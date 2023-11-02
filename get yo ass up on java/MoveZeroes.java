import java.util.Arrays;

/**
 * MoveZeroes
 */

public class MoveZeroes {
    public static void moveZeroes(int[] nums){
        int nonZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                if (i != nonZeroIndex) {
                    nums[i] = 0; 
                }
                nonZeroIndex++;
            }
    }
}
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        int[] nums1 = {0};
        moveZeroes(nums);
        moveZeroes(nums1);
    }
}