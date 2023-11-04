import java.util.Arrays;

/**
 * ContainsDuplicates
 */
public class ContainsDuplicates {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return false;
        }

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        
    }
}