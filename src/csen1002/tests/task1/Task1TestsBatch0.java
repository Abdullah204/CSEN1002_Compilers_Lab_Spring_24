package csen1002.tests.task1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task1.RegExToNfa;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task1TestsBatch0 {

	@Test
	public void testRegEx1() {
		RegExToNfa regExToNfa = new RegExToNfa("t;w;x#wt|*x.");
		assertEquals("0;1;2;3;4;5;6;7;9#t;w;x#0,w,1;1,e,5;2,t,3;3,e,5;4,e,0;4,e,2;5,e,4;5,e,7;6,e,4;6,e,7;7,x,9#6#9",
				regExToNfa.toString());
	}

	@Test
	public void testRegEx2() {
		RegExToNfa regExToNfa = new RegExToNfa("d;i;j;p;t#dt*j|ip.|.");
		assertEquals(
				"0;1;2;3;4;5;6;7;8;9;10;11;13;15#d;i;j;p;t#0,d,1;1,e,8;1,e,10;2,t,3;3,e,2;3,e,5;4,e,2;4,e,5;5,e,9;6,j,7;7,e,9;8,e,4;8,e,6;9,e,15;10,i,11;11,p,13;13,e,15#0#15",
				regExToNfa.toString());
	}

	@Test
	public void testRegEx3() {
		RegExToNfa regExToNfa = new RegExToNfa("c;n#cen|.");
		assertEquals("0;1;2;3;4;5;7#c;n#0,c,1;1,e,2;1,e,4;2,e,3;3,e,7;4,n,5;5,e,7#0#7", regExToNfa.toString());
	}

	@Test
	public void testRegEx4() {
		RegExToNfa regExToNfa = new RegExToNfa("a;i;q;v#iaq.q.va|.|");
		assertEquals(
				"0;1;2;3;5;7;8;9;10;11;13;14;15#a;i;q;v#0,i,1;1,e,15;2,a,3;3,q,5;5,q,7;7,e,8;7,e,10;8,v,9;9,e,13;10,a,11;11,e,13;13,e,15;14,e,0;14,e,2#14#15",
				regExToNfa.toString());
	}

	@Test
	public void testRegEx5() {
		RegExToNfa regExToNfa = new RegExToNfa("d;n;o;t#odn.t||");
		assertEquals(
				"0;1;2;3;5;6;7;8;9;10;11#d;n;o;t#0,o,1;1,e,11;2,d,3;3,n,5;5,e,9;6,t,7;7,e,9;8,e,2;8,e,6;9,e,11;10,e,0;10,e,8#10#11",
				regExToNfa.toString());
	}

	@Test
	public void testRegEx6() {
		RegExToNfa regExToNfa = new RegExToNfa("f;s;u;x#sx|fu|*x..");
		assertEquals(
				"0;1;2;3;4;5;6;7;8;9;10;11;13;15#f;s;u;x#0,s,1;1,e,5;2,x,3;3,e,5;4,e,0;4,e,2;5,e,10;5,e,13;6,f,7;7,e,11;8,u,9;9,e,11;10,e,6;10,e,8;11,e,10;11,e,13;13,x,15#4#15",
				regExToNfa.toString());
	}

	@Test
	public void testRegEx7() {
		RegExToNfa regExToNfa = new RegExToNfa("f;g;t#gt.gf..");
		assertEquals("0;1;3;5;7#f;g;t#0,g,1;1,t,3;3,g,5;5,f,7#0#7", regExToNfa.toString());
	}

	@Test
	public void testRegEx8() {
		RegExToNfa regExToNfa = new RegExToNfa("h;q#hhq.|");
		assertEquals("0;1;2;3;5;6;7#h;q#0,h,1;1,e,7;2,h,3;3,q,5;5,e,7;6,e,0;6,e,2#6#7", regExToNfa.toString());
	}

	@Test
	public void testRegEx9() {
		RegExToNfa regExToNfa = new RegExToNfa("f;j;k;y#jf.yyk..*|");
		assertEquals(
				"0;1;3;4;5;7;9;10;11;12;13#f;j;k;y#0,j,1;1,f,3;3,e,13;4,y,5;5,y,7;7,k,9;9,e,4;9,e,11;10,e,4;10,e,11;11,e,13;12,e,0;12,e,10#12#13",
				regExToNfa.toString());
	}

	@Test
	public void testRegEx10() {
		RegExToNfa regExToNfa = new RegExToNfa("g;u;x#x*x|gu|*.");
		assertEquals(
				"0;1;2;3;4;5;6;7;8;9;10;11;12;13;15#g;u;x#0,x,1;1,e,0;1,e,3;2,e,0;2,e,3;3,e,7;4,x,5;5,e,7;6,e,2;6,e,4;7,e,12;7,e,15;8,g,9;9,e,13;10,u,11;11,e,13;12,e,8;12,e,10;13,e,12;13,e,15#6#15",
				regExToNfa.toString());
	}

}