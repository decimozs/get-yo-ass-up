import java.util.Arrays;

/**
 * DuplicateZeros
 */
public class DuplicateZeros {
    public static void duplicateZeros(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        
        int[] array = new int[arr.length];

        int j = 0;

        for (int i = 0; i < arr.length && j < arr.length; i++) {
            array[j] = arr[i];
            j++;

            if (arr[i] == 0 && j < arr.length) {
                array[j] = 0;
                j++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = array[i];
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] nums1 = {1,0,2,3,0,4,5,0};
        int[] nums2 = {1,2,3};
        duplicateZeros(nums1);
        duplicateZeros(nums2);
    }
}