import java.util.Objects;

public class Book {
    private final String bookName;
    private final Author author;
    private int publishingYear;

    public Book(String bookName, Author authorFullName, int publishingYear) {
        this.bookName = bookName;
        this.author = authorFullName;
        this.publishingYear = publishingYear;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public String toString() {
        return "Book: " + bookName + " by Author: " + author;
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book b2 = (Book) other;
        return bookName.equals(b2.bookName);
    }

    public int hashCode() {
        return Objects.hash(bookName);
    }

}
