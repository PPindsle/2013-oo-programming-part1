
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your username:");
        String user = reader.nextLine();
        System.out.println("Type your password:");
        String pass = reader.nextLine();
        
        String fail = "Your username or password was invalid!";
        String success = "You are logged into the system!";
        
        if ((user.equals("alex") && pass.equals("mightyducks")) || (user.equals("emily") && pass.equals("cat"))) {
            System.out.println(success);
        } else {
            System.out.println(fail);
        }
    }
}
