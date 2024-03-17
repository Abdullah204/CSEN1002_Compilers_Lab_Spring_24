package csen1002.tests.task5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task5.CfgLeftRecElim;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task5TestsBatch0 {

	@Test
	public void testCfgLeftRecursionElimination1() {
		CfgLeftRecElim cfgLeftRecElim = new CfgLeftRecElim(
				"S;I;D;W;K#c;g;n;t#S/nKS,gDKS,nIg,ScWSW;I/WSWK,DcWn,IcSgS,InS;D/IIcWS,gKWS,g;W/DK,WWnI,t,cS,DtIt,WKtD;K/gStSI,WIg,Sn");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals(
				"S;I;D;W;K;S';I';D';W'#c;g;n;t#S/nKSS',gDKSS',nIgS';I/WSWKI',DcWnI';D/WSWKI'IcWSD',gKWSD',gD';W/gKWSD'KW',gD'KW',tW',cSW',gKWSD'tItW',gD'tItW';K/gStSI,gKWSD'KW'Ig,gD'KW'Ig,tW'Ig,cSW'Ig,gKWSD'tItW'Ig,gD'tItW'Ig,nKSS'n,gDKSS'n,nIgS'n;S'/cWSWS',e;I'/cSgSI',nSI',e;D'/cWnI'IcWSD',e;W'/SWKI'IcWSD'KW',WnIW',SWKI'IcWSD'tItW',KtDW',e",
				cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination2() {
		CfgLeftRecElim cfgLeftRecElim = new CfgLeftRecElim(
				"S;H;V;I;G#c;l;s;y#S/VH,sHI;H/cSSGI,HIVG;V/Vy,c,sHI,sIG,SH,SySy;I/lSSI,IV,s,IVI;G/IH,Hy,GHVy,yG,GI");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals(
				"S;H;V;I;G;H';V';I';G'#c;l;s;y#S/VH,sHI;H/cSSGIH';V/cV',sHIV',sIGV',sHIHV',sHIySyV';I/lSSII',sI';G/lSSII'HG',sI'HG',cSSGIH'yG',yGG';H'/IVGH',e;V'/yV',HHV',HySyV',e;I'/VI',VII',e;G'/HVyG',IG',e",
				cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination3() {
		CfgLeftRecElim cfgLeftRecElim = new CfgLeftRecElim(
				"S;F;V;Z;G#b;i;m;u#S/bF,ZSSZi,GbG;F/SGGZ,uVZu,SF,mFZ;V/VmS,i,Vb,mZiFb,bS,uVS;Z/uVG,bS,SSbGb,GVm,uFu,Vi;G/ZGVb,m,GVS,GZS");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals(
				"S;F;V;Z;G;V';Z';G'#b;i;m;u#S/bF,ZSSZi,GbG;F/bFGGZ,ZSSZiGGZ,GbGGGZ,uVZu,bFF,ZSSZiF,GbGF,mFZ;V/iV',mZiFbV',bSV',uVSV';Z/uVGZ',bSZ',bFSbGbZ',GbGSbGbZ',GVmZ',uFuZ',iV'iZ',mZiFbV'iZ',bSV'iZ',uVSV'iZ';G/uVGZ'GVbG',bSZ'GVbG',bFSbGbZ'GVbG',uFuZ'GVbG',iV'iZ'GVbG',mZiFbV'iZ'GVbG',bSV'iZ'GVbG',uVSV'iZ'GVbG',mG';V'/mSV',bV',e;Z'/SSZiSbGbZ',e;G'/bGSbGbZ'GVbG',VmZ'GVbG',VSG',ZSG',e",
				cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination4() {
		CfgLeftRecElim cfgLeftRecElim = new CfgLeftRecElim(
				"S;P;D;K;U#h;i;v#S/SKhSv,hKPi,iU,DP;P/PhKhU,PUP,Dv;D/UPSPi,DhP,v,iSvSh,Di,hPP;K/Dv,SiUP;U/PUP,PSS,hSU");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals(
				"S;P;D;K;U;S';P';D';U'#h;i;v#S/hKPiS',iUS',DPS';P/DvP';D/UPSPiD',vD',iSvShD',hPPD';K/UPSPiD'v,vD'v,iSvShD'v,hPPD'v,hKPiS'iUP,iUS'iUP,UPSPiD'PS'iUP,vD'PS'iUP,iSvShD'PS'iUP,hPPD'PS'iUP;U/vD'vP'UPU',iSvShD'vP'UPU',hPPD'vP'UPU',vD'vP'SSU',iSvShD'vP'SSU',hPPD'vP'SSU',hSUU';S'/KhSvS',e;P'/hKhUP',UPP',e;D'/hPD',iD',e;U'/PSPiD'vP'UPU',PSPiD'vP'SSU',e",
				cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination5() {
		CfgLeftRecElim cfgLeftRecElim = new CfgLeftRecElim(
				"S;J;V;T;X;Q;G#b;d;w#S/bVdS,SVQ,STdSd;J/dGS,VdX,GbVdG,bJdV,wQTQV,bTGwT;V/wJbJJ,GTdST;T/b,dTT,wJwGd;X/w,JSQ,Xw,dX;Q/dX,dQS,bXbG,Td,VSw;G/GbGX,TdSVb,GdGJw,SdQb");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals(
				"S;J;V;T;X;Q;G;S';X';G'#b;d;w#S/bVdSS';J/dGS,VdX,GbVdG,bJdV,wQTQV,bTGwT;V/wJbJJ,GTdST;T/b,dTT,wJwGd;X/wX',dGSSQX',wJbJJdXSQX',GTdSTdXSQX',GbVdGSQX',bJdVSQX',wQTQVSQX',bTGwTSQX',dXX';Q/dX,dQS,bXbG,bd,dTTd,wJwGdd,wJbJJSw,GTdSTSw;G/bdSVbG',dTTdSVbG',wJwGddSVbG',bVdSS'dQbG';S'/VQS',TdSdS',e;X'/wX',e;G'/bGXG',dGJwG',e",
				cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination6() {
		CfgLeftRecElim cfgLeftRecElim = new CfgLeftRecElim(
				"S;K;I;L;U#i;q;w#S/KL,SS,wUwK,KU;K/KiIi,qSKLU,LLq,KqIII;I/wLK,IS,SUwIS;L/qULU,IIi,Kw,Iq,Ui,UI;U/qIiL,KIK,UwI,Kq,UiS");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals(
				"S;K;I;L;U;S';K';I';L';U'#i;q;w#S/KLS',wUwKS',KUS';K/qSKLUK',LLqK';I/wLKI',qSKLUK'LS'UwISI',LLqK'LS'UwISI',wUwKS'UwISI',qSKLUK'US'UwISI',LLqK'US'UwISI';L/qULUL',wLKI'IiL',qSKLUK'LS'UwISI'IiL',wUwKS'UwISI'IiL',qSKLUK'US'UwISI'IiL',qSKLUK'wL',wLKI'qL',qSKLUK'LS'UwISI'qL',wUwKS'UwISI'qL',qSKLUK'US'UwISI'qL',UiL',UIL';U/qIiLU',qSKLUK'IKU',qULUL'LqK'IKU',wLKI'IiL'LqK'IKU',qSKLUK'LS'UwISI'IiL'LqK'IKU',wUwKS'UwISI'IiL'LqK'IKU',qSKLUK'US'UwISI'IiL'LqK'IKU',qSKLUK'wL'LqK'IKU',wLKI'qL'LqK'IKU',qSKLUK'LS'UwISI'qL'LqK'IKU',wUwKS'UwISI'qL'LqK'IKU',qSKLUK'US'UwISI'qL'LqK'IKU',qSKLUK'qU',qULUL'LqK'qU',wLKI'IiL'LqK'qU',qSKLUK'LS'UwISI'IiL'LqK'qU',wUwKS'UwISI'IiL'LqK'qU',qSKLUK'US'UwISI'IiL'LqK'qU',qSKLUK'wL'LqK'qU',wLKI'qL'LqK'qU',qSKLUK'LS'UwISI'qL'LqK'qU',wUwKS'UwISI'qL'LqK'qU',qSKLUK'US'UwISI'qL'LqK'qU';S'/SS',e;K'/iIiK',qIIIK',e;I'/SI',e;L'/LqK'LS'UwISI'IiL',LqK'US'UwISI'IiL',LqK'wL',LqK'LS'UwISI'qL',LqK'US'UwISI'qL',e;U'/iL'LqK'IKU',IL'LqK'IKU',wIU',iL'LqK'qU',IL'LqK'qU',iSU',e",
				cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination7() {
		CfgLeftRecElim cfgLeftRecElim = new CfgLeftRecElim(
				"S;T;X;E;C#b;t;w#S/XtS,bT;T/t,SbCw,CSb,Tt,TtC;X/TC,XtS,wTCEX,Xt;E/SE,SXt;C/TE,SCwX");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals(
				"S;T;X;E;C;T';X';C'#b;t;w#S/XtS,bT;T/tT',XtSbCwT',bTbCwT',CSbT';X/tT'CX',bTbCwT'CX',CSbT'CX',wTCEXX';E/tT'CX'tSE,bTbCwT'CX'tSE,CSbT'CX'tSE,wTCEXX'tSE,bTE,tT'CX'tSXt,bTbCwT'CX'tSXt,CSbT'CX'tSXt,wTCEXX'tSXt,bTXt;C/tT'EC',tT'CX'tSbCwT'EC',bTbCwT'CX'tSbCwT'EC',wTCEXX'tSbCwT'EC',bTbCwT'EC',tT'CX'tSCwXC',bTbCwT'CX'tSCwXC',wTCEXX'tSCwXC',bTCwXC';T'/tT',tCT',e;X'/tSbCwT'CX',tSX',tX',e;C'/SbT'CX'tSbCwT'EC',SbT'EC',SbT'CX'tSCwXC',e",
				cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination8() {
		CfgLeftRecElim cfgLeftRecElim = new CfgLeftRecElim(
				"S;X;O;L;R;W#g;t;u#S/tLg,Wg;X/gOuOW,uWt,XtXRg,Xt,RWORg;O/XSSO,SXW;L/LtLtX,tS,gLuSt,gWu,t,u;R/RuLL,OtL,WS,gXt,uSLuS,XLStR;W/WtRgR,WOg,Xg,gOWg,uRRSg,LR");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals(
				"S;X;O;L;R;W;X';L';R';W'#g;t;u#S/tLg,Wg;X/gOuOWX',uWtX',RWORgX';O/gOuOWX'SSO,uWtX'SSO,RWORgX'SSO,tLgXW,WgXW;L/tSL',gLuStL',gWuL',tL',uL';R/gOuOWX'SSOtLR',uWtX'SSOtLR',tLgXWtLR',WgXWtLR',WSR',gXtR',uSLuSR',gOuOWX'LStRR',uWtX'LStRR';W/gOuOWX'gW',uWtX'gW',gOuOWX'SSOtLR'WORgX'gW',uWtX'SSOtLR'WORgX'gW',tLgXWtLR'WORgX'gW',gXtR'WORgX'gW',uSLuSR'WORgX'gW',gOuOWX'LStRR'WORgX'gW',uWtX'LStRR'WORgX'gW',gOWgW',uRRSgW',tSL'RW',gLuStL'RW',gWuL'RW',tL'RW',uL'RW';X'/tXRgX',tX',e;L'/tLtXL',e;R'/uLLR',WORgX'SSOtLR',WORgX'LStRR',e;W'/tRgRW',OgW',gXWtLR'WORgX'gW',SR'WORgX'gW',e",
				cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination9() {
		CfgLeftRecElim cfgLeftRecElim = new CfgLeftRecElim(
				"S;G;Q;F;E;Z#a;b;h#S/aZQ,Gb,ZQ;G/FGh,hE;Q/SSQhG,SaZE,b,QbGZ,QhQaE,aQ;F/FhZbF,FS,ZFbS,FbE;E/ZaQ,ZbSQ;Z/Fb,FhShE,hQEGb,ZbZ,bQbZ");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals(
				"S;G;Q;F;E;Z;Q';F';Z'#a;b;h#S/aZQ,Gb,ZQ;G/FGh,hE;Q/aZQSQhGQ',FGhbSQhGQ',hEbSQhGQ',ZQSQhGQ',aZQaZEQ',FGhbaZEQ',hEbaZEQ',ZQaZEQ',bQ',aQQ';F/ZFbSF';E/ZaQ,ZbSQ;Z/hQEGbZ',bQbZZ';Q'/bGZQ',hQaEQ',e;F'/hZbFF',SF',bEF',e;Z'/FbSF'bZ',FbSF'hShEZ',bZZ',e",
				cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination10() {
		CfgLeftRecElim cfgLeftRecElim = new CfgLeftRecElim(
				"S;U;T;V;K;F;J#j;o;q;u#S/jVFS,uSVqK,SoT,FJJT,KJ;U/jSqV,JJ,oSF,SjKUJ,UU,UTKjV;T/VoT,JUoV,jFq,TJKV,TuTj;V/u,oU,uJ,jVqS;K/jFuS,oT;F/JSjKK,qSjJS,JoTF,KjSUV,VJqKK;J/uK,UJFq,SJoS");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals(
				"S;U;T;V;K;F;J;S';U';T';J'#j;o;q;u#S/jVFSS',uSVqKS',FJJTS',KJS';U/jSqVU',JJU',oSFU',jVFSS'jKUJU',uSVqKS'jKUJU',FJJTS'jKUJU',KJS'jKUJU';T/VoTT',JUoVT',jFqT';V/u,oU,uJ,jVqS;K/jFuS,oT;F/JSjKK,qSjJS,JoTF,jFuSjSUV,oTjSUV,uJqKK,oUJqKK,uJJqKK,jVqSJqKK;J/uKJ',jSqVU'JFqJ',oSFU'JFqJ',jVFSS'jKUJU'JFqJ',uSVqKS'jKUJU'JFqJ',qSjJSJJTS'jKUJU'JFqJ',jFuSjSUVJJTS'jKUJU'JFqJ',oTjSUVJJTS'jKUJU'JFqJ',uJqKKJJTS'jKUJU'JFqJ',oUJqKKJJTS'jKUJU'JFqJ',uJJqKKJJTS'jKUJU'JFqJ',jVqSJqKKJJTS'jKUJU'JFqJ',jFuSJS'jKUJU'JFqJ',oTJS'jKUJU'JFqJ',jVFSS'JoSJ',uSVqKS'JoSJ',qSjJSJJTS'JoSJ',jFuSjSUVJJTS'JoSJ',oTjSUVJJTS'JoSJ',uJqKKJJTS'JoSJ',oUJqKKJJTS'JoSJ',uJJqKKJJTS'JoSJ',jVqSJqKKJJTS'JoSJ',jFuSJS'JoSJ',oTJS'JoSJ';S'/oTS',e;U'/UU',TKjVU',e;T'/JKVT',uTjT',e;J'/JU'JFqJ',SjKKJJTS'jKUJU'JFqJ',oTFJJTS'jKUJU'JFqJ',SjKKJJTS'JoSJ',oTFJJTS'JoSJ',e",
				cfgLeftRecElim.toString());
	}

}