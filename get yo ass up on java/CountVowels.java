import java.util.Scanner;

/**
 * CountVowels
 */

public class CountVowels {
    public static int countVowels(String word){
        word = word.toLowerCase();

        int count = 0;

        String vowels = "aeiou";

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (vowels.contains(String.valueOf(currentChar))) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int result = countVowels(word);
        System.out.println(result);
        sc.close();
    }
}