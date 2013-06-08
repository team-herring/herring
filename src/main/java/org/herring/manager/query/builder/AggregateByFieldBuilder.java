package org.herring.manager.query.builder;

import org.herring.core.manager.query.AggregateByFieldCommand;
import org.herring.core.manager.query.AggregateCommand;
import org.herring.core.manager.query.types.FieldType;

import static org.herring.core.manager.query.AggregateCommand.AggregateMethod;
import static org.herring.manager.query.QueryParser.AggregateByFieldQuerySyntaxContext;

/**
 * @author Chiwan Park
 * @since 0.1
 */
public class AggregateByFieldBuilder {
    public static AggregateByFieldCommand build(QueryBuilder builder, AggregateByFieldQuerySyntaxContext context) {
        AggregateCommand command = (AggregateCommand) builder.visit(context.aggregateExpression());
        FieldType groupField = new FieldType(context.groupVar.getText());

        return new AggregateByFieldCommand(command.getAggregateFunction(), AggregateMethod.FIELD, command.getAggregatedField(), command.getResultField(), groupField);
    }
}
