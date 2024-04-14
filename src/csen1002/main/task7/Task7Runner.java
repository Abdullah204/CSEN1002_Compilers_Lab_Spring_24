// Make Sure that the package is "csen1002.main.task7"
package csen1002.main.task7;

// Make sure that ANTLR is imported properly

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Vocabulary;

import java.util.List;
import java.util.StringJoiner;

// This file is just to test your code (DO NOT SUBMIT THIS FILE)
public class Task7Runner {

    /**
     * Returns a string of tokenized lexemes.
     *
     * @param input is the string to be tokenized.
     * @return Returns a formatted string representation of the list of tokens. The
     *         string representation follows the one in the task description
     */
    public static String tokenStream(String input) {
        // In case Task7Lexer is not defined correctly:
        // 1- If you modified the grammar in the g4 file, regenerate the ANTLR
        // recognizer to make sure that the latest grammar is generated
        // 2- Make sure that the location and the package are configured properly
        Task7Lexer lexer = new Task7Lexer(CharStreams.fromString(input));
        Vocabulary vocabulary = lexer.getVocabulary();
        List<? extends Token> tokens = lexer.getAllTokens();
        StringJoiner stringJoiner = new StringJoiner(";");
        for (Token token : tokens) {
            stringJoiner.add(token.getText() + "," + vocabulary.getSymbolicName(token.getType()));
        }
        return stringJoiner.toString();
    }

    public static void main(String[] args) {
        System.out.println(tokenStream("1110"));
    }

}
