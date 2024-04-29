/**
 * Write your info here
 *
 * @name Abdullah Ahmad Fouad
 * @id 49-2554
 * @labNumber 16
 */

grammar Task9;


@header
{
package csen1002.main.task9;
}

@members {
	/**
	 * Compares two integer numbers
	 *
	 * @param x the first number to compare
	 * @param y the second number to compare
	 * @return 1 if x is equal to y, and 0 otherwise
	 */
	public static int equals(int x, int y) {
	    return x == y ? 1 : 0;
	}
}

s returns [int check]:
	res = f {$check = $res.check * $res.m;}; 

f returns [int check, int m]:
	e1 = d[1,1] e2 = t[$e1.l,2]  
	{
	$check = $e1.check * $e2.check;
	$m = $e2.m;
	} | 
	e1 = d[1,1] 
	{
	$check = $e1.check;
	$m = 1;
	};


d [int c , int r] returns [int l , int check ]: 
	'0' e1 = d[c+1 , r] {
		$l = $e1.l; $check = (1 - equals($c, $r)) * $e1.check;
	} 
	| '1' e1 = d[c+1 , r] {
		$l = $e1.l; $check = equals($c, $r) * $e1.check;
	} 
	| '0' {$l = $c ; $check = 1 - equals($c, $r);}  
	| '1' {$l = $c ; $check = equals($c, $r);};
 

 t [int l, int r]returns [int check, int m]:
 '#' e1 = n[r,1,l] {$check = $n.check ; $m = $n.m;} ;
 
 n [int r ,int  c, int l] returns [int check , int m]: 
 e1 = d[1,r] e2 = t [l , r+1]
 {
	
	$check = $e1.check * $e2.check;
	$m = equals($e1.l, $l) * $e2.m;
 }
 |
 e1 =  d[1,r] {
	$check = $e1.check;
	$m = equals($e1.l, $l);
 }
 ;



WS : [ \t\r\n]+ -> skip;

