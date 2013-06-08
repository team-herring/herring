package org.herring.manager.query.builder;

import org.herring.core.manager.query.FilterCommand;
import org.herring.core.manager.query.QueryCommand;
import org.herring.core.manager.query.types.FieldType;
import org.herring.core.manager.query.types.TimeType;
import org.herring.manager.query.util.OperatorUtils;

import java.util.ArrayList;
import java.util.List;

import static org.herring.core.manager.query.FilterCommand.Operator;
import static org.herring.manager.query.QueryParser.TimeComparisonExpressionContext;

/**
 * @author Chiwan Park
 * @since 0.1
 */
public class TimeComparisonQueryBuilder {
    public static List<QueryCommand> build(QueryBuilder builder, TimeComparisonExpressionContext context) {
        if (context.leftValue != null && context.rightValue != null)
            // TODO: 시간 리터럴끼리 비교시 예외 처리 추가.
            ;

        FieldType field;
        TimeType time;
        Operator operator = OperatorUtils.get(context.operator.getType());
        FilterCommand command;
        List<QueryCommand> commandList = new ArrayList<QueryCommand>();

        if (context.leftVar != null) {
            field = new FieldType(context.leftVar.getText());
            time = (TimeType) builder.visitTimeExpression(context.rightValue);

            command = new FilterCommand(field, time, operator);
        } else {
            field = new FieldType(context.rightVar.getText());
            time = (TimeType) builder.visitTimeExpression(context.leftValue);

            command = new FilterCommand(field, time, operator);
        }

        commandList.add(command);

        return commandList;
    }
}
