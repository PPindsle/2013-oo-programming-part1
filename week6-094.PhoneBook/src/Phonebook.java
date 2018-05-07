
/**
 *
 * @author Pernille
 */
import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> list;

    public Phonebook() {
        list = new ArrayList<Person>();
    }
    public void add(String name, String number) {
        list.add(new Person(name, number));
    }
    public void printAll() {
        for (Person person : list) {
            System.out.println(person.getName() + " number: " + person.getNumber());
        }
    }
    public String searchNumber(String name) {
        for (Person person : list) {
            if (person.getName().equals(name)) {
                return person.getNumber();
            } 
        }
        String notKnown = "number not known";
        return notKnown;
    }
    
}
