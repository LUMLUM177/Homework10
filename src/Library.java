import java.util.Arrays;

public class Library {
    private final Book[] books;

    public Library(int length) {
        books = new Book[length];
    }

    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
            if (i == books.length - 1) {
                System.out.println("К сожалению, записать данные о книге " + book.getBookName() + " невозможно, не осталось места.");
            }
        }
    }

    public void printAllBooks() {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
    }

    public String toString() {
        return Arrays.deepToString(books);
    }
}

