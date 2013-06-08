package org.herring.manager.query.builder;

import org.herring.core.manager.query.MergeCommand;
import org.herring.core.manager.query.QueryCommand;
import org.herring.manager.query.QueryParser;

import java.util.ArrayList;
import java.util.List;

import static org.herring.core.manager.query.MergeCommand.Condition;
import static org.herring.core.manager.query.MergeCommand.Condition.AND;
import static org.herring.core.manager.query.MergeCommand.Condition.OR;
import static org.herring.manager.query.QueryParser.ComparisonAndCombinedExpressionContext;
import static org.herring.manager.query.QueryParser.ComparisonOrCombinedExpressionContext;

/**
 * @author Chiwan Park
 * @since 0.1
 */
public class CombinedQueryBuilder {
    @SuppressWarnings("unchecked")
    public static <T extends QueryParser.CombinedComparisonExpressionContext> List<QueryCommand> build(QueryBuilder builder, T context) {
        List<QueryCommand> leftCommandList;
        List<QueryCommand> rightCommandList;
        Condition condition;

        if (context instanceof ComparisonAndCombinedExpressionContext) { // AND
            ComparisonAndCombinedExpressionContext casted = (ComparisonAndCombinedExpressionContext) context;

            leftCommandList = (List<QueryCommand>) builder.visit(casted.left);
            rightCommandList = (List<QueryCommand>) builder.visit(casted.right);

            condition = AND;
        } else { // OR
            ComparisonOrCombinedExpressionContext casted = (ComparisonOrCombinedExpressionContext) context;

            leftCommandList = (List<QueryCommand>) builder.visit(casted.left);
            rightCommandList = (List<QueryCommand>) builder.visit(casted.right);

            condition = OR;
        }

        List<QueryCommand> mergedCommandList = new ArrayList<QueryCommand>();

        mergedCommandList.addAll(leftCommandList);
        mergedCommandList.addAll(rightCommandList);

        MergeCommand command = new MergeCommand(condition);

        mergedCommandList.add(command);

        return mergedCommandList;
    }
}
