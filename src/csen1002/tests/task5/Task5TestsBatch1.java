package csen1002.tests.task5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task5.CfgLeftRecElim;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task5TestsBatch1 {

	@Test
	public void testCfgLeftRecursionElimination1() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;U;B;J;E#b;h;l;y#S/b,hUB,SSUhS,JUlS,SSBb;U/bSU,UUU,UShEy,b,BEbEU;B/Uh,yJhB,JUSh,BJJhB,y;J/bUJl,UlB,SBSlU,y,hUUhE;E/JB,bU,lBb,lUUyS,BJUU,hShSh");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;U;B;J;E;S';U';B';J'#b;h;l;y#S/bS',hUBS',JUlSS';U/bSUU',bU',BEbEUU';B/bSUU'hB',bU'hB',yJhBB',JUShB',yB';J/bUJlJ',bSUU'lBJ',bU'lBJ',bSUU'hB'EbEUU'lBJ',bU'hB'EbEUU'lBJ',yJhBB'EbEUU'lBJ',yB'EbEUU'lBJ',bS'BSlUJ',hUBS'BSlUJ',yJ',hUUhEJ';E/bUJlJ'B,bSUU'lBJ'B,bU'lBJ'B,bSUU'hB'EbEUU'lBJ'B,bU'hB'EbEUU'lBJ'B,yJhBB'EbEUU'lBJ'B,yB'EbEUU'lBJ'B,bS'BSlUJ'B,hUBS'BSlUJ'B,yJ'B,hUUhEJ'B,bU,lBb,lUUyS,bSUU'hB'JUU,bU'hB'JUU,yJhBB'JUU,bUJlJ'UShB'JUU,bSUU'lBJ'UShB'JUU,bU'lBJ'UShB'JUU,bSUU'hB'EbEUU'lBJ'UShB'JUU,bU'hB'EbEUU'lBJ'UShB'JUU,yJhBB'EbEUU'lBJ'UShB'JUU,yB'EbEUU'lBJ'UShB'JUU,bS'BSlUJ'UShB'JUU,hUBS'BSlUJ'UShB'JUU,yJ'UShB'JUU,hUUhEJ'UShB'JUU,yB'JUU,hShSh;S'/SUhSS',SBbS',e;U'/UUU',ShEyU',e;B'/EbEUU'hB',JJhBB',e;J'/UShB'EbEUU'lBJ',UlSS'BSlUJ',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination2() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;D;U;V;K#a;c;d;f;i#S/fSiVa,dU,iU,ScVKc,SaD,a;D/SKSdK,SaSaV,DaU,cDSf;U/UcKfS,d,cKKUi,DU;V/aK,VVDKi,fU,VDKUK;K/SaDV,Vc,dD");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;D;U;V;K;S';D';U';V'#a;c;d;f;i#S/fSiVaS',dUS',iUS',aS';D/fSiVaS'KSdKD',dUS'KSdKD',iUS'KSdKD',aS'KSdKD',fSiVaS'aSaVD',dUS'aSaVD',iUS'aSaVD',aS'aSaVD',cDSfD';U/dU',cKKUiU',fSiVaS'KSdKD'UU',dUS'KSdKD'UU',iUS'KSdKD'UU',aS'KSdKD'UU',fSiVaS'aSaVD'UU',dUS'aSaVD'UU',iUS'aSaVD'UU',aS'aSaVD'UU',cDSfD'UU';V/aKV',fUV';K/fSiVaS'aDV,dUS'aDV,iUS'aDV,aS'aDV,aKV'c,fUV'c,dD;S'/cVKcS',aDS',e;D'/aUD',e;U'/cKfSU',e;V'/VDKiV',DKUKV',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination3() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;G;K;D;N;Y#d;l;m;y#S/NmK,YK,SD,SY;G/SNSK,GlKK,GG,GyD;K/l,d;D/dD,yGGY,Gy;N/KSmKl,yK,KS,d;Y/GNK,lNSSG,DKGNd");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;G;K;D;N;Y;S';G';Y'#d;l;m;y#S/NmKS',YKS';G/NmKS'NSKG',YKS'NSKG';K/l,d;D/dD,yGGY,NmKS'NSKG'y,YKS'NSKG'y;N/lSmKl,dSmKl,yK,lS,dS,d;Y/lSmKlmKS'NSKG'NKY',dSmKlmKS'NSKG'NKY',yKmKS'NSKG'NKY',lSmKS'NSKG'NKY',dSmKS'NSKG'NKY',dmKS'NSKG'NKY',lNSSGY',dDKGNdY',yGGYKGNdY',lSmKlmKS'NSKG'yKGNdY',dSmKlmKS'NSKG'yKGNdY',yKmKS'NSKG'yKGNdY',lSmKS'NSKG'yKGNdY',dSmKS'NSKG'yKGNdY',dmKS'NSKG'yKGNdY';S'/DS',YS',e;G'/lKKG',GG',yDG',e;Y'/KS'NSKG'NKY',KS'NSKG'yKGNdY',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination4() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;F;V;H;T#a;g;s;x;y#S/a,SxVsS,SVgH,xSyS,TgFT;F/SyTsT,Ts;V/VxHx,VHTyH,sHSS,aSsVT,STsV;H/FT,VVTF,yHyT;T/y,FTFF,VFy,Ts");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;F;V;H;T;S';V';T'#a;g;s;x;y#S/aS',xSySS',TgFTS';F/aS'yTsT,xSySS'yTsT,TgFTS'yTsT,Ts;V/sHSSV',aSsVTV',aS'TsVV',xSySS'TsVV',TgFTS'TsVV';H/aS'yTsTT,xSySS'yTsTT,TgFTS'yTsTT,TsT,sHSSV'VTF,aSsVTV'VTF,aS'TsVV'VTF,xSySS'TsVV'VTF,TgFTS'TsVV'VTF,yHyT;T/yT',aS'yTsTTFFT',xSySS'yTsTTFFT',sHSSV'FyT',aSsVTV'FyT',aS'TsVV'FyT',xSySS'TsVV'FyT';S'/xVsSS',VgHS',e;V'/xHxV',HTyHV',e;T'/gFTS'yTsTTFFT',sTFFT',gFTS'TsVV'FyT',sT',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination5() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;R;I;K;D;M#m;p;s;t#S/IK,sSK;R/IpSm,RMIp,RMIsM,pS,Rt,RmRK;I/mSMSD,RmDtI,SMtK;K/mImIt,mSDK;D/MK,p,RKMMp,DMR,RpM;M/MII,MtKt,pSpIs,MK,m,t");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;R;I;K;D;M;R';I';D';M'#m;p;s;t#S/IK,sSK;R/IpSmR',pSR';I/mSMSDI',pSR'mDtII',sSKMtKI';K/mImIt,mSDK;D/MKD',pD',mSMSDI'pSmR'KMMpD',pSR'mDtII'pSmR'KMMpD',sSKMtKI'pSmR'KMMpD',pSR'KMMpD',mSMSDI'pSmR'pMD',pSR'mDtII'pSmR'pMD',sSKMtKI'pSmR'pMD',pSR'pMD';M/pSpIsM',mM',tM';R'/MIpR',MIsMR',tR',mRKR',e;I'/pSmR'mDtII',KMtKI',e;D'/MRD',e;M'/IIM',tKtM',KM',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination6() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;G;M;V;W#d;f;o#S/fWM,WV;G/dGWW,VoWf,GVWW,o,GM;M/MSS,VG,GoGf,dGW;V/MV,MWGGS;W/fSfGS,Vf,GWdW,SSo,WWMMG,Wo");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;G;M;V;W;G';M';V';W'#d;f;o#S/fWM,WV;G/dGWWG',VoWfG',oG';M/VGM',dGWWG'oGfM',VoWfG'oGfM',oG'oGfM',dGWM';V/dGWWG'oGfM'VV',oG'oGfM'VV',dGWM'VV',dGWWG'oGfM'WGGSV',oG'oGfM'WGGSV',dGWM'WGGSV';W/fSfGSW',dGWWG'oGfM'VV'fW',oG'oGfM'VV'fW',dGWM'VV'fW',dGWWG'oGfM'WGGSV'fW',oG'oGfM'WGGSV'fW',dGWM'WGGSV'fW',dGWWG'WdWW',dGWWG'oGfM'VV'oWfG'WdWW',oG'oGfM'VV'oWfG'WdWW',dGWM'VV'oWfG'WdWW',dGWWG'oGfM'WGGSV'oWfG'WdWW',oG'oGfM'WGGSV'oWfG'WdWW',dGWM'WGGSV'oWfG'WdWW',oG'WdWW',fWMSoW';G'/VWWG',MG',e;M'/SSM',e;V'/GM'VV',oWfG'oGfM'VV',GM'WGGSV',oWfG'oGfM'WGGSV',e;W'/VSoW',WMMGW',oW',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination7() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;W;G;O;H;L;K#b;j;l;w#S/SLK,SW,wLWW;W/WbSl,WjL,GjGW;G/w,lK,bWGG,OS;O/GbGlK,GKwH,lKHb,wSKLG;H/LW,lGw,jLO,WLK,Gw;L/ObLK,bLSwW,Kl,wGlG;K/KlLLw,Ol,OW,GHjL");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;W;G;O;H;L;K;S';W';O';K'#b;j;l;w#S/wLWWS';W/GjGWW';G/w,lK,bWGG,OS;O/wbGlKO',lKbGlKO',bWGGbGlKO',wKwHO',lKKwHO',bWGGKwHO',lKHbO',wSKLGO';H/LW,lGw,jLO,wjGWW'LK,lKjGWW'LK,bWGGjGWW'LK,wbGlKO'SjGWW'LK,lKbGlKO'SjGWW'LK,bWGGbGlKO'SjGWW'LK,wKwHO'SjGWW'LK,lKKwHO'SjGWW'LK,bWGGKwHO'SjGWW'LK,lKHbO'SjGWW'LK,wSKLGO'SjGWW'LK,ww,lKw,bWGGw,wbGlKO'Sw,lKbGlKO'Sw,bWGGbGlKO'Sw,wKwHO'Sw,lKKwHO'Sw,bWGGKwHO'Sw,lKHbO'Sw,wSKLGO'Sw;L/wbGlKO'bLK,lKbGlKO'bLK,bWGGbGlKO'bLK,wKwHO'bLK,lKKwHO'bLK,bWGGKwHO'bLK,lKHbO'bLK,wSKLGO'bLK,bLSwW,Kl,wGlG;K/wbGlKO'lK',lKbGlKO'lK',bWGGbGlKO'lK',wKwHO'lK',lKKwHO'lK',bWGGKwHO'lK',lKHbO'lK',wSKLGO'lK',wbGlKO'WK',lKbGlKO'WK',bWGGbGlKO'WK',wKwHO'WK',lKKwHO'WK',bWGGKwHO'WK',lKHbO'WK',wSKLGO'WK',wHjLK',lKHjLK',bWGGHjLK',wbGlKO'SHjLK',lKbGlKO'SHjLK',bWGGbGlKO'SHjLK',wKwHO'SHjLK',lKKwHO'SHjLK',bWGGKwHO'SHjLK',lKHbO'SHjLK',wSKLGO'SHjLK';S'/LKS',WS',e;W'/bSlW',jLW',e;O'/SbGlKO',SKwHO',e;K'/lLLwK',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination8() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;K;Y;L;V#l;v;x#S/xVYVl,x;K/KlYv,lSvS,VL,VVl,YKL,KxSV;Y/YLY,xVLl,SV,SYv,YvKvS,SLYV;L/VK,v,Vl,YSlV,vV,LYlSS;V/LY,KxYYS,SK,VYSx");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;K;Y;L;V;K';Y';L';V'#l;v;x#S/xVYVl,x;K/lSvSK',VLK',VVlK',YKLK';Y/xVLlY',xVYVlVY',xVY',xVYVlYvY',xYvY',xVYVlLYVY',xLYVY';L/VKL',vL',VlL',xVLlY'SlVL',xVYVlVY'SlVL',xVY'SlVL',xVYVlYvY'SlVL',xYvY'SlVL',xVYVlLYVY'SlVL',xLYVY'SlVL',vVL';V/vL'YV',xVLlY'SlVL'YV',xVYVlVY'SlVL'YV',xVY'SlVL'YV',xVYVlYvY'SlVL'YV',xYvY'SlVL'YV',xVYVlLYVY'SlVL'YV',xLYVY'SlVL'YV',vVL'YV',lSvSK'xYYSV',xVLlY'KLK'xYYSV',xVYVlVY'KLK'xYYSV',xVY'KLK'xYYSV',xVYVlYvY'KLK'xYYSV',xYvY'KLK'xYYSV',xVYVlLYVY'KLK'xYYSV',xLYVY'KLK'xYYSV',xVYVlKV',xKV';K'/lYvK',xSVK',e;Y'/LYY',vKvSY',e;L'/YlSSL',e;V'/KL'YV',lL'YV',LK'xYYSV',VlK'xYYSV',YSxV',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination9() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;L;O;Y;I;B#j;o;s;w;y#S/sByL,SOLs,j;L/w,jI;O/OIOO,ILSjY,yISo,OYj,oSy;Y/SLBy,yS,wIYjB,YY,LSsY;I/OBjO,SwYOw,wBLs,IOIOj;B/ySS,BOS,wBIL,BLw,oBIs,oSYj");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;L;O;Y;I;B;S';O';Y';I';B'#j;o;s;w;y#S/sByLS',jS';L/w,jI;O/ILSjYO',yISoO',oSyO';Y/sByLS'LByY',jS'LByY',ySY',wIYjBY',wSsYY',jISsYY';I/yISoO'BjOI',oSyO'BjOI',sByLS'wYOwI',jS'wYOwI',wBLsI';B/ySSB',wBILB',oBIsB',oSYjB';S'/OLsS',e;O'/IOOO',YjO',e;Y'/YY',e;I'/LSjYO'BjOI',OIOjI',e;B'/OSB',LwB',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination10() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;N;Y;C;I;U;M#j;k;s;y;z#S/SY,SkIyU,kYSU,MCySN,sC;N/SMUYS,YIIYs,kS,NyCz,SC,y;Y/NUUSs,MYMj,kIYkM;C/YSsMs,YM,YS,Uz;I/sYY,jIy,MUS,INMYN,IjCS;U/SsY,yMSjI;M/kUy,US");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;N;Y;C;I;U;M;S';N';Y';I';M'#j;k;s;y;z#S/kYSUS',MCySNS',sCS';N/kYSUS'MUYSN',MCySNS'MUYSN',sCS'MUYSN',YIIYsN',kSN',kYSUS'CN',MCySNS'CN',sCS'CN',yN';Y/kYSUS'MUYSN'UUSsY',MCySNS'MUYSN'UUSsY',sCS'MUYSN'UUSsY',kSN'UUSsY',kYSUS'CN'UUSsY',MCySNS'CN'UUSsY',sCS'CN'UUSsY',yN'UUSsY',MYMjY',kIYkMY';C/kYSUS'MUYSN'UUSsY'SsMs,MCySNS'MUYSN'UUSsY'SsMs,sCS'MUYSN'UUSsY'SsMs,kSN'UUSsY'SsMs,kYSUS'CN'UUSsY'SsMs,MCySNS'CN'UUSsY'SsMs,sCS'CN'UUSsY'SsMs,yN'UUSsY'SsMs,MYMjY'SsMs,kIYkMY'SsMs,kYSUS'MUYSN'UUSsY'M,MCySNS'MUYSN'UUSsY'M,sCS'MUYSN'UUSsY'M,kSN'UUSsY'M,kYSUS'CN'UUSsY'M,MCySNS'CN'UUSsY'M,sCS'CN'UUSsY'M,yN'UUSsY'M,MYMjY'M,kIYkMY'M,kYSUS'MUYSN'UUSsY'S,MCySNS'MUYSN'UUSsY'S,sCS'MUYSN'UUSsY'S,kSN'UUSsY'S,kYSUS'CN'UUSsY'S,MCySNS'CN'UUSsY'S,sCS'CN'UUSsY'S,yN'UUSsY'S,MYMjY'S,kIYkMY'S,Uz;I/sYYI',jIyI',MUSI';U/kYSUS'sY,MCySNS'sY,sCS'sY,yMSjI;M/kUyM',kYSUS'sYSM',sCS'sYSM',yMSjISM';S'/YS',kIyUS',e;N'/yCzN',e;Y'/IIYsN'UUSsY',e;I'/NMYNI',jCSI',e;M'/CySNS'sYSM',e", cfgLeftRecElim.toString());
	}

}