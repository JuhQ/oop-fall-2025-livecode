package library.system;

import library.model.Book;
import library.model.LibraryMember;

import java.util.ArrayList;

public class Library {
    public ArrayList<LibraryMember> members = new ArrayList<>();
    public ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }

    public void addMember(LibraryMember member) {
        this.members.add(member);
    }
    public void borrowBook(Book book, LibraryMember member) {
        member.borrowBook(book);
        // TODO: library should also keep track what books are available
    }

    public void returnBook(Book book, LibraryMember member) {
        member.returnBook(book);
        // TODO: library should also keep track what books are available
    }

    public void printBorrowedBooks() {
        for (LibraryMember member : this.members) {
            for (Book book : member.getBorrowedBooks()) {
                System.out.println(book.title);
            }
        }
    }

}
