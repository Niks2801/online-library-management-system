public class Librarian {

    private String name;
    private String password;

    // Constructor with name and password
    public Librarian(String name, String password) {
        this.name = name;
        this.password = password;
    }

    // Getters for name and password (password might be hashed for security)
    public String getName() {
        return name;
    }

    // Password setter (might not be directly set for security reasons)
    public void setPassword(String password) {
        this.password = password; // Implement hashing here!
    }

    // Method to add a book to the library catalog (interaction with database likely)
    public void addBook(Book book) {
        // Logic to add book to the database
        System.out.println("Book " + book.getTitle() + " added to the library by " + this.name);
    }

    // Method to remove a book from the library catalog (interaction with database likely)
    public void removeBook(Book book) {
        // Logic to remove book from the database
        System.out.println("Book " + book.getTitle() + " removed from the library by " + this.name);
    }

    // Method to search for a book by title, author, or ISBN (interaction with database likely)
    public Book searchBook(String searchQuery) {
        // Logic to search for book in the database based on searchQuery
        // Implement search logic and return the Book object if found, null otherwise
        System.out.println("Searching for book: " + searchQuery);
        return null; // Replace with actual search implementation
    }

    // Method to view all books (interaction with database likely)
    public void viewAllBooks() {
        // Logic to retrieve all books from the database and display them
        System.out.println("Listing all books in the library:");
        // Implement logic to iterate through books and display details
    }

    // Method to issue a book to a member (interaction with database and Member class likely)
    public void issueBook(Member member, Book book) {
        if (book.isAvailable()) {
            // Logic to update book status to borrowed and create a transaction record
            member.borrowBook(book); // Call member method to handle borrowing
            book.setAvailable(false);
            System.out.println("Book " + book.getTitle() + " issued to " + member.getName());
        } else {
            System.out.println("Book " + book.getTitle() + " is not available for borrowing.");
        }
    }

    // Method to receive a returned book (interaction with database and Member class likely)
    public void receiveBook(Member member, Book book) {
        // Logic to update book status to available and update transaction record
        member.returnBook(book); // Call member method to handle returning
        book.setAvailable(true);
        System.out.println("Book " + book.getTitle() + " returned by " + member.getName());
    }
}