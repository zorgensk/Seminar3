package Task7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        books.add(new Book("A1984", "George Orwell", 1949));
        books.add(new Book("BTo Kill a Mockingbird", "Harper Lee", 1960));

        Collections.sort(books);

        for (Book book : books) {
            System.out.println(book);
        }
    }
}