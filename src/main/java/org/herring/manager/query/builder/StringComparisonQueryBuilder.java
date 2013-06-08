package org.herring.manager.query.builder;

import org.herring.core.manager.query.FilterCommand;
import org.herring.core.manager.query.QueryCommand;
import org.herring.core.manager.query.types.FieldType;
import org.herring.core.manager.query.types.StringType;
import org.herring.manager.query.QueryParser;
import org.herring.manager.query.util.OperatorUtils;

import java.util.ArrayList;
import java.util.List;

import static org.herring.core.manager.query.FilterCommand.Operator;
import static org.herring.manager.query.QueryParser.*;

/**
 * @author Chiwan Park
 * @since 0.1
 */
public class StringComparisonQueryBuilder {

    public static List<QueryCommand> build(QueryBuilder builder, StringComparisonExpressionContext context) {
        String strLeft = context.left.getText();
        String strRight = context.right.getText();
        FieldType field;
        StringType literal;
        Operator operator;

        List<QueryCommand> commandList = new ArrayList<QueryCommand>();
        FilterCommand command;

        int leftType = context.left.getType();
        int rightType = context.right.getType();

        if (leftType == rightType && leftType != QueryParser.FIELD_IDENTIFIER)
            // TODO: 문자열 리터럴끼리 비교시 예외 처리 추가
            ;

        if (leftType == QueryParser.FIELD_IDENTIFIER) {
            field = new FieldType(strLeft);
            literal = new StringType(strRight.substring(1, strRight.length() - 1));
            operator = OperatorUtils.get(context.operator.getType());
            command = new FilterCommand(field, literal, operator);
        } else {
            field = new FieldType(strRight);
            literal = new StringType(strLeft.substring(1, strLeft.length() - 1));
            operator = OperatorUtils.get(context.operator.getType());
            command = new FilterCommand(literal, field, operator);
        }

        commandList.add(command);

        return commandList;
    }
}
