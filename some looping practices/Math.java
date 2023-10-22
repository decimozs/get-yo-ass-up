
/**
 * Math
 */

public class Math {

    // greatest common divisor function
    public static int gcd (int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }

        return gcd (number2, number1 % number2);
    }

    // least common multiple function
    public static int lcm (int number1, int number2) {
        int gcd = gcd(number1, number2);

        return (number1 * number2) / gcd;
    }

    // odd or even number function
    public static String oddOrEven (int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

}