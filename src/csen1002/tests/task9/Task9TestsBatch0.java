package csen1002.tests.task9;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task9.Task9Lexer;
import csen1002.main.task9.Task9Parser;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task9TestsBatch0 {
	
    /**
     * Parses a provided string using Task 9's grammar
     * and gets the value of the attribute "check" of the variable "s"
     *
     * @param input a string to parse
     * @return the value of the attribute "check" of the variable "s"
     */
    public static int sCheckValue(String input) {
        Task9Lexer lexer = new Task9Lexer(CharStreams.fromString(input));
        Task9Parser parser = new Task9Parser(new CommonTokenStream(lexer));
        return parser.s().check;
    }

	@Test
	public void testString1() {
		assertEquals(1, sCheckValue("1000000000000#0100000000000#0010000000000#0001000000000#0000100000000#0000010000000#0000001000000#0000000100000#0000000010000#0000000001000"));
	}

	@Test
	public void testString2() {
	    assertEquals(0, sCheckValue("0101000110111011#0111101100111110#1001010110111000#0111011011110010#1011110000001011#1100011010000101#1001111011101100#0010001111011000#1000100010111011#0010010100101101#1011111000101010#0111111001000011#1011001100110110#1111011100101001#1010000101011101#0101000010101111"));
	}

	@Test
	public void testString3() {
		assertEquals(0, sCheckValue("1101110011#1100100101#0100000111#1000010111#1101110100#0011010111#1000010111#1100101101#1001111001#0110101111"));
	}

	@Test
	public void testString4() {
		assertEquals(0, sCheckValue("00111010101100#01100100001000#01001100001100#00110110000101#01001100111010#11000100011001#01011110010001#00010100100101#00011101011111#10001110010111#01000110100001#00001011100111#01100100111010#01110100111000"));
	}

	@Test
	public void testString5() {
		assertEquals(0, sCheckValue("1000101#0101000#0010000#0101011#1010101#1010000#1101011"));
	}

	@Test
	public void testString6() {
		assertEquals(0, sCheckValue("01010000#11111001#01000111#01000110#11011011#11011001#10111100#11011100"));
	}

	@Test
	public void testString7() {
		assertEquals(0, sCheckValue("01101111#00111111#11000101#11001111#10110100#01111000#01011100#10011000"));
	}

	@Test
	public void testString8() {
		assertEquals(0, sCheckValue("10011100010#00100100010#11111101101#01101001101#01011011100#10100001100#10110001111#10000011011#10100001000#10111000101#01001000111"));
	}

	@Test
	public void testString9() {
		assertEquals(1, sCheckValue("1000000#0100000#0010000#0001000#0000100#0000010#0000001"));
	}

	@Test
	public void testString10() {
		assertEquals(0, sCheckValue("10000000000000000000#010000000000000000000000#00100000000000000000#0001000000000000000000#00001000000000000000000000#0000010000000000000000000000#0000001000000000000000000#000000010000000#00000000100000000000"));
	}

}
