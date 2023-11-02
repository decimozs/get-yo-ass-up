/**
 * FindNumbersWithEvenNumberOfDigits
 */
public class FindNumbersWithEvenNumberOfDigits {
    public static int findNumbers(int[] nums) {
        int evens = 0;

        for (int i = 0; i < nums.length; i++) {
            int digits = String.valueOf(nums[i]).length();
            if (digits % 2 == 0 && nums[i] > 10) {
                evens++;
            }
        }

        return evens;
    }
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int[] nums2 = {555,901,482,1771};
        int rs1 = findNumbers(nums);
        int rs2 = findNumbers(nums2);
        System.out.println(rs1);
        System.out.println(rs2);
    }
}