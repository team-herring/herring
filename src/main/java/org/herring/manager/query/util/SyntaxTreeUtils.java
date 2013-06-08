package org.herring.manager.query.util;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.herring.core.manager.query.QueryCommand;
import org.herring.manager.query.QueryLexer;
import org.herring.manager.query.QueryParser;
import org.herring.manager.query.builder.QueryBuilder;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Queue;

/**
 * @author Chiwan Park
 * @since 0.1
 */
public class SyntaxTreeUtils {

    private static QueryBuilder BUILDER = new QueryBuilder();

    public static ParseTree buildTree(String query) throws IOException {
        ANTLRInputStream inputStream = new ANTLRInputStream(new ByteArrayInputStream(query.getBytes("utf-8")));
        QueryLexer lexer = new QueryLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        QueryParser parser = new QueryParser(tokenStream);

        return parser.querySyntax();
    }

    @SuppressWarnings("unchecked")
    public static Queue<QueryCommand> convertToCommandQueue(ParseTree tree) {
        return (Queue<QueryCommand>) BUILDER.visit(tree);
    }
}
