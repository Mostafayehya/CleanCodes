package fundamentals.functions.form;


import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class LychrelTest {
    LychrelGenerator lychrelGenerator;
    private final int LIMIT = 1000;

    @Before
    public void setup() {
        lychrelGenerator = new LychrelGenerator();
    }

    @Test
    public void facts() throws Exception {
        isNotLychrel(1, 0);
        isNotLychrel(2, 0);
        isNotLychrel(10, 1);
        isNotLychrel(11, 0);
        isNotLychrel(19, 2);
        isNotLychrel(59, 3);
        isNotLychrel(78, 4);
        isNotLychrel(89, 24);

        isProbableLychrel(196);

    }

    private void isProbableLychrel(int i) {
        isNotLychrel(i, LIMIT);
    }

    private void isNotLychrel(int n, int iteration) {
        assertEquals(iteration, lychrelGenerator.convergesAtIteration(BigInteger.valueOf(n),0,LIMIT));
    }

    @Test
    public void palindromes() throws Exception {
        isPalindrome(1);
        isPalindrome(11);
        isPalindrome(121);
        isPalindrome(121);
        isPalindrome(12321);
    }

    private void isPalindrome(int n) {
        assertTrue(lychrelGenerator.isPalindrome(BigInteger.valueOf(n)));
    }

    @Test
    public void nonPalindromes() throws Exception {
        isNotPalindrome(10);
        isNotPalindrome(12331);
    }

    private void isNotPalindrome(int n) {
        assertFalse(lychrelGenerator.isPalindrome(BigInteger.valueOf(n)));
    }

    @Test
    public void reversals() throws Exception {
        reversed(21, 12);
        reversed(1, 1);
        reversed(121, 121);
        reversed(3344, 4433);
    }

    private void reversed(int first, int second) {
        assertEquals(BigInteger.valueOf(first), lychrelGenerator.reverse(BigInteger.valueOf(second)));
    }
}
