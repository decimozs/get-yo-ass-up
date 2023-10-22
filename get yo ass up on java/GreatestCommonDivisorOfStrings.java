import java.util.Scanner;

/**
 * GreatestCommonDivisorOfStrings
 */

public class GreatestCommonDivisorOfStrings {
    public static String gcdOfStrings(String text1, String text2) {
        if (!(text1 + text2).equals(text2 + text1)) {
            return "";
        }
        
        int length = gcd(text1.length(), text2.length());

        return text1.substring(0, length);
    }

    private static int gcd(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }

        return gcd(number2, number1 % number2);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text1 = sc.nextLine();
        String text2 = sc.nextLine();
        String result = gcdOfStrings(text1, text2);
        System.out.println(result);

        sc.close();
    }
}