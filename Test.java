import java.util.Scanner;

/**
* Test
 */

public class Test {
    public static String longestCommonPrefix(String[] words) {
        if (words == null || words.length == 0) {
            return "";
        }

        String prefix = words[0];
        
        for (int i = 0; i < words.length; i++) {
            String current = words[i];
            int j = 0;

            while (j < prefix.length() && j < current.length() && prefix.charAt(j) == current.charAt(j)) {
                j++;
            }

            prefix = prefix.substring(0, j);
            
            if (prefix.isEmpty()) {
                return "";
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = {"flour", "flow", "flight"};
        String result = longestCommonPrefix(words);
        System.out.println(result);

        sc.close();
   }
}