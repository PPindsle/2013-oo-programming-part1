
public class FromOneToHundred {

    public static void main(String[] args) {
        int num = 100;
        int count = 1;
        
        while (num >= 1) {
            System.out.println(count);
            count++;
            num--;
        }
    }
}
