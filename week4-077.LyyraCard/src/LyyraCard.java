
/**
 *
 * @author Pernille
 */
public class LyyraCard {
    private double balance;
    
    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }
    public String toString() {
        String result = "The card has " + this.balance + " euros";
        return result;
    }
    public void payEconomical() {
        double cost = 2.5;
        if (this.balance >= cost) {
            this.balance -= cost;            
        }
    }
    public void payGourmet() {
        double cost = 4.0;
        if (this.balance >= cost) {
            this.balance -= cost;            
        }
    }
    public void loadMoney(double amount) {
        double max = 150.0;
        double sum = this.balance + amount;
        if (amount > 0) {
            if (sum <= max) {
                this.balance += amount;
            } else if (sum > max) {
                this.balance = max;
            }
        }
    }
}
