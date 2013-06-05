// Generated from Query.g4 by ANTLR 4.0

package org.herring.manager.query;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface QueryListener extends ParseTreeListener {
	void enterComparisonWrappedExpression(QueryParser.ComparisonWrappedExpressionContext ctx);
	void exitComparisonWrappedExpression(QueryParser.ComparisonWrappedExpressionContext ctx);

	void enterCalcAggregateFunction(QueryParser.CalcAggregateFunctionContext ctx);
	void exitCalcAggregateFunction(QueryParser.CalcAggregateFunctionContext ctx);

	void enterComparisonNotCombinedExpression(QueryParser.ComparisonNotCombinedExpressionContext ctx);
	void exitComparisonNotCombinedExpression(QueryParser.ComparisonNotCombinedExpressionContext ctx);

	void enterComparisonOrCombinedExpression(QueryParser.ComparisonOrCombinedExpressionContext ctx);
	void exitComparisonOrCombinedExpression(QueryParser.ComparisonOrCombinedExpressionContext ctx);

	void enterRelativeTimeRangeExpression(QueryParser.RelativeTimeRangeExpressionContext ctx);
	void exitRelativeTimeRangeExpression(QueryParser.RelativeTimeRangeExpressionContext ctx);

	void enterAskQuerySyntax(QueryParser.AskQuerySyntaxContext ctx);
	void exitAskQuerySyntax(QueryParser.AskQuerySyntaxContext ctx);

	void enterComparisonSingleExpression(QueryParser.ComparisonSingleExpressionContext ctx);
	void exitComparisonSingleExpression(QueryParser.ComparisonSingleExpressionContext ctx);

	void enterComparisonAndCombinedExpression(QueryParser.ComparisonAndCombinedExpressionContext ctx);
	void exitComparisonAndCombinedExpression(QueryParser.ComparisonAndCombinedExpressionContext ctx);

	void enterAbsoluteTimeRangeExpression(QueryParser.AbsoluteTimeRangeExpressionContext ctx);
	void exitAbsoluteTimeRangeExpression(QueryParser.AbsoluteTimeRangeExpressionContext ctx);

	void enterAggregateByTimeQuerySyntax(QueryParser.AggregateByTimeQuerySyntaxContext ctx);
	void exitAggregateByTimeQuerySyntax(QueryParser.AggregateByTimeQuerySyntaxContext ctx);

	void enterAggregateByFieldQuerySyntax(QueryParser.AggregateByFieldQuerySyntaxContext ctx);
	void exitAggregateByFieldQuerySyntax(QueryParser.AggregateByFieldQuerySyntaxContext ctx);

	void enterOptionalQuerySyntax(QueryParser.OptionalQuerySyntaxContext ctx);
	void exitOptionalQuerySyntax(QueryParser.OptionalQuerySyntaxContext ctx);

	void enterSingleComparisonExpression(QueryParser.SingleComparisonExpressionContext ctx);
	void exitSingleComparisonExpression(QueryParser.SingleComparisonExpressionContext ctx);

	void enterTimeExpression(QueryParser.TimeExpressionContext ctx);
	void exitTimeExpression(QueryParser.TimeExpressionContext ctx);

	void enterQuerySyntax(QueryParser.QuerySyntaxContext ctx);
	void exitQuerySyntax(QueryParser.QuerySyntaxContext ctx);

	void enterFilterQuerySyntax(QueryParser.FilterQuerySyntaxContext ctx);
	void exitFilterQuerySyntax(QueryParser.FilterQuerySyntaxContext ctx);
}