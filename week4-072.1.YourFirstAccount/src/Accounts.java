
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
       Account myAcc = new Account("My account",100.0);
       myAcc.deposit(20.0);
       System.out.println(myAcc);
    }

}
