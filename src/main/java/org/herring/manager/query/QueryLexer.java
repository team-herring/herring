// Generated from Query.g4 by ANTLR 4.0

package org.herring.manager.query;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QueryLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WS=2, CALCULATE=3, AVERAGE=4, COUNT=5, SUM=6, MIN=7, MAX=8, MEDIAN=9, 
		BY=10, BETWEEN=11, IN=12, DAYS=13, MINUTES=14, HOURS=15, MONTHS=16, ASK=17, 
		FILTER=18, AND=19, OR=20, NOT=21, LESS_THAN=22, LESS_THAN_OR_EQUAL=23, 
		GREATER_THAN=24, GREATER_THAN_OR_EQUAL=25, EQUAL=26, NOT_EQUAL=27, MULTIPLY=28, 
		ADD=29, DIVIDE=30, SUBTRACT=31, PIPE=32, OPEN_BRACE=33, CLOSE_BRACE=34, 
		TABLE_IDENTIFIER=35, FIELD_IDENTIFIER=36, DATE_LITERAL=37, TIME_LITERAL=38, 
		ZONE_LITERAL=39, POSITIVE_INTEGER=40, NEGATIVE_INTEGER=41, POSITIVE_REAL=42, 
		NEGATIVE_REAL=43, SMALL_QUOTED_STRING=44, LARGE_QUOTED_STRING=45;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'T'", "WS", "CALCULATE", "AVERAGE", "COUNT", "SUM", "MIN", "MAX", "MEDIAN", 
		"BY", "BETWEEN", "IN", "DAYS", "MINUTES", "HOURS", "MONTHS", "ASK", "FILTER", 
		"AND", "OR", "NOT", "'<'", "'<='", "'>'", "'>='", "'='", "'!='", "'*'", 
		"'+'", "'/'", "'-'", "'|'", "'('", "')'", "TABLE_IDENTIFIER", "FIELD_IDENTIFIER", 
		"DATE_LITERAL", "TIME_LITERAL", "ZONE_LITERAL", "POSITIVE_INTEGER", "NEGATIVE_INTEGER", 
		"POSITIVE_REAL", "NEGATIVE_REAL", "SMALL_QUOTED_STRING", "LARGE_QUOTED_STRING"
	};
	public static final String[] ruleNames = {
		"T__0", "WS", "CALCULATE", "AVERAGE", "COUNT", "SUM", "MIN", "MAX", "MEDIAN", 
		"BY", "BETWEEN", "IN", "DAYS", "MINUTES", "HOURS", "MONTHS", "ASK", "FILTER", 
		"AND", "OR", "NOT", "LESS_THAN", "LESS_THAN_OR_EQUAL", "GREATER_THAN", 
		"GREATER_THAN_OR_EQUAL", "EQUAL", "NOT_EQUAL", "MULTIPLY", "ADD", "DIVIDE", 
		"SUBTRACT", "PIPE", "OPEN_BRACE", "CLOSE_BRACE", "TABLE_IDENTIFIER", "FIELD_IDENTIFIER", 
		"DATE_LITERAL", "TIME_LITERAL", "ZONE_LITERAL", "POSITIVE_INTEGER", "NEGATIVE_INTEGER", 
		"POSITIVE_REAL", "NEGATIVE_REAL", "SMALL_QUOTED_STRING", "LARGE_QUOTED_STRING"
	};


	public QueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Query.g4"; }

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
		case 1: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: _channel = 1;  break;
		}
	}

	public static final String _serializedATN =
		"\2\4/\u0154\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\3\2\3\2\3\3\6\3a\n\3\r\3\16\3"+
		"b\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\6$\u00ef"+
		"\n$\r$\16$\u00f0\3%\3%\6%\u00f5\n%\r%\16%\u00f6\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\5(\u0113"+
		"\n(\3)\5)\u0116\n)\3)\6)\u0119\n)\r)\16)\u011a\3*\3*\6*\u011f\n*\r*\16"+
		"*\u0120\3+\5+\u0124\n+\3+\6+\u0127\n+\r+\16+\u0128\3+\3+\7+\u012d\n+\f"+
		"+\16+\u0130\13+\3,\3,\6,\u0134\n,\r,\16,\u0135\3,\3,\7,\u013a\n,\f,\16"+
		",\u013d\13,\3-\3-\3-\3-\7-\u0143\n-\f-\16-\u0146\13-\3-\3-\3.\3.\3.\3"+
		".\7.\u014e\n.\f.\16.\u0151\13.\3.\3.\4\u0144\u014f/\3\3\1\5\4\2\7\5\1"+
		"\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17"+
		"\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61"+
		"\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1"+
		"K\'\1M(\1O)\1Q*\1S+\1U,\1W-\1Y.\1[/\1\3\2t\5\13\f\17\17\"\"\4EEee\4CC"+
		"cc\4NNnn\4EEee\4WWww\4NNnn\4CCcc\4VVvv\4GGgg\4CCcc\4XXxx\4GGgg\4TTtt\4"+
		"CCcc\4IIii\4GGgg\4EEee\4QQqq\4WWww\4PPpp\4VVvv\4UUuu\4WWww\4OOoo\4OOo"+
		"o\4KKkk\4PPpp\4OOoo\4CCcc\4ZZzz\4OOoo\4GGgg\4FFff\4KKkk\4CCcc\4PPpp\4"+
		"DDdd\4[[{{\4DDdd\4GGgg\4VVvv\4YYyy\4GGgg\4GGgg\4PPpp\4KKkk\4PPpp\4FFf"+
		"f\4CCcc\4[[{{\4UUuu\4OOoo\4KKkk\4PPpp\4WWww\4VVvv\4GGgg\4UUuu\4JJjj\4"+
		"QQqq\4WWww\4TTtt\4UUuu\4OOoo\4QQqq\4PPpp\4VVvv\4JJjj\4UUuu\4CCcc\4UUu"+
		"u\4MMmm\4HHhh\4KKkk\4NNnn\4VVvv\4GGgg\4TTtt\4CCcc\4PPpp\4FFff\4QQqq\4"+
		"TTtt\4PPpp\4QQqq\4VVvv\7//\62;C\\aac|\7//\62;C\\aac|\3\62;\3\62;\3\62"+
		";\3\62;\3\62;\3\62;\3\62;\3\62;\3\62;\3\62;\3\62;\3\62;\3\62;\3\62;\4"+
		"--//\3\62;\3\62;\3\62;\3\62;\3\62;\3\62;\3\62;\3\62;\3\62;\3\62;\u0163"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5`\3\2\2\2\7f\3"+
		"\2\2\2\tp\3\2\2\2\13x\3\2\2\2\r~\3\2\2\2\17\u0082\3\2\2\2\21\u0086\3\2"+
		"\2\2\23\u008a\3\2\2\2\25\u0091\3\2\2\2\27\u0094\3\2\2\2\31\u009c\3\2\2"+
		"\2\33\u009f\3\2\2\2\35\u00a4\3\2\2\2\37\u00ac\3\2\2\2!\u00b2\3\2\2\2#"+
		"\u00b9\3\2\2\2%\u00bd\3\2\2\2\'\u00c4\3\2\2\2)\u00c8\3\2\2\2+\u00cb\3"+
		"\2\2\2-\u00cf\3\2\2\2/\u00d1\3\2\2\2\61\u00d4\3\2\2\2\63\u00d6\3\2\2\2"+
		"\65\u00d9\3\2\2\2\67\u00db\3\2\2\29\u00de\3\2\2\2;\u00e0\3\2\2\2=\u00e2"+
		"\3\2\2\2?\u00e4\3\2\2\2A\u00e6\3\2\2\2C\u00e8\3\2\2\2E\u00ea\3\2\2\2G"+
		"\u00ec\3\2\2\2I\u00f2\3\2\2\2K\u00f8\3\2\2\2M\u0103\3\2\2\2O\u0112\3\2"+
		"\2\2Q\u0115\3\2\2\2S\u011c\3\2\2\2U\u0123\3\2\2\2W\u0131\3\2\2\2Y\u013e"+
		"\3\2\2\2[\u0149\3\2\2\2]^\7V\2\2^\4\3\2\2\2_a\t\2\2\2`_\3\2\2\2ab\3\2"+
		"\2\2b`\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\b\3\2\2e\6\3\2\2\2fg\t\3\2\2gh\t"+
		"\4\2\2hi\t\5\2\2ij\t\6\2\2jk\t\7\2\2kl\t\b\2\2lm\t\t\2\2mn\t\n\2\2no\t"+
		"\13\2\2o\b\3\2\2\2pq\t\f\2\2qr\t\r\2\2rs\t\16\2\2st\t\17\2\2tu\t\20\2"+
		"\2uv\t\21\2\2vw\t\22\2\2w\n\3\2\2\2xy\t\23\2\2yz\t\24\2\2z{\t\25\2\2{"+
		"|\t\26\2\2|}\t\27\2\2}\f\3\2\2\2~\177\t\30\2\2\177\u0080\t\31\2\2\u0080"+
		"\u0081\t\32\2\2\u0081\16\3\2\2\2\u0082\u0083\t\33\2\2\u0083\u0084\t\34"+
		"\2\2\u0084\u0085\t\35\2\2\u0085\20\3\2\2\2\u0086\u0087\t\36\2\2\u0087"+
		"\u0088\t\37\2\2\u0088\u0089\t \2\2\u0089\22\3\2\2\2\u008a\u008b\t!\2\2"+
		"\u008b\u008c\t\"\2\2\u008c\u008d\t#\2\2\u008d\u008e\t$\2\2\u008e\u008f"+
		"\t%\2\2\u008f\u0090\t&\2\2\u0090\24\3\2\2\2\u0091\u0092\t\'\2\2\u0092"+
		"\u0093\t(\2\2\u0093\26\3\2\2\2\u0094\u0095\t)\2\2\u0095\u0096\t*\2\2\u0096"+
		"\u0097\t+\2\2\u0097\u0098\t,\2\2\u0098\u0099\t-\2\2\u0099\u009a\t.\2\2"+
		"\u009a\u009b\t/\2\2\u009b\30\3\2\2\2\u009c\u009d\t\60\2\2\u009d\u009e"+
		"\t\61\2\2\u009e\32\3\2\2\2\u009f\u00a0\t\62\2\2\u00a0\u00a1\t\63\2\2\u00a1"+
		"\u00a2\t\64\2\2\u00a2\u00a3\t\65\2\2\u00a3\34\3\2\2\2\u00a4\u00a5\t\66"+
		"\2\2\u00a5\u00a6\t\67\2\2\u00a6\u00a7\t8\2\2\u00a7\u00a8\t9\2\2\u00a8"+
		"\u00a9\t:\2\2\u00a9\u00aa\t;\2\2\u00aa\u00ab\t<\2\2\u00ab\36\3\2\2\2\u00ac"+
		"\u00ad\t=\2\2\u00ad\u00ae\t>\2\2\u00ae\u00af\t?\2\2\u00af\u00b0\t@\2\2"+
		"\u00b0\u00b1\tA\2\2\u00b1 \3\2\2\2\u00b2\u00b3\tB\2\2\u00b3\u00b4\tC\2"+
		"\2\u00b4\u00b5\tD\2\2\u00b5\u00b6\tE\2\2\u00b6\u00b7\tF\2\2\u00b7\u00b8"+
		"\tG\2\2\u00b8\"\3\2\2\2\u00b9\u00ba\tH\2\2\u00ba\u00bb\tI\2\2\u00bb\u00bc"+
		"\tJ\2\2\u00bc$\3\2\2\2\u00bd\u00be\tK\2\2\u00be\u00bf\tL\2\2\u00bf\u00c0"+
		"\tM\2\2\u00c0\u00c1\tN\2\2\u00c1\u00c2\tO\2\2\u00c2\u00c3\tP\2\2\u00c3"+
		"&\3\2\2\2\u00c4\u00c5\tQ\2\2\u00c5\u00c6\tR\2\2\u00c6\u00c7\tS\2\2\u00c7"+
		"(\3\2\2\2\u00c8\u00c9\tT\2\2\u00c9\u00ca\tU\2\2\u00ca*\3\2\2\2\u00cb\u00cc"+
		"\tV\2\2\u00cc\u00cd\tW\2\2\u00cd\u00ce\tX\2\2\u00ce,\3\2\2\2\u00cf\u00d0"+
		"\7>\2\2\u00d0.\3\2\2\2\u00d1\u00d2\7>\2\2\u00d2\u00d3\7?\2\2\u00d3\60"+
		"\3\2\2\2\u00d4\u00d5\7@\2\2\u00d5\62\3\2\2\2\u00d6\u00d7\7@\2\2\u00d7"+
		"\u00d8\7?\2\2\u00d8\64\3\2\2\2\u00d9\u00da\7?\2\2\u00da\66\3\2\2\2\u00db"+
		"\u00dc\7#\2\2\u00dc\u00dd\7?\2\2\u00dd8\3\2\2\2\u00de\u00df\7,\2\2\u00df"+
		":\3\2\2\2\u00e0\u00e1\7-\2\2\u00e1<\3\2\2\2\u00e2\u00e3\7\61\2\2\u00e3"+
		">\3\2\2\2\u00e4\u00e5\7/\2\2\u00e5@\3\2\2\2\u00e6\u00e7\7~\2\2\u00e7B"+
		"\3\2\2\2\u00e8\u00e9\7*\2\2\u00e9D\3\2\2\2\u00ea\u00eb\7+\2\2\u00ebF\3"+
		"\2\2\2\u00ec\u00ee\7%\2\2\u00ed\u00ef\tY\2\2\u00ee\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1H\3\2\2\2"+
		"\u00f2\u00f4\7B\2\2\u00f3\u00f5\tZ\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f6"+
		"\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7J\3\2\2\2\u00f8"+
		"\u00f9\t[\2\2\u00f9\u00fa\t\\\2\2\u00fa\u00fb\t]\2\2\u00fb\u00fc\t^\2"+
		"\2\u00fc\u00fd\7/\2\2\u00fd\u00fe\t_\2\2\u00fe\u00ff\t`\2\2\u00ff\u0100"+
		"\7/\2\2\u0100\u0101\ta\2\2\u0101\u0102\tb\2\2\u0102L\3\2\2\2\u0103\u0104"+
		"\tc\2\2\u0104\u0105\td\2\2\u0105\u0106\7<\2\2\u0106\u0107\te\2\2\u0107"+
		"\u0108\tf\2\2\u0108\u0109\7<\2\2\u0109\u010a\tg\2\2\u010a\u010b\th\2\2"+
		"\u010bN\3\2\2\2\u010c\u010d\ti\2\2\u010d\u010e\tj\2\2\u010e\u010f\tk\2"+
		"\2\u010f\u0110\tl\2\2\u0110\u0113\tm\2\2\u0111\u0113\7\\\2\2\u0112\u010c"+
		"\3\2\2\2\u0112\u0111\3\2\2\2\u0113P\3\2\2\2\u0114\u0116\7-\2\2\u0115\u0114"+
		"\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0119\tn\2\2\u0118"+
		"\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2"+
		"\2\2\u011bR\3\2\2\2\u011c\u011e\7/\2\2\u011d\u011f\to\2\2\u011e\u011d"+
		"\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"T\3\2\2\2\u0122\u0124\7-\2\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0126\3\2\2\2\u0125\u0127\tp\2\2\u0126\u0125\3\2\2\2\u0127\u0128\3\2"+
		"\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u012e\7\60\2\2\u012b\u012d\tq\2\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2"+
		"\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012fV\3\2\2\2\u0130\u012e"+
		"\3\2\2\2\u0131\u0133\7/\2\2\u0132\u0134\tr\2\2\u0133\u0132\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2"+
		"\2\2\u0137\u013b\7\60\2\2\u0138\u013a\ts\2\2\u0139\u0138\3\2\2\2\u013a"+
		"\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013cX\3\2\2\2"+
		"\u013d\u013b\3\2\2\2\u013e\u0144\7)\2\2\u013f\u0140\7^\2\2\u0140\u0143"+
		"\7)\2\2\u0141\u0143\13\2\2\2\u0142\u013f\3\2\2\2\u0142\u0141\3\2\2\2\u0143"+
		"\u0146\3\2\2\2\u0144\u0145\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0147\3\2"+
		"\2\2\u0146\u0144\3\2\2\2\u0147\u0148\7)\2\2\u0148Z\3\2\2\2\u0149\u014f"+
		"\7$\2\2\u014a\u014b\7^\2\2\u014b\u014e\7$\2\2\u014c\u014e\13\2\2\2\u014d"+
		"\u014a\3\2\2\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u0150\3\2"+
		"\2\2\u014f\u014d\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152"+
		"\u0153\7$\2\2\u0153\\\3\2\2\2\25\2b\u00ee\u00f0\u00f4\u00f6\u0112\u0115"+
		"\u011a\u0120\u0123\u0128\u012e\u0135\u013b\u0142\u0144\u014d\u014f";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}