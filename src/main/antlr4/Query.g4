grammar Query;

@header {
package org.herring.manager.query;
}

import CommonLexerRules ;

// Time Comparison
timeComparisonExpression
    : (leftVar=FIELD_IDENTIFIER | (leftValue=timeExpression))
      operator=(LESS_THAN | LESS_THAN_OR_EQUAL | GREATER_THAN | GREATER_THAN_OR_EQUAL | EQUAL | NOT_EQUAL)
      (rightVar=FIELD_IDENTIFIER | (rightValue=timeExpression))
    ;

// Number Comparision
numberComparisonExpression
    : left=(FIELD_IDENTIFIER | POSITIVE_INTEGER | NEGATIVE_INTEGER | POSITIVE_REAL | NEGATIVE_REAL)
      operator=(LESS_THAN | LESS_THAN_OR_EQUAL | GREATER_THAN | GREATER_THAN_OR_EQUAL | EQUAL | NOT_EQUAL)
      right=(FIELD_IDENTIFIER | POSITIVE_INTEGER | NEGATIVE_INTEGER | POSITIVE_REAL | NEGATIVE_REAL)
    ;

// String Comparision
stringComparisonExpression
    : left=(FIELD_IDENTIFIER | SMALL_QUOTED_STRING | LARGE_QUOTED_STRING)
      operator=(LESS_THAN | LESS_THAN_OR_EQUAL | GREATER_THAN | GREATER_THAN_OR_EQUAL | EQUAL | NOT_EQUAL | IN | NOT_IN)
      right=(FIELD_IDENTIFIER | SMALL_QUOTED_STRING | LARGE_QUOTED_STRING)
    ;

// Single Comparison
singleComparisonExpression
    : timeComparisonExpression
    | numberComparisonExpression
    | stringComparisonExpression
    ;

// Combined Comparison
combinedComparisonExpression
    : OPEN_BRACE combinedComparisonExpression CLOSE_BRACE               # comparisonWrappedExpression
    | left=combinedComparisonExpression AND right=combinedComparisonExpression     # comparisonAndCombinedExpression
    | left=combinedComparisonExpression OR right=combinedComparisonExpression      # comparisonOrCombinedExpression
    | NOT combinedComparisonExpression                                  # comparisonNotCombinedExpression
    | singleComparisonExpression                                        # comparisonSingleExpression
    ;

// Time Expression
timeExpression
    : date=DATE_LITERAL ('T' time=TIME_LITERAL)? ('Z' zone=ZONE_LITERAL)?
    ;

// Time Range Expression
timeRangeExpression
    : BETWEEN from=timeExpression AND to=timeExpression                         # absoluteTimeRangeExpression
    | IN timeValue=POSITIVE_INTEGER timeUnit=(DAYS | MONTHS | HOURS | MINUTES)  # relativeTimeRangeExpression
    ;

// Aggregate Detail Expression
aggregateExpression
    : AGGREGATE resultVar=FIELD_IDENTIFIER EQUAL function=(AVERAGE | COUNT | MIN | MAX | SUM | MEDIAN) OPEN_BRACE funcVar=FIELD_IDENTIFIER CLOSE_BRACE     # calcAggregateFunction
    ;

// ASK Query Syntax
askQuerySyntax
    : ASK table=FIELD_IDENTIFIER timeRangeExpression
    ;

// Filter Query Syntax
filterQuerySyntax
    : FILTER combinedComparisonExpression
    ;

// Aggregate Query Syntax
aggregateByFieldQuerySyntax
    : aggregateExpression BY groupVar=FIELD_IDENTIFIER
    ;

aggregateByTimeQuerySyntax
    : aggregateExpression BY TIME timeValue=POSITIVE_INTEGER timeUnit=(DAYS | MONTHS | HOURS | MINUTES)
    ;

optionalQuerySyntax
    : PIPE filterQuerySyntax
    | PIPE aggregateByFieldQuerySyntax
    | PIPE aggregateByTimeQuerySyntax
    ;

// All Query Syntax
querySyntax
    : askQuerySyntax optionalQuerySyntax+
    ;
