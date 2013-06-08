package org.herring.manager.query.builder;

import org.herring.core.manager.query.QueryCommand;
import org.herring.manager.query.QueryParser;

import java.util.List;

import static org.herring.manager.query.QueryParser.FilterQuerySyntaxContext;

/**
 * @author Chiwan Park
 * @since 0.1
 */
public class FilterQueryBuilder {
    @SuppressWarnings("unchecked")
    public static List<QueryCommand> build(QueryBuilder builder, FilterQuerySyntaxContext context) {
        QueryParser.CombinedComparisonExpressionContext childContext = context.combinedComparisonExpression();
        List<QueryCommand> commandList = null;

        if (childContext instanceof QueryParser.ComparisonWrappedExpressionContext)
            commandList = (List<QueryCommand>) builder.visitComparisonWrappedExpression((QueryParser.ComparisonWrappedExpressionContext) childContext);
        else if (childContext instanceof QueryParser.ComparisonAndCombinedExpressionContext)
            commandList = (List<QueryCommand>) builder.visitComparisonAndCombinedExpression((QueryParser.ComparisonAndCombinedExpressionContext) childContext);
        else if (childContext instanceof QueryParser.ComparisonOrCombinedExpressionContext)
            commandList = (List<QueryCommand>) builder.visitComparisonOrCombinedExpression((QueryParser.ComparisonOrCombinedExpressionContext) childContext);
        else if (childContext instanceof QueryParser.ComparisonNotCombinedExpressionContext)
            commandList = (List<QueryCommand>) builder.visitComparisonNotCombinedExpression((QueryParser.ComparisonNotCombinedExpressionContext) childContext);
        else if (childContext instanceof QueryParser.ComparisonSingleExpressionContext)
            commandList = (List<QueryCommand>) builder.visitComparisonSingleExpression((QueryParser.ComparisonSingleExpressionContext) childContext);

        return commandList;
    }
}
