package com.visitor;

import java.util.*;
import com.code_fragment.CodeFragment;
import org.stringtemplate.v4.*;

public class SimplerPlusPlusVisitor extends SimplerPlusPlusParserBaseVisitor<CodeFragment> {
    class Variable {
        public String type;
        public String name;
        public Integer depth;
        public List<CodeFragment> sizeOfDimensions;

        public Variable(String type, String name, Integer depth) {
            this.type = type;
            this.name = name;
            this.depth = depth;
            this.sizeOfDimensions = new ArrayList<>();
        }
    }

    class Method {
        public String name;
        public String returnType;
        public List<Variable> listOfParameters;
        public Map<String, Variable> parameters;
        public Map<String, Variable> liveVariables;

        public Method(String name, String returnType) {
            this.name = name;
            this.returnType = returnType;
            this.listOfParameters = new ArrayList<>();
            this.parameters = new HashMap<String, Variable>();
            this.liveVariables = new HashMap<String, Variable>();
        }
    }

    //LLVM templates
    private STGroup call_expression_group = new STGroupFile("./src/main/java/com/llvm_templates/call_expression.stg");
    private STGroup condition_group = new STGroupFile("./src/main/java/com/llvm_templates/condition.stg");
    private STGroup declaration_group = new STGroupFile("./src/main/java/com/llvm_templates/declaration.stg");
    private STGroup def_function_group = new STGroupFile("./src/main/java/com/llvm_templates/def_function.stg");
    private STGroup expression_group = new STGroupFile("./src/main/java/com/llvm_templates/expression.stg");
    private STGroup for_loop_group = new STGroupFile("./src/main/java/com/llvm_templates/for_loop.stg");
    private STGroup init_group = new STGroupFile("./src/main/java/com/llvm_templates/init.stg");
    private STGroup return_group = new STGroupFile("./src/main/java/com/llvm_templates/return.stg");
    private STGroup while_loop_group = new STGroupFile("./src/main/java/com/llvm_templates/while_loop.stg");

    //Memory
    private Map<String, Method> methods = new HashMap<String, Method>();
    private Method currentMethod = null; // it talks in which function I am currently
    private Integer depth = 0; // it talks me how deep I am in the code
    private Integer labelIdCounter = 0; // counter for creating name of new variables

    @Override
    public CodeFragment visitRoot(SimplerPlusPlusParser.RootContext ctx) {
        ST init_template = this.init_group.getInstanceOf("init");

        Method print_int = new Method("@print_int", "i32");
        Variable number = new Variable("i32", "%number", 1);
        print_int.listOfParameters.add(number);
        print_int.parameters.put("number", number);
        this.methods.put("print_int", print_int);

        this.methods.put("println", new Method("@println", "i32"));
        this.methods.put("scanf_int", new Method("@scanf_int", "i32"));

        Method print_char = new Method("@print_char", "i32");
        Variable character = new Variable("i8", "%character", 1);
        print_char.listOfParameters.add(character);
        print_char.parameters.put("character", character);
        this.methods.put("print_char", print_char);

        this.methods.put("scanf_char", new Method("@scanf_char", "i8"));

        CodeFragment list_of_functions = visit(ctx.functions());

        init_template.add("list_of_functions", list_of_functions);

        return new CodeFragment(init_template.render());
    }

    @Override
    public CodeFragment visitFunctions(SimplerPlusPlusParser.FunctionsContext ctx) {
        CodeFragment result = new CodeFragment("");

        for (int i = 0; i < ctx.def_function().size(); i++)
            result.addCode(visit(ctx.def_function(i)));

        if (this.methods.get("main") == null)
            throw new Error("You must declare 'main' function");

        return result;
    }

    @Override
    public CodeFragment visitStatement(SimplerPlusPlusParser.StatementContext ctx) {
        if (ctx.condition() != null)
            return visit(ctx.condition());
        else if (ctx.while_loop() != null)
            return visit(ctx.while_loop());
        else if (ctx.for_loop() != null)
            return visit(ctx.for_loop());
        else if (ctx.declaration_list() != null)
            return visit(ctx.declaration_list());
        else if (ctx.call_expression() != null)
            return visit(ctx.call_expression());
        else
            return visit(ctx.jump());
    }

