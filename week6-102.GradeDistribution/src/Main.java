import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        
        System.out.println("Type exam scores, -1 completes: ");
        Distribution grades = new Distribution();
        
        while (true) {
            int score = Integer.parseInt(scanner.nextLine());
            grades.addScore(score);
            if (score == -1) {
                System.out.println("Scores so far: ");
                grades.getScores();
                
                System.out.println("Grades so far: ");
                grades.getGrades();
                
                System.out.println("Grade distribution: ");
                grades.getGradeDistribution();
                
                System.out.println("Acceptance percentage: " + grades.getPercentage());
                break;
            }
        }
    }
}
