import java.util.Random;

public class PasswordRandomizer {
    int length;
    private Random random;

    public PasswordRandomizer(int length) {
        this.length = length;
        random = new Random();
    }

    public String createPassword() {
        int i = length;
        String newPass = "";
        
        while (i >= 1) {
            char character = "abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(26));
            newPass += character;
            i--;
        }
        return newPass;
    }
}