    @Override
    public CodeFragment visitBlock_of_code(SimplerPlusPlusParser.Block_of_codeContext ctx) {
        this.depth++;

        CodeFragment result = new CodeFragment("");
        if (ctx.statement() != null)
            for (int i = 0; i < ctx.statement().size(); i++)
                result.addCode(visit(ctx.statement(i)));

        this.depth--;

        List<String> keys = new ArrayList<>(this.currentMethod.liveVariables.keySet());
        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            Variable variable = this.currentMethod.liveVariables.get(key);
            if (variable.depth > this.depth) {
                if (variable.sizeOfDimensions.size() != 0) {
                    result.addCode("call i8 @free(" + variable.type + " " + variable.name + ")\n");
                }
                this.currentMethod.liveVariables.remove(key);
            }

        }

        return result;
    }
    /*************************************** DECLARATIONS *******************************************************/
    @Override
    public CodeFragment visitDeclaration(SimplerPlusPlusParser.DeclarationContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public CodeFragment visitDeclaration_list(SimplerPlusPlusParser.Declaration_listContext ctx) {
        CodeFragment result = new CodeFragment("");

        for (int i = 0; i < ctx.declaration().size(); i++)
            result.addCode(visit(ctx.declaration(i)));

        return result;
    }

    @Override
    public CodeFragment visitDeclaration_variable(SimplerPlusPlusParser.Declaration_variableContext ctx) {
        ST declaration_variable_template = this.declaration_group.getInstanceOf("declaration_variable");
        String name = ctx.NAME().getText();
        String type = visit(ctx.variable_types()).toString();

        if (this.currentMethod.liveVariables.get(name) != null || this.currentMethod.parameters.get(name) != null)
            throw new Error("Variable '" + name + "' already exists");

        String llvmVariableName = "%var" + this.labelIdCounter.toString();
        this.labelIdCounter++;
        Variable llvmVariable = new Variable(type, llvmVariableName, this.depth);
        this.currentMethod.liveVariables.put(name, llvmVariable);

        declaration_variable_template.add("llvm_variable_name", llvmVariableName);
        declaration_variable_template.add("type", type);

        CodeFragment value = visit(ctx.value_declaration());

        declaration_variable_template.add("value_computing", value);
        declaration_variable_template.add("value_register_type", value.getRegisterType());
        declaration_variable_template.add("value_register_name", value.getRegisterName());

        return new CodeFragment(declaration_variable_template.render());
    }

    @Override
    public CodeFragment visitDeclaration_array(SimplerPlusPlusParser.Declaration_arrayContext ctx) {
        String name = ctx.NAME().getText();
        String llvmCode = "";
        String type = visit(ctx.variable_types()).toString();
        if (this.currentMethod.liveVariables.get(name) != null || this.currentMethod.parameters.get(name) != null)
            throw new Error("Array '" + name + "' already exists");

        List<CodeFragment> expressions = new ArrayList<>();
        for (int i = 0; i < ctx.expression().size(); i++) {
            CodeFragment result = visit(ctx.expression(i));
            llvmCode += result.toString();
            expressions.add(result);

            if (!result.getRegisterType().equals("i32"))
                throw new Error("You can not call not integer index to the array");
        }

        CodeFragment exp = expressions.get(0);
        CodeFragment sizeOfArray = new CodeFragment("", exp.getRegisterName(), exp.getRegisterType());
        for (int i = 1; i < ctx.expression().size(); i++) {
            String registerName = "%reg" + this.labelIdCounter.toString();
            this.labelIdCounter++;
            llvmCode += "    " + registerName + " = mul nuw " + sizeOfArray.getRegisterType() + " " +  sizeOfArray.getRegisterName() +
                ", " + expressions.get(i).getRegisterName() + "\n";
            sizeOfArray.setRegisterName(registerName);
        }

        String arrayPointer = "%reg" + this.labelIdCounter.toString();
        this.labelIdCounter++;

        llvmCode += "    " + arrayPointer + " = call i8* @malloc(" + sizeOfArray.getRegisterType() +
            " " + sizeOfArray.getRegisterName() + ")\n";

        String newArrayPointer = "%reg" + this.labelIdCounter.toString();
        this.labelIdCounter++;

        Variable array = new Variable(type + "*", newArrayPointer, this.depth);
        array.sizeOfDimensions = expressions;
        this.currentMethod.liveVariables.put(name, array);

        llvmCode += "    " + newArrayPointer + " = bitcast i8* " + arrayPointer + " to " + type + "*\n";

        return new CodeFragment(llvmCode, newArrayPointer, type + "*");
    }

    @Override
    public CodeFragment visitDeclaration_existing_variable(SimplerPlusPlusParser.Declaration_existing_variableContext ctx) {
        ST declaration_variable_template = this.declaration_group.getInstanceOf("declaration_existing_variable");
        String name = ctx.NAME().getText();
        Variable llvmVariable = this.currentMethod.liveVariables.get(name);
        if (llvmVariable == null)
            throw new Error("Variable '" + name + "' does not exist");

        CodeFragment value = visit(ctx.value_declaration());

        declaration_variable_template.add("llvm_variable_name", llvmVariable.name);
        declaration_variable_template.add("value_computing", value);
        declaration_variable_template.add("value_register_type", value.getRegisterType());
        declaration_variable_template.add("value_register_name", value.getRegisterName());

        return new CodeFragment(declaration_variable_template.render());
    }

    @Override
    public CodeFragment visitDeclaration_existing_array(SimplerPlusPlusParser.Declaration_existing_arrayContext ctx) {
        String name = ctx.NAME().getText();
        String llvmCode = "";
        Variable array = this.currentMethod.liveVariables.get(name);
        if (array == null)
            throw new Error("Array '" + name + "' does not exist");

        List<CodeFragment> expressions = new ArrayList<>();
        for (int i = 0; i < ctx.expression().size(); i++) {
            CodeFragment result = visit(ctx.expression(i));
            llvmCode += result.toString();
            expressions.add(result);

            if (!result.getRegisterType().equals("i32"))
                throw new Error("You can not call not integer index to the array");
        }

        CodeFragment valueNode = visit(ctx.value_declaration());
        CodeFragment resultAddress = this.getArrayAddress(name, expressions);

        llvmCode += resultAddress.toString() + valueNode.toString() + "    store " + valueNode.getRegisterType() + " " + valueNode.getRegisterName() + ", " +
        valueNode.getRegisterType() + "* " + resultAddress.getRegisterName() + "\n";

        return new CodeFragment(llvmCode);
    }

    @Override
    public CodeFragment visitValue_declaration(SimplerPlusPlusParser.Value_declarationContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public CodeFragment visitExpression(SimplerPlusPlusParser.ExpressionContext ctx) {
        return visit(ctx.compared_expression());
    }

    /*************************************** BINARY OPERATIONS **************************************************/
    @Override
    public CodeFragment visitCompared_expression(SimplerPlusPlusParser.Compared_expressionContext ctx) {
        if (ctx.binary_expression() != null)
            return visitChildren(ctx);

        ST compared_template = this.expression_group.getInstanceOf("binary_operation");
        CodeFragment operand1 = visit(ctx.compared_expression(0));
        CodeFragment operand2 = visit(ctx.compared_expression(1));

        compared_template.add("operand1", operand1);
        compared_template.add("operand2", operand2);

        if (operand1.getRegisterType().isEmpty() || operand2.getRegisterType().isEmpty())
            throw new Error("Unrecognized type of result");
        if (operand1.getRegisterType().compareTo(operand2.getRegisterType()) != 0)
            throw new Error("I can not compare " + operand1.getRegisterType() + " and " + operand2.getRegisterType() + " types");

        String resultName = "%reg" + this.labelIdCounter.toString();
        this.labelIdCounter++;

        compared_template.add("resultName", resultName);

        if (ctx.op.getType() == SimplerPlusPlusParser.EQUALS)
            compared_template.add("instruction", "icmp eq");
        else if (ctx.op.getType() == SimplerPlusPlusParser.LESS_THAN)
            compared_template.add("instruction", "icmp slt");
        else if (ctx.op.getType() == SimplerPlusPlusParser.GREATER_THAN)
            compared_template.add("instruction", "icmp sgt");
        else if (ctx.op.getType() == SimplerPlusPlusParser.LT_EQ)
            compared_template.add("instruction", "icmp sle");
        else if (ctx.op.getType() == SimplerPlusPlusParser.GT_EQ)
            compared_template.add("instruction", "icmp sge");
        else
            compared_template.add("instruction", "icmp ne");

        compared_template.add("resultType", operand1.getRegisterType());
        compared_template.add("operand1_register_name", operand1.getRegisterName());
        compared_template.add("operand2_register_name", operand2.getRegisterName());

        return new CodeFragment(compared_template.render(), resultName, operand1.getRegisterType());
    }

    @Override
    public CodeFragment visitBinary_expression(SimplerPlusPlusParser.Binary_expressionContext ctx) {
        if (ctx.math_expression() != null)
            return visitChildren(ctx);

        ST binary_template = this.expression_group.getInstanceOf("binary_operation");
        CodeFragment operand1 = visit(ctx.binary_expression(0));
        CodeFragment operand2 = visit(ctx.binary_expression(1));

        binary_template.add("operand1", operand1);
        binary_template.add("operand2", operand2);

        if (operand1.getRegisterType().isEmpty() || operand2.getRegisterType().isEmpty())
            throw new Error("Unrecognized type of result");
        if (operand1.getRegisterType().compareTo(operand2.getRegisterType()) != 0)
            throw new Error("I can not execute binary operation on " + operand1.getRegisterType() + " and "
                    + operand2.getRegisterType() + " types");

        String resultName = "%reg" + this.labelIdCounter.toString();
        this.labelIdCounter++;

        binary_template.add("resultName", resultName);

        if (ctx.op.getType() == SimplerPlusPlusParser.BIN_OR || ctx.op.getType() == SimplerPlusPlusParser.LOG_OR)
            binary_template.add("instruction", "or");
        else if (ctx.op.getType() == SimplerPlusPlusParser.BIN_AND|| ctx.op.getType() == SimplerPlusPlusParser.LOG_AND)
            binary_template.add("instruction", "and");
        else
            binary_template.add("instruction", "xor");

        binary_template.add("resultType", "i1");
        binary_template.add("operand1_register_name", operand1.getRegisterName());
        binary_template.add("operand2_register_name", operand2.getRegisterName());

        return new CodeFragment(binary_template.render(), resultName, operand1.getRegisterType());
    }

    @Override
    public CodeFragment visitMath_expression(SimplerPlusPlusParser.Math_expressionContext ctx) {
        if (ctx.shift_expression() != null)
            return visitChildren(ctx);

        ST math_template = this.expression_group.getInstanceOf("binary_operation");
        CodeFragment operand1 = visit(ctx.math_expression(0));
        CodeFragment operand2 = visit(ctx.math_expression(1));

        math_template.add("operand1", operand1);
        math_template.add("operand2", operand2);

        if (operand1.getRegisterType().isEmpty() || operand2.getRegisterType().isEmpty())
            throw new Error("Unrecognized type of result");
        if (operand1.getRegisterType().compareTo(operand2.getRegisterType()) != 0)
            throw new Error("I can not execute math operation on " + operand1.getRegisterType() + " and "
                    + operand2.getRegisterType() + " types");

        String resultName = "%reg" + this.labelIdCounter.toString();
        this.labelIdCounter++;

        math_template.add("resultName", resultName);

        if (ctx.op.getType() == SimplerPlusPlusParser.STAR)
            math_template.add("instruction", "mul");
        else if (ctx.op.getType() == SimplerPlusPlusParser.DIV)
            math_template.add("instruction", "udiv");
        else if (ctx.op.getType() == SimplerPlusPlusParser.MOD)
            math_template.add("instruction", "urem");
        else if (ctx.op.getType() == SimplerPlusPlusParser.ADD)
            math_template.add("instruction", "add");
        else
            math_template.add("instruction", "sub");

        math_template.add("resultType", operand1.getRegisterType());
        math_template.add("operand1_register_name", operand1.getRegisterName());
        math_template.add("operand2_register_name", operand2.getRegisterName());

        return new CodeFragment(math_template.render(), resultName, operand1.getRegisterType());
    }

    @Override
    public CodeFragment visitShift_expression(SimplerPlusPlusParser.Shift_expressionContext ctx) {
        if (ctx.unary_expression() != null)
            return visitChildren(ctx);

        ST shift_template = this.expression_group.getInstanceOf("binary_operation");
        CodeFragment operand1 = visit(ctx.shift_expression(0));
        CodeFragment operand2 = visit(ctx.shift_expression(1));

        shift_template.add("operand1", operand1);
        shift_template.add("operand2", operand2);

        if (operand1.getRegisterType().isEmpty() || operand2.getRegisterType().isEmpty())
            throw new Error("Unrecognized type of result");
        if (operand1.getRegisterType().compareTo(operand2.getRegisterType()) != 0)
            throw new Error("I can not execute shift operation on " + operand1.getRegisterType() + " and "
                    + operand2.getRegisterType() + " types");

        String resultName = "%reg" + this.labelIdCounter.toString();
        this.labelIdCounter++;

        shift_template.add("resultName", resultName);

        if (ctx.op.getType() == SimplerPlusPlusParser.LEFT_SHIFT)
            shift_template.add("instruction", "shl");
        else
            shift_template.add("instruction", "ashr");

        shift_template.add("resultType", operand1.getRegisterType());
        shift_template.add("operand1_register_name", operand1.getRegisterName());
        shift_template.add("operand2_register_name", operand2.getRegisterName());

        return new CodeFragment(shift_template.render(), resultName, operand1.getRegisterType());
    }

    /*************************************** UNARY OPERATIONS **************************************************/
    @Override
    public CodeFragment visitUnary_expression(SimplerPlusPlusParser.Unary_expressionContext ctx) {
        if (ctx.call_expression() != null)
            return visit(ctx.call_expression());
        else if (ctx.value() != null)
            return visit(ctx.value());

        ST unary_template = this.expression_group.getInstanceOf("unary_operation");
        CodeFragment operand = visit(ctx.unary_expression());

        unary_template.add("operand", operand);

        if (operand.getRegisterType().isEmpty())
            throw new Error("Unrecognized type of result");
        if (ctx.op.getType() == SimplerPlusPlusParser.ADD)
            return new CodeFragment(operand.toString(), operand.getRegisterName(), operand.getRegisterType());

        String resultName = "%reg" + this.labelIdCounter.toString();
        this.labelIdCounter++;

        unary_template.add("resultName", resultName);

        if (ctx.op.getType() == SimplerPlusPlusParser.MINUS)
            unary_template.add("instruction", "mul");
        else
            unary_template.add("instruction", "xor");

        unary_template.add("resultType", operand.getRegisterType());
        unary_template.add("operand_register_name", operand.getRegisterName());

        return new CodeFragment(unary_template.render(), resultName, operand.getRegisterType());
    }

    /******************************************** CALLING **********************************************************/
    @Override
    public CodeFragment visitCall_expression(SimplerPlusPlusParser.Call_expressionContext ctx) {
        if (ctx.call_variable() != null || ctx.call_array() != null || ctx.deep_expression() != null)
            return visitChildren(ctx);

        String methodName = ctx.NAME().getText();
        if (this.methods.get(methodName) == null)
            throw new Error("The function '" + methodName + "' does not exist!");

        int countOfParameters = ctx.expression().size();
        if (this.methods.get(methodName).parameters.size() != countOfParameters)
            throw new Error("Count of parameters for function '" + methodName + "' is not the same!");

        List<Variable> methodParameters = this.methods.get(methodName).listOfParameters;
        List<CodeFragment> callingParameters = new ArrayList<>();
        String llvmCode = "";
        for (int i = 0; i < countOfParameters; i++) {
            Variable methodParameter = methodParameters.get(i);
            CodeFragment callingParameter = visit(ctx.expression(i));
            llvmCode += callingParameter.toString();

            if (!callingParameter.getRegisterType().equals(methodParameter.type))
                throw new Error(String.valueOf(i + 1) + ". parameter type '" + callingParameter.getRegisterType() +
                 "' in function '" + methodName + "' does not equal to type '" + methodParameter.type + "'");
            callingParameters.add(callingParameter);
        }

        Method method = this.methods.get(methodName);
        String registerName = "    %reg" + this.labelIdCounter;
        llvmCode += registerName + " = call " + method.returnType + " " + method.name + "(";
        this.labelIdCounter++;

        for (int i = 0; i < countOfParameters; i++) {
            CodeFragment callingParameter = callingParameters.get(i);
            llvmCode += callingParameter.getRegisterType() + " " + callingParameter.getRegisterName();
            if (i != countOfParameters - 1)
                llvmCode += ", ";
        }

        llvmCode += ")\n";
        return new CodeFragment(llvmCode, registerName, method.returnType);
    }

    private CodeFragment getArrayAddress(String name, List<CodeFragment> expressions) {
        Variable array = this.currentMethod.liveVariables.get(name);
        if (array == null)
            array = this.currentMethod.parameters.get(name);
        if (array == null)
            throw new Error("Array '" + name + "' does not exist");
        String llvmCode = "";


        CodeFragment resultAddress = new CodeFragment("");
        resultAddress.setRegisterType(array.type.substring(0, array.type.length() - 1));
        int dimensions = expressions.size();
        List<CodeFragment> sizeOfDimensions = array.sizeOfDimensions;

        CodeFragment currentArray = new CodeFragment("", array.name, array.type);
        for (int i = 0; i < dimensions; i++) {
            CodeFragment exp = expressions.get(i);
            CodeFragment fragmentAddress = new CodeFragment("", exp.getRegisterName(), exp.getRegisterType());


            for (int j = i + 1; j < dimensions; j++) {
                CodeFragment sizeOfDimension = sizeOfDimensions.get(j);
                String registerName = "%reg" + this.labelIdCounter.toString();
                this.labelIdCounter++;
                llvmCode += "    " + registerName + " = mul nuw " + sizeOfDimension.getRegisterType() + " " +
                    sizeOfDimension.getRegisterName() + ", " + fragmentAddress.getRegisterName() + "\n";
                fragmentAddress.setRegisterName(registerName);
            }

            String registerName = "%reg" + this.labelIdCounter.toString();
            this.labelIdCounter++;
            llvmCode += "    " + registerName + " = getelementptr inbounds " + currentArray.getRegisterType().substring(0, array.type.length() - 1) +
                ", " + currentArray.getRegisterType() + " " + currentArray.getRegisterName() + ", " + fragmentAddress.getRegisterType() + " " +
                fragmentAddress.getRegisterName() + "\n";

            currentArray.setRegisterName(registerName);
            resultAddress.setRegisterName(registerName);
        }

        return new CodeFragment(llvmCode, resultAddress.getRegisterName(), resultAddress.getRegisterType());
    }

    @Override
    public CodeFragment visitCall_array(SimplerPlusPlusParser.Call_arrayContext ctx) {
        String name = ctx.NAME().getText();
        String llvmCode = "";
        List<CodeFragment> expressions = new ArrayList<>();
        for (int i = 0; i < ctx.expression().size(); i++) {
            CodeFragment result = visit(ctx.expression(i));
            llvmCode += result.toString();
            expressions.add(result);

            if (!result.getRegisterType().equals("i32"))
                throw new Error("You can not call not integer index to the array");
        }

        CodeFragment arrayAddress = this.getArrayAddress(name, expressions);
        String registerName = "    %reg" + this.labelIdCounter.toString();
        this.labelIdCounter++;

        String arrayValue = registerName + " = load " + arrayAddress.getRegisterType() + ", " + arrayAddress.getRegisterType() +
            "* " + arrayAddress.getRegisterName() + "\n";

        return new CodeFragment(llvmCode + arrayAddress + arrayValue, registerName, arrayAddress.getRegisterType());
    }

    @Override
    public CodeFragment visitCall_variable(SimplerPlusPlusParser.Call_variableContext ctx) {
        ST call_variable_template = this.call_expression_group.getInstanceOf("call_variable");
        String name = ctx.NAME().getText();

        Variable parameter = this.currentMethod.parameters.get(name);

        if (parameter != null) {
            return new CodeFragment("", parameter.name, parameter.type);
        }

        Variable variable = this.currentMethod.liveVariables.get(name);
        if (variable == null)
            variable = this.currentMethod.parameters.get(name);
        if (variable == null)
            throw new Error("Variable '" + name + "' does not exist!");

        String registerName = "%var" + this.labelIdCounter;
        this.labelIdCounter++;

        call_variable_template.add("register_name", registerName);
        call_variable_template.add("variable_type", variable.type);
        call_variable_template.add("variable_name", variable.name);

        return new CodeFragment(call_variable_template.render(), registerName, variable.type);
    }

    @Override
    public CodeFragment visitDeep_expression(SimplerPlusPlusParser.Deep_expressionContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public CodeFragment visitValue(SimplerPlusPlusParser.ValueContext ctx) {
        ST call_value_template = this.call_expression_group.getInstanceOf("call_value");
        String registerType = "";
        String registerName = "%reg" + this.labelIdCounter.toString();
        String value = "";
        this.labelIdCounter++;

        if (ctx.boolean_value() != null) {
            registerType = "i1";
            value = ctx.boolean_value().getText().equals("True") ? "1" : "0";
        } else if (ctx.STRING_VALUE() != null) {
            String character = ctx.STRING_VALUE().getText();
            registerType = "i8";

            if (character.length() < 3 || character.length() > 4) {
                throw new Error("Character '" + character + "' is invalid");
            }

            if (character.charAt(1) == 92 && character.charAt(2) == 110) {
                value = "10";
            } else {
                int asciiCode = ctx.STRING_VALUE().getText().charAt(1);
                value = String.valueOf(asciiCode);
            }
        } else {
            registerType = "i32";
            value = visit(ctx.integer()).toString();
        }

        call_value_template.add("register_name", registerName);
        call_value_template.add("register_type", registerType);
        call_value_template.add("value", value);

        return new CodeFragment(call_value_template.render(), registerName, registerType);
    }

    @Override
    public CodeFragment visitCondition(SimplerPlusPlusParser.ConditionContext ctx) {
        ST condition_template = this.condition_group.getInstanceOf("condition");

        CodeFragment expression = visit(ctx.expression());
        CodeFragment if_block_of_code = visit(ctx.block_of_code(0));
        CodeFragment else_block_of_code = null;
        if (ctx.block_of_code().size() == 2)
            else_block_of_code = visit(ctx.block_of_code(1));

        condition_template.add("evaluated_condition", expression);
        condition_template.add("evaluated_condition_register", expression.getRegisterName());
        condition_template.add("if_block_of_code", if_block_of_code);
        if (else_block_of_code != null)
            condition_template.add("else_block_of_code", else_block_of_code);
        condition_template.add("label_id", this.labelIdCounter.toString());
        this.labelIdCounter++;

        return new CodeFragment(condition_template.render());
    }

    @Override
    public CodeFragment visitWhile_loop(SimplerPlusPlusParser.While_loopContext ctx) {
        ST while_loop_template = this.while_loop_group.getInstanceOf("while_loop");

        CodeFragment expression = visit(ctx.expression());
        String block_of_code = ctx.block_of_code() == null ? "" : visit(ctx.block_of_code()).toString();

        while_loop_template.add("evaluated_condition", expression);
        while_loop_template.add("cycle_end_register", expression.getRegisterName());
        while_loop_template.add("block_of_code", block_of_code);
        while_loop_template.add("label_id", this.labelIdCounter);
        this.labelIdCounter++;

        return new CodeFragment(while_loop_template.render());
    }

    @Override
    public CodeFragment visitFor_loop(SimplerPlusPlusParser.For_loopContext ctx) {
        ST for_loop_template = this.for_loop_group.getInstanceOf("for_loop");
        CodeFragment lower = visit(ctx.expression(0));
        CodeFragment upper = visit(ctx.expression(1));
        CodeFragment iter = visit(ctx.expression(2));

        String variable_name = ctx.NAME().getText();
        String llvm_variable_name = "%i_memory_register" + this.labelIdCounter;
        String i_value_register = "%i_value_register" + this.labelIdCounter;
        String i_new_value_register = "%i_new_value_register" + this.labelIdCounter;
        String condition_value_register = "%condition_value_register" + this.labelIdCounter;
        String aux_register = "%aux_register" + this.labelIdCounter;
        Variable i = new Variable("i32", llvm_variable_name, this.depth + 1);
        this.currentMethod.liveVariables.put(variable_name, i);
        this.labelIdCounter++;

        String blockOfCode = ctx.block_of_code() == null ? "" : visit(ctx.block_of_code()).toString();

        for_loop_template.add("i_memory_register", llvm_variable_name);
        for_loop_template.add("i_value_register", i_value_register);
        for_loop_template.add("i_new_value_register", i_new_value_register);
        for_loop_template.add("condition_value_register", condition_value_register);
        for_loop_template.add("aux_register", aux_register);
        for_loop_template.add("lower", lower);
        for_loop_template.add("upper", upper);
        for_loop_template.add("iter", iter);
        for_loop_template.add("lower_value_register", lower.getRegisterName());
        for_loop_template.add("upper_value_register", upper.getRegisterName());
        for_loop_template.add("iter_value_register", iter.getRegisterName());
        for_loop_template.add("block_of_code", blockOfCode);
        for_loop_template.add("label_id", this.labelIdCounter);
        this.labelIdCounter++;

        this.currentMethod.liveVariables.remove(variable_name);
        return new CodeFragment(for_loop_template.render());
    }

    /******************************************** RETURN VALUE **********************************************************/
    @Override public CodeFragment visitJump(SimplerPlusPlusParser.JumpContext ctx) {
        ST return_template = this.return_group.getInstanceOf("return");
        if (ctx.expression() == null)
            return new CodeFragment(return_template.render());

        CodeFragment expression = visit(ctx.expression());

        String methodType = this.currentMethod.returnType;
        if (!methodType.equals(expression.getRegisterType()))
            throw new Error("I can not return type '" + expression.getRegisterType() + "' in the method '" +
                this.currentMethod.name + "'");

        return_template.add("evaluated_expression", expression);
        return_template.add("type", expression.getRegisterType());
        return_template.add("result", expression.getRegisterName());

        return new CodeFragment(return_template.render());
    }
    /********************************************** FUNCTION DEFINITION  *********************************************/
    @Override public CodeFragment visitDef_function(SimplerPlusPlusParser.Def_functionContext ctx) {
        ST def_function_template = this.def_function_group.getInstanceOf("def_function");
        String name = ctx.NAME().getText();
        String returnType = visit(ctx.function_types()).toString();

        if (this.methods.get(name) != null)
            throw new Error("The function with name '" + name + "' already exists");
        if (this.depth != 0)
            throw new Error("You can not define function in function");

        Method method = new Method("@" + name, returnType);
        this.methods.put(name, method);
        this.currentMethod = method;
        this.depth++;

        String list_of_parameters = ctx.def_parameters() == null ? "" : visit(ctx.def_parameters()).toString();
        String block_of_code = ctx.block_of_code() == null ? "" : visit(ctx.block_of_code()).toString();

        def_function_template.add("return_type", returnType);
        def_function_template.add("name", "@" + name);
        def_function_template.add("list_of_parameters", list_of_parameters);
        def_function_template.add("block_of_code", block_of_code);

        this.currentMethod = null;
        this.depth--;
        return new CodeFragment(def_function_template.render());
    }

    @Override
    public CodeFragment visitDef_parameters(SimplerPlusPlusParser.Def_parametersContext ctx) {
        String llvmCode = "";
        for (int i = 0; i < ctx.def_parameter().size(); i++) {
            llvmCode += visit(ctx.def_parameter(i)).toString();
            if (i != ctx.def_parameter().size() - 1)
                llvmCode += ", ";
        }
        return new CodeFragment(llvmCode);
    }

    @Override
    public CodeFragment visitDef_parameter(SimplerPlusPlusParser.Def_parameterContext ctx) {
        String name = ctx.NAME().getText();
        int sizeOfDimensions = ctx.OPEN_BRACKET().size();
        String variable_type = visit(ctx.variable_types()).toString();

        Variable parameter = new Variable(variable_type, "%" + name, this.depth);
        this.currentMethod.parameters.put(name, parameter);
        this.currentMethod.listOfParameters.add(parameter);
        return new CodeFragment(variable_type + " %" + name);
    }

    /************************************************* VISIT TYPES ***************************************************/
    @Override
    public CodeFragment visitVariable_types(SimplerPlusPlusParser.Variable_typesContext ctx) {
        if (ctx.CHAR() != null)
            return new CodeFragment("i8");
        else if (ctx.BOOLEAN() != null)
            return new CodeFragment("i1");
        else if (ctx.INT() != null)
            return new CodeFragment("i32");
        else if (ctx.STRING() != null)
            return new CodeFragment("i8*");
        else
            throw new Error("Undefined type of variable");
    }

    @Override
    public CodeFragment visitFunction_types(SimplerPlusPlusParser.Function_typesContext ctx) {
        if (ctx.VOID() != null)
            return new CodeFragment(ctx.VOID().getText());
        return visitChildren(ctx);
    }

    @Override
    public CodeFragment visitInteger(SimplerPlusPlusParser.IntegerContext ctx) {
        int result = 0;

        if (ctx.DECIMAL_INTEGER() != null)
            return new CodeFragment(ctx.DECIMAL_INTEGER().getText());
        else if (ctx.OCT_INTEGER() != null)
            result = Integer.parseInt(ctx.OCT_INTEGER().getText().substring(2), 8);
        else if (ctx.HEX_INTEGER() != null)
            result = Integer.parseInt(ctx.HEX_INTEGER().getText().substring(2), 16);
        else if (ctx.BIN_INTEGER() != null)
            result = Integer.parseInt(ctx.BIN_INTEGER().getText().substring(2), 2);
        else
            throw new Error("Undefined type of integer");

        return new CodeFragment(String.valueOf(result));
    }
}