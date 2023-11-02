/**
 * MaxConsecutiveOnes
 */
public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int consecutives = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                consecutives++;
                max = Math.max(max, consecutives);
            } else {
                consecutives = 0;
            }
        }

        return max;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,1,0,1,1,1};
        int[] nums2 = {1,0,1,1,0,1};
        int rs1 = findMaxConsecutiveOnes(nums1);
        int rs2 = findMaxConsecutiveOnes(nums2);
        System.out.println(rs1);
        System.out.println(rs2);
    }
}