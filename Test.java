import java.util.Scanner;

/**
* Test
 */

public class Test {
    private static int gcd (int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }

        return gcd(number2, number1 % number2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int result = gcd(number1, number2);
        System.out.println(result);

        sc.close();
   }
}