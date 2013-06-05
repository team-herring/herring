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
		T__1=1, T__0=2, WS=3, AGGREGATE=4, CALCULATE=5, AVERAGE=6, COUNT=7, SUM=8, 
		MIN=9, MAX=10, MEDIAN=11, BY=12, TIME=13, BETWEEN=14, IN=15, DAYS=16, 
		MINUTES=17, HOURS=18, MONTHS=19, ASK=20, FILTER=21, AND=22, OR=23, NOT=24, 
		LESS_THAN=25, LESS_THAN_OR_EQUAL=26, GREATER_THAN=27, GREATER_THAN_OR_EQUAL=28, 
		EQUAL=29, NOT_EQUAL=30, MULTIPLY=31, ADD=32, DIVIDE=33, SUBTRACT=34, PIPE=35, 
		OPEN_BRACE=36, CLOSE_BRACE=37, FIELD_IDENTIFIER=38, DATE_LITERAL=39, TIME_LITERAL=40, 
		ZONE_LITERAL=41, POSITIVE_INTEGER=42, NEGATIVE_INTEGER=43, POSITIVE_REAL=44, 
		NEGATIVE_REAL=45, SMALL_QUOTED_STRING=46, LARGE_QUOTED_STRING=47;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'T'", "'Z'", "WS", "AGGREGATE", "CALCULATE", "AVERAGE", "COUNT", "SUM", 
		"MIN", "MAX", "MEDIAN", "BY", "TIME", "BETWEEN", "IN", "DAYS", "MINUTES", 
		"HOURS", "MONTHS", "ASK", "FILTER", "AND", "OR", "NOT", "'<'", "'<='", 
		"'>'", "'>='", "'='", "'!='", "'*'", "'+'", "'/'", "'-'", "'|'", "'('", 
		"')'", "FIELD_IDENTIFIER", "DATE_LITERAL", "TIME_LITERAL", "ZONE_LITERAL", 
		"POSITIVE_INTEGER", "NEGATIVE_INTEGER", "POSITIVE_REAL", "NEGATIVE_REAL", 
		"SMALL_QUOTED_STRING", "LARGE_QUOTED_STRING"
	};
	public static final String[] ruleNames = {
		"T__1", "T__0", "WS", "AGGREGATE", "CALCULATE", "AVERAGE", "COUNT", "SUM", 
		"MIN", "MAX", "MEDIAN", "BY", "TIME", "BETWEEN", "IN", "DAYS", "MINUTES", 
		"HOURS", "MONTHS", "ASK", "FILTER", "AND", "OR", "NOT", "LESS_THAN", "LESS_THAN_OR_EQUAL", 
		"GREATER_THAN", "GREATER_THAN_OR_EQUAL", "EQUAL", "NOT_EQUAL", "MULTIPLY", 
		"ADD", "DIVIDE", "SUBTRACT", "PIPE", "OPEN_BRACE", "CLOSE_BRACE", "FIELD_IDENTIFIER", 
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
		case 2: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: _channel = 1;  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\61\u0165\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\3"+
		"\3\3\4\6\4g\n\4\r\4\16\4h\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\5\21\u00b9\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u00c2\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u00c9\n\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\5\24\u00d1\n\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\6\'\u0108\n"+
		"\'\r\'\16\'\u0109\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3*\3*\3*\3*\3*\3*\3+\5+\u0127\n+\3+\6+\u012a\n+\r+\16+\u012b\3"+
		",\3,\6,\u0130\n,\r,\16,\u0131\3-\5-\u0135\n-\3-\6-\u0138\n-\r-\16-\u0139"+
		"\3-\3-\7-\u013e\n-\f-\16-\u0141\13-\3.\3.\6.\u0145\n.\r.\16.\u0146\3."+
		"\3.\7.\u014b\n.\f.\16.\u014e\13.\3/\3/\3/\3/\7/\u0154\n/\f/\16/\u0157"+
		"\13/\3/\3/\3\60\3\60\3\60\3\60\7\60\u015f\n\60\f\60\16\60\u0162\13\60"+
		"\3\60\3\60\4\u0155\u0160\61\3\3\1\5\4\1\7\5\2\t\6\1\13\7\1\r\b\1\17\t"+
		"\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1"+
		"#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67"+
		"\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,"+
		"\1W-\1Y.\1[/\1]\60\1_\61\1\3\2\u0080\5\13\f\17\17\"\"\4CCcc\4IIii\4II"+
		"ii\4TTtt\4GGgg\4IIii\4CCcc\4VVvv\4GGgg\4EEee\4CCcc\4NNnn\4EEee\4WWww\4"+
		"NNnn\4CCcc\4VVvv\4GGgg\4CCcc\4XXxx\4GGgg\4TTtt\4CCcc\4IIii\4GGgg\4EEe"+
		"e\4QQqq\4WWww\4PPpp\4VVvv\4UUuu\4WWww\4OOoo\4OOoo\4KKkk\4PPpp\4OOoo\4"+
		"CCcc\4ZZzz\4OOoo\4GGgg\4FFff\4KKkk\4CCcc\4PPpp\4DDdd\4[[{{\4VVvv\4KKk"+
		"k\4OOoo\4GGgg\4DDdd\4GGgg\4VVvv\4YYyy\4GGgg\4GGgg\4PPpp\4KKkk\4PPpp\4"+
		"FFff\4CCcc\4[[{{\4UUuu\4OOoo\4KKkk\4PPpp\4WWww\4VVvv\4GGgg\4UUuu\4JJj"+
		"j\4QQqq\4WWww\4TTtt\4UUuu\4OOoo\4QQqq\4PPpp\4VVvv\4JJjj\4UUuu\4CCcc\4"+
		"UUuu\4MMmm\4HHhh\4KKkk\4NNnn\4VVvv\4GGgg\4TTtt\4CCcc\4PPpp\4FFff\4QQq"+
		"q\4TTtt\4PPpp\4QQqq\4VVvv\7//\62;C\\aac|\3\62;\3\62;\3\62;\3\62;\3\62"+
		";\3\62;\3\62;\3\62;\3\62;\3\62;\3\62;\3\62;\3\62;\3\62;\4--//\3\62;\3"+
		"\62;\3\62;\3\62;\3\62;\3\62;\3\62;\3\62;\3\62;\3\62;\u0176\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2\2\5c\3\2"+
		"\2\2\7f\3\2\2\2\tl\3\2\2\2\13v\3\2\2\2\r\u0080\3\2\2\2\17\u0088\3\2\2"+
		"\2\21\u008e\3\2\2\2\23\u0092\3\2\2\2\25\u0096\3\2\2\2\27\u009a\3\2\2\2"+
		"\31\u00a1\3\2\2\2\33\u00a4\3\2\2\2\35\u00a9\3\2\2\2\37\u00b1\3\2\2\2!"+
		"\u00b4\3\2\2\2#\u00ba\3\2\2\2%\u00c3\3\2\2\2\'\u00ca\3\2\2\2)\u00d2\3"+
		"\2\2\2+\u00d6\3\2\2\2-\u00dd\3\2\2\2/\u00e1\3\2\2\2\61\u00e4\3\2\2\2\63"+
		"\u00e8\3\2\2\2\65\u00ea\3\2\2\2\67\u00ed\3\2\2\29\u00ef\3\2\2\2;\u00f2"+
		"\3\2\2\2=\u00f4\3\2\2\2?\u00f7\3\2\2\2A\u00f9\3\2\2\2C\u00fb\3\2\2\2E"+
		"\u00fd\3\2\2\2G\u00ff\3\2\2\2I\u0101\3\2\2\2K\u0103\3\2\2\2M\u0105\3\2"+
		"\2\2O\u010b\3\2\2\2Q\u0116\3\2\2\2S\u011f\3\2\2\2U\u0126\3\2\2\2W\u012d"+
		"\3\2\2\2Y\u0134\3\2\2\2[\u0142\3\2\2\2]\u014f\3\2\2\2_\u015a\3\2\2\2a"+
		"b\7V\2\2b\4\3\2\2\2cd\7\\\2\2d\6\3\2\2\2eg\t\2\2\2fe\3\2\2\2gh\3\2\2\2"+
		"hf\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\b\4\2\2k\b\3\2\2\2lm\t\3\2\2mn\t\4\2"+
		"\2no\t\5\2\2op\t\6\2\2pq\t\7\2\2qr\t\b\2\2rs\t\t\2\2st\t\n\2\2tu\t\13"+
		"\2\2u\n\3\2\2\2vw\t\f\2\2wx\t\r\2\2xy\t\16\2\2yz\t\17\2\2z{\t\20\2\2{"+
		"|\t\21\2\2|}\t\22\2\2}~\t\23\2\2~\177\t\24\2\2\177\f\3\2\2\2\u0080\u0081"+
		"\t\25\2\2\u0081\u0082\t\26\2\2\u0082\u0083\t\27\2\2\u0083\u0084\t\30\2"+
		"\2\u0084\u0085\t\31\2\2\u0085\u0086\t\32\2\2\u0086\u0087\t\33\2\2\u0087"+
		"\16\3\2\2\2\u0088\u0089\t\34\2\2\u0089\u008a\t\35\2\2\u008a\u008b\t\36"+
		"\2\2\u008b\u008c\t\37\2\2\u008c\u008d\t \2\2\u008d\20\3\2\2\2\u008e\u008f"+
		"\t!\2\2\u008f\u0090\t\"\2\2\u0090\u0091\t#\2\2\u0091\22\3\2\2\2\u0092"+
		"\u0093\t$\2\2\u0093\u0094\t%\2\2\u0094\u0095\t&\2\2\u0095\24\3\2\2\2\u0096"+
		"\u0097\t\'\2\2\u0097\u0098\t(\2\2\u0098\u0099\t)\2\2\u0099\26\3\2\2\2"+
		"\u009a\u009b\t*\2\2\u009b\u009c\t+\2\2\u009c\u009d\t,\2\2\u009d\u009e"+
		"\t-\2\2\u009e\u009f\t.\2\2\u009f\u00a0\t/\2\2\u00a0\30\3\2\2\2\u00a1\u00a2"+
		"\t\60\2\2\u00a2\u00a3\t\61\2\2\u00a3\32\3\2\2\2\u00a4\u00a5\t\62\2\2\u00a5"+
		"\u00a6\t\63\2\2\u00a6\u00a7\t\64\2\2\u00a7\u00a8\t\65\2\2\u00a8\34\3\2"+
		"\2\2\u00a9\u00aa\t\66\2\2\u00aa\u00ab\t\67\2\2\u00ab\u00ac\t8\2\2\u00ac"+
		"\u00ad\t9\2\2\u00ad\u00ae\t:\2\2\u00ae\u00af\t;\2\2\u00af\u00b0\t<\2\2"+
		"\u00b0\36\3\2\2\2\u00b1\u00b2\t=\2\2\u00b2\u00b3\t>\2\2\u00b3 \3\2\2\2"+
		"\u00b4\u00b5\t?\2\2\u00b5\u00b6\t@\2\2\u00b6\u00b8\tA\2\2\u00b7\u00b9"+
		"\tB\2\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\"\3\2\2\2\u00ba"+
		"\u00bb\tC\2\2\u00bb\u00bc\tD\2\2\u00bc\u00bd\tE\2\2\u00bd\u00be\tF\2\2"+
		"\u00be\u00bf\tG\2\2\u00bf\u00c1\tH\2\2\u00c0\u00c2\tI\2\2\u00c1\u00c0"+
		"\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2$\3\2\2\2\u00c3\u00c4\tJ\2\2\u00c4\u00c5"+
		"\tK\2\2\u00c5\u00c6\tL\2\2\u00c6\u00c8\tM\2\2\u00c7\u00c9\tN\2\2\u00c8"+
		"\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9&\3\2\2\2\u00ca\u00cb\tO\2\2\u00cb"+
		"\u00cc\tP\2\2\u00cc\u00cd\tQ\2\2\u00cd\u00ce\tR\2\2\u00ce\u00d0\tS\2\2"+
		"\u00cf\u00d1\tT\2\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1(\3\2"+
		"\2\2\u00d2\u00d3\tU\2\2\u00d3\u00d4\tV\2\2\u00d4\u00d5\tW\2\2\u00d5*\3"+
		"\2\2\2\u00d6\u00d7\tX\2\2\u00d7\u00d8\tY\2\2\u00d8\u00d9\tZ\2\2\u00d9"+
		"\u00da\t[\2\2\u00da\u00db\t\\\2\2\u00db\u00dc\t]\2\2\u00dc,\3\2\2\2\u00dd"+
		"\u00de\t^\2\2\u00de\u00df\t_\2\2\u00df\u00e0\t`\2\2\u00e0.\3\2\2\2\u00e1"+
		"\u00e2\ta\2\2\u00e2\u00e3\tb\2\2\u00e3\60\3\2\2\2\u00e4\u00e5\tc\2\2\u00e5"+
		"\u00e6\td\2\2\u00e6\u00e7\te\2\2\u00e7\62\3\2\2\2\u00e8\u00e9\7>\2\2\u00e9"+
		"\64\3\2\2\2\u00ea\u00eb\7>\2\2\u00eb\u00ec\7?\2\2\u00ec\66\3\2\2\2\u00ed"+
		"\u00ee\7@\2\2\u00ee8\3\2\2\2\u00ef\u00f0\7@\2\2\u00f0\u00f1\7?\2\2\u00f1"+
		":\3\2\2\2\u00f2\u00f3\7?\2\2\u00f3<\3\2\2\2\u00f4\u00f5\7#\2\2\u00f5\u00f6"+
		"\7?\2\2\u00f6>\3\2\2\2\u00f7\u00f8\7,\2\2\u00f8@\3\2\2\2\u00f9\u00fa\7"+
		"-\2\2\u00faB\3\2\2\2\u00fb\u00fc\7\61\2\2\u00fcD\3\2\2\2\u00fd\u00fe\7"+
		"/\2\2\u00feF\3\2\2\2\u00ff\u0100\7~\2\2\u0100H\3\2\2\2\u0101\u0102\7*"+
		"\2\2\u0102J\3\2\2\2\u0103\u0104\7+\2\2\u0104L\3\2\2\2\u0105\u0107\7B\2"+
		"\2\u0106\u0108\tf\2\2\u0107\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0107"+
		"\3\2\2\2\u0109\u010a\3\2\2\2\u010aN\3\2\2\2\u010b\u010c\tg\2\2\u010c\u010d"+
		"\th\2\2\u010d\u010e\ti\2\2\u010e\u010f\tj\2\2\u010f\u0110\7/\2\2\u0110"+
		"\u0111\tk\2\2\u0111\u0112\tl\2\2\u0112\u0113\7/\2\2\u0113\u0114\tm\2\2"+
		"\u0114\u0115\tn\2\2\u0115P\3\2\2\2\u0116\u0117\to\2\2\u0117\u0118\tp\2"+
		"\2\u0118\u0119\7<\2\2\u0119\u011a\tq\2\2\u011a\u011b\tr\2\2\u011b\u011c"+
		"\7<\2\2\u011c\u011d\ts\2\2\u011d\u011e\tt\2\2\u011eR\3\2\2\2\u011f\u0120"+
		"\tu\2\2\u0120\u0121\tv\2\2\u0121\u0122\tw\2\2\u0122\u0123\tx\2\2\u0123"+
		"\u0124\ty\2\2\u0124T\3\2\2\2\u0125\u0127\7-\2\2\u0126\u0125\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u012a\tz\2\2\u0129\u0128\3\2"+
		"\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"V\3\2\2\2\u012d\u012f\7/\2\2\u012e\u0130\t{\2\2\u012f\u012e\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132X\3\2\2\2"+
		"\u0133\u0135\7-\2\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137"+
		"\3\2\2\2\u0136\u0138\t|\2\2\u0137\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013f\7\60"+
		"\2\2\u013c\u013e\t}\2\2\u013d\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f"+
		"\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140Z\3\2\2\2\u0141\u013f\3\2\2\2"+
		"\u0142\u0144\7/\2\2\u0143\u0145\t~\2\2\u0144\u0143\3\2\2\2\u0145\u0146"+
		"\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u014c\7\60\2\2\u0149\u014b\t\177\2\2\u014a\u0149\3\2\2\2\u014b\u014e"+
		"\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\\\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014f\u0155\7)\2\2\u0150\u0151\7^\2\2\u0151\u0154\7)\2"+
		"\2\u0152\u0154\13\2\2\2\u0153\u0150\3\2\2\2\u0153\u0152\3\2\2\2\u0154"+
		"\u0157\3\2\2\2\u0155\u0156\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0158\3\2"+
		"\2\2\u0157\u0155\3\2\2\2\u0158\u0159\7)\2\2\u0159^\3\2\2\2\u015a\u0160"+
		"\7$\2\2\u015b\u015c\7^\2\2\u015c\u015f\7$\2\2\u015d\u015f\13\2\2\2\u015e"+
		"\u015b\3\2\2\2\u015e\u015d\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u0161\3\2"+
		"\2\2\u0160\u015e\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163"+
		"\u0164\7$\2\2\u0164`\3\2\2\2\26\2h\u00b8\u00c1\u00c8\u00d0\u0107\u0109"+
		"\u0126\u012b\u0131\u0134\u0139\u013f\u0146\u014c\u0153\u0155\u015e\u0160";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}