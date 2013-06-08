package org.herring.manager.query.builder;

import org.herring.core.manager.query.AggregateByTimeCommand;
import org.herring.core.manager.query.AggregateCommand;
import org.herring.core.manager.query.types.NumberType;

import static org.herring.core.manager.query.AggregateCommand.AggregateMethod;
import static org.herring.manager.query.QueryParser.AggregateByTimeQuerySyntaxContext;
import static org.herring.manager.query.QueryParser.DAYS;
import static org.herring.manager.query.QueryParser.HOURS;
import static org.herring.manager.query.QueryParser.MINUTES;
import static org.herring.manager.query.QueryParser.MONTHS;

/**
 * @author Chiwan Park
 * @since 0.1
 */
public class AggregateByTimeBuilder {
    public static AggregateByTimeCommand build(QueryBuilder builder, AggregateByTimeQuerySyntaxContext context) {
        AggregateCommand command = (AggregateCommand) builder.visit(context.aggregateExpression());
        int timeValue = Integer.valueOf(context.timeValue.getText());

        // TODO: 매 개월마다 알맞는 timeValue를 선택할 수 있도록 해야함.
        switch (context.timeUnit.getType()) {
            case MONTHS:
                timeValue *= 30;
            case DAYS:
                timeValue *= 24;
            case HOURS:
                timeValue *= 60;
            case MINUTES:
                timeValue *= 60;
        }

        return new AggregateByTimeCommand(command.getAggregateFunction(), AggregateMethod.TIME, command.getAggregatedField(), command.getResultField(), new NumberType(timeValue));
    }
}
