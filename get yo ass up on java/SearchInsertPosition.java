/**
 * SearchInsertPosition
 */
public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int rigth = nums.length - 1;

        while (left <= rigth) {
            int mid = left + (rigth - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                rigth = mid - 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int rs1 = searchInsert(nums, 5);
        int rs2 = searchInsert(nums, 2);
        int rs3 = searchInsert(nums, 7);
        System.out.println(rs1);
        System.out.println(rs2);
        System.out.println(rs3);
    }
}