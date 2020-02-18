// Generated from Hello.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, OR=2, NOT=3, XOR=4, INTNUM=5, SKIP=6, CHAR=7, LPAREN=8, RPAREN=9, 
		SEMI=10, COMMA=11, EMPTY=12, PRINT=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'"
	};
	public static final String[] ruleNames = {
		"AND", "OR", "NOT", "XOR", "INTNUM", "SKIP", "CHAR", "LPAREN", "RPAREN", 
		"SEMI", "COMMA", "EMPTY", "PRINT"
	};


	public HelloLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17Q\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\6\6\6.\n\6\r\6\16\6/\3\7\6\7\63\n\7\r\7\16\7\64"+
		"\3\7\5\78\n\7\3\b\6\b;\n\b\r\b\16\b<\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\2\2\17\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\3\2\5\3\2\62\63\4"+
		"\2\f\f\17\17\4\2C\\c|T\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5!\3\2\2"+
		"\2\7$\3\2\2\2\t(\3\2\2\2\13-\3\2\2\2\r\67\3\2\2\2\17:\3\2\2\2\21>\3\2"+
		"\2\2\23@\3\2\2\2\25B\3\2\2\2\27D\3\2\2\2\31F\3\2\2\2\33K\3\2\2\2\35\36"+
		"\7C\2\2\36\37\7P\2\2\37 \7F\2\2 \4\3\2\2\2!\"\7Q\2\2\"#\7T\2\2#\6\3\2"+
		"\2\2$%\7P\2\2%&\7Q\2\2&\'\7V\2\2\'\b\3\2\2\2()\7Z\2\2)*\7Q\2\2*+\7T\2"+
		"\2+\n\3\2\2\2,.\t\2\2\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\f"+
		"\3\2\2\2\61\63\t\3\2\2\62\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65"+
		"\3\2\2\2\658\3\2\2\2\668\5\31\r\2\67\62\3\2\2\2\67\66\3\2\2\28\16\3\2"+
		"\2\29;\t\4\2\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\20\3\2\2\2>?\7"+
		"*\2\2?\22\3\2\2\2@A\7+\2\2A\24\3\2\2\2BC\7=\2\2C\26\3\2\2\2DE\7.\2\2E"+
		"\30\3\2\2\2FG\7p\2\2GH\7w\2\2HI\7n\2\2IJ\7n\2\2J\32\3\2\2\2KL\7r\2\2L"+
		"M\7t\2\2MN\7k\2\2NO\7p\2\2OP\7v\2\2P\34\3\2\2\2\7\2/\64\67<\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}