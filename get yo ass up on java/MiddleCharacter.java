import java.util.Scanner;

/**
 * MiddleCharacter
 */
public class MiddleCharacter {
    public static char findMiddleCharacter(String word){
        if (word.length() % 2 == 0) {
            return ' ';
        }

        int middleCharacter = word.length() / 2;

        return word.charAt(middleCharacter);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char result = findMiddleCharacter(word);
        System.out.println(result);
        sc.close();
    }
}