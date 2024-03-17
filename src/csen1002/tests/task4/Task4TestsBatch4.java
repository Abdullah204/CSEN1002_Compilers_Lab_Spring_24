package csen1002.tests.task4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task4.CfgEpsUnitElim;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task4TestsBatch4 {

	@Test
	public void testCfgEpsilonRuleElimination1() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;R;Y;K;J#a;h;m;x;y#S/YRh,yRa;R/K,KKxR,SYSy,e,xKKYK;Y/KSmY,S,Y,e,hJaS,mYY;K/K,R,S,Y,aJmS,e;J/Sa,mSS");
		cfgEpsUnitElim.eliminateEpsilonRules();
		assertEquals("S;R;Y;K;J#a;h;m;x;y#S/Rh,YRh,Yh,h,yRa,ya;R/K,KKx,KKxR,Kx,KxR,SSy,SYSy,x,xK,xKK,xKKK,xKKY,xKKYK,xKY,xKYK,xR,xY,xYK;Y/KSm,KSmY,S,Sm,SmY,Y,hJaS,m,mY,mYY;K/K,R,S,Y,aJmS;J/Sa,mSS", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonRuleElimination2() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;N;U;H;F;B#g;l;o;t;z#S/FSgH,Fl,U,z;N/BzF,N,NHS,U,e;U/Fl,l,t,zFoHH;H/FzFUS,HStUU,HU,NtFoN,S,U;F/N,e,tHFSS,zN;B/FzSl,oH,z,zB");
		cfgEpsUnitElim.eliminateEpsilonRules();
		assertEquals("S;N;U;H;F;B#g;l;o;t;z#S/FSgH,Fl,SgH,U,l,z;N/Bz,BzF,HS,N,NHS,U;U/Fl,l,t,zFoHH,zoHH;H/FzFUS,FzUS,HStUU,HU,NtFo,NtFoN,Nto,NtoN,S,U,tFo,tFoN,to,toN,zFUS,zUS;F/N,tHFSS,tHSS,z,zN;B/FzSl,oH,z,zB,zSl", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonRuleElimination3() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;X;B;G;Y#a;c;i;q;z#S/BBaY,XzS,aGcGa;X/G,GXBGc,a,iYGS,qB;B/S,SiS,X,YBXX,e;G/B,G,S,Si,aX,e;Y/SBc,iGSG,z");
		cfgEpsUnitElim.eliminateEpsilonRules();
		assertEquals("S;X;B;G;Y#a;c;i;q;z#S/BBaY,BaY,XzS,aGcGa,aGca,aY,acGa,aca,zS;X/BGc,Bc,G,GBGc,GBc,GGc,GXBGc,GXBc,GXGc,GXc,Gc,XBGc,XBc,XGc,Xc,a,c,iYGS,iYS,q,qB;B/S,SiS,X,Y,YB,YBX,YBXX,YX,YXX;G/B,G,S,Si,a,aX;Y/SBc,Sc,iGS,iGSG,iS,iSG,z", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgUnitRuleElimination1() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;M;I;E;K;P;W#g;h;z#S/K,MS,S,SESKK;M/E,Ez,gK;I/S,W,hEWE;E/IPWh,WEEK,hMg;K/I,M,Pg,SM,WPM;P/IIKg,P,S,gSMP;W/EgMPS,IzES");
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;M;I;E;K;P;W#g;h;z#S/EgMPS,Ez,IPWh,IzES,MS,Pg,SESKK,SM,WEEK,WPM,gK,hEWE,hMg;M/Ez,IPWh,WEEK,gK,hMg;I/EgMPS,Ez,IPWh,IzES,MS,Pg,SESKK,SM,WEEK,WPM,gK,hEWE,hMg;E/IPWh,WEEK,hMg;K/EgMPS,Ez,IPWh,IzES,MS,Pg,SESKK,SM,WEEK,WPM,gK,hEWE,hMg;P/EgMPS,Ez,IIKg,IPWh,IzES,MS,Pg,SESKK,SM,WEEK,WPM,gK,gSMP,hEWE,hMg;W/EgMPS,IzES", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgUnitRuleElimination2() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;F;O;U;T;Q;A#a;o;p;z#S/FzFoO,Q,a,o;F/AaUaF,FoTUo,Q,USFUO;O/F,T,oS,oSF,oUOA;U/Q,S,UTzFQ,p,zFAaA;T/pFOQ,zAUOF;Q/OUUQ,Sz,TaOQ,U,a;A/OpQ,U,aASF,p");
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;F;O;U;T;Q;A#a;o;p;z#S/FzFoO,OUUQ,Sz,TaOQ,UTzFQ,a,o,p,zFAaA;F/AaUaF,FoTUo,FzFoO,OUUQ,Sz,TaOQ,USFUO,UTzFQ,a,o,p,zFAaA;O/AaUaF,FoTUo,FzFoO,OUUQ,Sz,TaOQ,USFUO,UTzFQ,a,o,oS,oSF,oUOA,p,pFOQ,zAUOF,zFAaA;U/FzFoO,OUUQ,Sz,TaOQ,UTzFQ,a,o,p,zFAaA;T/pFOQ,zAUOF;Q/FzFoO,OUUQ,Sz,TaOQ,UTzFQ,a,o,p,zFAaA;A/FzFoO,OUUQ,OpQ,Sz,TaOQ,UTzFQ,a,aASF,o,p,zFAaA", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgUnitRuleElimination3() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;Q;F;Z;M;V#a;p;t;z#S/M,ZZZF,a,pVa;Q/FFMM,M,QStV;F/M,MaF,Q,ZSM,aMz;Z/VtS,tMa,zQMZM,zQZS;M/Z,pStQ,z;V/VtZQ,pMt,tS");
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;Q;F;Z;M;V#a;p;t;z#S/VtS,ZZZF,a,pStQ,pVa,tMa,z,zQMZM,zQZS;Q/FFMM,QStV,VtS,pStQ,tMa,z,zQMZM,zQZS;F/FFMM,MaF,QStV,VtS,ZSM,aMz,pStQ,tMa,z,zQMZM,zQZS;Z/VtS,tMa,zQMZM,zQZS;M/VtS,pStQ,tMa,z,zQMZM,zQZS;V/VtZQ,pMt,tS", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonUnitRuleElimination1() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;T;N;L;O;J#i;m;t;u;x#S/NTm,Su,T,uLxON;T/S,StJmO,u;N/ST,e,mT,tNiT,x;L/TL,x;O/O,Sx,T,e,iO;J/OL,TNLT");
		cfgEpsUnitElim.eliminateEpsilonRules();
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;T;N;L;O;J#i;m;t;u;x#S/NTm,StJm,StJmO,Su,Tm,u,uLx,uLxN,uLxO,uLxON;T/NTm,StJm,StJmO,Su,Tm,u,uLx,uLxN,uLxO,uLxON;N/ST,mT,tNiT,tiT,x;L/TL,x;O/NTm,StJm,StJmO,Su,Sx,Tm,i,iO,u,uLx,uLxN,uLxO,uLxON;J/OL,TL,TLT,TNLT,x", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonUnitRuleElimination2() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;O;Y;L;I;N;K#f;q;r;y#S/r,rL;O/O,OYL,Yf;Y/N,NKKS,S,e,fOOY;L/IKK,IOK,N,O,S,Y;I/SSrNI,YqYIr,e,q;N/e,rOyKN,ySO;K/OLqON,OfL");
		cfgEpsUnitElim.eliminateEpsilonRules();
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;O;Y;L;I;N;K#f;q;r;y#S/r,rL;O/OL,OY,OYL,Yf,f;Y/KKS,NKKS,fOO,fOOY,r,rL,rOyK,rOyKN,ySO;L/IKK,IOK,KK,KKS,NKKS,OK,OL,OY,OYL,Yf,f,fOO,fOOY,r,rL,rOyK,rOyKN,ySO;I/SSr,SSrI,SSrN,SSrNI,YqIr,YqYIr,YqYr,Yqr,q,qIr,qYIr,qYr,qr;N/rOyK,rOyKN,ySO;K/OLqO,OLqON,Of,OfL,OqO,OqON", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonUnitRuleElimination3() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;U;B;G;J;R#c;l;s;v#S/BcRv,lU,sBl,v;U/e,l,lGS,sJG;B/J,S,e,s,sSJGJ;G/B,U,s;J/J,SRlB,cJB,e,s;R/l,sG,sUsU");
		cfgEpsUnitElim.eliminateEpsilonRules();
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;U;B;G;J;R#c;l;s;v#S/BcRv,cRv,l,lU,sBl,sl,v;U/l,lGS,lS,s,sG,sJ,sJG;B/BcRv,SRl,SRlB,c,cB,cJ,cJB,cRv,l,lU,s,sBl,sS,sSG,sSGJ,sSJ,sSJG,sSJGJ,sSJJ,sl,v;G/BcRv,SRl,SRlB,c,cB,cJ,cJB,cRv,l,lGS,lS,lU,s,sBl,sG,sJ,sJG,sS,sSG,sSGJ,sSJ,sSJG,sSJGJ,sSJJ,sl,v;J/SRl,SRlB,c,cB,cJ,cJB,s;R/l,s,sG,sUs,sUsU,ss,ssU", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonUnitRuleElimination4() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;O;I;F;E;D;V#c;n;o;t#S/DoDt,ED,t;O/oFo,tI;I/D,E,e,tO;F/F,OIFV,cD,oOc;E/Dt,FVnOF,I,e,tV;D/DI,ODVI,OcESO,oI;V/o,tVDDc");
		cfgEpsUnitElim.eliminateEpsilonRules();
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;O;I;F;E;D;V#c;n;o;t#S/DI,DoDt,ED,ODV,ODVI,OcESO,OcSO,o,oI,t;O/oFo,t,tI;I/DI,Dt,FVnOF,ODV,ODVI,OcESO,OcSO,o,oI,tO,tV;F/OFV,OIFV,cD,oOc;E/DI,Dt,FVnOF,ODV,ODVI,OcESO,OcSO,o,oI,tO,tV;D/DI,ODV,ODVI,OcESO,OcSO,o,oI;V/o,tVDDc", cfgEpsUnitElim.toString());
	}

}