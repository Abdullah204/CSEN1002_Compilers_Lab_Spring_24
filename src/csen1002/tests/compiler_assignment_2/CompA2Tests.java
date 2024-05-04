package csen1002.tests.compiler_assignment_2;

import csen1002.main.compiler_assignment_2.taskLexer;
import csen1002.main.compiler_assignment_2.taskParser;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.Test;

public class CompA2Tests {
    public static int getCheck(String input) {
        taskLexer lexer = new taskLexer(CharStreams.fromString(input));
        taskParser parser = new taskParser(new CommonTokenStream(lexer));
        return (parser.s().check);
    }

    @Test
    public void testEmptyStringCheckIsZero() {
        assertEquals(0, getCheck(""));
    }

    @Test
    public void testSingleAStringCheckIsOne() {
        assertEquals(0, getCheck("a"));
    }

    @Test
    public void testSingleBStringCheckIsZero() {
        assertEquals(0, getCheck("b"));
    }

    @Test
    public void testSingleWSStringCheckIsZero() {
        assertEquals(0, getCheck(" "));
    }

    @Test
    public void testOddFalse() {
        assertEquals(0, getCheck("abb"));
    }

    @Test
    public void testOddTrue() {
        assertEquals(0, getCheck("aaaab"));
    }

    @Test
    public void testEvenTrue() {
        assertEquals(1, getCheck("ab"));
    }

    @Test
    public void testEvenFalse() {
        assertEquals(0, getCheck("ba"));
        assertEquals(0, getCheck("aa"));
    }

    @Test
    public void testEvenTrueWithWS() {
        assertEquals(1, getCheck("a b"));
    }

    @Test
    public void testLongEvenEqualNumberOfAs() {
        String s = "ababababababab";
        assertEquals(0, getCheck(s + s));
    }

    @Test
    public void testLongOddEqualNumberOfAs() {
        String s = "ababababababab";
        assertEquals(0, getCheck(s + s + "b"));
        assertEquals(0, getCheck("b" + s + s));
    }

    @Test
    public void testLongEvenNumberOfAsInRightMore() {
        String s = "abab";
        assertEquals(0, getCheck(s + s + "aa"));
    }

    @Test
    public void testLongEvenNumberOfAsInLeftMore() {
        String s = "ababababababaabababababaabab";
        assertEquals(1, getCheck("aa" + s + s));
    }

}
