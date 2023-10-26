import java.util.Scanner;

/**
 * MergeStringsAlternately
 */

public class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        int word1Length = word1.length();
        int word2Length = word2.length();
        int i = 0;
        int j = 0;

        StringBuilder merged = new StringBuilder();

        while (i < word1Length || j < word2Length) {
            if (i < word1Length) {
                merged.append(word1.charAt(i++));
            }
            if (j < word2Length) {
                merged.append(word2.charAt(j++));
            }
        }

        return merged.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] testCases = {"abc", "123", "ab", "xyz", "abcdef", "123", "hello", "world"};

        for (int i = 0; i < testCases.length; i += 2) {
            String result = mergeAlternately(testCases[i], testCases[i + 1]);
            System.out.println(result);
        }

        sc.close();
    }
}