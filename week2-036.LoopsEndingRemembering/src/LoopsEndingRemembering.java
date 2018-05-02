import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int sum = 1;
        int amnt = -1;
        double avg;
        int even = 0;
        int odd = -1;
        
        
        System.out.println("Type numbers: ");
        while (true) {
            int num = Integer.parseInt(reader.nextLine());
            sum += num;
            amnt++;
            avg = (double)sum / amnt;
            
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }            
            
            if (num == -1) {
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is " + sum);
                System.out.println("How many numbers: " + amnt);
                System.out.println("Average: " + avg);
                System.out.println("Even numbers: " + even);
                System.out.println("Odd numbers: " + odd);
                break;
            }
        }
    }
}
