package org.herring.manager.query.builder;

import org.antlr.v4.runtime.tree.ParseTree;
import org.herring.core.manager.query.QueryCommand;
import org.herring.core.manager.query.ReturnCommand;
import org.herring.manager.query.QueryBaseVisitor;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import static org.herring.manager.query.QueryParser.*;

/**
 * @author Chiwan Park
 * @since 0.1
 */
public class QueryBuilder extends QueryBaseVisitor<Object> {
    @Override
    public Object visitTimeExpression(TimeExpressionContext ctx) {
        return TimeBuilder.build(this, ctx);
    }

    @Override
    public Object visitAbsoluteTimeRangeExpression(AbsoluteTimeRangeExpressionContext ctx) {
        return AbsoluteTimeRangeBuilder.build(this, ctx);
    }

    @Override
    public Object visitRelativeTimeRangeExpression(RelativeTimeRangeExpressionContext ctx) {
        return RelativeTimeRangeBuilder.build(this, ctx);
    }

    @Override
    public Object visitAskQuerySyntax(AskQuerySyntaxContext ctx) {
        return AskQueryBuilder.build(this, ctx);
    }

    @Override
    public Object visitFilterQuerySyntax(FilterQuerySyntaxContext ctx) {
        return FilterQueryBuilder.build(this, ctx);
    }

    @Override
    public Object visitStringComparisonExpression(StringComparisonExpressionContext ctx) {
        return StringComparisonQueryBuilder.build(this, ctx);
    }

    @Override
    public Object visitNumberComparisonExpression(NumberComparisonExpressionContext ctx) {
        return NumberComparisonQueryBuilder.build(this, ctx);
    }

    @Override
    public Object visitTimeComparisonExpression(TimeComparisonExpressionContext ctx) {
        return TimeComparisonQueryBuilder.build(this, ctx);
    }

    @Override
    public Object visitComparisonOrCombinedExpression(ComparisonOrCombinedExpressionContext ctx) {
        return CombinedQueryBuilder.build(this, ctx);
    }

    @Override
    public Object visitComparisonAndCombinedExpression(ComparisonAndCombinedExpressionContext ctx) {
        return CombinedQueryBuilder.build(this, ctx);
    }

    @Override
    public Object visitComparisonNotCombinedExpression(ComparisonNotCombinedExpressionContext ctx) {
        return NotQueryBuilder.build(this, ctx);
    }

    @Override
    public Object visitCalcAggregateFunction(CalcAggregateFunctionContext ctx) {
        return CommonAggregateQueryBuilder.build(this, ctx);
    }

    @Override
    public Object visitAggregateByTimeQuerySyntax(AggregateByTimeQuerySyntaxContext ctx) {
        return AggregateByTimeBuilder.build(this, ctx);
    }

    @Override
    public Object visitAggregateByFieldQuerySyntax(AggregateByFieldQuerySyntaxContext ctx) {
        return AggregateByFieldBuilder.build(this, ctx);
    }

    @SuppressWarnings("unchecked")
    @Override
    public Object visitQuerySyntax(QuerySyntaxContext ctx) {
        Queue<QueryCommand> commandQueue = new LinkedBlockingQueue<QueryCommand>();

        for (ParseTree child : ctx.children) {
            Object childResult = visit(child);

            // TODO: ANTLR v4 4.0 Runtime 버그로 인해 EOF 인지가 안되는 문제가 있음. 추후 ANTLR 버전 업그레이드 이후 수정 필요.
            if (childResult != null) {
                if (childResult instanceof List)
                    commandQueue.addAll((List<QueryCommand>) childResult);
                else if (childResult instanceof QueryCommand)
                    commandQueue.add((QueryCommand) childResult);
            }
        }

        commandQueue.add(new ReturnCommand());

        return commandQueue;
    }

    @Override
    public Object visitComparisonWrappedExpression(ComparisonWrappedExpressionContext ctx) {
        // 양쪽 괄호 제외 하고, 가운데 context만 선택
        return visit(ctx.combinedComparisonExpression());
    }
}
