/**
 * StringCompression
 */
public class StringCompression {
    public static int compress(char[] chars) {
        int n = chars.length;

        if (n == 0) {
            return 0;
        }
        
        int index = 0;
        int count = 1;
        
        for (int i = 1; i < n; i++) {
            if (chars[i] == chars[i - 1]) {
                count++;
            } else {
                chars[index++] = chars[i - 1]; 
                if (count > 1) {
                    String countStr = String.valueOf(count);
                    for (char c : countStr.toCharArray()) {
                        chars[index++] = c;
                    }
                }
                count = 1; 
            }
        }
    
        chars[index++] = chars[n - 1];
    
        if (count > 1) {
            String countStr = String.valueOf(count);
            for (char c : countStr.toCharArray()) {
                chars[index++] = c;
            }
        }
    
        return index;
    }
    public static void main(String[] args) {
        char[] tc1 = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        char[] tc2 = {'a'};
        char[] tc3 = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        int rs1 = compress(tc1);
        int rs2 = compress(tc2);
        int rs3 = compress(tc3);
        System.out.println(rs1);
        System.out.println(rs2);
        System.out.println(rs3);
    }
}