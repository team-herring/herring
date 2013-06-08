package org.herring.manager.query.tests;

import org.antlr.v4.runtime.tree.ParseTree;
import org.herring.core.manager.query.QueryCommand;
import org.herring.manager.query.util.SyntaxTreeUtils;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Queue;

import static org.herring.core.manager.query.QueryCommand.CommandType.AGGREGATE;
import static org.herring.core.manager.query.QueryCommand.CommandType.FILTER;
import static org.herring.core.manager.query.QueryCommand.CommandType.LOAD;
import static org.herring.core.manager.query.QueryCommand.CommandType.MERGE;
import static org.herring.core.manager.query.QueryCommand.CommandType.RETURN;

/**
 * @author Chiwan Park
 * @since 0.1
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
// TODO: 단순한 검증 뿐 아니라 심도 있는 검증 필요.
public class QueryBuilderTest {

    @Test
    public void testAskQuery() throws Exception {
        ParseTree syntaxTree = SyntaxTreeUtils.buildTree("ask @sample between 2013-05-15 and 2015-05-15T00:00:30");
        Queue<QueryCommand> commandQueue = SyntaxTreeUtils.convertToCommandQueue(syntaxTree);

        Assert.assertEquals(2, commandQueue.size());
        Assert.assertEquals(LOAD, commandQueue.poll().getType());
        Assert.assertEquals(RETURN, commandQueue.poll().getType());
    }

    @Test
    public void testFilterQuery() throws Exception {
        ParseTree syntaxTree = SyntaxTreeUtils.buildTree("ask @sample in 15 minutes | filter not ((@a=55 and 'simple' in @b) or @b>30)");
        Queue<QueryCommand> commandQueue = SyntaxTreeUtils.convertToCommandQueue(syntaxTree);

        Assert.assertEquals(7, commandQueue.size());
        Assert.assertEquals(LOAD, commandQueue.poll().getType());
        Assert.assertEquals(FILTER, commandQueue.poll().getType());
        Assert.assertEquals(FILTER, commandQueue.poll().getType());
        Assert.assertEquals(MERGE, commandQueue.poll().getType());
        Assert.assertEquals(FILTER, commandQueue.poll().getType());
        Assert.assertEquals(MERGE, commandQueue.poll().getType());
        Assert.assertEquals(RETURN, commandQueue.poll().getType());
    }

    @Test
    public void testAggregateQuery() throws Exception {
        ParseTree syntaxTree = SyntaxTreeUtils.buildTree("ask @sample in 20 minutes | aggregate @count=COUNT(@value) by time 10minutes");
        Queue<QueryCommand> commandQueue = SyntaxTreeUtils.convertToCommandQueue(syntaxTree);

        Assert.assertEquals(3, commandQueue.size());
        Assert.assertEquals(LOAD, commandQueue.poll().getType());
        Assert.assertEquals(AGGREGATE, commandQueue.poll().getType());
        Assert.assertEquals(RETURN, commandQueue.poll().getType());
    }

    @Test
    public void testComplexQuery() throws Exception {
        ParseTree syntaxTree = SyntaxTreeUtils.buildTree("ask @sample between 2013-05-20 and 2013-05-25 | filter @a=55 and 'hello' not in @b | aggregate @count=count(@value) by @b | filter @count > 30");
        Queue<QueryCommand> commandQueue = SyntaxTreeUtils.convertToCommandQueue(syntaxTree);

        Assert.assertEquals(7, commandQueue.size());
        Assert.assertEquals(LOAD, commandQueue.poll().getType());
        Assert.assertEquals(FILTER, commandQueue.poll().getType());
        Assert.assertEquals(FILTER, commandQueue.poll().getType());
        Assert.assertEquals(MERGE, commandQueue.poll().getType());
        Assert.assertEquals(AGGREGATE, commandQueue.poll().getType());
        Assert.assertEquals(FILTER, commandQueue.poll().getType());
        Assert.assertEquals(RETURN, commandQueue.poll().getType());
    }
}
