public class Book {

    private int bookId; // Unique identifier for the book
    private String title;
    private String author;
    private String ISBN;
    private String genre;
    private boolean available; // Flag to indicate if the book is available for borrowing

    // Constructor with all attributes
    public Book(int bookId, String title, String author, String ISBN, String genre, boolean available) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.genre = genre;
        this.available = available;
    }

    // Getters and Setters for all attributes
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Method to display book details
    public String toString() {
        return "Book ID: " + bookId + "\nTitle: " + title + "\nAuthor: " + author + "\nISBN: " + ISBN + "\nGenre: " + genre + "\nAvailable: " + available;
    }
}