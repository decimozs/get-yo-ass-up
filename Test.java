public class Test {
    public static int maxSubarraySum(int[] arr, int k) {
        if (k > arr.length) {
            return -1; // Invalid input
        }

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        // Calculate the sum of the first 'k' elements
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }

        maxSum = currentSum;

        // Slide the window to calculate the maximum sum
        for (int i = k; i < arr.length; i++) {
            currentSum = currentSum - arr[i - k] + arr[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int result = maxSubarraySum(arr, k);
        System.out.println("Maximum subarray sum: " + result);
    }
}
