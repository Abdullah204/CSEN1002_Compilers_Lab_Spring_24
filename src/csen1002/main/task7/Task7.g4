/**
 * Write your info here
 *
 * @name Abdullah Ahmad Fouad
 * @id 49-2554
 * @labNumber 16
 */
grammar Task7;
ONE: '000' | '011' | '111' { System.out.println("ONE"); }; 
ZERO: '010' | '100' | '101' | '001' | '110' {System.out.println("ZERO");};
ERROR: '01' | '00' | '11' | '10' | '1' | '0' { System.out.println("ERROR"); };
test:  (ONE | ZERO | ERROR)+  EOF;




