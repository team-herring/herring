package org.herring.manager.query.builder;

import org.herring.core.manager.query.types.TimeType;

import static org.herring.manager.query.QueryParser.TimeExpressionContext;

/**
 * @author Chiwan Park
 * @since 0.1
 */
public class TimeBuilder {
    public static TimeType build(QueryBuilder builder, TimeExpressionContext context) {
        String strDate = context.date.getText();
        String strTime = "00:00:00";
        String strZone = "+0000";

        if (context.time != null)
            strTime = context.time.getText();
        if (context.zone != null)
            strZone = context.zone.getText();

        return TimeType.valueOf(strDate, strTime, strZone);
    }
}
