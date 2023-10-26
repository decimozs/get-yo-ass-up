/**
 * ReverseWords
 */
public class ReverseWordsInAString {
    public static String reverseWords(String s) {
        s = s.trim();

        StringBuilder reverse = new StringBuilder();
        String[] arrayChar = s.split("\\s+");

        for(int i = arrayChar.length - 1; i >= 0; i--){
            reverse.append(arrayChar[i]);

            if(i > 0){
                reverse.append(" ");
            }

        }

        return reverse.toString();
    }
    public static void main(String[] args) {
        String testcase1 = "the sky is blue";
        String testcase2 = "   hello world   ";
        String testcase3 = "a good   example";
        String result1 = reverseWords(testcase1);
        String result2 = reverseWords(testcase2);
        String result3 = reverseWords(testcase3);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}