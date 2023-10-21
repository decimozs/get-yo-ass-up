import java.util.Arrays;
import java.util.Scanner;

/**
 * [Problem]
 * Anagram
 */

/**
 * [Description]
 * Write a Java program that checks if two strings are anagrams of each other. An anagram is a word or phrase 
 * formed by rearranging the letters of another word or phrase, using all the original letters exactly once.
 */

/**
 * [Solution]
 * 1. Remove any spaces and convert both strings to lowercase or uppercase to ensure a case-sensitive comparison.
 * 2. Check if the lengths are equal. If false then they cannot be a anagram.
 * 3. Sort the characters of both strings(word).
 * 4. Compare the sorted strings if both are equal they are anagram.
 */

public class Anagrams {
    static boolean anagramCheck(String word1, String word2) {
        
        word1 = word1.replaceAll("\\s", "").toLowerCase();
        word2 = word2.replaceAll("\\s", "").toLowerCase();

        if (word1.length() != word2.length()) {
            return false;
        }

        char[] arrayChar1 = word1.toCharArray();
        char[] arrayChar2 = word2.toCharArray();

        Arrays.sort(arrayChar1);
        Arrays.sort(arrayChar2);

        if (!Arrays.equals(arrayChar1, arrayChar2)) {
            return false;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        boolean anagram = anagramCheck(word1, word2);

        if (anagram) {
            System.out.println("Anagram!");
        } else {
            System.out.println("Not a Anagram!");
        }

        sc.close();
    }
}