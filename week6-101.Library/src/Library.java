
/**
 *
 * @author Pernille
 */
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> Books;
    
    public Library() {
        Books = new ArrayList<Book>();
    }
    public void addBook(Book newBook) {
        Books.add(newBook);
    }
    public void printBooks() {
        for (Book book : Books) {
            System.out.println(book.title() + ", " + book.publisher() + ", " + book.year());
        }
    }
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();
        
        for (Book book : Books) {
            if(StringUtils.included(book.title(), title)) {
                found.add(book);
            }
        }
        return found;
    }
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        
        for (Book book : Books) {
            if(StringUtils.included(book.publisher(), publisher)) {
                found.add(book);
            }
        }
        return found;
    }
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();
        
        for (Book book : Books) {
            if (book.year() == year) {
                found.add(book);
            }
        }
        return found;
    }
}
