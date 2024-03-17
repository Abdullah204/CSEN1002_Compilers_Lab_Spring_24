package csen1002.tests.task1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task1.RegExToNfa;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task1TestsBatch4 {

	@Test
	public void testRegEx1() {
		RegExToNfa regExToNfa= new RegExToNfa("h;l;w#lhew.|*.*");
		assertEquals("0;1;2;3;4;5;7;8;9;11;12;13#h;l;w#0,l,1;1,e,8;1,e,11;2,h,3;3,e,9;4,e,5;5,w,7;7,e,9;8,e,2;8,e,4;9,e,8;9,e,11;11,e,0;11,e,13;12,e,0;12,e,13#12#13", regExToNfa.toString());
	}

	@Test
	public void testRegEx2() {
		RegExToNfa regExToNfa= new RegExToNfa("u;w#wu|*");
		assertEquals("0;1;2;3;4;5;6;7#u;w#0,w,1;1,e,5;2,u,3;3,e,5;4,e,0;4,e,2;5,e,4;5,e,7;6,e,4;6,e,7#6#7", regExToNfa.toString());
	}

	@Test
	public void testRegEx3() {
		RegExToNfa regExToNfa= new RegExToNfa("v;y#yevy..|*y.");
		assertEquals("0;1;2;3;5;7;8;9;10;11;13#v;y#0,y,1;1,e,9;2,e,3;3,v,5;5,y,7;7,e,9;8,e,0;8,e,2;9,e,8;9,e,11;10,e,8;10,e,11;11,y,13#10#13", regExToNfa.toString());
	}

	@Test
	public void testRegEx4() {
		RegExToNfa regExToNfa= new RegExToNfa("g;r#r*g.r.e.");
		assertEquals("0;1;2;3;5;7;9#g;r#0,r,1;1,e,0;1,e,3;2,e,0;2,e,3;3,g,5;5,r,7;7,e,9#2#9", regExToNfa.toString());
	}

	@Test
	public void testRegEx5() {
		RegExToNfa regExToNfa= new RegExToNfa("q;t#q*t*.");
		assertEquals("0;1;2;3;4;5;7#q;t#0,q,1;1,e,0;1,e,3;2,e,0;2,e,3;3,e,4;3,e,7;4,t,5;5,e,4;5,e,7#2#7", regExToNfa.toString());
	}

	@Test
	public void testRegEx6() {
		RegExToNfa regExToNfa= new RegExToNfa("d;f#ed|ff|.");
		assertEquals("0;1;2;3;4;5;6;7;8;9;11#d;f#0,e,1;1,e,5;2,d,3;3,e,5;4,e,0;4,e,2;5,e,6;5,e,8;6,f,7;7,e,11;8,f,9;9,e,11#4#11", regExToNfa.toString());
	}

	@Test
	public void testRegEx7() {
		RegExToNfa regExToNfa= new RegExToNfa("l;n;w;x;z#wlnz.x.*..*");
		assertEquals("0;1;3;4;5;7;9;11;12;13#l;n;w;x;z#0,w,1;1,l,3;3,e,4;3,e,11;4,n,5;5,z,7;7,x,9;9,e,4;9,e,11;11,e,0;11,e,13;12,e,0;12,e,13#12#13", regExToNfa.toString());
	}

	@Test
	public void testRegEx8() {
		RegExToNfa regExToNfa= new RegExToNfa("g;k;p;q#gpqqe.|.k.|");
		assertEquals("0;1;2;3;4;5;6;7;9;11;13;14;15#g;k;p;q#0,g,1;1,e,15;2,p,3;3,e,4;3,e,6;4,q,5;5,e,11;6,q,7;7,e,9;9,e,11;11,k,13;13,e,15;14,e,0;14,e,2#14#15", regExToNfa.toString());
	}

	@Test
	public void testRegEx9() {
		RegExToNfa regExToNfa= new RegExToNfa("b;g#eg*|b.");
		assertEquals("0;1;2;3;4;5;6;7;9#b;g#0,e,1;1,e,7;2,g,3;3,e,2;3,e,5;4,e,2;4,e,5;5,e,7;6,e,0;6,e,4;7,b,9#6#9", regExToNfa.toString());
	}

	@Test
	public void testRegEx10() {
		RegExToNfa regExToNfa= new RegExToNfa("c;f;p;q;y#pcy*q*f|.|.");
		assertEquals("0;1;2;3;4;5;6;7;8;9;10;11;12;13;15;17#c;f;p;q;y#0,p,1;1,e,2;1,e,6;2,c,3;3,e,17;4,y,5;5,e,4;5,e,7;6,e,4;6,e,7;7,e,10;7,e,12;8,q,9;9,e,8;9,e,11;10,e,8;10,e,11;11,e,15;12,f,13;13,e,15;15,e,17#0#17", regExToNfa.toString());
	}

}