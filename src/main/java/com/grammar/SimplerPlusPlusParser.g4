parser grammar SimplerPlusPlusParser;

options { tokenVocab=SimplerPlusPlusLexer; }

// A sequence of statements read from file
root
    : statement* EOF
    ;

// statement
statement
    : if_condition
    | while_loop
    | for_loop
    | def_function
    | declaration_list
    | call_expression  SEMI_COLON
    | jump
    ;

block_of_code
    : OPEN_BRACE statement* CLOSE_BRACE
    ;

// declaration
declaration_list
    : init_declaration (COMMA init_declaration)* SEMI_COLON
    ;

init_declaration
    : CONST? variable_types? declaration
    ;

declaration
    : NAME ASSIGN value_declaration
    | NAME (OPEN_BRACKET CLOSE_BRACKET)+ ASSIGN more_dimension_value_declaration
    | NAME (OPEN_BRACKET expression CLOSE_BRACKET)+ (ASSIGN value_declaration)?
    ;

value_declaration
    : expression (QUERT expression COLON expression)?
    ;

more_dimension_value_declaration
    : OPEN_BRACE more_dimension_value (COMMA more_dimension_value)* CLOSE_BRACE
    ;

more_dimension_value
    : more_dimension_value_declaration
    | expression
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
    | value
    ;

call_expression
    : NAME OPEN_PAREN given_parameters? CLOSE_PAREN
    | ASSERT expression
    | identifier_expression
    ;

identifier_expression
    : NAME
    | NAME (OPEN_BRACKET expression CLOSE_BRACKET)+
    | OPEN_PAREN expression CLOSE_PAREN
    ;

value
    : number
    | STRING_VALUE+
    | NULL
    ;

// if condition
if_condition
    : IF expression block_of_code elif_condition* else_condition?
    ;

elif_condition
    : ELIF expression block_of_code
    ;

else_condition
    : ELSE block_of_code
    ;

// while loop
while_loop
    : WHILE expression block_of_code
    ;

// for loop
for_loop
    : FOR NAME IN for_condition block_of_code
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
    : variable_types(OPEN_BRACKET CLOSE_BRACKET)* NAME
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
