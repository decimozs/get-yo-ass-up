import java.util.Arrays;
import java.util.Scanner;

/**
* Test
 */

public class Test {
    public static int secret(int x) {
        int i = 0;
        int j = 0;
        i = 2 * x;
        if (i > 10) {
            j = x / 2;
        } else {
            j = x / 3;
        }

        return j - 1;
    }

    public static void insertionSort(int[] arr) {
        int counts = 0;
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
            counts++;
        }
        System.out.println("Swap counts: " + counts);
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        int counts = 0;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            counts++;
        }

        System.out.println("Swap counts: " + counts);
    }
    public static void bubbleSort(int[] arr) {
        int counts = 0;
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    counts++;
                }
            }
            if (!swapped) {
                break;
            }

            System.out.println("Swap counts: " + counts);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,3};
        bubbleSort(arr);
        int secret = secret(12);
        System.out.println(Arrays.toString(arr));
        System.out.println("Secret: " + secret);
    }
}

//set b
// 9 10 11 15 18
// 6 7 8 13 11
// 10 36 66 53 34 23
// 15 25 20 23 - 15 20 25 23 - 15 20 23 25

//set a
// 7 6 8 12 15
// 3 4 5 10 18