
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        
        while (true) {
            System.out.println("Name:");
            String studentName = reader.nextLine();
            
            if (studentName.isEmpty()) {
                for (Student student : list) {
                    System.out.println(student);
                }
                break;
            }
            System.out.println("Studentnumber:");
            String studentNumber = reader.nextLine();
            list.add(new Student(studentName, studentNumber));
        }
        System.out.println("Give search term:");
        String search = reader.nextLine();
        
        System.out.println("Result:");
        for (Student student : list) {
            if (student.getName().contains(search)) {
                System.out.println(student);
            }
        }
    }
}
