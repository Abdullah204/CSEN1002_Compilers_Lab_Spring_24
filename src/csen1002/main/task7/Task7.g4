/**
 * Write your info here
 *
 * @name Abdullah Ahmad Fouad
 * @id 49-2554
 * @labNumber 16
 */

grammar Task7;


WS: [ \t\r\n]+ -> skip;

fragment Token:
    ONE |
    ZERO |
    ERROR;

ONE: '000' | '011' | '111' { System.out.println("ONE"); }; 
ZERO: '010' | '100' | '101' | '001' | '110' {System.out.println("ZERO");};
ERROR: '01' | '00' | '11' | '10' | '1' | '0' { System.out.println("ERROR"); };


/**
 * This rule is to check your grammar using "ANTLR Preview"
 */
test: /* (Rule1 | Rule2 | ... | RuleN)+ */ EOF; //Replace the non-fragment lexer rules here

// Write all the necessary lexer rules and fragment lexer rules here
