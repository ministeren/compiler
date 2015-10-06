// Generated from C:\Users\ministeren\Dropbox\Softwareteknologi - Fælles\3. Semester\Compilerteknik\Assignment 2\Assignment 2\MiniJava.g4 by ANTLR 4.1
package compiler.Frontend;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MINUS=1, AND=2, EQUALS=3, LESSTHAN=4, GREATERTHAN=5, PLUS=6, TIMES=7, 
		EXCLAMATION=8, SEMICOLON=9, COMMA=10, EQUAL=11, DOT=12, INCREMENT=13, 
		DECREMENT=14, PLUSEQUAL=15, ROUNDOPEN=16, ROUNDCLOSE=17, SQUAREOPEN=18, 
		SQUARECLOSE=19, CURLYOPEN=20, CURLYCLOSE=21, TRUE=22, FALSE=23, CLASS=24, 
		EXTENDS=25, TYPEBOOLEAN=26, TYPEVOID=27, TYPEINT=28, TYPEDOUBLE=29, TYPECHAR=30, 
		PUBLIC=31, PRIVATE=32, STATIC=33, THIS=34, IF=35, ELSE=36, WHILE=37, PRINT=38, 
		PRINTLN=39, RETURN=40, NEW=41, IDENT=42, INT=43, DOUBLE=44, CHAR=45, STRING=46, 
		LINE_COMMENT=47, MULTILINE_COMMENT=48, WHITESPACE=49;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'-'", "'&&'", "'=='", "'<'", "'>'", "'+'", "'*'", "'!'", "';'", "','", 
		"'='", "'.'", "'++'", "'--'", "'+='", "'('", "')'", "'['", "']'", "'{'", 
		"'}'", "'true'", "'false'", "'class'", "'extends'", "'boolean'", "'void'", 
		"'int'", "'double'", "'char'", "'public'", "'private'", "'static'", "'this'", 
		"'if'", "'else'", "'while'", "'System.out.print'", "'System.out.println'", 
		"'return'", "'new'", "IDENT", "INT", "DOUBLE", "CHAR", "STRING", "LINE_COMMENT", 
		"MULTILINE_COMMENT", "WHITESPACE"
	};
	public static final String[] ruleNames = {
		"MINUS", "AND", "EQUALS", "LESSTHAN", "GREATERTHAN", "PLUS", "TIMES", 
		"EXCLAMATION", "SEMICOLON", "COMMA", "EQUAL", "DOT", "INCREMENT", "DECREMENT", 
		"PLUSEQUAL", "ROUNDOPEN", "ROUNDCLOSE", "SQUAREOPEN", "SQUARECLOSE", "CURLYOPEN", 
		"CURLYCLOSE", "TRUE", "FALSE", "CLASS", "EXTENDS", "TYPEBOOLEAN", "TYPEVOID", 
		"TYPEINT", "TYPEDOUBLE", "TYPECHAR", "PUBLIC", "PRIVATE", "STATIC", "THIS", 
		"IF", "ELSE", "WHILE", "PRINT", "PRINTLN", "RETURN", "NEW", "LOWER", "UPPER", 
		"NONNULL", "NUMBER", "IDENT", "INT", "DOUBLE", "CHAR", "STRING", "LINE_COMMENT", 
		"MULTILINE_COMMENT", "WHITESPACE"
	};


	public MiniJavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 50: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 51: MULTILINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 52: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}
	private void MULTILINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\63\u0193\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3"+
		"&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3"+
		")\3)\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\5.\u0133\n.\3/\3"+
		"/\5/\u0137\n/\3/\3/\3/\3/\7/\u013d\n/\f/\16/\u0140\13/\3\60\3\60\3\60"+
		"\7\60\u0145\n\60\f\60\16\60\u0148\13\60\5\60\u014a\n\60\3\61\3\61\3\61"+
		"\7\61\u014f\n\61\f\61\16\61\u0152\13\61\3\61\3\61\3\61\3\61\3\61\7\61"+
		"\u0159\n\61\f\61\16\61\u015c\13\61\5\61\u015e\n\61\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\5\62\u0169\n\62\3\63\3\63\7\63\u016d\n\63\f"+
		"\63\16\63\u0170\13\63\3\63\3\63\3\64\3\64\3\64\3\64\7\64\u0178\n\64\f"+
		"\64\16\64\u017b\13\64\3\64\3\64\3\65\3\65\3\65\3\65\7\65\u0183\n\65\f"+
		"\65\16\65\u0186\13\65\3\65\3\65\3\65\3\65\3\65\3\66\6\66\u018e\n\66\r"+
		"\66\16\66\u018f\3\66\3\66\4\u016e\u0184\67\3\3\1\5\4\1\7\5\1\t\6\1\13"+
		"\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1"+
		"\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33"+
		"\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O"+
		")\1Q*\1S+\1U\2\1W\2\1Y\2\1[\2\1],\1_-\1a.\1c/\1e\60\1g\61\2i\62\3k\63"+
		"\4\3\2\5\5\2\"#%]_\u0080\4\2\f\f\17\17\5\2\13\f\17\17\"\"\u01a2\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2]\3\2"+
		"\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2"+
		"\2k\3\2\2\2\3m\3\2\2\2\5o\3\2\2\2\7r\3\2\2\2\tu\3\2\2\2\13w\3\2\2\2\r"+
		"y\3\2\2\2\17{\3\2\2\2\21}\3\2\2\2\23\177\3\2\2\2\25\u0081\3\2\2\2\27\u0083"+
		"\3\2\2\2\31\u0085\3\2\2\2\33\u0087\3\2\2\2\35\u008a\3\2\2\2\37\u008d\3"+
		"\2\2\2!\u0090\3\2\2\2#\u0092\3\2\2\2%\u0094\3\2\2\2\'\u0096\3\2\2\2)\u0098"+
		"\3\2\2\2+\u009a\3\2\2\2-\u009c\3\2\2\2/\u00a1\3\2\2\2\61\u00a7\3\2\2\2"+
		"\63\u00ad\3\2\2\2\65\u00b5\3\2\2\2\67\u00bd\3\2\2\29\u00c2\3\2\2\2;\u00c6"+
		"\3\2\2\2=\u00cd\3\2\2\2?\u00d2\3\2\2\2A\u00d9\3\2\2\2C\u00e1\3\2\2\2E"+
		"\u00e8\3\2\2\2G\u00ed\3\2\2\2I\u00f0\3\2\2\2K\u00f5\3\2\2\2M\u00fb\3\2"+
		"\2\2O\u010c\3\2\2\2Q\u011f\3\2\2\2S\u0126\3\2\2\2U\u012a\3\2\2\2W\u012c"+
		"\3\2\2\2Y\u012e\3\2\2\2[\u0132\3\2\2\2]\u0136\3\2\2\2_\u0149\3\2\2\2a"+
		"\u015d\3\2\2\2c\u0168\3\2\2\2e\u016a\3\2\2\2g\u0173\3\2\2\2i\u017e\3\2"+
		"\2\2k\u018d\3\2\2\2mn\7/\2\2n\4\3\2\2\2op\7(\2\2pq\7(\2\2q\6\3\2\2\2r"+
		"s\7?\2\2st\7?\2\2t\b\3\2\2\2uv\7>\2\2v\n\3\2\2\2wx\7@\2\2x\f\3\2\2\2y"+
		"z\7-\2\2z\16\3\2\2\2{|\7,\2\2|\20\3\2\2\2}~\7#\2\2~\22\3\2\2\2\177\u0080"+
		"\7=\2\2\u0080\24\3\2\2\2\u0081\u0082\7.\2\2\u0082\26\3\2\2\2\u0083\u0084"+
		"\7?\2\2\u0084\30\3\2\2\2\u0085\u0086\7\60\2\2\u0086\32\3\2\2\2\u0087\u0088"+
		"\7-\2\2\u0088\u0089\7-\2\2\u0089\34\3\2\2\2\u008a\u008b\7/\2\2\u008b\u008c"+
		"\7/\2\2\u008c\36\3\2\2\2\u008d\u008e\7-\2\2\u008e\u008f\7?\2\2\u008f "+
		"\3\2\2\2\u0090\u0091\7*\2\2\u0091\"\3\2\2\2\u0092\u0093\7+\2\2\u0093$"+
		"\3\2\2\2\u0094\u0095\7]\2\2\u0095&\3\2\2\2\u0096\u0097\7_\2\2\u0097(\3"+
		"\2\2\2\u0098\u0099\7}\2\2\u0099*\3\2\2\2\u009a\u009b\7\177\2\2\u009b,"+
		"\3\2\2\2\u009c\u009d\7v\2\2\u009d\u009e\7t\2\2\u009e\u009f\7w\2\2\u009f"+
		"\u00a0\7g\2\2\u00a0.\3\2\2\2\u00a1\u00a2\7h\2\2\u00a2\u00a3\7c\2\2\u00a3"+
		"\u00a4\7n\2\2\u00a4\u00a5\7u\2\2\u00a5\u00a6\7g\2\2\u00a6\60\3\2\2\2\u00a7"+
		"\u00a8\7e\2\2\u00a8\u00a9\7n\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7u\2\2"+
		"\u00ab\u00ac\7u\2\2\u00ac\62\3\2\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7"+
		"z\2\2\u00af\u00b0\7v\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3"+
		"\7f\2\2\u00b3\u00b4\7u\2\2\u00b4\64\3\2\2\2\u00b5\u00b6\7d\2\2\u00b6\u00b7"+
		"\7q\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7n\2\2\u00b9\u00ba\7g\2\2\u00ba"+
		"\u00bb\7c\2\2\u00bb\u00bc\7p\2\2\u00bc\66\3\2\2\2\u00bd\u00be\7x\2\2\u00be"+
		"\u00bf\7q\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7f\2\2\u00c18\3\2\2\2\u00c2"+
		"\u00c3\7k\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5\7v\2\2\u00c5:\3\2\2\2\u00c6"+
		"\u00c7\7f\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7w\2\2\u00c9\u00ca\7d\2\2"+
		"\u00ca\u00cb\7n\2\2\u00cb\u00cc\7g\2\2\u00cc<\3\2\2\2\u00cd\u00ce\7e\2"+
		"\2\u00ce\u00cf\7j\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7t\2\2\u00d1>\3\2"+
		"\2\2\u00d2\u00d3\7r\2\2\u00d3\u00d4\7w\2\2\u00d4\u00d5\7d\2\2\u00d5\u00d6"+
		"\7n\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7e\2\2\u00d8@\3\2\2\2\u00d9\u00da"+
		"\7r\2\2\u00da\u00db\7t\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7x\2\2\u00dd"+
		"\u00de\7c\2\2\u00de\u00df\7v\2\2\u00df\u00e0\7g\2\2\u00e0B\3\2\2\2\u00e1"+
		"\u00e2\7u\2\2\u00e2\u00e3\7v\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5\7v\2\2"+
		"\u00e5\u00e6\7k\2\2\u00e6\u00e7\7e\2\2\u00e7D\3\2\2\2\u00e8\u00e9\7v\2"+
		"\2\u00e9\u00ea\7j\2\2\u00ea\u00eb\7k\2\2\u00eb\u00ec\7u\2\2\u00ecF\3\2"+
		"\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef\7h\2\2\u00efH\3\2\2\2\u00f0\u00f1"+
		"\7g\2\2\u00f1\u00f2\7n\2\2\u00f2\u00f3\7u\2\2\u00f3\u00f4\7g\2\2\u00f4"+
		"J\3\2\2\2\u00f5\u00f6\7y\2\2\u00f6\u00f7\7j\2\2\u00f7\u00f8\7k\2\2\u00f8"+
		"\u00f9\7n\2\2\u00f9\u00fa\7g\2\2\u00faL\3\2\2\2\u00fb\u00fc\7U\2\2\u00fc"+
		"\u00fd\7{\2\2\u00fd\u00fe\7u\2\2\u00fe\u00ff\7v\2\2\u00ff\u0100\7g\2\2"+
		"\u0100\u0101\7o\2\2\u0101\u0102\7\60\2\2\u0102\u0103\7q\2\2\u0103\u0104"+
		"\7w\2\2\u0104\u0105\7v\2\2\u0105\u0106\7\60\2\2\u0106\u0107\7r\2\2\u0107"+
		"\u0108\7t\2\2\u0108\u0109\7k\2\2\u0109\u010a\7p\2\2\u010a\u010b\7v\2\2"+
		"\u010bN\3\2\2\2\u010c\u010d\7U\2\2\u010d\u010e\7{\2\2\u010e\u010f\7u\2"+
		"\2\u010f\u0110\7v\2\2\u0110\u0111\7g\2\2\u0111\u0112\7o\2\2\u0112\u0113"+
		"\7\60\2\2\u0113\u0114\7q\2\2\u0114\u0115\7w\2\2\u0115\u0116\7v\2\2\u0116"+
		"\u0117\7\60\2\2\u0117\u0118\7r\2\2\u0118\u0119\7t\2\2\u0119\u011a\7k\2"+
		"\2\u011a\u011b\7p\2\2\u011b\u011c\7v\2\2\u011c\u011d\7n\2\2\u011d\u011e"+
		"\7p\2\2\u011eP\3\2\2\2\u011f\u0120\7t\2\2\u0120\u0121\7g\2\2\u0121\u0122"+
		"\7v\2\2\u0122\u0123\7w\2\2\u0123\u0124\7t\2\2\u0124\u0125\7p\2\2\u0125"+
		"R\3\2\2\2\u0126\u0127\7p\2\2\u0127\u0128\7g\2\2\u0128\u0129\7y\2\2\u0129"+
		"T\3\2\2\2\u012a\u012b\4c|\2\u012bV\3\2\2\2\u012c\u012d\4C\\\2\u012dX\3"+
		"\2\2\2\u012e\u012f\4\63;\2\u012fZ\3\2\2\2\u0130\u0133\7\62\2\2\u0131\u0133"+
		"\5Y-\2\u0132\u0130\3\2\2\2\u0132\u0131\3\2\2\2\u0133\\\3\2\2\2\u0134\u0137"+
		"\5U+\2\u0135\u0137\5W,\2\u0136\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137"+
		"\u013e\3\2\2\2\u0138\u013d\5U+\2\u0139\u013d\5W,\2\u013a\u013d\5[.\2\u013b"+
		"\u013d\7a\2\2\u013c\u0138\3\2\2\2\u013c\u0139\3\2\2\2\u013c\u013a\3\2"+
		"\2\2\u013c\u013b\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f^\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u014a\7\62\2\2"+
		"\u0142\u0146\5Y-\2\u0143\u0145\5[.\2\u0144\u0143\3\2\2\2\u0145\u0148\3"+
		"\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u014a\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0149\u0141\3\2\2\2\u0149\u0142\3\2\2\2\u014a`\3\2\2\2"+
		"\u014b\u015e\7\62\2\2\u014c\u0150\5Y-\2\u014d\u014f\5[.\2\u014e\u014d"+
		"\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151"+
		"\u0153\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0154\5\31\r\2\u0154\u0155\7"+
		"\62\2\2\u0155\u015e\3\2\2\2\u0156\u015a\5Y-\2\u0157\u0159\5[.\2\u0158"+
		"\u0157\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2"+
		"\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u014b\3\2\2\2\u015d"+
		"\u014c\3\2\2\2\u015d\u0156\3\2\2\2\u015eb\3\2\2\2\u015f\u0169\t\2\2\2"+
		"\u0160\u0161\7^\2\2\u0161\u0169\7$\2\2\u0162\u0163\7^\2\2\u0163\u0169"+
		"\7^\2\2\u0164\u0165\7^\2\2\u0165\u0169\7v\2\2\u0166\u0167\7^\2\2\u0167"+
		"\u0169\7p\2\2\u0168\u015f\3\2\2\2\u0168\u0160\3\2\2\2\u0168\u0162\3\2"+
		"\2\2\u0168\u0164\3\2\2\2\u0168\u0166\3\2\2\2\u0169d\3\2\2\2\u016a\u016e"+
		"\7$\2\2\u016b\u016d\5c\62\2\u016c\u016b\3\2\2\2\u016d\u0170\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u016e\3\2"+
		"\2\2\u0171\u0172\7$\2\2\u0172f\3\2\2\2\u0173\u0174\7\61\2\2\u0174\u0175"+
		"\7\61\2\2\u0175\u0179\3\2\2\2\u0176\u0178\n\3\2\2\u0177\u0176\3\2\2\2"+
		"\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017c"+
		"\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017d\b\64\2\2\u017dh\3\2\2\2\u017e"+
		"\u017f\7\61\2\2\u017f\u0180\7,\2\2\u0180\u0184\3\2\2\2\u0181\u0183\13"+
		"\2\2\2\u0182\u0181\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0185\3\2\2\2\u0184"+
		"\u0182\3\2\2\2\u0185\u0187\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0188\7,"+
		"\2\2\u0188\u0189\7\61\2\2\u0189\u018a\3\2\2\2\u018a\u018b\b\65\3\2\u018b"+
		"j\3\2\2\2\u018c\u018e\t\4\2\2\u018d\u018c\3\2\2\2\u018e\u018f\3\2\2\2"+
		"\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192"+
		"\b\66\4\2\u0192l\3\2\2\2\21\2\u0132\u0136\u013c\u013e\u0146\u0149\u0150"+
		"\u015a\u015d\u0168\u016e\u0179\u0184\u018f";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}