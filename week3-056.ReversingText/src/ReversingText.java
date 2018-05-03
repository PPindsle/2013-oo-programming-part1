
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        int i = text.length()-1;
        String reverse = "";
        while (i >= 0) {
            char character = text.charAt(i);
            reverse += character;
            i--;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
