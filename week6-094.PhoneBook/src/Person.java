
/**
 *
 * @author Pernille
 */
public class Person {
    private String name;
    private String number;
    
    public Person(String name, String number) {
        this.name = name;
        this.number = number;
    }
    public String getName() {
        return this.name;
    }
    public String getNumber() {
        return this.number;
    }
    public String toString() {
        String toString = getName() + " number: " + getNumber();
        return toString;
    }
    public void changeNumber(String newNumber) {
        this.number = newNumber;
    }
    
}
