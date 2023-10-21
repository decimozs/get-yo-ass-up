import java.util.Scanner;

/**
 * LongestCommonPrefix
 */

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] string) {
        if (string == null || string.length == 0) {
            return "";
        }

        String result = string[0];

        for (int i = 0; i < string.length; i++) {
            String current = string[i];
            int j = 0;

            while (j < result.length() && j < current.length() && result.charAt(j) == current.charAt(j)) {
                j++;
            }

            result = result.substring(0, j);

            if (result.isEmpty()) {
                return "";
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = {"flour", "flow", "flight"};
        String result = longestCommonPrefix(words);
        System.out.println(result);
    }
}