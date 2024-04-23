package csen1002.tests.task8;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task8.CfgLl1Parser;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task8TestsBatch0 {

	@Test
	public void testCfg1String1() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;O;N;F;C#c;f;n;o;p;w;x#S/xSnO,nSOO,wC;O/xFw,nNx;N/wSO,oS,e;F/c,pC,e;C/fCxF,n#S/x,n,w;O/x,n;N/w,o,e;F/c,p,e;C/f,n#S/$nx;O/$nx;N/x;F/$nwx;C/$nwx");
		assertEquals("S;nSOO;nnSOOOO;nnxSnOOOOO;nnxxSnOnOOOOO;nnxxxSnOnOnOOOOO;nnxxxwCnOnOnOOOOO;ERROR", cfgLl1Parser.parse("nnxxxwxn"));
	}

	@Test
	public void testCfg1String2() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;O;N;F;C#c;f;n;o;p;w;x#S/xSnO,nSOO,wC;O/xFw,nNx;N/wSO,oS,e;F/c,pC,e;C/fCxF,n#S/x,n,w;O/x,n;N/w,o,e;F/c,p,e;C/f,n#S/$nx;O/$nx;N/x;F/$nwx;C/$nwx");
		assertEquals("S;nSOO;nnSOOOO;nnwCOOOO;nnwnOOOO;nnwnnNxOOO;nnwnnwSOxOOO;ERROR", cfgLl1Parser.parse("nnwnnwco"));
	}

	@Test
	public void testCfg1String3() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;O;N;F;C#c;f;n;o;p;w;x#S/xSnO,nSOO,wC;O/xFw,nNx;N/wSO,oS,e;F/c,pC,e;C/fCxF,n#S/x,n,w;O/x,n;N/w,o,e;F/c,p,e;C/f,n#S/$nx;O/$nx;N/x;F/$nwx;C/$nwx");
		assertEquals("S;wC;wfCxF;wffCxFxF;wfffCxFxFxF;wfffnxFxFxF;wfffnxcxFxF;wfffnxcxxF;wfffnxcxxc", cfgLl1Parser.parse("wfffnxcxxc"));
	}

	@Test
	public void testCfg1String4() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;O;N;F;C#c;f;n;o;p;w;x#S/xSnO,nSOO,wC;O/xFw,nNx;N/wSO,oS,e;F/c,pC,e;C/fCxF,n#S/x,n,w;O/x,n;N/w,o,e;F/c,p,e;C/f,n#S/$nx;O/$nx;N/x;F/$nwx;C/$nwx");
		assertEquals("S;nSOO;nxSnOOO;nxxSnOnOOO;nxxwCnOnOOO;nxxwfCxFnOnOOO;nxxwfnxFnOnOOO;ERROR", cfgLl1Parser.parse("nxxwfnww"));
	}

	@Test
	public void testCfg1String5() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;O;N;F;C#c;f;n;o;p;w;x#S/xSnO,nSOO,wC;O/xFw,nNx;N/wSO,oS,e;F/c,pC,e;C/fCxF,n#S/x,n,w;O/x,n;N/w,o,e;F/c,p,e;C/f,n#S/$nx;O/$nx;N/x;F/$nwx;C/$nwx");
		assertEquals("S;nSOO;nnSOOOO;nnwCOOOO;nnwnOOOO;nnwnnNxOOO;nnwnnoSxOOO;nnwnnowCxOOO;nnwnnownxOOO;ERROR", cfgLl1Parser.parse("nnwnnown"));
	}

	@Test
	public void testCfg2String1() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;Y;W;T;R#j;m;o;r;u;v;z#S/u,vS,oTuS,z;Y/vRo,jY,e;W/z,m,rSu,e;T/vR,rW,e;R/j,mSSY,z#S/u,v,o,z;Y/v,j,e;W/z,m,r,e;T/v,r,e;R/j,m,z#S/$ouvz;Y/ou;W/u;T/u;R/ou");
		assertEquals("S;vS;vvS;vvvS;vvvvS;vvvvoTuS;vvvvorWuS;vvvvoruS;vvvvoruz", cfgLl1Parser.parse("vvvvoruz"));
	}

	@Test
	public void testCfg2String2() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;Y;W;T;R#j;m;o;r;u;v;z#S/u,vS,oTuS,z;Y/vRo,jY,e;W/z,m,rSu,e;T/vR,rW,e;R/j,mSSY,z#S/u,v,o,z;Y/v,j,e;W/z,m,r,e;T/v,r,e;R/j,m,z#S/$ouvz;Y/ou;W/u;T/u;R/ou");
		assertEquals("S;vS;voTuS;vorWuS;vorrSuuS;vorrvSuuS;vorrvvSuuS;vorrvvoTuSuuS;ERROR", cfgLl1Parser.parse("vorrvvo"));
	}

	@Test
	public void testCfg2String3() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;Y;W;T;R#j;m;o;r;u;v;z#S/u,vS,oTuS,z;Y/vRo,jY,e;W/z,m,rSu,e;T/vR,rW,e;R/j,mSSY,z#S/u,v,o,z;Y/v,j,e;W/z,m,r,e;T/v,r,e;R/j,m,z#S/$ouvz;Y/ou;W/u;T/u;R/ou");
		assertEquals("S;vS;voTuS;vorWuS;vormuS;vormuoTuS;vormuovRuS;ERROR", cfgLl1Parser.parse("vormuov"));
	}

	@Test
	public void testCfg2String4() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;Y;W;T;R#j;m;o;r;u;v;z#S/u,vS,oTuS,z;Y/vRo,jY,e;W/z,m,rSu,e;T/vR,rW,e;R/j,mSSY,z#S/u,v,o,z;Y/v,j,e;W/z,m,r,e;T/v,r,e;R/j,m,z#S/$ouvz;Y/ou;W/u;T/u;R/ou");
		assertEquals("S;oTuS;ovRuS;ovmSSYuS;ovmoTuSSYuS;ovmouSSYuS;ovmouoTuSSYuS;ERROR", cfgLl1Parser.parse("ovmouooj"));
	}

	@Test
	public void testCfg2String5() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;Y;W;T;R#j;m;o;r;u;v;z#S/u,vS,oTuS,z;Y/vRo,jY,e;W/z,m,rSu,e;T/vR,rW,e;R/j,mSSY,z#S/u,v,o,z;Y/v,j,e;W/z,m,r,e;T/v,r,e;R/j,m,z#S/$ouvz;Y/ou;W/u;T/u;R/ou");
		assertEquals("S;oTuS;ouS;ouvS;ouvoTuS;ouvovRuS;ouvovzuS;ouvovzuoTuS;ouvovzuouS;ouvovzuouz", cfgLl1Parser.parse("ouvovzuouz"));
	}

}