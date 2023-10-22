import java.util.Scanner;

/**
 * Looping
 */

public class Looping {
    // forward loop
    public static void forwardLoop(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    } 

    // reverse loop
    public static void backwardLoop(int[] array){
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        forwardLoop(array);
        backwardLoop(array);

        sc.close();
    }
}