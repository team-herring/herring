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
		T__1=1, T__0=2, WS=3, AGGREGATE=4, CALCULATE=5, AVERAGE=6, COUNT=7, SUM=8, 
		MIN=9, MAX=10, MEDIAN=11, BY=12, TIME=13, BETWEEN=14, IN=15, DAYS=16, 
		MINUTES=17, HOURS=18, MONTHS=19, ASK=20, FILTER=21, AND=22, OR=23, NOT=24, 
		LESS_THAN=25, LESS_THAN_OR_EQUAL=26, GREATER_THAN=27, GREATER_THAN_OR_EQUAL=28, 
		EQUAL=29, NOT_EQUAL=30, MULTIPLY=31, ADD=32, DIVIDE=33, SUBTRACT=34, PIPE=35, 
		OPEN_BRACE=36, CLOSE_BRACE=37, FIELD_IDENTIFIER=38, DATE_LITERAL=39, TIME_LITERAL=40, 
		ZONE_LITERAL=41, POSITIVE_INTEGER=42, NEGATIVE_INTEGER=43, POSITIVE_REAL=44, 
		NEGATIVE_REAL=45, SMALL_QUOTED_STRING=46, LARGE_QUOTED_STRING=47;
	public static final String[] tokenNames = {
		"<INVALID>", "'T'", "'Z'", "WS", "AGGREGATE", "CALCULATE", "AVERAGE", 
		"COUNT", "SUM", "MIN", "MAX", "MEDIAN", "BY", "TIME", "BETWEEN", "IN", 
		"DAYS", "MINUTES", "HOURS", "MONTHS", "ASK", "FILTER", "AND", "OR", "NOT", 
		"'<'", "'<='", "'>'", "'>='", "'='", "'!='", "'*'", "'+'", "'/'", "'-'", 
		"'|'", "'('", "')'", "FIELD_IDENTIFIER", "DATE_LITERAL", "TIME_LITERAL", 
		"ZONE_LITERAL", "POSITIVE_INTEGER", "NEGATIVE_INTEGER", "POSITIVE_REAL", 
		"NEGATIVE_REAL", "SMALL_QUOTED_STRING", "LARGE_QUOTED_STRING"
	};
	public static final int
		RULE_singleComparisonExpression = 0, RULE_combinedComparisonExpression = 1, 
		RULE_timeExpression = 2, RULE_timeRangeExpression = 3, RULE_aggregateExpression = 4, 
		RULE_askQuerySyntax = 5, RULE_filterQuerySyntax = 6, RULE_aggregateByFieldQuerySyntax = 7, 
		RULE_aggregateByTimeQuerySyntax = 8, RULE_optionalQuerySyntax = 9, RULE_querySyntax = 10;
	public static final String[] ruleNames = {
		"singleComparisonExpression", "combinedComparisonExpression", "timeExpression", 
		"timeRangeExpression", "aggregateExpression", "askQuerySyntax", "filterQuerySyntax", 
		"aggregateByFieldQuerySyntax", "aggregateByTimeQuerySyntax", "optionalQuerySyntax", 
		"querySyntax"
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
			setState(22);
			((SingleComparisonExpressionContext)_localctx).left = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FIELD_IDENTIFIER) | (1L << DATE_LITERAL) | (1L << POSITIVE_INTEGER) | (1L << NEGATIVE_INTEGER) | (1L << POSITIVE_REAL) | (1L << NEGATIVE_REAL) | (1L << SMALL_QUOTED_STRING) | (1L << LARGE_QUOTED_STRING))) != 0)) ) {
				((SingleComparisonExpressionContext)_localctx).left = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(23);
			((SingleComparisonExpressionContext)_localctx).operator = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << LESS_THAN) | (1L << LESS_THAN_OR_EQUAL) | (1L << GREATER_THAN) | (1L << GREATER_THAN_OR_EQUAL) | (1L << EQUAL) | (1L << NOT_EQUAL))) != 0)) ) {
				((SingleComparisonExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(24);
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
			setState(34);
			switch (_input.LA(1)) {
			case NOT:
				{
				_localctx = new ComparisonNotCombinedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(27); match(NOT);
				setState(28); combinedComparisonExpression(2);
				}
				break;
			case OPEN_BRACE:
				{
				_localctx = new ComparisonWrappedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(29); match(OPEN_BRACE);
				setState(30); combinedComparisonExpression(0);
				setState(31); match(CLOSE_BRACE);
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
				setState(33); singleComparisonExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(44);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(42);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ComparisonAndCombinedExpressionContext(new CombinedComparisonExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_combinedComparisonExpression);
						setState(36);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(37); match(AND);
						setState(38); combinedComparisonExpression(5);
						}
						break;

					case 2:
						{
						_localctx = new ComparisonOrCombinedExpressionContext(new CombinedComparisonExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_combinedComparisonExpression);
						setState(39);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(40); match(OR);
						setState(41); combinedComparisonExpression(4);
						}
						break;
					}
					} 
				}
				setState(46);
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
			setState(47); ((TimeExpressionContext)_localctx).date = match(DATE_LITERAL);
			setState(50);
			_la = _input.LA(1);
			if (_la==1) {
				{
				setState(48); match(1);
				setState(49); ((TimeExpressionContext)_localctx).time = match(TIME_LITERAL);
				}
			}

			setState(54);
			_la = _input.LA(1);
			if (_la==2) {
				{
				setState(52); match(2);
				setState(53); ((TimeExpressionContext)_localctx).zone = match(ZONE_LITERAL);
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
			setState(64);
			switch (_input.LA(1)) {
			case BETWEEN:
				_localctx = new AbsoluteTimeRangeExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(56); match(BETWEEN);
				setState(57); ((AbsoluteTimeRangeExpressionContext)_localctx).from = timeExpression();
				setState(58); match(AND);
				setState(59); ((AbsoluteTimeRangeExpressionContext)_localctx).to = timeExpression();
				}
				break;
			case IN:
				_localctx = new RelativeTimeRangeExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(61); match(IN);
				setState(62); ((RelativeTimeRangeExpressionContext)_localctx).timeValue = match(POSITIVE_INTEGER);
				setState(63);
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

	public static class AggregateExpressionContext extends ParserRuleContext {
		public AggregateExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateExpression; }
	 
		public AggregateExpressionContext() { }
		public void copyFrom(AggregateExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CalcAggregateFunctionContext extends AggregateExpressionContext {
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
		public CalcAggregateFunctionContext(AggregateExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterCalcAggregateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitCalcAggregateFunction(this);
		}
	}

	public final AggregateExpressionContext aggregateExpression() throws RecognitionException {
		AggregateExpressionContext _localctx = new AggregateExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_aggregateExpression);
		int _la;
		try {
			_localctx = new CalcAggregateFunctionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			((CalcAggregateFunctionContext)_localctx).function = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AVERAGE) | (1L << COUNT) | (1L << SUM) | (1L << MIN) | (1L << MAX) | (1L << MEDIAN))) != 0)) ) {
				((CalcAggregateFunctionContext)_localctx).function = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(67); match(OPEN_BRACE);
			setState(68); ((CalcAggregateFunctionContext)_localctx).funcVar = match(FIELD_IDENTIFIER);
			setState(69); match(CLOSE_BRACE);
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
		public TerminalNode FIELD_IDENTIFIER() { return getToken(QueryParser.FIELD_IDENTIFIER, 0); }
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
			setState(71); match(ASK);
			setState(72); ((AskQuerySyntaxContext)_localctx).table = match(FIELD_IDENTIFIER);
			setState(73); timeRangeExpression();
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
			setState(75); match(FILTER);
			setState(76); combinedComparisonExpression(0);
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

	public static class AggregateByFieldQuerySyntaxContext extends ParserRuleContext {
		public Token resultVar;
		public Token groupVar;
		public AggregateExpressionContext aggregateExpression() {
			return getRuleContext(AggregateExpressionContext.class,0);
		}
		public TerminalNode BY() { return getToken(QueryParser.BY, 0); }
		public List<TerminalNode> FIELD_IDENTIFIER() { return getTokens(QueryParser.FIELD_IDENTIFIER); }
		public TerminalNode CALCULATE() { return getToken(QueryParser.CALCULATE, 0); }
		public TerminalNode FIELD_IDENTIFIER(int i) {
			return getToken(QueryParser.FIELD_IDENTIFIER, i);
		}
		public TerminalNode EQUAL() { return getToken(QueryParser.EQUAL, 0); }
		public AggregateByFieldQuerySyntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateByFieldQuerySyntax; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterAggregateByFieldQuerySyntax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitAggregateByFieldQuerySyntax(this);
		}
	}

	public final AggregateByFieldQuerySyntaxContext aggregateByFieldQuerySyntax() throws RecognitionException {
		AggregateByFieldQuerySyntaxContext _localctx = new AggregateByFieldQuerySyntaxContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_aggregateByFieldQuerySyntax);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); match(CALCULATE);
			setState(79); ((AggregateByFieldQuerySyntaxContext)_localctx).resultVar = match(FIELD_IDENTIFIER);
			setState(80); match(EQUAL);
			setState(81); aggregateExpression();
			setState(84);
			_la = _input.LA(1);
			if (_la==BY) {
				{
				setState(82); match(BY);
				setState(83); ((AggregateByFieldQuerySyntaxContext)_localctx).groupVar = match(FIELD_IDENTIFIER);
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

	public static class AggregateByTimeQuerySyntaxContext extends ParserRuleContext {
		public Token resultVar;
		public Token timeValue;
		public Token timeUnit;
		public TerminalNode MINUTES() { return getToken(QueryParser.MINUTES, 0); }
		public TerminalNode DAYS() { return getToken(QueryParser.DAYS, 0); }
		public TerminalNode TIME() { return getToken(QueryParser.TIME, 0); }
		public AggregateExpressionContext aggregateExpression() {
			return getRuleContext(AggregateExpressionContext.class,0);
		}
		public TerminalNode POSITIVE_INTEGER() { return getToken(QueryParser.POSITIVE_INTEGER, 0); }
		public TerminalNode BY() { return getToken(QueryParser.BY, 0); }
		public TerminalNode FIELD_IDENTIFIER() { return getToken(QueryParser.FIELD_IDENTIFIER, 0); }
		public TerminalNode MONTHS() { return getToken(QueryParser.MONTHS, 0); }
		public TerminalNode AGGREGATE() { return getToken(QueryParser.AGGREGATE, 0); }
		public TerminalNode HOURS() { return getToken(QueryParser.HOURS, 0); }
		public TerminalNode EQUAL() { return getToken(QueryParser.EQUAL, 0); }
		public AggregateByTimeQuerySyntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateByTimeQuerySyntax; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterAggregateByTimeQuerySyntax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitAggregateByTimeQuerySyntax(this);
		}
	}

	public final AggregateByTimeQuerySyntaxContext aggregateByTimeQuerySyntax() throws RecognitionException {
		AggregateByTimeQuerySyntaxContext _localctx = new AggregateByTimeQuerySyntaxContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_aggregateByTimeQuerySyntax);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(AGGREGATE);
			setState(87); ((AggregateByTimeQuerySyntaxContext)_localctx).resultVar = match(FIELD_IDENTIFIER);
			setState(88); match(EQUAL);
			setState(89); aggregateExpression();
			setState(90); match(BY);
			setState(91); match(TIME);
			setState(92); ((AggregateByTimeQuerySyntaxContext)_localctx).timeValue = match(POSITIVE_INTEGER);
			setState(93);
			((AggregateByTimeQuerySyntaxContext)_localctx).timeUnit = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DAYS) | (1L << MINUTES) | (1L << HOURS) | (1L << MONTHS))) != 0)) ) {
				((AggregateByTimeQuerySyntaxContext)_localctx).timeUnit = (Token)_errHandler.recoverInline(this);
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

	public static class OptionalQuerySyntaxContext extends ParserRuleContext {
		public AggregateByTimeQuerySyntaxContext aggregateByTimeQuerySyntax() {
			return getRuleContext(AggregateByTimeQuerySyntaxContext.class,0);
		}
		public TerminalNode PIPE() { return getToken(QueryParser.PIPE, 0); }
		public AggregateByFieldQuerySyntaxContext aggregateByFieldQuerySyntax() {
			return getRuleContext(AggregateByFieldQuerySyntaxContext.class,0);
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
		enterRule(_localctx, 18, RULE_optionalQuerySyntax);
		try {
			setState(101);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95); match(PIPE);
				setState(96); filterQuerySyntax();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97); match(PIPE);
				setState(98); aggregateByFieldQuerySyntax();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(99); match(PIPE);
				setState(100); aggregateByTimeQuerySyntax();
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
		enterRule(_localctx, 20, RULE_querySyntax);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); askQuerySyntax();
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(104); optionalQuerySyntax();
				}
				}
				setState(107); 
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
		"\2\3\61p\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t"+
		"\t\4\n\t\n\4\13\t\13\4\f\t\f\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3%\n\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3-\n\3\f\3\16\3\60\13\3\3\4"+
		"\3\4\3\4\5\4\65\n\4\3\4\3\4\5\49\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5C\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\tW\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13h\n\13\3\f\3\f\6\fl\n\f\r\f\16\fm\3\f\2\r\2\4\6\b"+
		"\n\f\16\20\22\24\26\2\b\4(),\61\4\21\21\33 \4(),\61\3\22\25\3\b\r\3\22"+
		"\25o\2\30\3\2\2\2\4$\3\2\2\2\6\61\3\2\2\2\bB\3\2\2\2\nD\3\2\2\2\fI\3\2"+
		"\2\2\16M\3\2\2\2\20P\3\2\2\2\22X\3\2\2\2\24g\3\2\2\2\26i\3\2\2\2\30\31"+
		"\t\2\2\2\31\32\t\3\2\2\32\33\t\4\2\2\33\3\3\2\2\2\34\35\b\3\1\2\35\36"+
		"\7\32\2\2\36%\5\4\3\2\37 \7&\2\2 !\5\4\3\2!\"\7\'\2\2\"%\3\2\2\2#%\5\2"+
		"\2\2$\34\3\2\2\2$\37\3\2\2\2$#\3\2\2\2%.\3\2\2\2&\'\6\3\2\3\'(\7\30\2"+
		"\2(-\5\4\3\2)*\6\3\3\3*+\7\31\2\2+-\5\4\3\2,&\3\2\2\2,)\3\2\2\2-\60\3"+
		"\2\2\2.,\3\2\2\2./\3\2\2\2/\5\3\2\2\2\60.\3\2\2\2\61\64\7)\2\2\62\63\7"+
		"\3\2\2\63\65\7*\2\2\64\62\3\2\2\2\64\65\3\2\2\2\658\3\2\2\2\66\67\7\4"+
		"\2\2\679\7+\2\28\66\3\2\2\289\3\2\2\29\7\3\2\2\2:;\7\20\2\2;<\5\6\4\2"+
		"<=\7\30\2\2=>\5\6\4\2>C\3\2\2\2?@\7\21\2\2@A\7,\2\2AC\t\5\2\2B:\3\2\2"+
		"\2B?\3\2\2\2C\t\3\2\2\2DE\t\6\2\2EF\7&\2\2FG\7(\2\2GH\7\'\2\2H\13\3\2"+
		"\2\2IJ\7\26\2\2JK\7(\2\2KL\5\b\5\2L\r\3\2\2\2MN\7\27\2\2NO\5\4\3\2O\17"+
		"\3\2\2\2PQ\7\7\2\2QR\7(\2\2RS\7\37\2\2SV\5\n\6\2TU\7\16\2\2UW\7(\2\2V"+
		"T\3\2\2\2VW\3\2\2\2W\21\3\2\2\2XY\7\6\2\2YZ\7(\2\2Z[\7\37\2\2[\\\5\n\6"+
		"\2\\]\7\16\2\2]^\7\17\2\2^_\7,\2\2_`\t\7\2\2`\23\3\2\2\2ab\7%\2\2bh\5"+
		"\16\b\2cd\7%\2\2dh\5\20\t\2ef\7%\2\2fh\5\22\n\2ga\3\2\2\2gc\3\2\2\2ge"+
		"\3\2\2\2h\25\3\2\2\2ik\5\f\7\2jl\5\24\13\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2"+
		"\2mn\3\2\2\2n\27\3\2\2\2\13$,.\648BVgm";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}