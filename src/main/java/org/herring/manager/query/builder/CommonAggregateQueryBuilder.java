package org.herring.manager.query.builder;

import org.herring.core.manager.query.AggregateCommand;
import org.herring.core.manager.query.types.FieldType;

import static org.herring.core.manager.query.AggregateCommand.AggregateFunction;
import static org.herring.manager.query.QueryParser.*;

/**
 * @author Chiwan Park
 * @since 0.1
 */
public class CommonAggregateQueryBuilder {
    public static AggregateCommand build(QueryBuilder builder, CalcAggregateFunctionContext context) {
        FieldType resultVar = new FieldType(context.resultVar.getText());
        FieldType funcVar = new FieldType(context.funcVar.getText());
        AggregateFunction function = getFunction(context.function.getType());

        return new AggregateCommand(function, null, funcVar, resultVar);
    }

    public static AggregateFunction getFunction(int functionType) {
        switch (functionType) {
            case AVERAGE:
                return AggregateFunction.AVERAGE;
            case SUM:
                return AggregateFunction.SUM;
            case MIN:
                return AggregateFunction.MIN;
            case MAX:
                return AggregateFunction.MAX;
            case MEDIAN:
                return AggregateFunction.MEDIAN;
            case COUNT:
                return AggregateFunction.COUNT;
        }

        return null;
    }
}
