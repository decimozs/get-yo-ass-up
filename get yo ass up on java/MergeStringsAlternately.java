import java.util.Scanner;

/**
 * MergeStringsAlternately
 */

public class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        int length = word1.length() + word2.length();
        char[] merged = new char[length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < word1.length() && j < word2.length()) {
            merged[k++] = word1.charAt(i++);
            merged[k++] = word2.charAt(j++);
        }

        while (i < word1.length()) {
            merged[k++] = word1.charAt(i++);
        }
        
        while (j < word2.length()) {
            merged[k++] = word2.charAt(j++);
        }

        return new String(merged);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = "abcd";
        String word2 = "pq";
        String result = mergeAlternately(word1, word2);
        System.out.println(result);

        sc.close();
    }
}