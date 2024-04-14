package csen1002.tests.task6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task6.CfgFirstFollow;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task6TestsBatch0 {

	@Test
	public void testCfg1First() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;P;I;T;W;X;C#g;h;l;t;v;x;z#S/gXCPI,SvI;P/g,gThCX,W;I/Sv,XXIC,S;T/XTWx,TCT,WP,hITXS,SCTXh,lWt;W/IWWX,vCXT,e,X,S,I;X/xCx,z,e,X;C/vXX,xXCXX,PITx,zX,SlPv");
		assertEquals("S/g;P/egvxz;I/gxz;T/eghlvxz;W/egvxz;X/exz;C/gvxz", cfgFirstFollow.first());
	}
	
	@Test
	public void testCfg1Follow() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;P;I;T;W;X;C#g;h;l;t;v;x;z#S/gXCPI,SvI;P/g,gThCX,W;I/Sv,XXIC,S;T/XTWx,TCT,WP,hITXS,SCTXh,lWt;W/IWWX,vCXT,e,X,S,I;X/xCx,z,e,X;C/vXX,xXCXX,PITx,zX,SlPv");
		assertEquals("S/$ghltvxz;P/ghtvxz;I/$ghltvxz;T/ghtvxz;W/ghtvxz;X/$ghltvxz;C/$ghltvxz", cfgFirstFollow.follow());
	}

	@Test
	public void testCfg2First() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;Z;Q;F;C;B;I#a;g;m;s;v;y#S/gQCFC,Bm;Z/IBS,C,s,B,S;Q/QyCy,mSC,vBg,IZ,e;F/gIa,C,e,F;C/gIF,CQFC,C;B/ZS,ZF,F,S;I/y,Cv,gZmCy,BFIQI,BIIS,sZg");
		assertEquals("S/gmsy;Z/egmsy;Q/egmsvy;F/eg;C/g;B/egmsy;I/gmsy", cfgFirstFollow.first());
	}
	
	@Test
	public void testCfg2Follow() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;Z;Q;F;C;B;I#a;g;m;s;v;y#S/gQCFC,Bm;Z/IBS,C,s,B,S;Q/QyCy,mSC,vBg,IZ,e;F/gIa,C,e,F;C/gIF,CQFC,C;B/ZS,ZF,F,S;I/y,Cv,gZmCy,BFIQI,BIIS,sZg");
		assertEquals("S/$agmsvy;Z/gmsy;Q/gmsy;F/$agmsvy;C/$agmsvy;B/gmsy;I/$agmsvy", cfgFirstFollow.follow());
	}

	@Test
	public void testCfg3First() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;W;D;T;E;H;Y#b;f;n;o;x#S/nWDx,ETxYf,S,T;W/H,HxE,f,e;D/xSEoH,WDxEE,YT,fTS,EHWD;T/SEn,nTb,e,S,E;E/xT,nTSTS,o;H/ETDW,WHWoW,SDW,EYHTE,S;Y/oWoDT,SWWHW,oTb,TWoH,S,DfT");
		assertEquals("S/enox;W/efnox;D/efnox;T/enox;E/nox;H/efnox;Y/efnox", cfgFirstFollow.first());
	}
	
	@Test
	public void testCfg3Follow() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;W;D;T;E;H;Y#b;f;n;o;x#S/nWDx,ETxYf,S,T;W/H,HxE,f,e;D/xSEoH,WDxEE,YT,fTS,EHWD;T/SEn,nTb,e,S,E;E/xT,nTSTS,o;H/ETDW,WHWoW,SDW,EYHTE,S;Y/oWoDT,SWWHW,oTb,TWoH,S,DfT");
		assertEquals("S/$bfnox;W/fnox;D/fnox;T/$bfnox;E/$bfnox;H/fnox;Y/fnox", cfgFirstFollow.follow());
	}

	@Test
	public void testCfg4First() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;Y;X;C;A;B;L#a;l;m;o;p;r;t#S/aYX,l;Y/CY,BlLY,SlC,C;X/rCtAp,CmX,ASXp;C/ACA,A,e,S,X;A/SYm,XSA,e,A;B/BCSXS,CXYoA,m,Yt;L/BC,Y,AX,LBC,oSX");
		assertEquals("S/al;Y/aelmrt;X/almr;C/aelmr;A/aelmr;B/almrt;L/aelmort", cfgFirstFollow.first());
	}
	
	@Test
	public void testCfg4Follow() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;Y;X;C;A;B;L#a;l;m;o;p;r;t#S/aYX,l;Y/CY,BlLY,SlC,C;X/rCtAp,CmX,ASXp;C/ACA,A,e,S,X;A/SYm,XSA,e,A;B/BCSXS,CXYoA,m,Yt;L/BC,Y,AX,LBC,oSX");
		assertEquals("S/$almoprt;Y/almort;X/$almoprt;C/almort;A/almoprt;B/almort;L/almort", cfgFirstFollow.follow());
	}

	@Test
	public void testCfg5First() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;Z;R;D;E;U;O#i;l;m;p;q;u;x#S/x,E;Z/EOl,RRO,U;R/SxDx,ZSxUp,U,Ux,Z,S;D/iZpZ,UxO,R,e;E/ZZOq,Ox;U/uOE,pEZmO,e,U;O/U,p,m,ORE");
		assertEquals("S/mpqux;Z/empqux;R/empqux;D/eimpqux;E/mpqux;U/epu;O/empqux", cfgFirstFollow.first());
	}
	
	@Test
	public void testCfg5Follow() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;Z;R;D;E;U;O#i;l;m;p;q;u;x#S/x,E;Z/EOl,RRO,U;R/SxDx,ZSxUp,U,Ux,Z,S;D/iZpZ,UxO,R,e;E/ZZOq,Ox;U/uOE,pEZmO,e,U;O/U,p,m,ORE");
		assertEquals("S/$mpqux;Z/mpqux;R/mpqux;D/x;E/$lmpqux;U/lmpqux;O/lmpqux", cfgFirstFollow.follow());
	}
	
}