
import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AllBirds birdDB = new AllBirds();
        
        System.out.print("? ");
        String command = scanner.nextLine();
        
        while (!command.equals("Quit")) {
            
            if (command.equals("Add")) {
                
                System.out.print("Name: ");
                String name = scanner.nextLine();
                
                System.out.print("Latin Name: ");
                String latin = scanner.nextLine();
                
                birdDB.add(name, latin);
                
                System.out.print("? ");
                command = scanner.nextLine();
                
            } else if (command.equals("Observation")) {
                
                System.out.print("What was observed:? ");
                String observedBird = scanner.nextLine();
                
                birdDB.observation(observedBird);
                
                System.out.print("? ");
                command = scanner.nextLine();
                
            } else if (command.equals("Statistics")) {

                birdDB.statistics();
                
                System.out.print("? ");
                command = scanner.nextLine();
                
            } else if (command.equals("Show")) {
                
                System.out.print("What? ");
                String showBird = scanner.nextLine();
                
                birdDB.findBird(showBird);
                System.out.print("? ");
                command = scanner.nextLine();
            } else {
                System.out.println("Please enter a valid command...");
                System.out.print("? ");
                command = scanner.nextLine();
            }
            
        }
            
    }

}
