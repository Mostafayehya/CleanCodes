package fundamentals.functions.form;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Arrays;

public class LychrelGenerator {

    public int convergesAtIteration(int n, int limit) {
        if (!isPalindrome(n)) {
            int r = reverse(n);
            int sum = n + r;
            if (!isPalindrome(sum))
                return 2;
            else
                return 1;
        } else {
            return 0;
        }
    }

    public int reverse(int n) {
        char[] nDigits = Integer.toString(n).toCharArray();
        char[] rDigits = new char[nDigits.length];
        int lastIndex = nDigits.length - 1;

        for (int i = 0; i < nDigits.length; i++)
            rDigits[i] = nDigits[lastIndex - i];

        int reversedInteger = Integer.valueOf(String.valueOf(rDigits));
        return reversedInteger;
    }

    public boolean isPalindrome(int n) {
        String digits = Integer.toString(n);
        int lastIndex = digits.length() - 1;
        for (int i = 0; i < digits.length(); i++) {
            if (digits.charAt(i) != digits.charAt(lastIndex - i))
                return false;
        }
        return true;
    }
}
