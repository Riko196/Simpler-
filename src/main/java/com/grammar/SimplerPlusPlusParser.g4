parser grammar SimplerPlusPlusParser;

options { tokenVocab=SimplerPlusPlusLexer; }

// A sequence of statements read from file
root
    : functions EOF
    ;

// funtions + main
functions
    : def_function+
    ;

// statement
statement
    : condition
    | while_loop
    | for_loop
    | declaration_list
    | call_expression  SEMI_COLON
    | jump
    ;

block_of_code
    : OPEN_BRACE statement* CLOSE_BRACE
    ;

// declaration
declaration
    : declaration_variable
    | declaration_existing_variable
    | declaration_array
    | declaration_existing_array
    ;

declaration_list
    : declaration (COMMA declaration)* SEMI_COLON
    ;

declaration_variable
    : variable_types NAME ASSIGN value_declaration
    ;

declaration_array
    : variable_types NAME (OPEN_BRACKET expression CLOSE_BRACKET)+
    ;

declaration_existing_variable
    : NAME ASSIGN value_declaration
    ;

declaration_existing_array
    : NAME (OPEN_BRACKET expression CLOSE_BRACKET)+ ASSIGN value_declaration
    ;

value_declaration
    : expression
    ;

// Expressions
expression
    : compared_expression
    ;

compared_expression
    : compared_expression op=(EQUALS|LESS_THAN|GREATER_THAN|LT_EQ|GT_EQ|NOT_EQ) compared_expression
    | binary_expression
    ;

binary_expression
    : binary_expression op=(BIN_OR|BIN_AND|BIN_XOR|LOG_OR|LOG_AND) binary_expression
    | math_expression
    ;

math_expression
    : math_expression op=(STAR|DIV|MOD) math_expression
    | math_expression op=(ADD|MINUS) math_expression
    | shift_expression
    ;

shift_expression
    : shift_expression op=(LEFT_SHIFT|RIGHT_SHIFT) shift_expression
    | unary_expression
    ;

unary_expression
    : op=(ADD|MINUS|TILDE|LOG_NOT) unary_expression
    | call_expression
    | value
    ;

call_expression
    : NAME OPEN_PAREN (expression (COMMA expression)*)? CLOSE_PAREN
    | call_array
    | call_variable
    | deep_expression
    ;

call_array
    : NAME (OPEN_BRACKET expression CLOSE_BRACKET)+
    ;

call_variable
    : NAME
    ;

deep_expression
    : OPEN_PAREN expression CLOSE_PAREN
    ;

value
    : integer
    | boolean_value
    | STRING_VALUE
    ;

// if condition
condition
    : IF expression block_of_code (ELSE block_of_code)?
    ;

// while loop
while_loop
    : WHILE expression block_of_code
    ;

// for loop
for_loop
    : FOR NAME IN OPEN_PAREN expression COMMA  expression COMMA expression CLOSE_PAREN block_of_code
    ;

// Jump statement
jump
    : RETURN expression? SEMI_COLON
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

// Types of variables
variable_types
    :   CHAR
    |   BOOLEAN
    |   INT
    |   STRING
    ;

function_types
    : variable_types
    | VOID
    ;

// Types of numbers

integer
    : DECIMAL_INTEGER
    | OCT_INTEGER
    | HEX_INTEGER
    | BIN_INTEGER
    ;

boolean_value
    : TRUE
    | FALSE
    ;