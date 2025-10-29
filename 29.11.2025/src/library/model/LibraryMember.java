package library.model;

import java.util.ArrayList;

public class LibraryMember {
    public String name;
    public int id;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();
    public static int count = 0;

    public LibraryMember(String name) {
        count++;
        this.id = count;
        this.name = name;
    }

    public void borrowBook(Book book) {
        this.borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        this.borrowedBooks.remove(book);
    }

    public ArrayList<Book> getBorrowedBooks() {
        return this.borrowedBooks;
    }
}
