package fundamentals.functions.form;


import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

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
    }

    private void isNotLychrel(int n, int iteration) {
        assertEquals(iteration, lychrelGenerator.convergesAtIteration(n, LIMIT));
    }

    @Test
    public void palindromes() throws Exception {
        isPalindrome(1);
        isPalindrome(11);
        isPalindrome(121);
        isPalindrome(121);
        isPalindrome(12321);
    }

    @Test
    public void nonPalindromes() throws Exception {
        isNotPalindrome(10);
        isNotPalindrome(12331);
    }

    private void isNotPalindrome(int n) {
        assertFalse(lychrelGenerator.isPalindrome(n));
    }

    private void isPalindrome(int n) {
        assertTrue(lychrelGenerator.isPalindrome(n));
    }
}
