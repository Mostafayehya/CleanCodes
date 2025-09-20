package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*

The task in this section is to build a baby calculator in TDD style.
We are building our own calculator with a minimal set of features.
Write a function that takes two parameters and returns the multiplication without using the multiplication operator

 */
class CalculatorTest {

    @Test
    void zeroTest() {
        assertEquals(0, multiply(0, 0));
    }

    @Test
    void oneTimeOneTest() {
        assertEquals(1, multiply(1, 1));
    }

    @Test
    void handleZeroAsMultiplier() {
        assertEquals(0, multiply(1, 0));
    }

    @Test
    void handleZeroAsFirstParameter() {
        assertEquals(0, multiply(0, 1));
    }

    @Test
    void handlingNegativeFirsts() {
        assertEquals(0, multiply(-1, 0));
    }

    @Test
    void handlingNegativeMultiplier() {
        assertEquals(0, multiply(0, -1));
    }

    @Test
    void handleBothNegatives() {
        assertEquals(1, multiply(-1, -1));
    }

    @Test
    void handleNegativeMultiplier() {
        assertEquals(-4, multiply(2, -2));
    }

    @Test
    void handleNegativeFirst() {
        assertEquals(-6, multiply(-2, 3));
    }


    @Test
    void handleBigNumbers() {
        assertEquals(15, multiply(5, 3));
    }

    private int multiply(int first, int multiplier) {
        if (first == 0 || multiplier == 0) return 0;

        if (first == 1) return multiplier;
        if (multiplier == 1) return first;

        int signed = 0;
        int result = 0;

        if (multiplier < 0 || first < 0) {
            signed = 1;
        }

        if (multiplier < 0 && first < 0) {
            signed = 0;
        }

        first = Math.abs(first);
        multiplier = Math.abs(multiplier);

        for (int i = 0; i < multiplier; i++) {
            result += first;
        }

        return signed == 1 ? -result : result;
    }
}
