
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    public Money plus(Money added) {
        int newEuros = this.euros + added.euros;
        int newCents = this.cents + added.cents;
        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }
    public boolean less(Money compared) {
        if (this.euros < compared.euros){
            return true;
        }
        if (this.euros == compared.euros) {
            if (this.cents < compared.cents) {
                return true;
            }
        }
        return false;
    }
    public Money minus(Money decreased) {
        if (this.less(decreased)) {
            int newEuros = 0;
            int newCents = 0;
            
            return new Money(newEuros, newCents);
        } else {
            int newEuros = this.euros - decreased.euros;
            int newCents = this.cents - decreased.cents;
            
            if (this.cents < decreased.cents) {
                newEuros--;
                newCents = 100 - decreased.cents;
            }
            return new Money(newEuros, newCents);
        }
        
    }

}
