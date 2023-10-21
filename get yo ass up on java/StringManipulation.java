import java.util.Scanner;

/**
 * [Problem]
 * StringManipulation
 */

/**
 * [Description]
 * Write a program that takes a sentence and performs various string manipulations, 
 * such as counting the number of words, reversing the sentence, and converting it 
 * to uppercase or lowercase.
 */

/**
 * [Solution]
 * 1. Take a input of string.
 * 2. Based on the input, we must count the number of characters of word on the string.
 * 3. Reverse the string.
 * 4. Convert it to lowercase and uppercase
 */

public class StringManipulation {
    static void stringManipulation(String string) {
        String[] words = string.split("\\s");
        int numberOfWords = words.length;
        String reversedString = new StringBuilder(string).reverse().toString();
        String convertLowerCase = string.toLowerCase();
        String convertUpperCase = string.toUpperCase();

        System.out.println("Number of words: " + numberOfWords);
        System.out.println("Reversed string: " + reversedString);
        System.out.println("Lower case: " + convertLowerCase);
        System.out.println("Upper case: " + convertUpperCase);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        stringManipulation(text);

        sc.close();
    }
}