import java.util.Scanner;

/**
 * [Problem]
 * Palindromes
 */

/**
 * [Description]
 * Create a Java program that checks whether a given string is a palindrome or not. 
 * A palindrome is a word, phrase, or sequence of characters that reads the same forwards and backwards.
 */

/**
 * [Solution]
 * 1. Remove any spaces and convert the string to lowercase or uppercase to ensure case-sensistive comparison.
 * 2. Compare the string with its reverse. If they are the same, the string is palindrome.
 */

public class Palindromes {
    static boolean palindromeCheck(String word) {
        word = word.replaceAll("\\s", "").toLowerCase();
        String reversedWord = new StringBuilder(word).reverse().toString();

        if (!word.equals(reversedWord)) {
            return false; 
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        boolean palindrome = palindromeCheck(word);

        if (palindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome!");
        }

        sc.close();
    }
}
