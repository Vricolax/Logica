grammar Hello;


declaration:// LPAREN r RPAREN
INTNUM
|CHAR
|SKIP
|statements* EOF
;


statements: SKIP | EMPTY | SEMI;

r: declaration
|(operation)+
|(operation SEMI)+
|(operation SEMI SKIP)+
;

gate: AND | OR | NOT | XOR;
operation: gate LPAREN r COMMA r RPAREN | gate LPAREN r RPAREN;
and_operation: AND LPAREN r COMMA r RPAREN;
or_operation: OR LPAREN r COMMA r RPAREN;
not_operation: NOT LPAREN r RPAREN;
xor_operation: XOR LPAREN r COMMA r RPAREN;

AND: 'AND';
OR: 'OR' ;
NOT : 'NOT' ;
XOR : 'XOR' ;

INTNUM : [0-1]+ ;
SKIP : ('\r' | '\n')+ | EMPTY;
CHAR:  [a-zA-Z]+;


LPAREN : '(' ;
RPAREN : ')' ;
SEMI : ';';
COMMA : ',';
EMPTY : 'null';
PRINT : 'print';

