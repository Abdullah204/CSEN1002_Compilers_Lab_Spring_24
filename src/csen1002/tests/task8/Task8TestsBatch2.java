package csen1002.tests.task8;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task8.CfgLl1Parser;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task8TestsBatch2 {

	@Test
	public void testCfg1String1() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;D;E;M;U#a;d;g;h;m;r;z#S/zDzU,d,gDg;D/rS,aMzS;E/Ug,hE,e;M/mEaM,gE,e;U/gS,dU#S/z,d,g;D/r,a;E/dg,h,e;M/m,g,e;U/g,d#S/$gz;D/gz;E/az;M/z;U/$gz");
		assertEquals("S;zDzU;zaMzSzU;zamEaMzSzU;zamaMzSzU;zamazSzU;zamazzDzUzU;ERROR", cfgLl1Parser.parse("zamazzzm"));
	}

	@Test
	public void testCfg1String2() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;D;E;M;U#a;d;g;h;m;r;z#S/zDzU,d,gDg;D/rS,aMzS;E/Ug,hE,e;M/mEaM,gE,e;U/gS,dU#S/z,d,g;D/r,a;E/dg,h,e;M/m,g,e;U/g,d#S/$gz;D/gz;E/az;M/z;U/$gz");
		assertEquals("S;gDg;gaMzSg;gagEzSg;gaghEzSg;gaghUgzSg;gaghgSgzSg;ERROR", cfgLl1Parser.parse("gaghgahg"));
	}

	@Test
	public void testCfg1String3() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;D;E;M;U#a;d;g;h;m;r;z#S/zDzU,d,gDg;D/rS,aMzS;E/Ug,hE,e;M/mEaM,gE,e;U/gS,dU#S/z,d,g;D/r,a;E/dg,h,e;M/m,g,e;U/g,d#S/$gz;D/gz;E/az;M/z;U/$gz");
		assertEquals("S;gDg;gaMzSg;gagEzSg;gaghEzSg;gaghUgzSg;gaghdUgzSg;ERROR", cfgLl1Parser.parse("gaghdzhm"));
	}

	@Test
	public void testCfg1String4() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;D;E;M;U#a;d;g;h;m;r;z#S/zDzU,d,gDg;D/rS,aMzS;E/Ug,hE,e;M/mEaM,gE,e;U/gS,dU#S/z,d,g;D/r,a;E/dg,h,e;M/m,g,e;U/g,d#S/$gz;D/gz;E/az;M/z;U/$gz");
		assertEquals("S;gDg;gaMzSg;gagEzSg;gagUgzSg;gaggSgzSg;gaggdgzSg;gaggdgzdg", cfgLl1Parser.parse("gaggdgzdg"));
	}

	@Test
	public void testCfg1String5() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;D;E;M;U#a;d;g;h;m;r;z#S/zDzU,d,gDg;D/rS,aMzS;E/Ug,hE,e;M/mEaM,gE,e;U/gS,dU#S/z,d,g;D/r,a;E/dg,h,e;M/m,g,e;U/g,d#S/$gz;D/gz;E/az;M/z;U/$gz");
		assertEquals("S;gDg;gaMzSg;gamEaMzSg;gamhEaMzSg;gamhUgaMzSg;gamhgSgaMzSg;gamhgzDzUgaMzSg;ERROR", cfgLl1Parser.parse("gamhgzha"));
	}

	@Test
	public void testCfg2String1() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;I;O;W;J#a;i;j;n;p;q;r#S/rJ,JW;I/J,iI,e;O/iIj,j,e;W/Jp,pO,nSr,e;J/q,a#S/r,aq;I/aq,i,e;O/i,j,e;W/aq,p,n,e;J/q,a#S/$r;I/j;O/$r;W/$r;J/$ajnpqr");
		assertEquals("S;JW;aW;anSr;anJWr;anqWr;anqpOr;anqpiIjr;anqpiiIjr;anqpiiiIjr;anqpiiiJjr;anqpiiiajr", cfgLl1Parser.parse("anqpiiiajr"));
	}

	@Test
	public void testCfg2String2() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;I;O;W;J#a;i;j;n;p;q;r#S/rJ,JW;I/J,iI,e;O/iIj,j,e;W/Jp,pO,nSr,e;J/q,a#S/r,aq;I/aq,i,e;O/i,j,e;W/aq,p,n,e;J/q,a#S/$r;I/j;O/$r;W/$r;J/$ajnpqr");
		assertEquals("S;JW;aW;anSr;anJWr;anaWr;ananSrr;ananJWrr;ananaWrr;ananaJprr;ananaqprr;ERROR", cfgLl1Parser.parse("ananaqja"));
	}

	@Test
	public void testCfg2String3() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;I;O;W;J#a;i;j;n;p;q;r#S/rJ,JW;I/J,iI,e;O/iIj,j,e;W/Jp,pO,nSr,e;J/q,a#S/r,aq;I/aq,i,e;O/i,j,e;W/aq,p,n,e;J/q,a#S/$r;I/j;O/$r;W/$r;J/$ajnpqr");
		assertEquals("S;JW;qW;qnSr;qnJWr;qnaWr;qnaJpr;qnaqpr;ERROR", cfgLl1Parser.parse("qnaqprrj"));
	}

	@Test
	public void testCfg2String4() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;I;O;W;J#a;i;j;n;p;q;r#S/rJ,JW;I/J,iI,e;O/iIj,j,e;W/Jp,pO,nSr,e;J/q,a#S/r,aq;I/aq,i,e;O/i,j,e;W/aq,p,n,e;J/q,a#S/$r;I/j;O/$r;W/$r;J/$ajnpqr");
		assertEquals("S;JW;aW;apO;apiIj;apiJj;apiqj;ERROR", cfgLl1Parser.parse("apiqnrnj"));
	}

	@Test
	public void testCfg2String5() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;I;O;W;J#a;i;j;n;p;q;r#S/rJ,JW;I/J,iI,e;O/iIj,j,e;W/Jp,pO,nSr,e;J/q,a#S/r,aq;I/aq,i,e;O/i,j,e;W/aq,p,n,e;J/q,a#S/$r;I/j;O/$r;W/$r;J/$ajnpqr");
		assertEquals("S;JW;aW;apO;apiIj;apiiIj;apiiiIj;apiiiJj;apiiiqj", cfgLl1Parser.parse("apiiiqj"));
	}

}