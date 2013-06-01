lexer grammar CommonLexerRules;

// Whitespace removal
WS: [ \r\t\n]+ -> channel(1) ;

// Aggregate Keywords
CALCULATE: ('C'|'c')('A'|'a')('L'|'l')('C'|'c')('U'|'u')('L'|'l')('A'|'a')('T'|'t')('E'|'e') ;
AVERAGE: ('A'|'a')('V'|'v')('E'|'e')('R'|'r')('A'|'a')('G'|'g')('E'|'e') ;
COUNT: ('C'|'c')('O'|'o')('U'|'u')('N'|'n')('T'|'t') ;
SUM: ('S'|'s')('U'|'u')('M'|'m') ;
MIN: ('M'|'m')('I'|'i')('N'|'n') ;
MAX: ('M'|'m')('A'|'a')('X'|'x') ;
MEDIAN: ('M'|'m')('E'|'e')('D'|'d')('I'|'i')('A'|'a')('N'|'n') ;
BY: ('B'|'b')('Y'|'y') ;

// Time Keywords
BETWEEN: ('B'|'b')('E'|'e')('T'|'t')('W'|'w')('E'|'e')('E'|'e')('N'|'n') ;
IN: ('I'|'i')('N'|'n') ;
DAYS: ('D'|'d')('A'|'a')('Y'|'y')('S'|'s') ;
MINUTES: ('M'|'m')('I'|'i')('N'|'n')('U'|'u')('T'|'t')('E'|'e')('S'|'s') ;
HOURS: ('H'|'h')('O'|'o')('U'|'u')('R'|'r')('S'|'s') ;
MONTHS: ('M'|'m')('O'|'o')('N'|'n')('T'|'t')('H'|'h')('S'|'s') ;

// Ask Keywords
ASK: ('A'|'a')('S'|'s')('K'|'k') ;

// Filter Keywords
FILTER: ('F'|'f')('I'|'i')('L'|'l')('T'|'t')('E'|'e')('R'|'r') ;
AND: ('A'|'a')('N'|'n')('D'|'d') ;
OR: ('O'|'o')('R'|'r') ;
NOT: ('N'|'n')('O'|'o')('T'|'t') ;

// Comparison Operator
LESS_THAN: '<' ;
LESS_THAN_OR_EQUAL: '<=' ;
GREATER_THAN: '>' ;
GREATER_THAN_OR_EQUAL: '>=' ;
EQUAL: '=' ;
NOT_EQUAL: '!=' ;

// Calculatation Operator
MULTIPLY: '*' ;
ADD: '+' ;
DIVIDE: '/' ;
SUBTRACT: '-' ;

// Query Keywords
PIPE: '|' ;
OPEN_BRACE: '(' ;
CLOSE_BRACE: ')' ;

// Identifiers
TABLE_IDENTIFIER: '#'([0-9]|[a-z]|[A-Z]|'-'|'_')+ ;
FIELD_IDENTIFIER: '@'([0-9]|[a-z]|[A-Z]|'-'|'_')+ ;

// Literal
DATE_LITERAL: [0-9][0-9][0-9][0-9]'-'[0-9][0-9]'-'[0-9][0-9] ;
TIME_LITERAL: [0-9][0-9]':'[0-9][0-9]':'[0-9][0-9] ;
ZONE_LITERAL: (('+'|'-')[0-9][0-9][0-9][0-9]|'Z') ;

POSITIVE_INTEGER: '+'? [0-9]+ ;
NEGATIVE_INTEGER: '-' [0-9]+ ;
POSITIVE_REAL: '+'? [0-9]+ '.' [0-9]* ;
NEGATIVE_REAL: '-' [0-9]+ '.' [0-9]* ;
SMALL_QUOTED_STRING: '\'' ('\\\'' | . )*? '\'' ;
LARGE_QUOTED_STRING: '\"' ('\\\"' | . )*? '\"' ;
