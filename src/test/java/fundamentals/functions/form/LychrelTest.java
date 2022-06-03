package fundamentals.functions.form;


import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;
import java.util.*;

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

    @Test
    public void twoDimentionalArrays() throws Exception {

        int n = 3, m = 6;
        int[][] two = new int[n][m];
        int counter = 0;
        for(int i = 0 ; i < n ; i++){
            for (int j = 0; j <m ; j++) {
                two[i][j] = counter;
                counter++;
                System.out.printf("two[%d][%d] = %d\n",i,j,counter);
            }
        }

        System.out.printf("two.length = %d",two.length);
        System.out.printf("two[0].length = %d",two[0].length);
        System.out.printf("two[3][0=.length = %d",two[2].length);

    }

    @Test
    public void testSet() throws Exception {

        Map<String,Integer> resultsMap = new HashMap<>();
        resultsMap.put("mo", 1);
        resultsMap.put("ye", 2);
        resultsMap.put("ah", 3);
        Integer maxValue = Collections.max(resultsMap.values());

        StringBuilder stringBuilder = new StringBuilder();
        resultsMap.forEach((k,v) ->{
            if(v == maxValue){

                stringBuilder.append(k);
            }
        });

        List<Integer[]> integerArrays = new ArrayList<>();
        integerArrays.add(new Integer[]{-6,1,5});
        integerArrays.add(new Integer[]{-8,3,5});
        integerArrays.add(new Integer[]{-8,2,6});

        integerArrays.sort((o1, o2) -> o1[0].compareTo(o2[0])
                + o1[1].compareTo(o2[1])
                + o1[2].compareTo(o2[2]));

        integerArrays.forEach(integers -> {
            System.out.println();
            Arrays.stream(integers).forEach(System.out::println);
        });
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
