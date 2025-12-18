package com.library;

import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== LIBRARY MANAGEMENT SYSTEM ===");
            System.out.println("1. Add New Book");
            System.out.println("2. Register New Member");
            System.out.println("3. Display All Books");
            System.out.println("4. Display Available Books");
            System.out.println("5. Search Books");
            System.out.println("6. Borrow Book");
            System.out.println("7. Return Book");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\n=== ADD NEW BOOK ===");
                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter Genre: ");
                    String genre = sc.nextLine();
                    library.addBook(new Book(isbn, title, author, genre));
                    break;

                case 2:
                    System.out.println("\n=== REGISTER NEW MEMBER ===");
                    System.out.print("Enter Member ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Contact: ");
                    String contact = sc.nextLine();
                    library.addMember(new Member(id, name, contact));
                    break;

                case 3:
                    System.out.println("\n=== ALL BOOKS ===");
                    library.displayAllBooks();
                    break;

                case 4:
                    System.out.println("\n=== AVAILABLE BOOKS ===");
                    library.displayAvailableBooks();
                    break;

                case 5:
                    System.out.println("\n=== SEARCH BOOKS ===");
                    System.out.print("Enter search keyword: ");
                    String keyword = sc.nextLine();
                    library.searchBooks(keyword);
                    break;

                case 6:
                    System.out.println("\n=== BORROW BOOK ===");
                    System.out.print("Enter Member ID: ");
                    String mid = sc.nextLine();
                    System.out.print("Enter Book ISBN: ");
                    String bisbn = sc.nextLine();
                    library.borrowBook(mid, bisbn);
                    break;

                case 7:
                    System.out.println("\n=== RETURN BOOK ===");
                    System.out.print("Enter Member ID: ");
                    String rid = sc.nextLine();
                    System.out.print("Enter Book ISBN: ");
                    String risbn = sc.nextLine();
                    library.returnBook(rid, risbn);
                    break;

                case 8:
                    System.out.println("👋 Exiting Library System...");
                    break;

                default:
                    System.out.println("❌ Invalid choice!");
            }
        } while (choice != 8);

        sc.close();
    }
}
