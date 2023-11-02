
/**
 * OddNumbersPrintNegative
 */

public class OddNumbersPrintNegative {
    public static void oddNumbersPrintNegative(int[] array) {
        for (int i = 0; i <= array.length; i++) {
            if (i % 2 != 0) {
                System.out.print(" " + -i + " ");
            }
            else {
                System.out.print(i);
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        oddNumbersPrintNegative(numbers);
    }
}