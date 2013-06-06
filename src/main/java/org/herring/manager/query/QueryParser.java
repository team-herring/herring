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
		MINUTES=17, HOURS=18, MONTHS=19, ASK=20, FILTER=21, AND=22, OR=23, NOT_IN=24, 
		NOT=25, LESS_THAN=26, LESS_THAN_OR_EQUAL=27, GREATER_THAN=28, GREATER_THAN_OR_EQUAL=29, 
		EQUAL=30, NOT_EQUAL=31, MULTIPLY=32, ADD=33, DIVIDE=34, SUBTRACT=35, PIPE=36, 
		OPEN_BRACE=37, CLOSE_BRACE=38, FIELD_IDENTIFIER=39, DATE_LITERAL=40, TIME_LITERAL=41, 
		ZONE_LITERAL=42, POSITIVE_INTEGER=43, NEGATIVE_INTEGER=44, POSITIVE_REAL=45, 
		NEGATIVE_REAL=46, SMALL_QUOTED_STRING=47, LARGE_QUOTED_STRING=48;
	public static final String[] tokenNames = {
		"<INVALID>", "'T'", "'Z'", "WS", "AGGREGATE", "CALCULATE", "AVERAGE", 
		"COUNT", "SUM", "MIN", "MAX", "MEDIAN", "BY", "TIME", "BETWEEN", "IN", 
		"DAYS", "MINUTES", "HOURS", "MONTHS", "ASK", "FILTER", "AND", "OR", "NOT_IN", 
		"NOT", "'<'", "'<='", "'>'", "'>='", "'='", "'!='", "'*'", "'+'", "'/'", 
		"'-'", "'|'", "'('", "')'", "FIELD_IDENTIFIER", "DATE_LITERAL", "TIME_LITERAL", 
		"ZONE_LITERAL", "POSITIVE_INTEGER", "NEGATIVE_INTEGER", "POSITIVE_REAL", 
		"NEGATIVE_REAL", "SMALL_QUOTED_STRING", "LARGE_QUOTED_STRING"
	};
	public static final int
		RULE_timeComparisonExpression = 0, RULE_numberComparisonExpression = 1, 
		RULE_stringComparisonExpression = 2, RULE_singleComparisonExpression = 3, 
		RULE_combinedComparisonExpression = 4, RULE_timeExpression = 5, RULE_timeRangeExpression = 6, 
		RULE_aggregateExpression = 7, RULE_askQuerySyntax = 8, RULE_filterQuerySyntax = 9, 
		RULE_aggregateByFieldQuerySyntax = 10, RULE_aggregateByTimeQuerySyntax = 11, 
		RULE_optionalQuerySyntax = 12, RULE_querySyntax = 13;
	public static final String[] ruleNames = {
		"timeComparisonExpression", "numberComparisonExpression", "stringComparisonExpression", 
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
	public static class TimeComparisonExpressionContext extends ParserRuleContext {
		public Token leftVar;
		public TimeExpressionContext leftValue;
		public Token operator;
		public Token rightVar;
		public TimeExpressionContext rightValue;
		public TerminalNode GREATER_THAN_OR_EQUAL() { return getToken(QueryParser.GREATER_THAN_OR_EQUAL, 0); }
		public TerminalNode LESS_THAN_OR_EQUAL() { return getToken(QueryParser.LESS_THAN_OR_EQUAL, 0); }
		public TimeExpressionContext timeExpression(int i) {
			return getRuleContext(TimeExpressionContext.class,i);
		}
		public List<TerminalNode> FIELD_IDENTIFIER() { return getTokens(QueryParser.FIELD_IDENTIFIER); }
		public TerminalNode GREATER_THAN() { return getToken(QueryParser.GREATER_THAN, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(QueryParser.NOT_EQUAL, 0); }
		public List<TimeExpressionContext> timeExpression() {
			return getRuleContexts(TimeExpressionContext.class);
		}
		public TerminalNode FIELD_IDENTIFIER(int i) {
			return getToken(QueryParser.FIELD_IDENTIFIER, i);
		}
		public TerminalNode EQUAL() { return getToken(QueryParser.EQUAL, 0); }
		public TerminalNode LESS_THAN() { return getToken(QueryParser.LESS_THAN, 0); }
		public TimeComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeComparisonExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitTimeComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeComparisonExpressionContext timeComparisonExpression() throws RecognitionException {
		TimeComparisonExpressionContext _localctx = new TimeComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_timeComparisonExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			switch (_input.LA(1)) {
			case FIELD_IDENTIFIER:
				{
				setState(28); ((TimeComparisonExpressionContext)_localctx).leftVar = match(FIELD_IDENTIFIER);
				}
				break;
			case DATE_LITERAL:
				{
				{
				setState(29); ((TimeComparisonExpressionContext)_localctx).leftValue = timeExpression();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(32);
			((TimeComparisonExpressionContext)_localctx).operator = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << LESS_THAN_OR_EQUAL) | (1L << GREATER_THAN) | (1L << GREATER_THAN_OR_EQUAL) | (1L << EQUAL) | (1L << NOT_EQUAL))) != 0)) ) {
				((TimeComparisonExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(35);
			switch (_input.LA(1)) {
			case FIELD_IDENTIFIER:
				{
				setState(33); ((TimeComparisonExpressionContext)_localctx).rightVar = match(FIELD_IDENTIFIER);
				}
				break;
			case DATE_LITERAL:
				{
				{
				setState(34); ((TimeComparisonExpressionContext)_localctx).rightValue = timeExpression();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class NumberComparisonExpressionContext extends ParserRuleContext {
		public Token left;
		public Token operator;
		public Token right;
		public TerminalNode GREATER_THAN_OR_EQUAL() { return getToken(QueryParser.GREATER_THAN_OR_EQUAL, 0); }
		public List<TerminalNode> NEGATIVE_REAL() { return getTokens(QueryParser.NEGATIVE_REAL); }
		public TerminalNode LESS_THAN_OR_EQUAL() { return getToken(QueryParser.LESS_THAN_OR_EQUAL, 0); }
		public TerminalNode POSITIVE_INTEGER(int i) {
			return getToken(QueryParser.POSITIVE_INTEGER, i);
		}
		public TerminalNode POSITIVE_REAL(int i) {
			return getToken(QueryParser.POSITIVE_REAL, i);
		}
		public List<TerminalNode> FIELD_IDENTIFIER() { return getTokens(QueryParser.FIELD_IDENTIFIER); }
		public TerminalNode GREATER_THAN() { return getToken(QueryParser.GREATER_THAN, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(QueryParser.NOT_EQUAL, 0); }
		public List<TerminalNode> POSITIVE_REAL() { return getTokens(QueryParser.POSITIVE_REAL); }
		public TerminalNode EQUAL() { return getToken(QueryParser.EQUAL, 0); }
		public TerminalNode LESS_THAN() { return getToken(QueryParser.LESS_THAN, 0); }
		public TerminalNode NEGATIVE_INTEGER(int i) {
			return getToken(QueryParser.NEGATIVE_INTEGER, i);
		}
		public List<TerminalNode> POSITIVE_INTEGER() { return getTokens(QueryParser.POSITIVE_INTEGER); }
		public TerminalNode NEGATIVE_REAL(int i) {
			return getToken(QueryParser.NEGATIVE_REAL, i);
		}
		public List<TerminalNode> NEGATIVE_INTEGER() { return getTokens(QueryParser.NEGATIVE_INTEGER); }
		public TerminalNode FIELD_IDENTIFIER(int i) {
			return getToken(QueryParser.FIELD_IDENTIFIER, i);
		}
		public NumberComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberComparisonExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitNumberComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberComparisonExpressionContext numberComparisonExpression() throws RecognitionException {
		NumberComparisonExpressionContext _localctx = new NumberComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_numberComparisonExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			((NumberComparisonExpressionContext)_localctx).left = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FIELD_IDENTIFIER) | (1L << POSITIVE_INTEGER) | (1L << NEGATIVE_INTEGER) | (1L << POSITIVE_REAL) | (1L << NEGATIVE_REAL))) != 0)) ) {
				((NumberComparisonExpressionContext)_localctx).left = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(38);
			((NumberComparisonExpressionContext)_localctx).operator = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << LESS_THAN_OR_EQUAL) | (1L << GREATER_THAN) | (1L << GREATER_THAN_OR_EQUAL) | (1L << EQUAL) | (1L << NOT_EQUAL))) != 0)) ) {
				((NumberComparisonExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(39);
			((NumberComparisonExpressionContext)_localctx).right = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FIELD_IDENTIFIER) | (1L << POSITIVE_INTEGER) | (1L << NEGATIVE_INTEGER) | (1L << POSITIVE_REAL) | (1L << NEGATIVE_REAL))) != 0)) ) {
				((NumberComparisonExpressionContext)_localctx).right = (Token)_errHandler.recoverInline(this);
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

	public static class StringComparisonExpressionContext extends ParserRuleContext {
		public Token left;
		public Token operator;
		public Token right;
		public TerminalNode LESS_THAN_OR_EQUAL() { return getToken(QueryParser.LESS_THAN_OR_EQUAL, 0); }
		public TerminalNode GREATER_THAN_OR_EQUAL() { return getToken(QueryParser.GREATER_THAN_OR_EQUAL, 0); }
		public TerminalNode LARGE_QUOTED_STRING(int i) {
			return getToken(QueryParser.LARGE_QUOTED_STRING, i);
		}
		public List<TerminalNode> LARGE_QUOTED_STRING() { return getTokens(QueryParser.LARGE_QUOTED_STRING); }
		public TerminalNode IN() { return getToken(QueryParser.IN, 0); }
		public List<TerminalNode> FIELD_IDENTIFIER() { return getTokens(QueryParser.FIELD_IDENTIFIER); }
		public TerminalNode GREATER_THAN() { return getToken(QueryParser.GREATER_THAN, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(QueryParser.NOT_EQUAL, 0); }
		public TerminalNode NOT_IN() { return getToken(QueryParser.NOT_IN, 0); }
		public TerminalNode SMALL_QUOTED_STRING(int i) {
			return getToken(QueryParser.SMALL_QUOTED_STRING, i);
		}
		public TerminalNode EQUAL() { return getToken(QueryParser.EQUAL, 0); }
		public TerminalNode LESS_THAN() { return getToken(QueryParser.LESS_THAN, 0); }
		public List<TerminalNode> SMALL_QUOTED_STRING() { return getTokens(QueryParser.SMALL_QUOTED_STRING); }
		public TerminalNode FIELD_IDENTIFIER(int i) {
			return getToken(QueryParser.FIELD_IDENTIFIER, i);
		}
		public StringComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringComparisonExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitStringComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringComparisonExpressionContext stringComparisonExpression() throws RecognitionException {
		StringComparisonExpressionContext _localctx = new StringComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stringComparisonExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			((StringComparisonExpressionContext)_localctx).left = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FIELD_IDENTIFIER) | (1L << SMALL_QUOTED_STRING) | (1L << LARGE_QUOTED_STRING))) != 0)) ) {
				((StringComparisonExpressionContext)_localctx).left = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(42);
			((StringComparisonExpressionContext)_localctx).operator = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << NOT_IN) | (1L << LESS_THAN) | (1L << LESS_THAN_OR_EQUAL) | (1L << GREATER_THAN) | (1L << GREATER_THAN_OR_EQUAL) | (1L << EQUAL) | (1L << NOT_EQUAL))) != 0)) ) {
				((StringComparisonExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(43);
			((StringComparisonExpressionContext)_localctx).right = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FIELD_IDENTIFIER) | (1L << SMALL_QUOTED_STRING) | (1L << LARGE_QUOTED_STRING))) != 0)) ) {
				((StringComparisonExpressionContext)_localctx).right = (Token)_errHandler.recoverInline(this);
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

	public static class SingleComparisonExpressionContext extends ParserRuleContext {
		public StringComparisonExpressionContext stringComparisonExpression() {
			return getRuleContext(StringComparisonExpressionContext.class,0);
		}
		public NumberComparisonExpressionContext numberComparisonExpression() {
			return getRuleContext(NumberComparisonExpressionContext.class,0);
		}
		public TimeComparisonExpressionContext timeComparisonExpression() {
			return getRuleContext(TimeComparisonExpressionContext.class,0);
		}
		public SingleComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleComparisonExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitSingleComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleComparisonExpressionContext singleComparisonExpression() throws RecognitionException {
		SingleComparisonExpressionContext _localctx = new SingleComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_singleComparisonExpression);
		try {
			setState(48);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45); timeComparisonExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46); numberComparisonExpression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(47); stringComparisonExpression();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitComparisonWrappedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonNotCombinedExpressionContext extends CombinedComparisonExpressionContext {
		public TerminalNode NOT() { return getToken(QueryParser.NOT, 0); }
		public CombinedComparisonExpressionContext combinedComparisonExpression() {
			return getRuleContext(CombinedComparisonExpressionContext.class,0);
		}
		public ComparisonNotCombinedExpressionContext(CombinedComparisonExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitComparisonNotCombinedExpression(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitComparisonOrCombinedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonSingleExpressionContext extends CombinedComparisonExpressionContext {
		public SingleComparisonExpressionContext singleComparisonExpression() {
			return getRuleContext(SingleComparisonExpressionContext.class,0);
		}
		public ComparisonSingleExpressionContext(CombinedComparisonExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitComparisonSingleExpression(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitComparisonAndCombinedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CombinedComparisonExpressionContext combinedComparisonExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CombinedComparisonExpressionContext _localctx = new CombinedComparisonExpressionContext(_ctx, _parentState, _p);
		CombinedComparisonExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, RULE_combinedComparisonExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			switch (_input.LA(1)) {
			case NOT:
				{
				_localctx = new ComparisonNotCombinedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(51); match(NOT);
				setState(52); combinedComparisonExpression(2);
				}
				break;
			case OPEN_BRACE:
				{
				_localctx = new ComparisonWrappedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53); match(OPEN_BRACE);
				setState(54); combinedComparisonExpression(0);
				setState(55); match(CLOSE_BRACE);
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
				setState(57); singleComparisonExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(66);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ComparisonAndCombinedExpressionContext(new CombinedComparisonExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_combinedComparisonExpression);
						setState(60);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(61); match(AND);
						setState(62); combinedComparisonExpression(5);
						}
						break;

					case 2:
						{
						_localctx = new ComparisonOrCombinedExpressionContext(new CombinedComparisonExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_combinedComparisonExpression);
						setState(63);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(64); match(OR);
						setState(65); combinedComparisonExpression(4);
						}
						break;
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitTimeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeExpressionContext timeExpression() throws RecognitionException {
		TimeExpressionContext _localctx = new TimeExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_timeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); ((TimeExpressionContext)_localctx).date = match(DATE_LITERAL);
			setState(74);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(72); match(1);
				setState(73); ((TimeExpressionContext)_localctx).time = match(TIME_LITERAL);
				}
				break;
			}
			setState(78);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(76); match(2);
				setState(77); ((TimeExpressionContext)_localctx).zone = match(ZONE_LITERAL);
				}
				break;
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitRelativeTimeRangeExpression(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitAbsoluteTimeRangeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeRangeExpressionContext timeRangeExpression() throws RecognitionException {
		TimeRangeExpressionContext _localctx = new TimeRangeExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_timeRangeExpression);
		int _la;
		try {
			setState(88);
			switch (_input.LA(1)) {
			case BETWEEN:
				_localctx = new AbsoluteTimeRangeExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(80); match(BETWEEN);
				setState(81); ((AbsoluteTimeRangeExpressionContext)_localctx).from = timeExpression();
				setState(82); match(AND);
				setState(83); ((AbsoluteTimeRangeExpressionContext)_localctx).to = timeExpression();
				}
				break;
			case IN:
				_localctx = new RelativeTimeRangeExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(85); match(IN);
				setState(86); ((RelativeTimeRangeExpressionContext)_localctx).timeValue = match(POSITIVE_INTEGER);
				setState(87);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitCalcAggregateFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregateExpressionContext aggregateExpression() throws RecognitionException {
		AggregateExpressionContext _localctx = new AggregateExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_aggregateExpression);
		int _la;
		try {
			_localctx = new CalcAggregateFunctionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			((CalcAggregateFunctionContext)_localctx).function = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AVERAGE) | (1L << COUNT) | (1L << SUM) | (1L << MIN) | (1L << MAX) | (1L << MEDIAN))) != 0)) ) {
				((CalcAggregateFunctionContext)_localctx).function = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(91); match(OPEN_BRACE);
			setState(92); ((CalcAggregateFunctionContext)_localctx).funcVar = match(FIELD_IDENTIFIER);
			setState(93); match(CLOSE_BRACE);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitAskQuerySyntax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AskQuerySyntaxContext askQuerySyntax() throws RecognitionException {
		AskQuerySyntaxContext _localctx = new AskQuerySyntaxContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_askQuerySyntax);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); match(ASK);
			setState(96); ((AskQuerySyntaxContext)_localctx).table = match(FIELD_IDENTIFIER);
			setState(97); timeRangeExpression();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitFilterQuerySyntax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterQuerySyntaxContext filterQuerySyntax() throws RecognitionException {
		FilterQuerySyntaxContext _localctx = new FilterQuerySyntaxContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_filterQuerySyntax);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99); match(FILTER);
			setState(100); combinedComparisonExpression(0);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitAggregateByFieldQuerySyntax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregateByFieldQuerySyntaxContext aggregateByFieldQuerySyntax() throws RecognitionException {
		AggregateByFieldQuerySyntaxContext _localctx = new AggregateByFieldQuerySyntaxContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_aggregateByFieldQuerySyntax);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); match(CALCULATE);
			setState(103); ((AggregateByFieldQuerySyntaxContext)_localctx).resultVar = match(FIELD_IDENTIFIER);
			setState(104); match(EQUAL);
			setState(105); aggregateExpression();
			setState(108);
			_la = _input.LA(1);
			if (_la==BY) {
				{
				setState(106); match(BY);
				setState(107); ((AggregateByFieldQuerySyntaxContext)_localctx).groupVar = match(FIELD_IDENTIFIER);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitAggregateByTimeQuerySyntax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregateByTimeQuerySyntaxContext aggregateByTimeQuerySyntax() throws RecognitionException {
		AggregateByTimeQuerySyntaxContext _localctx = new AggregateByTimeQuerySyntaxContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_aggregateByTimeQuerySyntax);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); match(AGGREGATE);
			setState(111); ((AggregateByTimeQuerySyntaxContext)_localctx).resultVar = match(FIELD_IDENTIFIER);
			setState(112); match(EQUAL);
			setState(113); aggregateExpression();
			setState(114); match(BY);
			setState(115); match(TIME);
			setState(116); ((AggregateByTimeQuerySyntaxContext)_localctx).timeValue = match(POSITIVE_INTEGER);
			setState(117);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitOptionalQuerySyntax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalQuerySyntaxContext optionalQuerySyntax() throws RecognitionException {
		OptionalQuerySyntaxContext _localctx = new OptionalQuerySyntaxContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_optionalQuerySyntax);
		try {
			setState(125);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119); match(PIPE);
				setState(120); filterQuerySyntax();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121); match(PIPE);
				setState(122); aggregateByFieldQuerySyntax();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123); match(PIPE);
				setState(124); aggregateByTimeQuerySyntax();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitQuerySyntax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySyntaxContext querySyntax() throws RecognitionException {
		QuerySyntaxContext _localctx = new QuerySyntaxContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_querySyntax);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); askQuerySyntax();
			setState(129); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(128); optionalQuerySyntax();
				}
				}
				setState(131); 
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
		case 4: return combinedComparisonExpression_sempred((CombinedComparisonExpressionContext)_localctx, predIndex);
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
		"\2\3\62\u0088\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2"+
		"\5\2!\n\2\3\2\3\2\3\2\5\2&\n\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\5\5\63\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6=\n\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\7\6E\n\6\f\6\16\6H\13\6\3\7\3\7\3\7\5\7M\n\7\3\7\3\7\5\7Q\n"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b[\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\fo\n\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0080\n\16"+
		"\3\17\3\17\6\17\u0084\n\17\r\17\16\17\u0085\3\17\2\20\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\2\f\3\34!\4))-\60\3\34!\4))-\60\4))\61\62\5\21\21\32"+
		"\32\34!\4))\61\62\3\22\25\3\b\r\3\22\25\u0088\2 \3\2\2\2\4\'\3\2\2\2\6"+
		"+\3\2\2\2\b\62\3\2\2\2\n<\3\2\2\2\fI\3\2\2\2\16Z\3\2\2\2\20\\\3\2\2\2"+
		"\22a\3\2\2\2\24e\3\2\2\2\26h\3\2\2\2\30p\3\2\2\2\32\177\3\2\2\2\34\u0081"+
		"\3\2\2\2\36!\7)\2\2\37!\5\f\7\2 \36\3\2\2\2 \37\3\2\2\2!\"\3\2\2\2\"%"+
		"\t\2\2\2#&\7)\2\2$&\5\f\7\2%#\3\2\2\2%$\3\2\2\2&\3\3\2\2\2\'(\t\3\2\2"+
		"()\t\4\2\2)*\t\5\2\2*\5\3\2\2\2+,\t\6\2\2,-\t\7\2\2-.\t\b\2\2.\7\3\2\2"+
		"\2/\63\5\2\2\2\60\63\5\4\3\2\61\63\5\6\4\2\62/\3\2\2\2\62\60\3\2\2\2\62"+
		"\61\3\2\2\2\63\t\3\2\2\2\64\65\b\6\1\2\65\66\7\33\2\2\66=\5\n\6\2\678"+
		"\7\'\2\289\5\n\6\29:\7(\2\2:=\3\2\2\2;=\5\b\5\2<\64\3\2\2\2<\67\3\2\2"+
		"\2<;\3\2\2\2=F\3\2\2\2>?\6\6\2\3?@\7\30\2\2@E\5\n\6\2AB\6\6\3\3BC\7\31"+
		"\2\2CE\5\n\6\2D>\3\2\2\2DA\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\13\3"+
		"\2\2\2HF\3\2\2\2IL\7*\2\2JK\7\3\2\2KM\7+\2\2LJ\3\2\2\2LM\3\2\2\2MP\3\2"+
		"\2\2NO\7\4\2\2OQ\7,\2\2PN\3\2\2\2PQ\3\2\2\2Q\r\3\2\2\2RS\7\20\2\2ST\5"+
		"\f\7\2TU\7\30\2\2UV\5\f\7\2V[\3\2\2\2WX\7\21\2\2XY\7-\2\2Y[\t\t\2\2ZR"+
		"\3\2\2\2ZW\3\2\2\2[\17\3\2\2\2\\]\t\n\2\2]^\7\'\2\2^_\7)\2\2_`\7(\2\2"+
		"`\21\3\2\2\2ab\7\26\2\2bc\7)\2\2cd\5\16\b\2d\23\3\2\2\2ef\7\27\2\2fg\5"+
		"\n\6\2g\25\3\2\2\2hi\7\7\2\2ij\7)\2\2jk\7 \2\2kn\5\20\t\2lm\7\16\2\2m"+
		"o\7)\2\2nl\3\2\2\2no\3\2\2\2o\27\3\2\2\2pq\7\6\2\2qr\7)\2\2rs\7 \2\2s"+
		"t\5\20\t\2tu\7\16\2\2uv\7\17\2\2vw\7-\2\2wx\t\13\2\2x\31\3\2\2\2yz\7&"+
		"\2\2z\u0080\5\24\13\2{|\7&\2\2|\u0080\5\26\f\2}~\7&\2\2~\u0080\5\30\r"+
		"\2\177y\3\2\2\2\177{\3\2\2\2\177}\3\2\2\2\u0080\33\3\2\2\2\u0081\u0083"+
		"\5\22\n\2\u0082\u0084\5\32\16\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2"+
		"\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\35\3\2\2\2\16 %\62<D"+
		"FLPZn\177\u0085";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}