package problemsolving;

import com.sun.javaws.IconUtil;

import java.util.*;

public class Karat {

    public static class FirstProblem {
        public static String findEmbeddedWord(String[] words, String string1) {
            Map<Character, Integer> string1Map = generateOccurenceMap(string1);
            for (String word : words)
                if (isFound(string1Map, word)) return word;

            return null;
        }

        private static boolean isFound(Map<Character, Integer> string1Map, String word) {
            Map<Character, Integer> wordMap = generateOccurenceMap(word);
            for (Character c : wordMap.keySet())
                if (wordMap.getOrDefault(c, 0) > string1Map.getOrDefault(c, 0))
                    return false;

            return true;
        }

        private static Map<Character, Integer> generateOccurenceMap(String string1) {
            Map<Character, Integer> string1Map = new HashMap<>();
            for (int i = 0; i < string1.length(); i++) {
                Character c = string1.charAt(i);
                Integer occurence = string1Map.getOrDefault(c, 0);
                string1Map.put(c, ++occurence);
            }
            return string1Map;
        }
    }

    public static class FirstProblem_SecondSolution {

        public static String findEmbeddedWord(String[] words, String string) {

            Map<Character, Integer> charCount = generateCharCountMap(string);

            for (String word : words) {
                Map<Character, Integer> wordCharCount = generateCharCountMap(word);

                boolean match = true;
                for (int i = 0; i < word.length(); i++) {
                    Character c = word.charAt(i);
                    if (wordCharCount.getOrDefault(c, 0) > charCount.getOrDefault(c, 0))
                        match = false;
                }

                if (match) return word;
            }
            return null;
        }

        public static Map<Character, Integer> generateCharCountMap(String s) {
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                Character c = s.charAt(i);
                Integer count = map.getOrDefault(c, 0);
                map.put(c, ++count);
            }
            return map;
        }


    }

    public static class SecondProblem_DFS {

        static Character[][] grid;
        static List<Integer[]> result = new ArrayList<>();

        public static List<Integer[]> findWordLocation(Character[][] matrix, String word) {
            grid = matrix;
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[0].length; col++) {
                    result = new ArrayList<>();
                    recurse(word, 0, row, col);
                    if (!result.isEmpty()) {
                        Collections.reverse(result);
                        return result;
                    }

                }
            }
            return result;
        }

        public static void recurse(String word, int index, int row, int col) {

            if (row >= grid.length || col >= grid[0].length)
                return;

            if (index >= word.length() || word.charAt(index) != grid[row][col])
                return;

            if (result.isEmpty()) {
                recurse(word, index + 1, row, col + 1);
            }
            if (result.isEmpty()) {
                recurse(word, index + 1, row + 1, col);
            }

            if (index >= word.length() - 1 || !result.isEmpty()) {
                result.add(new Integer[]{row, col});
            }
        }

    }

    public static class SeconSet_FirstProblem {

        public static boolean isCompleteHand(String title) {
            System.out.println("Input: " + title);

            final Map<Character, Integer> mapWithoutTriples = generateMapWithoutTriples(title);
            System.out.println(mapWithoutTriples);

            boolean isPair = false;

            for (Character key : mapWithoutTriples.keySet()) {
                Integer value = mapWithoutTriples.get(key);

                if (value == 1)
                    return false;

                if (value == 2) {
                    if (isPair)
                        return false;
                    else
                        isPair = true;
                }

            }
            return isPair;
        }

        public static Map<Character, Integer> generateMapWithoutTriples(String s) {
            Map<Character, Integer> map = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                final char key = s.charAt(i);
                if (map.getOrDefault(key,0) == 3) {
                    map.put(key, 0);
                }
                int currentValue = map.getOrDefault(key, 0);
                map.put(key, currentValue + 1);
            }

            return map;
        }
    }

    public static class Disappear{

        public int disappear(int[][] grid,int x, int y){
            int p = 0 ;

            int k = grid[x][y];
            System.out.println(k);

            int row = grid.length;
            int col = grid[0].length;

        }
    }

}
