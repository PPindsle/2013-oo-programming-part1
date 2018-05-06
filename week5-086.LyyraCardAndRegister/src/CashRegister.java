
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros 
        cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens  
        double economicalPrice = 2.50;
        if (cashGiven >= economicalPrice) {
            cashInRegister += economicalPrice;
            economicalSold++;
            return cashGiven - economicalPrice;
        }
        return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        double gourmetPrice = 4.00;
        if (cashGiven >= gourmetPrice) {
            cashInRegister += gourmetPrice;
            gourmetSold++;
            return cashGiven - gourmetPrice;
        }
        return cashGiven;
    }
    public boolean payEconomical(LyyraCard card) {
        double economicalPrice = 2.50;
        if (card.balance() >= economicalPrice) {
            economicalSold++;
            card.pay(economicalPrice);
            return true;
        }
        return false;
    }
    public boolean payGourmet(LyyraCard card) {
        double gourmetPrice = 4.00;
        if (card.balance() >= gourmetPrice) {
            gourmetSold++;
            card.pay(gourmetPrice);
            return true;
        }
        return false;
    }
    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            card.loadMoney(sum);
            cashInRegister += sum;
        }
        
    }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
