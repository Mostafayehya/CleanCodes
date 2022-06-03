package problemsolving;


import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class KaratTest {
    String[] words;
    Character[][] grid1={
            {'c','c','x','t','i','p'},
            {'c','c','a','t','n','i'},
            {'a','c','n','n','t','t'},
            {'t','c','s','i','p','t'},
            {'a','o','o','o','a','a'},
            {'o','a','a','a','o','o'},
            {'k','a','i','c','k','i'},
    };

    @Before
    public void setUp() throws Exception {

        words = new String[]{"cat", "baby", "dog", "bird", "car", "ax"};

    }

    @Test
    public void embeddedWord_Example1() {
        String string1 = "tcabnihjs";
        assertTrue(Karat.FirstProblem.findEmbeddedWord(words, string1).contains("cat"));
        assertTrue(Karat.FirstProblem_SecondSolution.findEmbeddedWord(words, string1).contains("cat"));
    }

    @Test
    public void embeddedWord_Example2() {
        String string1 = "baykkjl";
        assertNull(Karat.FirstProblem.findEmbeddedWord(words, string1));
        assertNull(Karat.FirstProblem_SecondSolution.findEmbeddedWord(words, string1));
    }

    @Test
    public void embeddedWord_Example3() {
        String string1 = "tcabnihjs";
        assertTrue(Karat.FirstProblem.findEmbeddedWord(words, string1).contains("cat"));
        assertTrue(Karat.FirstProblem_SecondSolution.findEmbeddedWord(words, string1).contains("cat"));
    }

    @Test
    public void embeddedWord_Example4() {
        String string1 = "bbabylkkj";
        assertTrue(Karat.FirstProblem.findEmbeddedWord(words, string1).contains("baby"));
        assertTrue(Karat.FirstProblem_SecondSolution.findEmbeddedWord(words, string1).contains("baby"));
    }

    @Test
    public void embeddedWord_Example5() {
        String string1 = "ccc";
        assertNull(Karat.FirstProblem.findEmbeddedWord(words, string1));
        assertNull(Karat.FirstProblem_SecondSolution.findEmbeddedWord(words, string1));
    }

    @Test
    public void embeddedWord_Example6() {
        String string1 = "breadmaking";
        assertTrue(Karat.FirstProblem.findEmbeddedWord(words, string1).contains("bird"));
        assertTrue(Karat.FirstProblem_SecondSolution.findEmbeddedWord(words, string1).contains("bird"));
    }

/*    @Test
    public void firstSet_SecondProblem_firstTest() throws Exception {

        String s = "catnip";
        int[][] expected ={
                {1,1},
                {1,2},
                {1,3},
                {2,3},
                {3,3},
                {3,4},
        };
        assertTrue(Arrays.deepEquals(expected, Karat.SecondProblem_DFS.findWordLocation(grid1, "catnip").toArray()));
    }*/

    @Test
    public void isCompleteHand_1() throws Exception {

        assertTrue(Karat.SeconSet_FirstProblem.isCompleteHand("11133555"));
        assertTrue(Karat.SeconSet_FirstProblem.isCompleteHand("00000111"));
        assertTrue(Karat.SeconSet_FirstProblem.isCompleteHand("13233121"));
        assertTrue(Karat.SeconSet_FirstProblem.isCompleteHand("99999999"));
        assertTrue(Karat.SeconSet_FirstProblem.isCompleteHand("99"));
        assertTrue(Karat.SeconSet_FirstProblem.isCompleteHand("88888844"));
        assertTrue(Karat.SeconSet_FirstProblem.isCompleteHand("77777777777777"));
        assertFalse(Karat.SeconSet_FirstProblem.isCompleteHand("111333555"));
        assertFalse(Karat.SeconSet_FirstProblem.isCompleteHand("11223344555"));
        assertFalse(Karat.SeconSet_FirstProblem.isCompleteHand("999999999"));
        assertFalse(Karat.SeconSet_FirstProblem.isCompleteHand("9"));
        assertFalse(Karat.SeconSet_FirstProblem.isCompleteHand("000022"));
        assertFalse(Karat.SeconSet_FirstProblem.isCompleteHand("888889"));
        assertFalse(Karat.SeconSet_FirstProblem.isCompleteHand("889"));
        assertFalse(Karat.SeconSet_FirstProblem.isCompleteHand("1111111"));
        assertFalse(Karat.SeconSet_FirstProblem.isCompleteHand("1111122222"));
    }
}