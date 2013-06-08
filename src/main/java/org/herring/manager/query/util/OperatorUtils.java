package org.herring.manager.query.util;

import static org.herring.core.manager.query.FilterCommand.Operator;
import static org.herring.manager.query.QueryParser.*;

/**
 * @author Chiwan Park
 * @since 0.1
 */
public class OperatorUtils {
    public static Operator get(int type) {
        switch (type) {
            case EQUAL:
                return Operator.EQ;
            case NOT_EQUAL:
                return Operator.NEQ;
            case LESS_THAN:
                return Operator.LT;
            case LESS_THAN_OR_EQUAL:
                return Operator.LTE;
            case GREATER_THAN:
                return Operator.GT;
            case GREATER_THAN_OR_EQUAL:
                return Operator.GTE;
            case IN:
                return Operator.IN;
            case NOT_IN:
                return Operator.NOT_IN;
        }

        return null;
    }

    public static Operator not(Operator operator) {
        switch (operator) {
            case EQ:
                return Operator.NEQ;
            case NEQ:
                return Operator.EQ;
            case LT:
                return Operator.GTE;
            case LTE:
                return Operator.GT;
            case GT:
                return Operator.LTE;
            case GTE:
                return Operator.LT;
            case IN:
                return Operator.NOT_IN;
            case NOT_IN:
                return Operator.IN;
        }

        return null;
    }
}
