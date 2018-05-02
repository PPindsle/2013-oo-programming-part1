
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a year:");
        int year = Integer.parseInt(reader.nextLine());
        String LY = "This year is a leap year.";
        String NLY  = "This year is not a leap year.";
        
        
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(LY);
                } else {
                    System.out.println(NLY);
                }
            } else {
                System.out.println(LY);
            }
        } else {
            System.out.println(NLY);
        }
    }
}
