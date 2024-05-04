package csen1002.main.compiler_assignment_2;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class taskRunner {
    public static void main(String[] args) {
        taskLexer lexer = new taskLexer(CharStreams.fromString("a b"));
        taskParser parser = new taskParser(new CommonTokenStream(lexer));
        System.out.println(parser.s().check);
    }
}
