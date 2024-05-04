grammar task;



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

// Parser rules
s returns [int diff , int check , int even] :
 'a' s1 = s 'a' {$diff = $s1.diff; $check = $s1.check; $even = $s1.even;}
  | 'b' s1 = s 'b' {$diff = $s1.diff; $check = $s1.check * $s1.even; $even = $s1.even;}
  | 'a' s1 = s 'b' {$diff = $s1.diff + 1; $check = ($s1.check + equals($s1.diff, 0)) *  $s1.even; $even = $s1.even;}
  | 'b' s1 = s 'a' {$diff = $s1.diff - 1; $check = ($s1.check - equals($s1.diff, 1)) * $s1.even ;$even = $s1.even;}
  | 'a' {$diff = 1; $check = 0; $even = 0;}
  | 'b' {$diff = -1; $check = 0; $even = 0;}
  | {$diff = 0; $check = 0; $even = 1;};



WS : (' ' | '\t' | '\r' | '\n') {skip();};