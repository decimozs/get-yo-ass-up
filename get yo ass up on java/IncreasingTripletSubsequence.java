/**
 * IncreasingTripletSubsequence
 */
public class IncreasingTripletSubsequence {
    public static boolean tripletSubsequence(int[] array){
        if (array == null || array.length < 3) {
            return false;
        }

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int num : array) {
            if (num <= min1) {
                min1 = num;
            } else if (num <= min2) {
                min2 = num;
            } else {
                return true;
            }
        }

        return false;
    }
        public static void main(String[] args) {
        int[] tc1 = {1,2,3,4,5};
        int[] tc2 = {5,4,3,2,1};
        int[] tc3 = {2,1,5,0,4,6};
        boolean rs1 = tripletSubsequence(tc1);
        boolean rs2 = tripletSubsequence(tc2);
        boolean rs3 = tripletSubsequence(tc3);
        System.out.println(rs1);
        System.out.println(rs2);
        System.out.println(rs3);
    }
}