// Generated from Query.g4 by ANTLR 4.0

package org.herring.manager.query;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface QueryVisitor<T> extends ParseTreeVisitor<T> {
	T visitComparisonWrappedExpression(QueryParser.ComparisonWrappedExpressionContext ctx);

	T visitCalcAggregateFunction(QueryParser.CalcAggregateFunctionContext ctx);

	T visitComparisonNotCombinedExpression(QueryParser.ComparisonNotCombinedExpressionContext ctx);

	T visitComparisonOrCombinedExpression(QueryParser.ComparisonOrCombinedExpressionContext ctx);

	T visitRelativeTimeRangeExpression(QueryParser.RelativeTimeRangeExpressionContext ctx);

	T visitAskQuerySyntax(QueryParser.AskQuerySyntaxContext ctx);

	T visitComparisonSingleExpression(QueryParser.ComparisonSingleExpressionContext ctx);

	T visitComparisonAndCombinedExpression(QueryParser.ComparisonAndCombinedExpressionContext ctx);

	T visitAbsoluteTimeRangeExpression(QueryParser.AbsoluteTimeRangeExpressionContext ctx);

	T visitAggregateByTimeQuerySyntax(QueryParser.AggregateByTimeQuerySyntaxContext ctx);

	T visitAggregateByFieldQuerySyntax(QueryParser.AggregateByFieldQuerySyntaxContext ctx);

	T visitOptionalQuerySyntax(QueryParser.OptionalQuerySyntaxContext ctx);

	T visitSingleComparisonExpression(QueryParser.SingleComparisonExpressionContext ctx);

	T visitTimeExpression(QueryParser.TimeExpressionContext ctx);

	T visitQuerySyntax(QueryParser.QuerySyntaxContext ctx);

	T visitFilterQuerySyntax(QueryParser.FilterQuerySyntaxContext ctx);
}