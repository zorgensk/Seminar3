package Task7;

public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private int publishedYear;

    public String getAuthor() {
        return author;
    }

    public Book(String title, String author, int publishedYear) {
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public String getTitle() {
        return title;
    }

    // Другие геттеры и методы...

    @Override
    public int compareTo(Book otherBook) {
        return this.author.compareTo(otherBook.getAuthor());
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishedYear=" + publishedYear +
                '}';
    }
}

