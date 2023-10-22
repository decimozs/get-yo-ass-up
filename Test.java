import java.util.Scanner;

/**
* Test
 */

public class Test {
   public static void forwardLoop(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    } 

    public static void backwardLoop(int[] array){
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        forwardLoop(array);
        System.out.println();
        backwardLoop(array);

        sc.close();
    }
}