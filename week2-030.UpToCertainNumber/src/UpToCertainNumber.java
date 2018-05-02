
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Up to what number?");
        int num = Integer.parseInt(reader.nextLine());
        int count = 1;
        
        while (num >= 1) {
            System.out.println(count);
            count++;
            num--;
        }
        
    }
}
