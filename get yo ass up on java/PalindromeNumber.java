/**
 * PalindromeNumber
 */
public class PalindromeNumber {
    public static boolean isPalindrome(int x){
        String number = Integer.toString(x);

        int left = 0;
        int right = number.length() - 1;

        while (left < right) {
            if (number.charAt(left) != number.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        int x = 121;
        int x1 = 10;
        boolean tc1 = isPalindrome(x1);
        boolean tc2 = isPalindrome(x);
        System.out.println(tc1);
        System.out.println(tc2);
    }
}