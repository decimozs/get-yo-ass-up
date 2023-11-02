import java.util.Arrays;

/**
 * SquaresOfASortedArray
 */
public class SquaresOfASortedArray {
    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);

        return nums;
    }
    public static void main(String[] args) {
        int[] tc1 = {-4,-1,0,3,10};
        int[] tc2 = {-7,-3,2,3,11};
        int[] rs1 = sortedSquares(tc1);
        int[] rs2 = sortedSquares(tc2);
        System.out.println(Arrays.toString(rs1));
        System.out.println(Arrays.toString(rs2));
    }
}