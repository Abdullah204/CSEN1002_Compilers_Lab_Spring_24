// Generated from /Users/abdullahahmad/Downloads/Semester_10/CSEN_1002_Advanced_Computer_Lab/Tasks_Repo/src/csen1002/main/task7/Task7.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Task7Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, ONE=2, ZERO=3, ERROR=4;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "Token", "ONE", "ZERO", "ERROR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "ONE", "ZERO", "ERROR"
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


	public Task7Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Task7.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 2:
			ONE_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			ZERO_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
			ERROR_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ONE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 System.out.println("ONE"); 
			break;
		}
	}
	private void ZERO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			System.out.println("ZERO");
			break;
		}
	}
	private void ERROR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			 System.out.println("ERROR"); 
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u0004D\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0001\u0000\u0004\u0000\r\b\u0000\u000b\u0000\f\u0000\u000e"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u0016\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002#\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u00036\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004C\b\u0004\u0000\u0000\u0005\u0001"+
		"\u0001\u0003\u0000\u0005\u0002\u0007\u0003\t\u0004\u0001\u0000\u0001\u0003"+
		"\u0000\t\n\r\r  P\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0001\f\u0001\u0000\u0000\u0000\u0003\u0015\u0001\u0000\u0000"+
		"\u0000\u0005\"\u0001\u0000\u0000\u0000\u00075\u0001\u0000\u0000\u0000"+
		"\tB\u0001\u0000\u0000\u0000\u000b\r\u0007\u0000\u0000\u0000\f\u000b\u0001"+
		"\u0000\u0000\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e\f\u0001\u0000"+
		"\u0000\u0000\u000e\u000f\u0001\u0000\u0000\u0000\u000f\u0010\u0001\u0000"+
		"\u0000\u0000\u0010\u0011\u0006\u0000\u0000\u0000\u0011\u0002\u0001\u0000"+
		"\u0000\u0000\u0012\u0016\u0003\u0005\u0002\u0000\u0013\u0016\u0003\u0007"+
		"\u0003\u0000\u0014\u0016\u0003\t\u0004\u0000\u0015\u0012\u0001\u0000\u0000"+
		"\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015\u0014\u0001\u0000\u0000"+
		"\u0000\u0016\u0004\u0001\u0000\u0000\u0000\u0017\u0018\u00050\u0000\u0000"+
		"\u0018\u0019\u00050\u0000\u0000\u0019#\u00050\u0000\u0000\u001a\u001b"+
		"\u00050\u0000\u0000\u001b\u001c\u00051\u0000\u0000\u001c#\u00051\u0000"+
		"\u0000\u001d\u001e\u00051\u0000\u0000\u001e\u001f\u00051\u0000\u0000\u001f"+
		" \u00051\u0000\u0000 !\u0001\u0000\u0000\u0000!#\u0006\u0002\u0001\u0000"+
		"\"\u0017\u0001\u0000\u0000\u0000\"\u001a\u0001\u0000\u0000\u0000\"\u001d"+
		"\u0001\u0000\u0000\u0000#\u0006\u0001\u0000\u0000\u0000$%\u00050\u0000"+
		"\u0000%&\u00051\u0000\u0000&6\u00050\u0000\u0000\'(\u00051\u0000\u0000"+
		"()\u00050\u0000\u0000)6\u00050\u0000\u0000*+\u00051\u0000\u0000+,\u0005"+
		"0\u0000\u0000,6\u00051\u0000\u0000-.\u00050\u0000\u0000./\u00050\u0000"+
		"\u0000/6\u00051\u0000\u000001\u00051\u0000\u000012\u00051\u0000\u0000"+
		"23\u00050\u0000\u000034\u0001\u0000\u0000\u000046\u0006\u0003\u0002\u0000"+
		"5$\u0001\u0000\u0000\u00005\'\u0001\u0000\u0000\u00005*\u0001\u0000\u0000"+
		"\u00005-\u0001\u0000\u0000\u000050\u0001\u0000\u0000\u00006\b\u0001\u0000"+
		"\u0000\u000078\u00050\u0000\u00008C\u00051\u0000\u00009:\u00050\u0000"+
		"\u0000:C\u00050\u0000\u0000;<\u00051\u0000\u0000<C\u00051\u0000\u0000"+
		"=>\u00051\u0000\u0000>C\u00050\u0000\u0000?C\u00051\u0000\u0000@A\u0005"+
		"0\u0000\u0000AC\u0006\u0004\u0003\u0000B7\u0001\u0000\u0000\u0000B9\u0001"+
		"\u0000\u0000\u0000B;\u0001\u0000\u0000\u0000B=\u0001\u0000\u0000\u0000"+
		"B?\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000C\n\u0001\u0000\u0000"+
		"\u0000\u0006\u0000\u000e\u0015\"5B\u0004\u0006\u0000\u0000\u0001\u0002"+
		"\u0000\u0001\u0003\u0001\u0001\u0004\u0002";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}