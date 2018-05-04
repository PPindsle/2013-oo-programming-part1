import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random = new Random();
    private int max = 39;
    private int min = 1;
    private int amountOfNumbers = 7;

    public LotteryNumbers() {
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        this.numbers = new ArrayList<Integer>();
        int i = 1;
        while (i <= amountOfNumbers) {
            int num = random.nextInt(max - min + 1) + min;
            if (!this.numbers.contains(num)) {
                this.numbers.add(num);
                i++;
            }
        }
    }
    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }
}
