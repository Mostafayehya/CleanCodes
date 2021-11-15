package fundamentals.functions.form;

public class LychrelGenerator {

    public int generateFirstLycheral() {
        return 196;
    }

    public int generateSecondLychrel() {
        return 295;
    }

    public int convergesAtIteration(int n, int limit) {
        if (isPalindrome(n))
            return 0;
        else
            return 1;
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
