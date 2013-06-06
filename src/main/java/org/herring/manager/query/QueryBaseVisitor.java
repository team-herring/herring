// Generated from Query.g4 by ANTLR 4.0

package org.herring.manager.query;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

public class QueryBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements QueryVisitor<T> {
	@Override public T visitStringComparisonExpression(QueryParser.StringComparisonExpressionContext ctx) { return visitChildren(ctx); }

	@Override public T visitComparisonWrappedExpression(QueryParser.ComparisonWrappedExpressionContext ctx) { return visitChildren(ctx); }

	@Override public T visitCalcAggregateFunction(QueryParser.CalcAggregateFunctionContext ctx) { return visitChildren(ctx); }

	@Override public T visitNumberComparisonExpression(QueryParser.NumberComparisonExpressionContext ctx) { return visitChildren(ctx); }

	@Override public T visitComparisonNotCombinedExpression(QueryParser.ComparisonNotCombinedExpressionContext ctx) { return visitChildren(ctx); }

	@Override public T visitComparisonOrCombinedExpression(QueryParser.ComparisonOrCombinedExpressionContext ctx) { return visitChildren(ctx); }

	@Override public T visitRelativeTimeRangeExpression(QueryParser.RelativeTimeRangeExpressionContext ctx) { return visitChildren(ctx); }

	@Override public T visitAskQuerySyntax(QueryParser.AskQuerySyntaxContext ctx) { return visitChildren(ctx); }

	@Override public T visitComparisonSingleExpression(QueryParser.ComparisonSingleExpressionContext ctx) { return visitChildren(ctx); }

	@Override public T visitComparisonAndCombinedExpression(QueryParser.ComparisonAndCombinedExpressionContext ctx) { return visitChildren(ctx); }

	@Override public T visitAbsoluteTimeRangeExpression(QueryParser.AbsoluteTimeRangeExpressionContext ctx) { return visitChildren(ctx); }

	@Override public T visitAggregateByTimeQuerySyntax(QueryParser.AggregateByTimeQuerySyntaxContext ctx) { return visitChildren(ctx); }

	@Override public T visitTimeComparisonExpression(QueryParser.TimeComparisonExpressionContext ctx) { return visitChildren(ctx); }

	@Override public T visitAggregateByFieldQuerySyntax(QueryParser.AggregateByFieldQuerySyntaxContext ctx) { return visitChildren(ctx); }

	@Override public T visitOptionalQuerySyntax(QueryParser.OptionalQuerySyntaxContext ctx) { return visitChildren(ctx); }

	@Override public T visitSingleComparisonExpression(QueryParser.SingleComparisonExpressionContext ctx) { return visitChildren(ctx); }

	@Override public T visitTimeExpression(QueryParser.TimeExpressionContext ctx) { return visitChildren(ctx); }

	@Override public T visitQuerySyntax(QueryParser.QuerySyntaxContext ctx) { return visitChildren(ctx); }

	@Override public T visitFilterQuerySyntax(QueryParser.FilterQuerySyntaxContext ctx) { return visitChildren(ctx); }
}