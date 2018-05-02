
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the points [0-60]:");
        int num = Integer.parseInt(reader.nextLine());
        
        if (num < 0) {
            System.out.println("Type an amount over 0.");
        } else if (num < 30) {
            System.out.println("Grade: failed");
        } else if (num < 35) {
            System.out.println("Grade: 1");
        } else if (num < 40) {
            System.out.println("Grade: 2");
        } else if (num < 45) {
            System.out.println("Grade: 3");
        } else if (num < 50) {
            System.out.println("Grade: 4");
        } else if (num >= 50) {
            System.out.println("Grade: 5");
        } else {
            System.out.println("Type in a valid number");
        }
    }
}
