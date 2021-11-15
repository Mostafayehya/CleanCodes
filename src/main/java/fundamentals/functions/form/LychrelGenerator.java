package fundamentals.functions.form;

import java.math.BigInteger;

public class LychrelGenerator {

    public int convergesAtIteration(BigInteger n, int iteration, int limit) {
        if (!isPalindrome(n) && iteration < limit)
            return convergesAtIteration(n.add(reverse(n)), iteration + 1, limit);
        else
            return iteration;
    }


    public BigInteger reverse(BigInteger n) {
        char[] nDigits = n.toString().toCharArray();
        char[] rDigits = new char[nDigits.length];
        int lastIndex = nDigits.length - 1;

        for (int i = 0; i < nDigits.length; i++)
            rDigits[i] = nDigits[lastIndex - i];

        BigInteger reversedInteger = new BigInteger(String.valueOf(rDigits));
        return reversedInteger;
    }

    public boolean isPalindrome(BigInteger n) {
        String digits = n.toString();
        int lastIndex = digits.length() - 1;
        for (int i = 0; i < digits.length(); i++) {
            if (digits.charAt(i) != digits.charAt(lastIndex - i))
                return false;
        }
        return true;
    }
}
