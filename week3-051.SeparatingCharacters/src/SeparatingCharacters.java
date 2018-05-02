
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name:");
        String name = reader.nextLine();
        
        int i = name.length();
        int j = 0;
        int y = 1;
        
        while (i >= 1) {
            char character = name.charAt(j);
            System.out.println(y + ". character: " + character);
            i--;
            j++;
            y++;
        }
    }
}
