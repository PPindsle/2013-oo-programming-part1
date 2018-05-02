
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Give me two numbers:");
        int number1 = Integer.parseInt(reader.nextLine());
        int number2 = Integer.parseInt(reader.nextLine());
        int sum = number1 + number2;
        
        System.out.println("Sum of numbers: " + sum);
        
        // Implement your program here. Remember to ask the input from user
    }
}
