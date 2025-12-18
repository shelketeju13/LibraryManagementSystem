┌───────────────────────────┐
│           Book            │
├───────────────────────────┤
│ - isbn : String           │
│ - title : String          │
│ - author : String         │
│ - genre : String          │
│ - available : boolean     │
├───────────────────────────┤
│ + getIsbn() : String      │
│ + getTitle() : String    │
│ + getAuthor() : String   │
│ + getGenre() : String    │
│ + isAvailable() : boolean│
│ + setAvailable(boolean)  │
│ + displayBook() : void   │
└───────────────────────────┘


┌───────────────────────────┐
│          Member           │
├───────────────────────────┤
│ - memberId : String       │
│ - name : String           │
│ - contact : String        │
│ - borrowedBooks : List<Book> │
├───────────────────────────┤
│ + getMemberId() : String  │
│ + getName() : String      │
│ + getBorrowedBooks() : List<Book> │
│ + borrowBook(Book) : void │
│ + returnBook(Book) : void │
└───────────────────────────┘


┌───────────────────────────┐
│          Library          │
├───────────────────────────┤
│ - books : List<Book>      │
│ - members : List<Member>  │
├───────────────────────────┤
│ + addBook(Book) : void    │
│ + addMember(Member) : void│
│ + displayAllBooks() : void│
│ + displayAvailableBooks() : void │
│ + searchBooks(String) : void │
│ + borrowBook(String, String) : void │
│ + returnBook(String, String) : void │
└───────────────────────────┘


┌───────────────────────────┐
│       LibrarySystem       │
├───────────────────────────┤
│ + main(String[]) : void   │
└───────────────────────────┘

Library "has-a" Book            → Aggregation
Library "has-a" Member          → Aggregation
Member "borrows" Book           → Association
LibrarySystem "uses" Library    → Dependency
