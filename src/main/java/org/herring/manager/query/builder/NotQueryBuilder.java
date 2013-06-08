package org.herring.manager.query.builder;

import org.herring.core.manager.query.FilterCommand;
import org.herring.core.manager.query.MergeCommand;
import org.herring.core.manager.query.QueryCommand;
import org.herring.manager.query.util.OperatorUtils;

import java.util.List;

import static org.herring.core.manager.query.FilterCommand.Operator;
import static org.herring.core.manager.query.MergeCommand.Condition;
import static org.herring.core.manager.query.QueryCommand.CommandType.FILTER;
import static org.herring.core.manager.query.QueryCommand.CommandType.MERGE;
import static org.herring.manager.query.QueryParser.ComparisonNotCombinedExpressionContext;

/**
 * @author Chiwan Park
 * @since 0.1
 */
public class NotQueryBuilder {
    @SuppressWarnings("unchecked")
    public static List<QueryCommand> build(QueryBuilder builder, ComparisonNotCombinedExpressionContext context) {
        List<QueryCommand> commandList = (List<QueryCommand>) builder.visit(context.combinedComparisonExpression());

        for (int i = 0, length = commandList.size(); i < length; ++i) {
            QueryCommand command = commandList.get(i);

            if (command.getType() == MERGE) {
                commandList.set(i, applyNot((MergeCommand) command));
            } else if (command.getType() == FILTER) {
                commandList.set(i, applyNot((FilterCommand) command));
            }
        }

        return commandList;
    }

    public static MergeCommand applyNot(MergeCommand command) {
        Condition condition;
        if (command.getCondition() == Condition.AND)
            condition = Condition.OR;
        else
            condition = Condition.AND;

        return new MergeCommand(condition);
    }

    public static FilterCommand applyNot(FilterCommand command) {
        Operator operator = OperatorUtils.not(command.getOperator());

        return new FilterCommand(command.getOperand1(), command.getOperand2(), operator);
    }
}
