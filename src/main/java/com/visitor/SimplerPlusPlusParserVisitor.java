package com.visitor;
 // Generated from src/main/java/com/visitor/SimplerPlusPlusParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimplerPlusPlusParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimplerPlusPlusParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimplerPlusPlusParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(SimplerPlusPlusParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplerPlusPlusParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SimplerPlusPlusParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplerPlusPlusParser#block_of_code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_of_code(SimplerPlusPlusParser.Block_of_codeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplerPlusPlusParser#declaration_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_list(SimplerPlusPlusParser.Declaration_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplerPlusPlusParser#init_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_declaration(SimplerPlusPlusParser.Init_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplerPlusPlusParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(SimplerPlusPlusParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplerPlusPlusParser#value_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_declaration(SimplerPlusPlusParser.Value_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplerPlusPlusParser#more_dimension_value_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMore_dimension_value_declaration(SimplerPlusPlusParser.More_dimension_value_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplerPlusPlusParser#more_dimension_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMore_dimension_value(SimplerPlusPlusParser.More_dimension_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplerPlusPlusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SimplerPlusPlusParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplerPlusPlusParser#compared_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompared_expression(SimplerPlusPlusParser.Compared_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplerPlusPlusParser#binary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_expression(SimplerPlusPlusParser.Binary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplerPlusPlusParser#logical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_expression(SimplerPlusPlusParser.Logical_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplerPlusPlusParser#math_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_expression(SimplerPlusPlusParser.Math_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplerPlusPlusParser#shift_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_expression(SimplerPlusPlusParser.Shift_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplerPlusPlusParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression(SimplerPlusPlusParser.Unary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplerPlusPlusParser#call_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_expression(SimplerPlusPlusParser.Call_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplerPlusPlusParser#identifier_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_expression(SimplerPlusPlusParser.Identifier_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplerPlusPlusParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(SimplerPlusPlusParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplerPlusPlusParser#if_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_condition(SimplerPlusPlusParser.If_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplerPlusPlusParser#elif_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElif_condition(SimplerPlusPlusParser.Elif_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplerPlusPlusParser#else_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_condition(SimplerPlusPlusParser.Else_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplerPlusPlusParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(SimplerPlusPlusParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplerPlusPlusParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(SimplerPlusPlusParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplerPlusPlusParser#for_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_condition(SimplerPlusPlusParser.For_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplerPlusPlusParser#jump}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJump(SimplerPlusPlusParser.JumpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplerPlusPlusParser#def_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_function(SimplerPlusPlusParser.Def_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplerPlusPlusParser#def_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_parameters(SimplerPlusPlusParser.Def_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplerPlusPlusParser#def_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_parameter(SimplerPlusPlusParser.Def_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplerPlusPlusParser#given_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGiven_parameters(SimplerPlusPlusParser.Given_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplerPlusPlusParser#variable_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_types(SimplerPlusPlusParser.Variable_typesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplerPlusPlusParser#function_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_types(SimplerPlusPlusParser.Function_typesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplerPlusPlusParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(SimplerPlusPlusParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplerPlusPlusParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(SimplerPlusPlusParser.IntegerContext ctx);
}