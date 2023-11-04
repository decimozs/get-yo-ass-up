/**
 * ValidPalindrome
 */
public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        if (s.length() == 0 || s == null) {
            return true;
        }

        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }

    public static void main(String[] args) {
        
    }
}