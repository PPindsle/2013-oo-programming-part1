import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number:");
        int n = Integer.parseInt(reader.nextLine());
        
        int count = 1;
        int sum = 1;
        
        
        while (count <= n) {
            sum *= count;
            count++;
        }
        System.out.println("Factorial is " + sum);
    }
}
