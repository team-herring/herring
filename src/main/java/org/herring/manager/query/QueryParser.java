// Generated from Query.g4 by ANTLR 4.0

package org.herring.manager.query;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QueryParser extends Parser {
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
	public static final String[] tokenNames = {
		"<INVALID>", "'T'", "WS", "CALCULATE", "AVERAGE", "COUNT", "SUM", "MIN", 
		"MAX", "MEDIAN", "BY", "BETWEEN", "IN", "DAYS", "MINUTES", "HOURS", "MONTHS", 
		"ASK", "FILTER", "AND", "OR", "NOT", "'<'", "'<='", "'>'", "'>='", "'='", 
		"'!='", "'*'", "'+'", "'/'", "'-'", "'|'", "'('", "')'", "TABLE_IDENTIFIER", 
		"FIELD_IDENTIFIER", "DATE_LITERAL", "TIME_LITERAL", "ZONE_LITERAL", "POSITIVE_INTEGER", 
		"NEGATIVE_INTEGER", "POSITIVE_REAL", "NEGATIVE_REAL", "SMALL_QUOTED_STRING", 
		"LARGE_QUOTED_STRING"
	};
	public static final int
		RULE_singleComparisonExpression = 0, RULE_combinedComparisonExpression = 1, 
		RULE_timeExpression = 2, RULE_timeRangeExpression = 3, RULE_calcExpression = 4, 
		RULE_askQuerySyntax = 5, RULE_filterQuerySyntax = 6, RULE_calculateQuerySyntax = 7, 
		RULE_optionalQuerySyntax = 8, RULE_querySyntax = 9;
	public static final String[] ruleNames = {
		"singleComparisonExpression", "combinedComparisonExpression", "timeExpression", 
		"timeRangeExpression", "calcExpression", "askQuerySyntax", "filterQuerySyntax", 
		"calculateQuerySyntax", "optionalQuerySyntax", "querySyntax"
	};

	@Override
	public String getGrammarFileName() { return "Query.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public QueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SingleComparisonExpressionContext extends ParserRuleContext {
		public Token left;
		public Token operator;
		public Token right;
		public TerminalNode GREATER_THAN_OR_EQUAL() { return getToken(QueryParser.GREATER_THAN_OR_EQUAL, 0); }
		public TerminalNode LESS_THAN_OR_EQUAL() { return getToken(QueryParser.LESS_THAN_OR_EQUAL, 0); }
		public List<TerminalNode> NEGATIVE_REAL() { return getTokens(QueryParser.NEGATIVE_REAL); }
		public TerminalNode LARGE_QUOTED_STRING(int i) {
			return getToken(QueryParser.LARGE_QUOTED_STRING, i);
		}
		public TerminalNode POSITIVE_INTEGER(int i) {
			return getToken(QueryParser.POSITIVE_INTEGER, i);
		}
		public List<TerminalNode> LARGE_QUOTED_STRING() { return getTokens(QueryParser.LARGE_QUOTED_STRING); }
		public TerminalNode POSITIVE_REAL(int i) {
			return getToken(QueryParser.POSITIVE_REAL, i);
		}
		public TerminalNode IN() { return getToken(QueryParser.IN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(QueryParser.GREATER_THAN, 0); }
		public List<TerminalNode> FIELD_IDENTIFIER() { return getTokens(QueryParser.FIELD_IDENTIFIER); }
		public TerminalNode NOT_EQUAL() { return getToken(QueryParser.NOT_EQUAL, 0); }
		public List<TerminalNode> POSITIVE_REAL() { return getTokens(QueryParser.POSITIVE_REAL); }
		public TerminalNode EQUAL() { return getToken(QueryParser.EQUAL, 0); }
		public TerminalNode SMALL_QUOTED_STRING(int i) {
			return getToken(QueryParser.SMALL_QUOTED_STRING, i);
		}
		public TerminalNode LESS_THAN() { return getToken(QueryParser.LESS_THAN, 0); }
		public List<TerminalNode> SMALL_QUOTED_STRING() { return getTokens(QueryParser.SMALL_QUOTED_STRING); }
		public TerminalNode NEGATIVE_INTEGER(int i) {
			return getToken(QueryParser.NEGATIVE_INTEGER, i);
		}
		public List<TerminalNode> POSITIVE_INTEGER() { return getTokens(QueryParser.POSITIVE_INTEGER); }
		public TerminalNode NEGATIVE_REAL(int i) {
			return getToken(QueryParser.NEGATIVE_REAL, i);
		}
		public List<TerminalNode> DATE_LITERAL() { return getTokens(QueryParser.DATE_LITERAL); }
		public TerminalNode DATE_LITERAL(int i) {
			return getToken(QueryParser.DATE_LITERAL, i);
		}
		public List<TerminalNode> NEGATIVE_INTEGER() { return getTokens(QueryParser.NEGATIVE_INTEGER); }
		public TerminalNode FIELD_IDENTIFIER(int i) {
			return getToken(QueryParser.FIELD_IDENTIFIER, i);
		}
		public SingleComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleComparisonExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterSingleComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitSingleComparisonExpression(this);
		}
	}

	public final SingleComparisonExpressionContext singleComparisonExpression() throws RecognitionException {
		SingleComparisonExpressionContext _localctx = new SingleComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleComparisonExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			((SingleComparisonExpressionContext)_localctx).left = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FIELD_IDENTIFIER) | (1L << DATE_LITERAL) | (1L << POSITIVE_INTEGER) | (1L << NEGATIVE_INTEGER) | (1L << POSITIVE_REAL) | (1L << NEGATIVE_REAL) | (1L << SMALL_QUOTED_STRING) | (1L << LARGE_QUOTED_STRING))) != 0)) ) {
				((SingleComparisonExpressionContext)_localctx).left = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(21);
			((SingleComparisonExpressionContext)_localctx).operator = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << LESS_THAN) | (1L << LESS_THAN_OR_EQUAL) | (1L << GREATER_THAN) | (1L << GREATER_THAN_OR_EQUAL) | (1L << EQUAL) | (1L << NOT_EQUAL))) != 0)) ) {
				((SingleComparisonExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(22);
			((SingleComparisonExpressionContext)_localctx).right = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FIELD_IDENTIFIER) | (1L << DATE_LITERAL) | (1L << POSITIVE_INTEGER) | (1L << NEGATIVE_INTEGER) | (1L << POSITIVE_REAL) | (1L << NEGATIVE_REAL) | (1L << SMALL_QUOTED_STRING) | (1L << LARGE_QUOTED_STRING))) != 0)) ) {
				((SingleComparisonExpressionContext)_localctx).right = (Token)_errHandler.recoverInline(this);
			}
			consume();
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

	public static class CombinedComparisonExpressionContext extends ParserRuleContext {
		public int _p;
		public CombinedComparisonExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CombinedComparisonExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_combinedComparisonExpression; }
	 
		public CombinedComparisonExpressionContext() { }
		public void copyFrom(CombinedComparisonExpressionContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class ComparisonWrappedExpressionContext extends CombinedComparisonExpressionContext {
		public TerminalNode CLOSE_BRACE() { return getToken(QueryParser.CLOSE_BRACE, 0); }
		public CombinedComparisonExpressionContext combinedComparisonExpression() {
			return getRuleContext(CombinedComparisonExpressionContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(QueryParser.OPEN_BRACE, 0); }
		public ComparisonWrappedExpressionContext(CombinedComparisonExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterComparisonWrappedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitComparisonWrappedExpression(this);
		}
	}
	public static class ComparisonNotCombinedExpressionContext extends CombinedComparisonExpressionContext {
		public TerminalNode NOT() { return getToken(QueryParser.NOT, 0); }
		public CombinedComparisonExpressionContext combinedComparisonExpression() {
			return getRuleContext(CombinedComparisonExpressionContext.class,0);
		}
		public ComparisonNotCombinedExpressionContext(CombinedComparisonExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterComparisonNotCombinedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitComparisonNotCombinedExpression(this);
		}
	}
	public static class ComparisonOrCombinedExpressionContext extends CombinedComparisonExpressionContext {
		public CombinedComparisonExpressionContext combinedComparisonExpression(int i) {
			return getRuleContext(CombinedComparisonExpressionContext.class,i);
		}
		public List<CombinedComparisonExpressionContext> combinedComparisonExpression() {
			return getRuleContexts(CombinedComparisonExpressionContext.class);
		}
		public TerminalNode OR() { return getToken(QueryParser.OR, 0); }
		public ComparisonOrCombinedExpressionContext(CombinedComparisonExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterComparisonOrCombinedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitComparisonOrCombinedExpression(this);
		}
	}
	public static class ComparisonSingleExpressionContext extends CombinedComparisonExpressionContext {
		public SingleComparisonExpressionContext singleComparisonExpression() {
			return getRuleContext(SingleComparisonExpressionContext.class,0);
		}
		public ComparisonSingleExpressionContext(CombinedComparisonExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterComparisonSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitComparisonSingleExpression(this);
		}
	}
	public static class ComparisonAndCombinedExpressionContext extends CombinedComparisonExpressionContext {
		public CombinedComparisonExpressionContext combinedComparisonExpression(int i) {
			return getRuleContext(CombinedComparisonExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(QueryParser.AND, 0); }
		public List<CombinedComparisonExpressionContext> combinedComparisonExpression() {
			return getRuleContexts(CombinedComparisonExpressionContext.class);
		}
		public ComparisonAndCombinedExpressionContext(CombinedComparisonExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterComparisonAndCombinedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitComparisonAndCombinedExpression(this);
		}
	}

	public final CombinedComparisonExpressionContext combinedComparisonExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CombinedComparisonExpressionContext _localctx = new CombinedComparisonExpressionContext(_ctx, _parentState, _p);
		CombinedComparisonExpressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, RULE_combinedComparisonExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			switch (_input.LA(1)) {
			case NOT:
				{
				_localctx = new ComparisonNotCombinedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(25); match(NOT);
				setState(26); combinedComparisonExpression(2);
				}
				break;
			case OPEN_BRACE:
				{
				_localctx = new ComparisonWrappedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(27); match(OPEN_BRACE);
				setState(28); combinedComparisonExpression(0);
				setState(29); match(CLOSE_BRACE);
				}
				break;
			case FIELD_IDENTIFIER:
			case DATE_LITERAL:
			case POSITIVE_INTEGER:
			case NEGATIVE_INTEGER:
			case POSITIVE_REAL:
			case NEGATIVE_REAL:
			case SMALL_QUOTED_STRING:
			case LARGE_QUOTED_STRING:
				{
				_localctx = new ComparisonSingleExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(31); singleComparisonExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(40);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ComparisonAndCombinedExpressionContext(new CombinedComparisonExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_combinedComparisonExpression);
						setState(34);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(35); match(AND);
						setState(36); combinedComparisonExpression(5);
						}
						break;

					case 2:
						{
						_localctx = new ComparisonOrCombinedExpressionContext(new CombinedComparisonExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_combinedComparisonExpression);
						setState(37);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(38); match(OR);
						setState(39); combinedComparisonExpression(4);
						}
						break;
					}
					} 
				}
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TimeExpressionContext extends ParserRuleContext {
		public Token date;
		public Token time;
		public Token zone;
		public TerminalNode TIME_LITERAL() { return getToken(QueryParser.TIME_LITERAL, 0); }
		public TerminalNode ZONE_LITERAL() { return getToken(QueryParser.ZONE_LITERAL, 0); }
		public TerminalNode DATE_LITERAL() { return getToken(QueryParser.DATE_LITERAL, 0); }
		public TimeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterTimeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitTimeExpression(this);
		}
	}

	public final TimeExpressionContext timeExpression() throws RecognitionException {
		TimeExpressionContext _localctx = new TimeExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_timeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); ((TimeExpressionContext)_localctx).date = match(DATE_LITERAL);
			setState(49);
			_la = _input.LA(1);
			if (_la==1) {
				{
				setState(46); match(1);
				setState(47); ((TimeExpressionContext)_localctx).time = match(TIME_LITERAL);
				setState(48); ((TimeExpressionContext)_localctx).zone = match(ZONE_LITERAL);
				}
			}

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

	public static class TimeRangeExpressionContext extends ParserRuleContext {
		public TimeRangeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeRangeExpression; }
	 
		public TimeRangeExpressionContext() { }
		public void copyFrom(TimeRangeExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelativeTimeRangeExpressionContext extends TimeRangeExpressionContext {
		public Token timeValue;
		public Token timeUnit;
		public TerminalNode MINUTES() { return getToken(QueryParser.MINUTES, 0); }
		public TerminalNode DAYS() { return getToken(QueryParser.DAYS, 0); }
		public TerminalNode POSITIVE_INTEGER() { return getToken(QueryParser.POSITIVE_INTEGER, 0); }
		public TerminalNode IN() { return getToken(QueryParser.IN, 0); }
		public TerminalNode MONTHS() { return getToken(QueryParser.MONTHS, 0); }
		public TerminalNode HOURS() { return getToken(QueryParser.HOURS, 0); }
		public RelativeTimeRangeExpressionContext(TimeRangeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterRelativeTimeRangeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitRelativeTimeRangeExpression(this);
		}
	}
	public static class AbsoluteTimeRangeExpressionContext extends TimeRangeExpressionContext {
		public TimeExpressionContext from;
		public TimeExpressionContext to;
		public TimeExpressionContext timeExpression(int i) {
			return getRuleContext(TimeExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(QueryParser.AND, 0); }
		public TerminalNode BETWEEN() { return getToken(QueryParser.BETWEEN, 0); }
		public List<TimeExpressionContext> timeExpression() {
			return getRuleContexts(TimeExpressionContext.class);
		}
		public AbsoluteTimeRangeExpressionContext(TimeRangeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterAbsoluteTimeRangeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitAbsoluteTimeRangeExpression(this);
		}
	}

	public final TimeRangeExpressionContext timeRangeExpression() throws RecognitionException {
		TimeRangeExpressionContext _localctx = new TimeRangeExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_timeRangeExpression);
		int _la;
		try {
			setState(59);
			switch (_input.LA(1)) {
			case BETWEEN:
				_localctx = new AbsoluteTimeRangeExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(51); match(BETWEEN);
				setState(52); ((AbsoluteTimeRangeExpressionContext)_localctx).from = timeExpression();
				setState(53); match(AND);
				setState(54); ((AbsoluteTimeRangeExpressionContext)_localctx).to = timeExpression();
				}
				break;
			case IN:
				_localctx = new RelativeTimeRangeExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(56); match(IN);
				setState(57); ((RelativeTimeRangeExpressionContext)_localctx).timeValue = match(POSITIVE_INTEGER);
				setState(58);
				((RelativeTimeRangeExpressionContext)_localctx).timeUnit = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DAYS) | (1L << MINUTES) | (1L << HOURS) | (1L << MONTHS))) != 0)) ) {
					((RelativeTimeRangeExpressionContext)_localctx).timeUnit = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class CalcExpressionContext extends ParserRuleContext {
		public CalcExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcExpression; }
	 
		public CalcExpressionContext() { }
		public void copyFrom(CalcExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CalcAggregateFunctionContext extends CalcExpressionContext {
		public Token function;
		public Token funcVar;
		public TerminalNode MAX() { return getToken(QueryParser.MAX, 0); }
		public TerminalNode COUNT() { return getToken(QueryParser.COUNT, 0); }
		public TerminalNode MIN() { return getToken(QueryParser.MIN, 0); }
		public TerminalNode FIELD_IDENTIFIER() { return getToken(QueryParser.FIELD_IDENTIFIER, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(QueryParser.CLOSE_BRACE, 0); }
		public TerminalNode SUM() { return getToken(QueryParser.SUM, 0); }
		public TerminalNode MEDIAN() { return getToken(QueryParser.MEDIAN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(QueryParser.OPEN_BRACE, 0); }
		public TerminalNode AVERAGE() { return getToken(QueryParser.AVERAGE, 0); }
		public CalcAggregateFunctionContext(CalcExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterCalcAggregateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitCalcAggregateFunction(this);
		}
	}

	public final CalcExpressionContext calcExpression() throws RecognitionException {
		CalcExpressionContext _localctx = new CalcExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_calcExpression);
		int _la;
		try {
			_localctx = new CalcAggregateFunctionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			((CalcAggregateFunctionContext)_localctx).function = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AVERAGE) | (1L << COUNT) | (1L << SUM) | (1L << MIN) | (1L << MAX) | (1L << MEDIAN))) != 0)) ) {
				((CalcAggregateFunctionContext)_localctx).function = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(62); match(OPEN_BRACE);
			setState(63); ((CalcAggregateFunctionContext)_localctx).funcVar = match(FIELD_IDENTIFIER);
			setState(64); match(CLOSE_BRACE);
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

	public static class AskQuerySyntaxContext extends ParserRuleContext {
		public Token table;
		public TimeRangeExpressionContext timeRangeExpression() {
			return getRuleContext(TimeRangeExpressionContext.class,0);
		}
		public TerminalNode TABLE_IDENTIFIER() { return getToken(QueryParser.TABLE_IDENTIFIER, 0); }
		public TerminalNode ASK() { return getToken(QueryParser.ASK, 0); }
		public AskQuerySyntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_askQuerySyntax; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterAskQuerySyntax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitAskQuerySyntax(this);
		}
	}

	public final AskQuerySyntaxContext askQuerySyntax() throws RecognitionException {
		AskQuerySyntaxContext _localctx = new AskQuerySyntaxContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_askQuerySyntax);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); match(ASK);
			setState(67); ((AskQuerySyntaxContext)_localctx).table = match(TABLE_IDENTIFIER);
			setState(68); timeRangeExpression();
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

	public static class FilterQuerySyntaxContext extends ParserRuleContext {
		public CombinedComparisonExpressionContext combinedComparisonExpression() {
			return getRuleContext(CombinedComparisonExpressionContext.class,0);
		}
		public TerminalNode FILTER() { return getToken(QueryParser.FILTER, 0); }
		public FilterQuerySyntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterQuerySyntax; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterFilterQuerySyntax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitFilterQuerySyntax(this);
		}
	}

	public final FilterQuerySyntaxContext filterQuerySyntax() throws RecognitionException {
		FilterQuerySyntaxContext _localctx = new FilterQuerySyntaxContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_filterQuerySyntax);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); match(FILTER);
			setState(71); combinedComparisonExpression(0);
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

	public static class CalculateQuerySyntaxContext extends ParserRuleContext {
		public Token resultVar;
		public Token groupVar;
		public TerminalNode BY() { return getToken(QueryParser.BY, 0); }
		public List<TerminalNode> FIELD_IDENTIFIER() { return getTokens(QueryParser.FIELD_IDENTIFIER); }
		public TerminalNode CALCULATE() { return getToken(QueryParser.CALCULATE, 0); }
		public TerminalNode FIELD_IDENTIFIER(int i) {
			return getToken(QueryParser.FIELD_IDENTIFIER, i);
		}
		public CalcExpressionContext calcExpression() {
			return getRuleContext(CalcExpressionContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(QueryParser.EQUAL, 0); }
		public CalculateQuerySyntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calculateQuerySyntax; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterCalculateQuerySyntax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitCalculateQuerySyntax(this);
		}
	}

	public final CalculateQuerySyntaxContext calculateQuerySyntax() throws RecognitionException {
		CalculateQuerySyntaxContext _localctx = new CalculateQuerySyntaxContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_calculateQuerySyntax);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); match(CALCULATE);
			setState(74); ((CalculateQuerySyntaxContext)_localctx).resultVar = match(FIELD_IDENTIFIER);
			setState(75); match(EQUAL);
			setState(76); calcExpression();
			setState(79);
			_la = _input.LA(1);
			if (_la==BY) {
				{
				setState(77); match(BY);
				setState(78); ((CalculateQuerySyntaxContext)_localctx).groupVar = match(FIELD_IDENTIFIER);
				}
			}

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

	public static class OptionalQuerySyntaxContext extends ParserRuleContext {
		public TerminalNode PIPE() { return getToken(QueryParser.PIPE, 0); }
		public CalculateQuerySyntaxContext calculateQuerySyntax() {
			return getRuleContext(CalculateQuerySyntaxContext.class,0);
		}
		public FilterQuerySyntaxContext filterQuerySyntax() {
			return getRuleContext(FilterQuerySyntaxContext.class,0);
		}
		public OptionalQuerySyntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalQuerySyntax; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterOptionalQuerySyntax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitOptionalQuerySyntax(this);
		}
	}

	public final OptionalQuerySyntaxContext optionalQuerySyntax() throws RecognitionException {
		OptionalQuerySyntaxContext _localctx = new OptionalQuerySyntaxContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_optionalQuerySyntax);
		try {
			setState(85);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81); match(PIPE);
				setState(82); filterQuerySyntax();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83); match(PIPE);
				setState(84); calculateQuerySyntax();
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

	public static class QuerySyntaxContext extends ParserRuleContext {
		public AskQuerySyntaxContext askQuerySyntax() {
			return getRuleContext(AskQuerySyntaxContext.class,0);
		}
		public List<OptionalQuerySyntaxContext> optionalQuerySyntax() {
			return getRuleContexts(OptionalQuerySyntaxContext.class);
		}
		public OptionalQuerySyntaxContext optionalQuerySyntax(int i) {
			return getRuleContext(OptionalQuerySyntaxContext.class,i);
		}
		public QuerySyntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySyntax; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterQuerySyntax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitQuerySyntax(this);
		}
	}

	public final QuerySyntaxContext querySyntax() throws RecognitionException {
		QuerySyntaxContext _localctx = new QuerySyntaxContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_querySyntax);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); askQuerySyntax();
			setState(89); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(88); optionalQuerySyntax();
				}
				}
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PIPE );
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1: return combinedComparisonExpression_sempred((CombinedComparisonExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean combinedComparisonExpression_sempred(CombinedComparisonExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 4 >= _localctx._p;

		case 1: return 3 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\3/`\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"#\n\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3+\n\3\f\3\16\3.\13\3\3\4\3\4\3\4\3\4"+
		"\5\4\64\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5>\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tR\n\t\3\n\3"+
		"\n\3\n\3\n\5\nX\n\n\3\13\3\13\6\13\\\n\13\r\13\16\13]\3\13\2\f\2\4\6\b"+
		"\n\f\16\20\22\24\2\7\4&\'*/\4\16\16\30\35\4&\'*/\3\17\22\3\6\13^\2\26"+
		"\3\2\2\2\4\"\3\2\2\2\6/\3\2\2\2\b=\3\2\2\2\n?\3\2\2\2\fD\3\2\2\2\16H\3"+
		"\2\2\2\20K\3\2\2\2\22W\3\2\2\2\24Y\3\2\2\2\26\27\t\2\2\2\27\30\t\3\2\2"+
		"\30\31\t\4\2\2\31\3\3\2\2\2\32\33\b\3\1\2\33\34\7\27\2\2\34#\5\4\3\2\35"+
		"\36\7#\2\2\36\37\5\4\3\2\37 \7$\2\2 #\3\2\2\2!#\5\2\2\2\"\32\3\2\2\2\""+
		"\35\3\2\2\2\"!\3\2\2\2#,\3\2\2\2$%\6\3\2\3%&\7\25\2\2&+\5\4\3\2\'(\6\3"+
		"\3\3()\7\26\2\2)+\5\4\3\2*$\3\2\2\2*\'\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3"+
		"\2\2\2-\5\3\2\2\2.,\3\2\2\2/\63\7\'\2\2\60\61\7\3\2\2\61\62\7(\2\2\62"+
		"\64\7)\2\2\63\60\3\2\2\2\63\64\3\2\2\2\64\7\3\2\2\2\65\66\7\r\2\2\66\67"+
		"\5\6\4\2\678\7\25\2\289\5\6\4\29>\3\2\2\2:;\7\16\2\2;<\7*\2\2<>\t\5\2"+
		"\2=\65\3\2\2\2=:\3\2\2\2>\t\3\2\2\2?@\t\6\2\2@A\7#\2\2AB\7&\2\2BC\7$\2"+
		"\2C\13\3\2\2\2DE\7\23\2\2EF\7%\2\2FG\5\b\5\2G\r\3\2\2\2HI\7\24\2\2IJ\5"+
		"\4\3\2J\17\3\2\2\2KL\7\5\2\2LM\7&\2\2MN\7\34\2\2NQ\5\n\6\2OP\7\f\2\2P"+
		"R\7&\2\2QO\3\2\2\2QR\3\2\2\2R\21\3\2\2\2ST\7\"\2\2TX\5\16\b\2UV\7\"\2"+
		"\2VX\5\20\t\2WS\3\2\2\2WU\3\2\2\2X\23\3\2\2\2Y[\5\f\7\2Z\\\5\22\n\2[Z"+
		"\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^\25\3\2\2\2\n\"*,\63=QW]";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}