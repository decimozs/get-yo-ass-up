/**
 * IsSubsequence
 */
public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int ptr1 = 0;
        int ptr2 = 0;

        while (ptr1 < s.length() && ptr2 < t.length()) {
            if (s.charAt(ptr1) == t.charAt(ptr2)) {
                ptr1++;
            }
            ptr2++;
        }

        return ptr1 == s.length();
    }
    public static void main(String[] args) {
        String s1 = "abc", t1 = "ahbgdc";
        String s2 = "axc", t2 = "ahbgdc";
        boolean rs1 = isSubsequence(s1, t1);
        boolean rs2 = isSubsequence(s2, t2);
        System.out.println(rs1);
        System.out.println(rs2);
    }
}