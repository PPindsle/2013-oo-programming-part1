/**
 *
 * @author Pernille
 */
public class BoundedCounter {
    private int value;
    private int upperLimit;
    private int newValue;
    
    public BoundedCounter(int upperLimit) {
        value = 0;
        this.upperLimit = upperLimit;
    }
    public void next() {
        int sum = value + 1;
        if (sum <= upperLimit) {
            value++;
        } else {
            value = 0;
        }
    }
    public String toString() {
        String result = "" + value;
        
        if (value < 10) {
            result = "0" + value;
        }
        return result;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int newValue) {
        this.newValue = newValue;
        
        if (newValue >= 0 && newValue <= upperLimit) {
            value = newValue;
        }
    }
}
