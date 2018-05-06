
/**
 *
 * @author Pernille
 */
public class Counter {
  private int startingValue;
  private boolean check;
  private int increaseAmount;
  private int decreaseAmount;
  
  public Counter(int startingValue, boolean check) {
      this.startingValue = startingValue;
      this.check = check;
  }
  public Counter(int startingValue) {
      this.startingValue = startingValue;
      this.check = false;
  }
  public Counter(boolean check) {
      this.startingValue = 0;
      this.check = check;
  }
  public Counter() {
      this.startingValue = 0;
      this.check = false;
  }
  public int value() {
      return startingValue;
  }
  public void increase() {
      startingValue++;
  }
  public void increase(int increaseAmount) {
      this.increaseAmount = increaseAmount;
      if (increaseAmount > 0) {
        startingValue += increaseAmount;
      }
  }
  public void decrease() {
      if (!check) {
        startingValue--;
      } else {
          if (startingValue > 0) {
            startingValue--;
          }
      }
  }
  public void decrease(int decreaseAmount) {
      if (decreaseAmount > 0) {
        if (!check) {
          startingValue -= decreaseAmount;
        } else {
            int sum = startingValue - decreaseAmount;
            if (sum >= 0) {
                startingValue -= decreaseAmount;
            } else {
                startingValue = 0;
            }
        }
      }
  }
    
}
