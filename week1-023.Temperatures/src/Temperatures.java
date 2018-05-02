
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        while (true) {
            System.out.println("Type a temperature:");
            double temp = Double.parseDouble(reader.nextLine());
            
            if (temp > -31 && temp < 41)
                Graph.addNumber(temp);
        }
    }
}
