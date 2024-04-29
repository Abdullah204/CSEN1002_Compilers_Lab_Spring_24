// Generated from /Users/abdullahahmad/Downloads/Semester_10/CSEN_1002_Advanced_Computer_Lab/Tasks_Repo/src/csen1002/main/task9/Task9.g4 by ANTLR 4.13.1

package csen1002.main.task9;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Task9Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, WS=4;
	public static final int
		RULE_s = 0, RULE_f = 1, RULE_d = 2, RULE_t = 3, RULE_n = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "f", "d", "t", "n"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'0'", "'1'", "'#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Task9.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		/**
		 * Compares two integer numbers
		 *
		 * @param x the first number to compare
		 * @param y the second number to compare
		 * @return 1 if x is equal to y, and 0 otherwise
		 */
		public static int equals(int x, int y) {
		    return x == y ? 1 : 0;
		}

	public Task9Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SContext extends ParserRuleContext {
		public int check;
		public FContext res;
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			((SContext)_localctx).res = f();
			((SContext)_localctx).check =  ((SContext)_localctx).res.check * ((SContext)_localctx).res.m;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FContext extends ParserRuleContext {
		public int check;
		public int m;
		public DContext e1;
		public TContext e2;
		public DContext d() {
			return getRuleContext(DContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
	}

	public final FContext f() throws RecognitionException {
		FContext _localctx = new FContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_f);
		try {
			setState(20);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(13);
				((FContext)_localctx).e1 = d(1,1);
				setState(14);
				((FContext)_localctx).e2 = t(((FContext)_localctx).e1.l,2);

					((FContext)_localctx).check =  ((FContext)_localctx).e1.check * ((FContext)_localctx).e2.check;
					((FContext)_localctx).m =  ((FContext)_localctx).e2.m;
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				((FContext)_localctx).e1 = d(1,1);

					((FContext)_localctx).check =  ((FContext)_localctx).e1.check;
					((FContext)_localctx).m =  1;
					
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DContext extends ParserRuleContext {
		public int c;
		public int r;
		public int l;
		public int check;
		public DContext e1;
		public DContext d() {
			return getRuleContext(DContext.class,0);
		}
		public DContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DContext(ParserRuleContext parent, int invokingState, int c, int r) {
			super(parent, invokingState);
			this.c = c;
			this.r = r;
		}
		@Override public int getRuleIndex() { return RULE_d; }
	}

	public final DContext d(int c,int r) throws RecognitionException {
		DContext _localctx = new DContext(_ctx, getState(), c, r);
		enterRule(_localctx, 4, RULE_d);
		try {
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				match(T__0);
				setState(23);
				((DContext)_localctx).e1 = d(c+1 , r);

						((DContext)_localctx).l =  ((DContext)_localctx).e1.l; ((DContext)_localctx).check =  (1 - equals(_localctx.c, _localctx.r)) * ((DContext)_localctx).e1.check;
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				match(T__1);
				setState(27);
				((DContext)_localctx).e1 = d(c+1 , r);

						((DContext)_localctx).l =  ((DContext)_localctx).e1.l; ((DContext)_localctx).check =  equals(_localctx.c, _localctx.r) * ((DContext)_localctx).e1.check;
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				match(T__0);
				((DContext)_localctx).l =  _localctx.c ; ((DContext)_localctx).check =  1 - equals(_localctx.c, _localctx.r);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(32);
				match(T__1);
				((DContext)_localctx).l =  _localctx.c ; ((DContext)_localctx).check =  equals(_localctx.c, _localctx.r);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TContext extends ParserRuleContext {
		public int l;
		public int r;
		public int check;
		public int m;
		public NContext e1;
		public NContext n;
		public NContext n() {
			return getRuleContext(NContext.class,0);
		}
		public TContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TContext(ParserRuleContext parent, int invokingState, int l, int r) {
			super(parent, invokingState);
			this.l = l;
			this.r = r;
		}
		@Override public int getRuleIndex() { return RULE_t; }
	}

	public final TContext t(int l,int r) throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState(), l, r);
		enterRule(_localctx, 6, RULE_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__2);
			setState(37);
			((TContext)_localctx).e1 = ((TContext)_localctx).n = n(r,1,l);
			((TContext)_localctx).check =  ((TContext)_localctx).n.check ; ((TContext)_localctx).m =  ((TContext)_localctx).n.m;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NContext extends ParserRuleContext {
		public int r;
		public int c;
		public int l;
		public int check;
		public int m;
		public DContext e1;
		public TContext e2;
		public DContext d() {
			return getRuleContext(DContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public NContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public NContext(ParserRuleContext parent, int invokingState, int r, int c, int l) {
			super(parent, invokingState);
			this.r = r;
			this.c = c;
			this.l = l;
		}
		@Override public int getRuleIndex() { return RULE_n; }
	}

	public final NContext n(int r,int c,int l) throws RecognitionException {
		NContext _localctx = new NContext(_ctx, getState(), r, c, l);
		enterRule(_localctx, 8, RULE_n);
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				((NContext)_localctx).e1 = d(1,r);
				setState(41);
				((NContext)_localctx).e2 = t(l , r+1);

					
					((NContext)_localctx).check =  ((NContext)_localctx).e1.check * ((NContext)_localctx).e2.check;
					((NContext)_localctx).m =  equals(((NContext)_localctx).e1.l, _localctx.l) * ((NContext)_localctx).e2.m;
				 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				((NContext)_localctx).e1 = d(1,r);

					((NContext)_localctx).check =  ((NContext)_localctx).e1.check;
					((NContext)_localctx).m =  equals(((NContext)_localctx).e1.l, _localctx.l);
				 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00042\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0015\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002#\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u00040\b\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002"+
		"\u0004\u0006\b\u0000\u00001\u0000\n\u0001\u0000\u0000\u0000\u0002\u0014"+
		"\u0001\u0000\u0000\u0000\u0004\"\u0001\u0000\u0000\u0000\u0006$\u0001"+
		"\u0000\u0000\u0000\b/\u0001\u0000\u0000\u0000\n\u000b\u0003\u0002\u0001"+
		"\u0000\u000b\f\u0006\u0000\uffff\uffff\u0000\f\u0001\u0001\u0000\u0000"+
		"\u0000\r\u000e\u0003\u0004\u0002\u0000\u000e\u000f\u0003\u0006\u0003\u0000"+
		"\u000f\u0010\u0006\u0001\uffff\uffff\u0000\u0010\u0015\u0001\u0000\u0000"+
		"\u0000\u0011\u0012\u0003\u0004\u0002\u0000\u0012\u0013\u0006\u0001\uffff"+
		"\uffff\u0000\u0013\u0015\u0001\u0000\u0000\u0000\u0014\r\u0001\u0000\u0000"+
		"\u0000\u0014\u0011\u0001\u0000\u0000\u0000\u0015\u0003\u0001\u0000\u0000"+
		"\u0000\u0016\u0017\u0005\u0001\u0000\u0000\u0017\u0018\u0003\u0004\u0002"+
		"\u0000\u0018\u0019\u0006\u0002\uffff\uffff\u0000\u0019#\u0001\u0000\u0000"+
		"\u0000\u001a\u001b\u0005\u0002\u0000\u0000\u001b\u001c\u0003\u0004\u0002"+
		"\u0000\u001c\u001d\u0006\u0002\uffff\uffff\u0000\u001d#\u0001\u0000\u0000"+
		"\u0000\u001e\u001f\u0005\u0001\u0000\u0000\u001f#\u0006\u0002\uffff\uffff"+
		"\u0000 !\u0005\u0002\u0000\u0000!#\u0006\u0002\uffff\uffff\u0000\"\u0016"+
		"\u0001\u0000\u0000\u0000\"\u001a\u0001\u0000\u0000\u0000\"\u001e\u0001"+
		"\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000#\u0005\u0001\u0000\u0000"+
		"\u0000$%\u0005\u0003\u0000\u0000%&\u0003\b\u0004\u0000&\'\u0006\u0003"+
		"\uffff\uffff\u0000\'\u0007\u0001\u0000\u0000\u0000()\u0003\u0004\u0002"+
		"\u0000)*\u0003\u0006\u0003\u0000*+\u0006\u0004\uffff\uffff\u0000+0\u0001"+
		"\u0000\u0000\u0000,-\u0003\u0004\u0002\u0000-.\u0006\u0004\uffff\uffff"+
		"\u0000.0\u0001\u0000\u0000\u0000/(\u0001\u0000\u0000\u0000/,\u0001\u0000"+
		"\u0000\u00000\t\u0001\u0000\u0000\u0000\u0003\u0014\"/";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}