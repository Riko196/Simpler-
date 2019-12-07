lexer grammar SimplerPlusPlusLexer;

// Keywords

DEF: 'def';
RETURN: 'return';
ASSERT: 'assert';
IF: 'if';
ELIF: 'elif';
ELSE: 'else';
WHILE: 'while';
FOR: 'for';
IN: 'in';
NULL: 'null';
CONTINUE: 'continue';
BREAK: 'break';
TRUE: 'True';
FALSE: 'False';
CONST: 'const';

// Compared operators

LESS_THAN: '<';
GREATER_THAN: '>';
EQUALS: '=';
GT_EQ: '>=';
LT_EQ: '<=';
NOT_EQ: '!=';

// Binary operators

BIN_OR: '|';
BIN_XOR: '^';
BIN_AND: '&';

// Logical operators

LOG_OR: 'or';
LOG_AND: 'and';
LOG_NOT: 'not';

// Math operators

ADD: '+';
MINUS: '-';
STAR: '*';
DIV: '/';
MOD: '%';
POWER: '**';

// Shift operators

LEFT_SHIFT: '<<';
RIGHT_SHIFT: '>>';

// Assign operators

ASSIGN: '<-';
ADD_ASSIGN: '+=';
SUB_ASSIGN: '-=';
MULT_ASSIGN: '*=';
DIV_ASSIGN: '/=';
MOD_ASSIGN: '%=';
AND_ASSIGN: '&=';
OR_ASSIGN: '|=';
XOR_ASSIGN: '^=';
LEFT_SHIFT_ASSIGN: '<<=';
RIGHT_SHIFT_ASSIGN: '>>=';
POWER_ASSIGN: '**=';

// Secondary operators

DOT: '.';
COMMA: ',';
COLON: ':';
QUERT: '?';
SEMI_COLON: ';';
ARROW: '->';
TILDE: '~';

// Types

VOID: 'void';
CHAR: 'char';
SHORT: 'short';
INT: 'int';
LONG: 'long';
FLOAT: 'float';
DOUBLE: 'double';
BOOLEAN: 'boolean';
STRING: 'string';

STRING_VALUE: ([uU] | [fF] [rR]? | [rR] [fF]?)? (
		SHORT_STRING
		| LONG_STRING
	)
	| ([bB] [rR]? | [rR] [bB]) (SHORT_BYTES | LONG_BYTES);

// Numbers

DECIMAL_INTEGER: [1-9] [0-9]* | '0'+;
OCT_INTEGER: '0' [oO] [0-7]+;
HEX_INTEGER: '0' [xX] [0-9a-fA-F]+;
BIN_INTEGER: '0' [bB] [01]+;

IMAG_NUMBER: (EXPONENT_OR_POINT_FLOAT | [0-9]+) [jJ];
FLOAT_NUMBER: EXPONENT_OR_POINT_FLOAT;

// Parenthesis

OPEN_PAREN: '(';
CLOSE_PAREN: ')';
OPEN_BRACE: '{';
CLOSE_BRACE: '}';
OPEN_BRACKET: '[';
CLOSE_BRACKET: ']';

NAME: ID_START ID_CONTINUE*;

// Fragments

fragment ID_CONTINUE:
	ID_START
	| [0-9];

fragment ID_START:
	'_'
	| [A-Z]
	| [a-z];

fragment SHORT_STRING:
	'\'' ('\\' (RN | .) | ~[\\\r\n'])* '\''
	| '"' ('\\' (RN | .) | ~[\\\r\n"])* '"';
fragment LONG_STRING:
	'\'\'\'' LONG_STRING_ITEM*? '\'\'\''
	| '"""' LONG_STRING_ITEM*? '"""';

fragment LONG_STRING_ITEM: ~'\\' | '\\' (RN | .);

fragment RN: '\r'? '\n';

fragment EXPONENT_OR_POINT_FLOAT: ([0-9]+ | POINT_FLOAT) [eE] [+-]? [0-9]+
	| POINT_FLOAT;

fragment POINT_FLOAT: [0-9]* '.' [0-9]+ | [0-9]+ '.';

fragment SHORT_BYTES:
	'\'' (SHORT_BYTES_CHAR_NO_SINGLE_QUOTE | BYTES_ESCAPE_SEQ)* '\''
	| '"' (SHORT_BYTES_CHAR_NO_DOUBLE_QUOTE | BYTES_ESCAPE_SEQ)* '"';

fragment LONG_BYTES:
	'\'\'\'' LONG_BYTES_ITEM*? '\'\'\''
	| '"""' LONG_BYTES_ITEM*? '"""';

fragment LONG_BYTES_ITEM: LONG_BYTES_CHAR | BYTES_ESCAPE_SEQ;

fragment SHORT_BYTES_CHAR_NO_SINGLE_QUOTE:
	[\u0000-\u0009]
	| [\u000B-\u000C]
	| [\u000E-\u0026]
	| [\u0028-\u005B]
	| [\u005D-\u007F];

fragment SHORT_BYTES_CHAR_NO_DOUBLE_QUOTE:
	[\u0000-\u0009]
	| [\u000B-\u000C]
	| [\u000E-\u0021]
	| [\u0023-\u005B]
	| [\u005D-\u007F];

fragment LONG_BYTES_CHAR: [\u0000-\u005B] | [\u005D-\u007F];

fragment BYTES_ESCAPE_SEQ: '\\' [\u0000-\u007F];

// Ignore these characters
MORE_LINE_COMMENT
    :   '/*' .*? '*/'
        -> skip
    ;

ONE_LINE_COMMENT
    :   '//' ~[\r\n]*
        -> skip
    ;

NEWLINE
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;

WHITESPACE
    :   [ \t]+
        -> skip
	;