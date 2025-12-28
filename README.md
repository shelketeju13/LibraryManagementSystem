# LibraryManagementSystem

## Project Overview

The **Library Management System** is a console-based Java application developed as part of an internship task.  
The system allows users to manage books and members, search books, borrow and return books, and track book availability.

The project demonstrates Java fundamentals, object-oriented programming, collection handling, and menu-driven application design.

---

## Objectives

* Implement Java programming fundamentals
* Apply object-oriented concepts (classes and encapsulation)
* Manage books and library members
* Track book availability status
* Build a menu-driven console application
* Implement borrowing and returning operations

---

## Features

* Add new books to the library
* Register library members
* Display all books and available books
* Search books by title or author
* Borrow books with availability validation
* Return borrowed books
* Display due date for borrowed books
* Console-based interactive menu system

---

## Technologies Used

* Java
* Scanner class for user input
* ArrayList for dynamic data storage
* Java Time API (`LocalDate`)
* Spring Tool Suite (STS)
* GitHub for version control

---

## Project Structure

```text
LibraryManagementSystem/
├── README.md
├── src/
│   └── com/library/
│       ├── Book.java
│       ├── Member.java
│       ├── Library.java
│       └── LibrarySystem.java
├── docs/
│   ├── ClassDiagram.png
│   └── Documentation.md
├── sample_data/
│   ├── sample_books.txt
│   └── sample_members.txt

```
---

## Class Diagram (UML)

The class diagram represents the static structure of the Library Management System and shows the relationships between classes.

---

## Classes and Relationships

- **Library** has a *has-a* relationship with **Book** and **Member**.  
- **Member** has a *has-many* relationship with **Book** through the `borrowedBooks` list.  
- **LibrarySystem** depends on **Library** to perform all library operations.  

---

## Relationship Summary

- **Library → Book** : Aggregation  
- **Library → Member** : Aggregation  
- **Member → Book** : Association  

> The UML class diagram image is available in the `docs/ClassDiagram.png` file.

---

## File Description

- **sample_books.txt**  
  Contains sample book records that can be used for testing.

- **sample_members.txt**  
  Contains sample library member details for testing purposes.

---

## Setup & Execution

1. Install **JDK 8**  
2. Open **Spring Tool Suite (STS)**  
3. Import the project as a **Java Project**  
4. Ensure the package name is `com.library`  
5. Run `LibrarySystem.java`  
6. Use the menu to interact with the system  

---

## Menu Options

1. Add New Book  
2. Register New Member  
3. Display All Books  
4. Display Available Books  
5. Search Books  
6. Borrow Book  
7. Return Book  
8. Exit  

---

## Testing

The application has been tested for:

- Adding and displaying books  
- Member registration  
- Searching books by title and author  
- Borrowing available books  
- Preventing double borrowing  
- Returning books correctly  
- Menu navigation and input handling  

Sample data is provided in the `sample_data` folder.

---

## Conclusion

This project fulfills the internship requirements by implementing a complete Library Management System using Java.  
It demonstrates effective use of object-oriented principles, collection handling, validation logic, and console-based interaction.

---

## Author

**Tejaswini Shelke**

