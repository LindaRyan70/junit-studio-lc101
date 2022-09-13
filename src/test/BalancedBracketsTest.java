package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void openedAndClosedBracketReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void stringInsideBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void nestedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void testBracketsInsideOutFramingWordReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("I ]am[ Ironman."));
    }

    @Test
    public void bracketInWrongOrderReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void onlyOpenBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void twoStatements() {
        String hello = "[Hello]";
        String world = "Wo][rld";

        assertEquals(!BalancedBrackets.hasBalancedBrackets(hello), BalancedBrackets.hasBalancedBrackets(world));
    }

    @Test
    public void onlyClosedBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void onlySingleBracketsInterlacedReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void oneSetOfCharactersBeforeContent() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void mismatchedNumberOfBracesReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]][[[][][]"));
    }
}
