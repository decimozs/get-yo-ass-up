import java.util.Scanner;

/**
 * [Problem]
 * Reverse a string
 */

/**
 * [Description]
 * Write a Java program that takes a user input string and reverses it. 
 * You should reverse the characters in the string without using any built-in string reverse functions.
 */

/**
 * [Solution]
 * 1. Reverse the string.
 * 2. Iterate trough the text and start on the length - 1 of the text.
 * 3. Append all the characters of the text.
 */

public class ReverseString {
    static String reverseString(String string) {

        String reversed = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            reversed += string.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String reversedWord = reverseString(text);
        System.out.println(reversedWord);

        sc.close();
    }
}