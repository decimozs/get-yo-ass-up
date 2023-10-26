/**
 * CanPlaceFlowers
 */
public class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n == 0){
            return true;
        }

        int length = flowerbed.length;

        int count = 0;

        for(int i = 0; i < length; i++){
            int prev = (i == 0 || flowerbed[i - 1] == 0) ? 0 : 1;
            int next = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) ? 0 : 1;

            if(flowerbed[i] == 0){
                if(prev == 0 && next == 0) {
                    count++;
                    if(count == n){
                        return true;
                    }

                    i++;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,0,0,0,1};
        int[] arr2 = {1,0,0,0,1};
        boolean testcase1 = canPlaceFlowers(arr1, 1);
        boolean testcase2 = canPlaceFlowers(arr2, 2);

        System.out.println(testcase1);
        System.out.println(testcase2);
    }
}