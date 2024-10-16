import java.util.HashMap;

public class Library {
    private HashMap<String, Book> books;

    public Library() {
        books = new HashMap<>();
    }

    public void addBook(String isbn, Book book) {
        books.put(isbn, book);
    }

    public Book getBook(String isbn) {
        return books.get(isbn);
    }

    public void removeBook(String isbn) {
        books.remove(isbn);
    }

    public int getSize() {
        return books.size();
    }

    public boolean isEmpty() {
        return books.isEmpty();
    }
}