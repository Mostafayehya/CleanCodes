package tdd.romannumerals;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeralConverter {
    Map<Integer, String> map = new HashMap<>();

    public RomanNumeralConverter() {
        map.put(0, "N");
        map.put(1, "I");
        map.put(2, "II");
        map.put(7, "VII");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(90, "XC");
        map.put(100, "C");
    }

    String convertToRomanNumeral(int number) {
        if (!map.containsKey(number)) {
            if (number > 10 && number < 100) {
                return hanldeTwoDigits(number);
            }
            if (number > 100 && number < 1000) {
                return handleThreeDigits(number);
            }
        }
        return map.get(number);
    }

    private String handleThreeDigits(int number) {
        int ones = number % 10;
        int tens = (number ) % 10;
        int hundreds = (number / 100) % 10;

        return map.get(hundreds) + map.get(tens) + map.get(ones);
    }

    private String hanldeTwoDigits(int number) {
        int ones = number % 10;
        int tens = number - ones;
        return map.get(tens) + map.get(ones);
    }
}
