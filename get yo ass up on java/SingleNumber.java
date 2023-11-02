/**
 * SingleNumber
 */
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int number = 0;
  
      for (int i : nums) {
        number ^= i;
      }
  
        return number;
      }
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        int[] nums1 = {4,1,2,1,2};
        int[] nums2 = {1};
        int rs1 = singleNumber(nums);
        int rs2 = singleNumber(nums1);
        int rs3 = singleNumber(nums2);
        System.out.println(rs1);
        System.out.println(rs2);
        System.out.println(rs3);
    }
}