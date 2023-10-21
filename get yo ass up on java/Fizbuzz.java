import java.util.Scanner;

/**
 * [Problem]
 * Fizbuzz
 */

/*
 * [Description]
 * Fizzbuzz, take as input as a integer and print fizz if the number is divisible by 3, buzz if the number
 * is divisible by 5, fizzbuzz if the numbers is divisible by 3 and 5 else print all the numbers.
 */

/*
 * [Solution]
 * 1. Print fizz if the number is divisible by 3.
 * 2. Print buzz if the number is divisible by 5.
 * 3. Print fizzbuzz if the number is divisible by 3 and 5.
 * 4. Print all the numbers
 */

public class Fizbuzz {
    static void fizzBuzz(int number) {
        for (int i = 1; i <= number; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        fizzBuzz(number);

        sc.close();
    }
}