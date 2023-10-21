import java.util.Scanner;

/**
 * RomanToInteger
 */

public class RomanToInteger {
    public static int romanToInt(String string) {
        int result = 0;
        int prev = 0;

        for (int i = string.length() - 1; i >= 0; i--) {
            char currentChar = string.charAt(i);
            int currentValue = romanValue(currentChar);

            if (currentValue < prev) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            prev = currentValue;
        }

        return result;
    }

    public static int romanValue(char character) {
        switch (character) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String roman = sc.nextLine();
        int result = romanToInt(roman);
        System.out.println(result);

        sc.close();
    }
}