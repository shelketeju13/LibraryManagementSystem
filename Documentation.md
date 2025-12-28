# Library Management System
---

## 1. Project Overview
- The Library Management System is a console-based Java application.
- It is designed to manage books and members in a library environment.
- The system supports adding books, registering members, searching, borrowing, and returning books.
- The project is implemented using Object-Oriented Programming (OOP) principles.

---

## 2. Project Objectives
- To develop a real-world library management application using Java.
- To apply core OOP concepts such as encapsulation and class-based design.
- To build a menu-driven system for user interaction.
- To manage book availability and member borrowing records effectively.

---

## 3. Technologies Used
- **Programming Language**: Java
- **Java Version**: JDK 8 
- **Development Environment**: Spring Tool Suite(STS)
- **Version Control**: GitHub
- **Application Type**: Console-based

---

## 4. System Requirements

- **Operating System**: Windows 
- **Java Development Kit (JDK)**:Version 8
- **IDE**:Spring Tool Suite(STS)

---

## 5. Setup and Installation Instructions
- Install Java JDK 8 
- Set the JAVA_HOME environment variable.
- Clone or download the project repository.
- Open the project in a Java IDE.
- Ensure the package name `com.library` is maintained.
- Run `LibrarySystem.java` to start the application.

---

## 6. Project Structure

```
LibraryManagementSystem/
├── src/
│ └── com/library/
│ ├── Book.java
│ ├── Member.java
│ ├── Library.java
│ └── LibrarySystem.java
├── docs/
│ └── ClassDiagram.png
│ └── Documentation.md
├── sample_data/
│ └── sample_books.txt
│ └── sample_members.txt
└── README.md

```

---

## 7. Code Structure Explanation

### Book.java
- Represents a book entity.
- Attributes: ISBN, title, author, genre, availability.
- Uses private fields with public getters and setters.
- Displays book details using a display method.

### Member.java
- Represents a library member.
- Stores member ID, name, contact, and borrowed books list.
- Provides methods to borrow and return books.

### Library.java
- Central management class of the system.
- Maintains lists of books and members using ArrayList.
- Implements searching, borrowing, returning, and validation logic.
- Handles book availability checks.

### LibrarySystem.java
- Main driver class of the application.
- Provides a menu-driven interface using Scanner.
- Controls application flow and user input.

---

## 8. Class Diagram (UML Explanation)

## Classes and Relationships

- **Library** has a *has-a* relationship with **Book** and **Member**.
- **Member** has a *has-many* relationship with **Book** through the `borrowedBooks` list.
- **LibrarySystem** depends on **Library** to perform all library operations.

---

## Relationships Summary

- **Library → Book** : Aggregation  
- **Library → Member** : Aggregation  
- **Member → Book** : Association  

> Class diagram image is available in `docs/ClassDiagram.png`.

---

## 9. User Manual
- Run the application using `LibrarySystem.java`.
- Select operations from the menu.
- Add books before borrowing.
- Register members before borrowing books.
- Search books using title or author keywords.
- Borrow and return books using member ID and ISBN.
- Exit the system using the exit option.

---

## 10. Technical Details
- Uses ArrayList for dynamic data storage.
- Implements encapsulation using private variables.
- Uses LocalDate to calculate due dates.
- Uses switch-case for menu control.
- Performs validation for book availability.

---

## 11. Technical Requirements Fulfilled
- Book and Member classes implemented.
- Proper encapsulation followed.
- Borrow and return functionality implemented.
- Search functionality by title and author.
- Menu-driven user interface provided.
- Availability validation implemented.

---

## 12. Testing Evidence

| Test Case | Input | Expected Output |
|---------|------|-----------------|
| Add Book | Valid book details | Book added successfully |
| Register Member | Valid member details | Member registered successfully |
| Borrow Book | Available book | Book borrowed successfully |
| Borrow Book | Already borrowed book | Error message |
| Search Book | Keyword exists | Matching books displayed |
| Return Book | Valid return | Book returned successfully |

---

## 13. Visual Documentation
- Screenshot of main menu
- Screenshot of adding a new book
- Screenshot of registering a member
- Screenshot of displaying all books
- Screenshot of borrowing a book
- Screenshot of returning a book


## 14. Conclusion
- The Library Management System successfully demonstrates Java OOP concepts.
- The project is modular, readable, and well-organized.
- All functional and technical requirements are fulfilled.
- The project is suitable for internship and academic evaluation.

---

## 15. Author 

**Tejaswini Shelke**