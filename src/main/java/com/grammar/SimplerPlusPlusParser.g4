parser grammar SimplerPlusPlusParser;

// export CLASSPATH=".:/usr/local/lib/antlr-4.7.2-complete.jar:$CLASSPATH"
// antlr4 SimplerPlusPlusLexer.g4
// antlr4 SimplerPlusPlusParse.g4
// javac SimplerPlusPlus*.java
// grun SimplerPlusPlus compilationUnit -gui

options { tokenVocab=SimplerPlusPlusLexer; }

// A sequence of statements read from file
root
    : statement* EOF
    ;

// statement
statement
    : if_condition  #if_condition_label
    | while_loop    #while_loop_label
    | for_loop      #for_loop_label
    | def_function  #def_function_label
    | init_declaration   #declaration_label
    | jump          #jump_label
    ;

block_of_code
    : OPEN_BRACE statement* CLOSE_BRACE
    ;

// declaration
init_declaration
    : variable_types? NAME ASSIGN declaration
    ;

declaration
    : expression SEMI_COLON
    | expression QUERT expression COLON expression
    ;

// Expressions
expression
    : compared_expression
    ;

compared_expression
    : compared_expression EQUALS compared_expression
    | compared_expression LESS_THAN compared_expression
    | compared_expression GREATER_THAN compared_expression
    | compared_expression LT_EQ compared_expression
    | compared_expression GT_EQ compared_expression
    | compared_expression NOT_EQ compared_expression
    | binary_expression
    ;

binary_expression
    : binary_expression BIN_OR binary_expression
    | binary_expression BIN_AND binary_expression
    | binary_expression BIN_XOR binary_expression
    | logical_expression
    ;

logical_expression
    : logical_expression LOG_AND logical_expression
    | logical_expression LOG_OR logical_expression
    | math_expression
    ;

math_expression
    : math_expression ADD math_expression
    | math_expression MINUS math_expression
    | math_expression STAR math_expression
    | math_expression DIV math_expression
    | math_expression MOD math_expression
    | math_expression POWER math_expression
    | shift_expression
    ;

shift_expression
    : shift_expression LEFT_SHIFT shift_expression
    | shift_expression RIGHT_SHIFT shift_expression
    | unary_expression
    ;

unary_expression
    : ADD unary_expression
    | MINUS unary_expression
    | LOG_NOT unary_expression
    | TILDE unary_expression
    | call_expression
    ;

call_expression
    : call_expression OPEN_BRACKET expression CLOSE_BRACKET
    | call_expression OPEN_PAREN given_parameters OPEN_PAREN
    | identifier_expression
    ;

identifier_expression
    : NAME
    | number
    | STRING_VALUE+
    | OPEN_PAREN expression CLOSE_PAREN
    ;

// if condition
if_condition
    : IF expression block_of_code elif_condition* else_condition?
    ;

elif_condition
    : ELIF expression block_of_code
    ;

else_condition
    : ELSE expression block_of_code
    ;

// while loop
while_loop
    : WHILE expression block_of_code
    ;

// for loop
for_loop
    : FOR OPEN_PAREN NAME CLOSE_PAREN IN for_condition block_of_code
    ;

for_condition
    : OPEN_PAREN expression COMMA  expression COMMA expression CLOSE_PAREN
    ;

// Jump statement
jump
    : RETURN expression? SEMI_COLON
    | BREAK SEMI_COLON
    | CONTINUE SEMI_COLON
    ;

// A definition of function and parameters
def_function
    : DEF NAME OPEN_PAREN def_parameters? CLOSE_PAREN ARROW function_types block_of_code
    ;

def_parameters
    : def_parameter (COMMA def_parameter)*
    ;

def_parameter
    : variable_types NAME
    ;

given_parameters
    : expression (COMMA expression)*
    ;

// Types of variables
variable_types
    :   CHAR
    |   BOOLEAN
    |   INT
    |   LONG
    |   FLOAT
    |   DOUBLE
    |   STRING
    ;

function_types
    : variable_types
    | VOID
    ;

// Types of numbers
number
    : integer
    | IMAG_NUMBER
    | FLOAT_NUMBER
    ;

integer
    : DECIMAL_INTEGER
    | OCT_INTEGER
    | HEX_INTEGER
    | BIN_INTEGER
    ;
