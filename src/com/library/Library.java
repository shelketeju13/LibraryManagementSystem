package com.library;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    // Add Book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("✅ Book added successfully!");
    }

    // Register Member
    public void addMember(Member member) {
        members.add(member);
        System.out.println("✅ Member registered successfully!");
    }

    // Display All Books
    public void displayAllBooks() {
        for (Book book : books) {
            book.displayBook();
        }
    }

    // Display Available Books
    public void displayAvailableBooks() {
        for (Book book : books) {
            if (book.isAvailable()) {
                book.displayBook();
            }
        }
    }

    // Search Books
    public void searchBooks(String keyword) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                book.getAuthor().toLowerCase().contains(keyword.toLowerCase())) {
                book.displayBook();
                found = true;
            }
        }
        if (!found) {
            System.out.println("❌ No books found.");
        }
    }

    // Borrow Book
    public void borrowBook(String memberId, String isbn) {
        Member member = findMember(memberId);
        Book book = findBook(isbn);

        if (member == null || book == null) {
            System.out.println("❌ Invalid Member ID or Book ISBN");
            return;
        }

        if (!book.isAvailable()) {
            System.out.println("❌ Book is already borrowed.");
            return;
        }

        book.setAvailable(false);
        member.borrowBook(book);

        LocalDate dueDate = LocalDate.now().plusDays(14);
        System.out.println("✅ Book borrowed successfully!");
        System.out.println("Member: " + member.getName());
        System.out.println("Book: " + book.getTitle());
        System.out.println("Due Date: " + dueDate);
    }

    // Return Book
    public void returnBook(String memberId, String isbn) {
        Member member = findMember(memberId);
        Book book = findBook(isbn);

        if (member == null || book == null) {
            System.out.println("❌ Invalid Member ID or Book ISBN");
            return;
        }

        book.setAvailable(true);
        member.returnBook(book);
        System.out.println("✅ Book returned successfully!");
    }

    private Member findMember(String memberId) {
        for (Member m : members) {
            if (m.getMemberId().equalsIgnoreCase(memberId)) {
                return m;
            }
        }
        return null;
    }

    private Book findBook(String isbn) {
        for (Book b : books) {
            if (b.getIsbn().equalsIgnoreCase(isbn)) {
                return b;
            }
        }
        return null;
    }
}
