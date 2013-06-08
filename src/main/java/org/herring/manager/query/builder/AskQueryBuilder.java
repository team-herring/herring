package org.herring.manager.query.builder;

import org.herring.core.manager.query.LoadCommand;
import org.herring.core.manager.query.types.FieldType;
import org.herring.core.manager.query.types.TimeRangeType;

import static org.herring.manager.query.QueryParser.AbsoluteTimeRangeExpressionContext;
import static org.herring.manager.query.QueryParser.AskQuerySyntaxContext;
import static org.herring.manager.query.QueryParser.RelativeTimeRangeExpressionContext;
import static org.herring.manager.query.QueryParser.TimeRangeExpressionContext;

/**
 * @author Chiwan Park
 * @since 0.1
 */
public class AskQueryBuilder {
    public static LoadCommand build(QueryBuilder builder, AskQuerySyntaxContext context) {
        String strTable = context.table.getText();
        TimeRangeExpressionContext childContext = context.timeRangeExpression();
        TimeRangeType timeRange;

        if (childContext instanceof AbsoluteTimeRangeExpressionContext)
            timeRange = (TimeRangeType) builder.visitAbsoluteTimeRangeExpression((AbsoluteTimeRangeExpressionContext) childContext);
        else
            timeRange = (TimeRangeType) builder.visitRelativeTimeRangeExpression((RelativeTimeRangeExpressionContext) childContext);

        return new LoadCommand(new FieldType(strTable), timeRange);
    }
}
