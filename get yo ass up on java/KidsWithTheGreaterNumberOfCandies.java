import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

/**
 * KidsWithTheGreaterNumberOfCandies
 */

 public class KidsWithTheGreaterNumberOfCandies {
    public static List<Boolean> kidsWithCandies (int[] candies, int extraCandies) {
        int max = 0;

        for (int candy : candies) {
            max = Math.max(max, candy);
        }

        List<Boolean> arrayOfCandies = new ArrayList<>();

        for (int candy : candies) {
            arrayOfCandies.add(candy + extraCandies >= max);
        }

        return arrayOfCandies;        
    }

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        List<Boolean> result = kidsWithCandies(candies, 3);
        System.out.println(result);
    }
}