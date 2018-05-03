import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        while (true) {
            System.out.println("Type a word:");
            String w = reader.nextLine();
            words.add(w);
            
            if (w.isEmpty()) {
                System.out.println("Your words:");
                for (String word : words) {
                    System.out.println(word);
                }
                break;
            }
        }
    }
}
