package org.herring.manager.query.builder;

import org.herring.core.manager.query.FilterCommand;
import org.herring.core.manager.query.QueryCommand;
import org.herring.core.manager.query.types.FieldType;
import org.herring.core.manager.query.types.NumberType;
import org.herring.manager.query.util.OperatorUtils;

import java.util.ArrayList;
import java.util.List;

import static org.herring.core.manager.query.FilterCommand.Operator;
import static org.herring.manager.query.QueryParser.FIELD_IDENTIFIER;
import static org.herring.manager.query.QueryParser.NumberComparisonExpressionContext;

/**
 * @author Chiwan Park
 * @since 0.1
 */
public class NumberComparisonQueryBuilder {
    public static List<QueryCommand> build(QueryBuilder builder, NumberComparisonExpressionContext context) {
        String strLeft = context.left.getText();
        String strRight = context.right.getText();
        int leftType = context.left.getType();
        int rightType = context.right.getType();

        List<QueryCommand> commandList = new ArrayList<QueryCommand>();
        FilterCommand command;

        if (leftType == rightType && leftType != FIELD_IDENTIFIER)
            // TODO: 수치형 리터럴끼리 비교시 예외 처리 추가
            ;

        Operator operator = OperatorUtils.get(context.operator.getType());

        if (leftType == FIELD_IDENTIFIER) {
            command = new FilterCommand(new FieldType(strLeft), NumberType.valueOf(strRight), operator);
        } else {
            command = new FilterCommand(new FieldType(strRight), NumberType.valueOf(strLeft), operator);
        }

        commandList.add(command);

        return commandList;
    }
}
