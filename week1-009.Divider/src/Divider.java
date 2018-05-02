
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number:");
        int number1 = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type another one;");
        int number2 = Integer.parseInt(reader.nextLine());
        
        double sum = (double)number1 / number2;
        
        System.out.println("Division: " + number1 + " / " + number2 + " = " + sum);
        // Implement your program here. Remember to ask the input from user.
    }
}
