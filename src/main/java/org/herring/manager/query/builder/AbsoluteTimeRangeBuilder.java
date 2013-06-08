package org.herring.manager.query.builder;

import org.herring.core.manager.query.types.TimeRangeType;
import org.herring.core.manager.query.types.TimeType;

import static org.herring.manager.query.QueryParser.AbsoluteTimeRangeExpressionContext;

/**
 * @author Chiwan Park
 * @since 0.1
 */
public class AbsoluteTimeRangeBuilder {
    public static TimeRangeType build(QueryBuilder builder, AbsoluteTimeRangeExpressionContext context) {
        TimeType from = (TimeType) builder.visit(context.from);
        TimeType to = (TimeType) builder.visit(context.to);

        return new TimeRangeType(from, to);
    }
}
