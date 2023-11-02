import java.util.Arrays;

/**
 * PlusOne
 */
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int length = digits.length;

        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        int[] testCase = new int[length + 1];
        testCase[0] = 1;
        return testCase;
    }
    public static void main(String[] args) {
        int[] tc1 = {1,2,3};
        int[] tc2 = {4,3,2,1};
        int[] tc3 = {9};
        int[] rs1 = plusOne(tc1);
        int[] rs2 = plusOne(tc2);
        int[] rs3 = plusOne(tc3);
        System.out.println(Arrays.toString(rs1));
        System.out.println(Arrays.toString(rs2));
        System.out.println(Arrays.toString(rs3));

    }
}