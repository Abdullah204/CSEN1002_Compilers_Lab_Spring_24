package csen1002.tests.task4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task4.CfgEpsUnitElim;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task4TestsBatch0 {

	@Test
	public void testCfgEpsilonRuleElimination1() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;V;Z;R;W#m;n;w#S/RnV,m;V/S,V,Z,e,n,nRmWS,nVmRR;Z/S,WwZ,ZRR,e,nSnV;R/R,SRwVZ,SW,Zw,e;W/ZVR,mWn");
		cfgEpsUnitElim.eliminateEpsilonRules();
		assertEquals("S;V;Z;R;W#m;n;w#S/Rn,RnV,m,n,nV;V/S,V,Z,n,nRmS,nRmWS,nVm,nVmR,nVmRR,nm,nmR,nmRR,nmS,nmWS;Z/R,RR,S,Ww,WwZ,Z,ZR,ZRR,nSn,nSnV,w,wZ;R/R,S,SRw,SRwV,SRwVZ,SRwZ,SW,Sw,SwV,SwVZ,SwZ,Zw,w;W/R,V,VR,Z,ZR,ZV,ZVR,mWn,mn", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonRuleElimination2() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;O;T;L;K;V#b;m;q#S/KTObT,S,Sm,qTLLS;O/KqT,VLbT,VmLK,b,e;T/KqO,bLLq,bVO,e;L/L,VbK,bSmV,m;K/KbSTK,L,O,bSq;V/OOK,OOOmV");
		cfgEpsUnitElim.eliminateEpsilonRules();
		assertEquals("S;O;T;L;K;V#b;m;q#S/KOb,KObT,KTOb,KTObT,KTb,KTbT,Kb,KbT,Ob,ObT,S,Sm,TOb,TObT,Tb,TbT,b,bT,qLLS,qTLLS;O/Kq,KqT,Lb,LbT,VLb,VLbT,VmL,VmLK,b,mL,mLK,q,qT;T/Kq,KqO,b,bLLq,bO,bV,bVO,q,qO;L/L,Vb,VbK,b,bK,bSm,bSmV,m;K/KbS,KbSK,KbST,KbSTK,L,O,bS,bSK,bST,bSTK,bSq;V/K,O,OK,OO,OOK,OOOm,OOOmV,OOm,OOmV,Om,OmV,m,mV", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonRuleElimination3() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;R;K;Q;Y#b;d;h;y#S/KQRQy,S,yQSS,yS;R/K,YRy,d,e,hSRR;K/K,KS,Q,SR,e,ySQRR;Q/K,R,b,e,hSbR;Y/KY,RRyRQ,yRSQ");
		cfgEpsUnitElim.eliminateEpsilonRules();
		assertEquals("S;R;K;Q;Y#b;d;h;y#S/KQQy,KQRQy,KQRy,KQy,KRQy,KRy,Ky,QQy,QRQy,QRy,Qy,RQy,Ry,S,y,yQSS,yS,ySS;R/K,YRy,Yy,d,hS,hSR,hSRR;K/K,KS,Q,S,SR,yS,ySQ,ySQR,ySQRR,ySR,ySRR;Q/K,R,b,hSb,hSbR;Y/KY,RRy,RRyQ,RRyR,RRyRQ,Ry,RyQ,RyR,RyRQ,Y,y,yQ,yR,yRQ,yRS,yRSQ,yS,ySQ", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgUnitRuleElimination1() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;D;G;B;T;A#q;u;w#S/BGTBT,D,DuSA,G,GBw,TuTq;D/A,Au,S,uST,wDwDq;G/TG,uTSG,wS;B/DGS,G,T;T/B,BuT,D,G,qD,uB;A/BT,uT,wT");
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;D;G;B;T;A#q;u;w#S/Au,BGTBT,BT,DuSA,GBw,TG,TuTq,uST,uT,uTSG,wDwDq,wS,wT;D/Au,BGTBT,BT,DuSA,GBw,TG,TuTq,uST,uT,uTSG,wDwDq,wS,wT;G/TG,uTSG,wS;B/Au,BGTBT,BT,BuT,DGS,DuSA,GBw,TG,TuTq,qD,uB,uST,uT,uTSG,wDwDq,wS,wT;T/Au,BGTBT,BT,BuT,DGS,DuSA,GBw,TG,TuTq,qD,uB,uST,uT,uTSG,wDwDq,wS,wT;A/BT,uT,wT", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgUnitRuleElimination2() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;G;P;E;I#l;v;z#S/E,IPl,P,S,lIz,lPG;G/GE,SEvP,lEE,zES;P/P,PG,zE;E/GlIlP,Sz,vGGl;I/GGv,vPlS,vSv,zIzG");
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;G;P;E;I#l;v;z#S/GlIlP,IPl,PG,Sz,lIz,lPG,vGGl,zE;G/GE,SEvP,lEE,zES;P/PG,zE;E/GlIlP,Sz,vGGl;I/GGv,vPlS,vSv,zIzG", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgUnitRuleElimination3() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;R;G;W;F;D;V#h;l;n#S/FFRn,R,RSRSS,S,WhFFD,hDn;R/F,RWW,SGFG;G/ShS,hWFSS,lD;W/D,F,FFF,lVnR;F/D,VhGl,hF;D/D,VlG,WnW;V/GnVl,n");
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;R;G;W;F;D;V#h;l;n#S/FFRn,RSRSS,RWW,SGFG,VhGl,VlG,WhFFD,WnW,hDn,hF;R/RWW,SGFG,VhGl,VlG,WnW,hF;G/ShS,hWFSS,lD;W/FFF,VhGl,VlG,WnW,hF,lVnR;F/VhGl,VlG,WnW,hF;D/VlG,WnW;V/GnVl,n", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonUnitRuleElimination1() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;T;D;F;H#a;c;l;r;w#S/THS,c,cF;T/DSTSH,HS,T;D/FDc,TrFT,aS,e;F/F,FF,S,T,e,lHHSw,rD,wHrTF;H/SFFwD,aD,cDSlS");
		cfgEpsUnitElim.eliminateEpsilonRules();
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;T;D;F;H#a;c;l;r;w#S/THS,c,cF;T/DSTSH,HS,STSH;D/Dc,FDc,Fc,TrFT,TrT,aS,c;F/DSTSH,FF,HS,STSH,THS,c,cF,lHHSw,r,rD,wHrT,wHrTF;H/SFFw,SFFwD,SFw,SFwD,Sw,SwD,a,aD,cDSlS,cSlS", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonUnitRuleElimination2() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;A;I;J;F;V#h;r;x;y#S/FFyA,S,hS;A/I,e,xVJrA,yArFy;I/FVhJ,SxIIx,e,hJx,r;J/A,IVShJ,SIrS,VyV;F/A,F,e,hA,yA,ySFJh;V/xFA,xVhJ,ySxV");
		cfgEpsUnitElim.eliminateEpsilonRules();
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;A;I;J;F;V#h;r;x;y#S/FFy,FFyA,Fy,FyA,hS,y,yA;A/FVh,FVhJ,SxIIx,SxIx,Sxx,Vh,VhJ,hJx,hx,r,xVJr,xVJrA,xVr,xVrA,yArFy,yAry,yrFy,yry;I/FVh,FVhJ,SxIIx,SxIx,Sxx,Vh,VhJ,hJx,hx,r;J/FVh,FVhJ,IVSh,IVShJ,SIrS,SrS,SxIIx,SxIx,Sxx,VSh,VShJ,Vh,VhJ,VyV,hJx,hx,r,xVJr,xVJrA,xVr,xVrA,yArFy,yAry,yrFy,yry;F/FVh,FVhJ,SxIIx,SxIx,Sxx,Vh,VhJ,h,hA,hJx,hx,r,xVJr,xVJrA,xVr,xVrA,y,yA,yArFy,yAry,ySFJh,ySFh,ySJh,ySh,yrFy,yry;V/x,xA,xF,xFA,xVh,xVhJ,ySxV", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonUnitRuleElimination3() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;E;V;H;F;D#d;j;r;x#S/EjSjD,j,r;E/FF,H,Sj,e;V/DDxVH,E,FEjH,H;H/E,HHSx,d,rEEdD,xS;F/E,S,Sj,SrVVd,e;D/Ex,xHd");
		cfgEpsUnitElim.eliminateEpsilonRules();
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;E;V;H;F;D#d;j;r;x#S/EjSjD,j,jSjD,r;E/EjSjD,FF,HHSx,HSx,Sj,SrVVd,SrVd,Srd,Sx,d,j,jSjD,r,rEEdD,rEdD,rdD,xS;V/DDx,DDxH,DDxV,DDxVH,Ej,EjH,EjSjD,FEj,FEjH,FF,Fj,FjH,HHSx,HSx,Sj,SrVVd,SrVd,Srd,Sx,d,j,jH,jSjD,r,rEEdD,rEdD,rdD,xS;H/EjSjD,FF,HHSx,HSx,Sj,SrVVd,SrVd,Srd,Sx,d,j,jSjD,r,rEEdD,rEdD,rdD,xS;F/EjSjD,FF,HHSx,HSx,Sj,SrVVd,SrVd,Srd,Sx,d,j,jSjD,r,rEEdD,rEdD,rdD,xS;D/Ex,x,xHd,xd", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonUnitRuleElimination4() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;Y;X;J;P#k;l;p#S/SpXkS,Y,pJkS;Y/PpJ,S,Y,lPXYp,lX;X/J,JJp,Y,e,lPXpY,lPpX,pJp;J/Jl,e,lXSk,p,pYJ;P/kPS,pJJl");
		cfgEpsUnitElim.eliminateEpsilonRules();
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;Y;X;J;P#k;l;p#S/Pp,PpJ,SpXkS,SpkS,l,lPXYp,lPYp,lX,pJkS,pkS;Y/Pp,PpJ,SpXkS,SpkS,l,lPXYp,lPYp,lX,pJkS,pkS;X/JJp,Jl,Jp,Pp,PpJ,SpXkS,SpkS,l,lPXYp,lPXpY,lPYp,lPp,lPpX,lPpY,lSk,lX,lXSk,p,pJkS,pJp,pY,pYJ,pkS,pp;J/Jl,l,lSk,lXSk,p,pY,pYJ;P/kPS,pJJl,pJl,pl", cfgEpsUnitElim.toString());
	}

}