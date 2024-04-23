package csen1002.tests.task6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task6.CfgFirstFollow;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task6TestsBatch2 {

	@Test
	public void testCfg1First() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;P;J;U;M;R#a;i;r;v;x;y#S/Jx,iP,PJSr,S;P/PRx,yPP;J/JRU,P,S,iPR,U;U/xPR,PPaUR,e;M/PiS,Ry,r,J,e,U,M;R/PMvU,SJv,U,Ui");
		assertEquals("S/ixy;P/y;J/eixy;U/exy;M/eirxy;R/eixy", cfgFirstFollow.first());
	}
	
	@Test
	public void testCfg1Follow() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;P;J;U;M;R#a;i;r;v;x;y#S/Jx,iP,PJSr,S;P/PRx,yPP;J/JRU,P,S,iPR,U;U/xPR,PPaUR,e;M/PiS,Ry,r,J,e,U,M;R/PMvU,SJv,U,Ui");
		assertEquals("S/$irvxy;P/$airvxy;J/ivxy;U/ivxy;M/v;R/ivxy", cfgFirstFollow.follow());
	}

	@Test
	public void testCfg2First() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;G;F;M;W;E#a;b;c;p;u;x;y#S/FF,ySxGu,xS,xSEc,F,G;G/xF,uSpMu,e;F/GySy,a,G;M/bFbSG,E,pSbG,EGE,e;W/aG,F,GFW,FWEEu,xScMx,b,e,G,S,M;E/GGuF,FaW,G");
		assertEquals("S/aeuxy;G/eux;F/aeuxy;M/abepuxy;W/abepuxy;E/aeuxy", cfgFirstFollow.first());
	}
	
	@Test
	public void testCfg2Follow() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;G;F;M;W;E#a;b;c;p;u;x;y#S/FF,ySxGu,xS,xSEc,F,G;G/xF,uSpMu,e;F/GySy,a,G;M/bFbSG,E,pSbG,EGE,e;W/aG,F,GFW,FWEEu,xScMx,b,e,G,S,M;E/GGuF,FaW,G");
		assertEquals("S/$abcpuxy;G/$abcpuxy;F/$abcpuxy;M/acuxy;W/acuxy;E/acuxy", cfgFirstFollow.follow());
	}

	@Test
	public void testCfg3First() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;P;F;U;N;D;L#d;f;j;m;t#S/f,DdDmS,dU,fUFtU,NSfPd;P/f,tDD,e;F/SmNP,f,LN,F,S;U/j,d,UfNL,e;N/fLUjU,SPS,P,tU,FdNm,N;D/f,fLSjN,dSDS,DFD,N;L/tL,mU,NmSjS");
		assertEquals("S/dfmt;P/eft;F/dfmt;U/defj;N/defmt;D/defmt;L/dfmt", cfgFirstFollow.first());
	}
	
	@Test
	public void testCfg3Follow() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;P;F;U;N;D;L#d;f;j;m;t#S/f,DdDmS,dU,fUFtU,NSfPd;P/f,tDD,e;F/SmNP,f,LN,F,S;U/j,d,UfNL,e;N/fLUjU,SPS,P,tU,FdNm,N;D/f,fLSjN,dSDS,DFD,N;L/tL,mU,NmSjS");
		assertEquals("S/$dfjmt;P/dfmt;F/dfmt;U/$dfjmt;N/dfmt;D/dfmt;L/$dfjmt", cfgFirstFollow.follow());
	}

	@Test
	public void testCfg4First() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;E;R;G;L;K;O#l;n;p;r;z#S/lSnEn,SnR;E/GS,rSR,LL,lKRl,KRn,e,E,S;R/GKEz,zOEp,OSOr;G/L,GpKzS,S;L/lRL,SzS,e,L;K/l,SOKl,G;O/Kr,LSOG,Sl,rLzRG,Rp");
		assertEquals("S/l;E/elprz;R/lprz;G/elp;L/el;K/elp;O/lprz", cfgFirstFollow.first());
	}
	
	@Test
	public void testCfg4Follow() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;E;R;G;L;K;O#l;n;p;r;z#S/lSnEn,SnR;E/GS,rSR,LL,lKRl,KRn,e,E,S;R/GKEz,zOEp,OSOr;G/L,GpKzS,S;L/lRL,SzS,e,L;K/l,SOKl,G;O/Kr,LSOG,Sl,rLzRG,Rp");
		assertEquals("S/$lnprz;E/npz;R/$lnprz;G/lprz;L/lnprz;K/lprz;O/lprz", cfgFirstFollow.follow());
	}

	@Test
	public void testCfg5First() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;M;K;F;B;O;X#d;g;h;i;n;q;w#S/n,X,iF;M/XSKMX,d,XFgSK,K;K/ShSSg,OB,qX,BwXd,OSqF,e,S,M;F/qB,wBS;B/S,iMXF,w,e;O/nF,hOXS,SOBMh,B,OwBX,K;X/h,qBOX");
		assertEquals("S/hinq;M/dehinqw;K/dehinqw;F/qw;B/ehinqw;O/dehinqw;X/hq", cfgFirstFollow.first());
	}
	
	@Test
	public void testCfg5Follow() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;M;K;F;B;O;X#d;g;h;i;n;q;w#S/n,X,iF;M/XSKMX,d,XFgSK,K;K/ShSSg,OB,qX,BwXd,OSqF,e,S,M;F/qB,wBS;B/S,iMXF,w,e;O/nF,hOXS,SOBMh,B,OwBX,K;X/h,qBOX");
		assertEquals("S/$dghinqw;M/dhinqw;K/dhinqw;F/$dghinqw;B/$dghinqw;O/dhinqw;X/$dghinqw", cfgFirstFollow.follow());
	}

}