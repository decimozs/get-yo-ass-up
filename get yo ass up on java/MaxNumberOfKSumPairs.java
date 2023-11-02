import java.util.Arrays;

/**
 * MaxNumberOfKSumPairs
 */
public class MaxNumberOfKSumPairs {
    public static int numberOfKSumPairs(int[] nums, int k) {
        Arrays.sort(nums);

        int pairs = 0;

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == k) {
                left++;
                right--;
                pairs++;
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }

        return pairs;
    }

    public static void main(String[] args) {
        int[] tc1 = {1,2,3,4};
        int[] tc2 = {3,1,3,4,3};
        int rs1 = numberOfKSumPairs(tc1, 5);
        int rs2 = numberOfKSumPairs(tc2, 6);
        System.out.println(rs1);
        System.out.println(rs2);
    }
}