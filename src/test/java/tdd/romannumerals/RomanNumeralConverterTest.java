package tdd.romannumerals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralConverterTest {
    private RomanNumeralConverter converter;


    @BeforeEach
    void setUp() {
        converter = new RomanNumeralConverter();
    }

    @Test
    void zeroTest() {
        assertEquals("N", converter.convertToRomanNumeral(0));
    }

    @Test
    void singleNumberTest() {
        assertEquals("I", converter.convertToRomanNumeral(1));
    }

    @Test
    void twoTest() {
        assertEquals("II", converter.convertToRomanNumeral(2));
    }

    @Test
    void handleElevenTest(){
        assertEquals("XI", converter.convertToRomanNumeral(11));
    }

    @Test
    void handleTwelveTest(){
        assertEquals("XII", converter.convertToRomanNumeral(12));
    }

    @Test
    void handleFortySevenTest(){
        assertEquals("XLVII", converter.convertToRomanNumeral(47));
    }

    @Test
    void handleNintyNineTest(){
        assertEquals("XCIX", converter.convertToRomanNumeral(99));
    }

    @Test
    void handleThreeDigitsTest(){
        assertEquals("CI", converter.convertToRomanNumeral(101));
    }
    @Test
    void handleMoreTrickyThreeDigitsTest(){
        assertEquals("CXI", converter.convertToRomanNumeral(111));
    }


}