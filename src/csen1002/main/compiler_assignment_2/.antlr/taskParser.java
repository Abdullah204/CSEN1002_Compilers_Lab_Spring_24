// Generated from /Users/abdullahahmad/Downloads/Semester_10/CSEN_1002_Advanced_Computer_Lab/Tasks_Repo/src/csen1002/main/compiler_assignment_2/task.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class taskParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, WS=3;
	public static final int
		RULE_s = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"s"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'a'", "'b'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "WS"
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
	public String getGrammarFileName() { return "task.g4"; }

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

	public taskParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SContext extends ParserRuleContext {
		public int diff;
		public int check;
		public int even;
		public SContext s1;
		public SContext s() {
			return getRuleContext(SContext.class,0);
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
			setState(27);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2);
				match(T__0);
				setState(3);
				((SContext)_localctx).s1 = s();
				setState(4);
				match(T__0);
				((SContext)_localctx).diff =  ((SContext)_localctx).s1.diff; ((SContext)_localctx).check =  ((SContext)_localctx).s1.check; ((SContext)_localctx).even =  ((SContext)_localctx).s1.even;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(7);
				match(T__1);
				setState(8);
				((SContext)_localctx).s1 = s();
				setState(9);
				match(T__1);
				((SContext)_localctx).diff =  ((SContext)_localctx).s1.diff; ((SContext)_localctx).check =  ((SContext)_localctx).s1.check * ((SContext)_localctx).s1.even; ((SContext)_localctx).even =  ((SContext)_localctx).s1.even;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(12);
				match(T__0);
				setState(13);
				((SContext)_localctx).s1 = s();
				setState(14);
				match(T__1);
				((SContext)_localctx).diff =  ((SContext)_localctx).s1.diff + 1; ((SContext)_localctx).check =  (((SContext)_localctx).s1.check + equals(((SContext)_localctx).s1.diff, 0)) *  ((SContext)_localctx).s1.even; ((SContext)_localctx).even =  ((SContext)_localctx).s1.even;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(17);
				match(T__1);
				setState(18);
				((SContext)_localctx).s1 = s();
				setState(19);
				match(T__0);
				((SContext)_localctx).diff =  ((SContext)_localctx).s1.diff - 1; ((SContext)_localctx).check =  (((SContext)_localctx).s1.check - equals(((SContext)_localctx).s1.diff, 1)) * ((SContext)_localctx).s1.even ;((SContext)_localctx).even =  ((SContext)_localctx).s1.even;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(22);
				match(T__0);
				((SContext)_localctx).diff =  1; ((SContext)_localctx).check =  0; ((SContext)_localctx).even =  0;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(24);
				match(T__1);
				((SContext)_localctx).diff =  -1; ((SContext)_localctx).check =  0; ((SContext)_localctx).even =  0;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				((SContext)_localctx).diff =  0; ((SContext)_localctx).check =  0; ((SContext)_localctx).even =  1;
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
		"\u0004\u0001\u0003\u001e\u0002\u0000\u0007\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"\u001c\b\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\"\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0002\u0003\u0005\u0001\u0000\u0000\u0003"+
		"\u0004\u0003\u0000\u0000\u0000\u0004\u0005\u0005\u0001\u0000\u0000\u0005"+
		"\u0006\u0006\u0000\uffff\uffff\u0000\u0006\u001c\u0001\u0000\u0000\u0000"+
		"\u0007\b\u0005\u0002\u0000\u0000\b\t\u0003\u0000\u0000\u0000\t\n\u0005"+
		"\u0002\u0000\u0000\n\u000b\u0006\u0000\uffff\uffff\u0000\u000b\u001c\u0001"+
		"\u0000\u0000\u0000\f\r\u0005\u0001\u0000\u0000\r\u000e\u0003\u0000\u0000"+
		"\u0000\u000e\u000f\u0005\u0002\u0000\u0000\u000f\u0010\u0006\u0000\uffff"+
		"\uffff\u0000\u0010\u001c\u0001\u0000\u0000\u0000\u0011\u0012\u0005\u0002"+
		"\u0000\u0000\u0012\u0013\u0003\u0000\u0000\u0000\u0013\u0014\u0005\u0001"+
		"\u0000\u0000\u0014\u0015\u0006\u0000\uffff\uffff\u0000\u0015\u001c\u0001"+
		"\u0000\u0000\u0000\u0016\u0017\u0005\u0001\u0000\u0000\u0017\u001c\u0006"+
		"\u0000\uffff\uffff\u0000\u0018\u0019\u0005\u0002\u0000\u0000\u0019\u001c"+
		"\u0006\u0000\uffff\uffff\u0000\u001a\u001c\u0006\u0000\uffff\uffff\u0000"+
		"\u001b\u0002\u0001\u0000\u0000\u0000\u001b\u0007\u0001\u0000\u0000\u0000"+
		"\u001b\f\u0001\u0000\u0000\u0000\u001b\u0011\u0001\u0000\u0000\u0000\u001b"+
		"\u0016\u0001\u0000\u0000\u0000\u001b\u0018\u0001\u0000\u0000\u0000\u001b"+
		"\u001a\u0001\u0000\u0000\u0000\u001c\u0001\u0001\u0000\u0000\u0000\u0001"+
		"\u001b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}