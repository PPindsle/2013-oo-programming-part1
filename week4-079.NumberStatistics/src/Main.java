import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
                
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        
        System.out.println("Type numbers: ");
        
        while (true) {
            int num = Integer.parseInt(reader.nextLine());
            
            if (num == -1) {
                break;
            }
            
            stats.addNumber(num);
            
            if (num % 2 == 0) {
                even.addNumber(num);
            } else {
                odd.addNumber(num);
            }
        }
        System.out.println("sum: " + stats.sum());
        System.out.println("Sum of even: " + even.sum());
        System.out.println("Sum of odd: " + odd.sum());
    }
}
