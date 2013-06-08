package org.herring.manager.query.builder;

import org.herring.core.manager.query.types.TimeRangeType;
import org.herring.core.manager.query.types.TimeType;

import java.util.Calendar;

import static org.herring.manager.query.QueryParser.DAYS;
import static org.herring.manager.query.QueryParser.HOURS;
import static org.herring.manager.query.QueryParser.MINUTES;
import static org.herring.manager.query.QueryParser.MONTHS;
import static org.herring.manager.query.QueryParser.RelativeTimeRangeExpressionContext;

/**
 * @author Chiwan Park
 * @since 0.1
 */
public class RelativeTimeRangeBuilder {
    public static TimeRangeType build(QueryBuilder builder, RelativeTimeRangeExpressionContext context) {
        int timeValue = Integer.valueOf(context.timeValue.getText());
        int timeUnit = context.timeUnit.getType();

        Calendar to = Calendar.getInstance();
        Calendar from = (Calendar) to.clone();

        switch (timeUnit) {
            case MONTHS:
                from.add(Calendar.MONTH, -timeValue);
                break;
            case DAYS:
                from.add(Calendar.DAY_OF_MONTH, -timeValue);
                break;
            case HOURS:
                from.add(Calendar.HOUR, -timeValue);
                break;
            case MINUTES:
                from.add(Calendar.MINUTE, -timeValue);
                break;
        }

        return new TimeRangeType(new TimeType(from), new TimeType(to));
    }
}
