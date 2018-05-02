
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First number");
        int first = Integer.parseInt(reader.nextLine()); 
        System.out.println("Last number");
        int last = Integer.parseInt(reader.nextLine());
        
        int sum = 0;
        int i = 1;
        
        System.out.println("First: " + first);
        System.out.println("Last: " + last);
        
        while (first <= last) {
            sum = sum + first;
            i++;
            first++;
        }
        System.out.println("Sum is " + sum);
    }
}
