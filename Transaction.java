public class Transaction {

    private int transactionId;
    private Book book;
    private Member member;
    private Date borrowedDate;
    private Date returnDate;
    private boolean returned; // Flag to indicate if the book has been returned

    // Constructor with all attributes
    public Transaction(int transactionId, Book book, Member member, Date borrowedDate, Date returnDate, boolean returned) {
        this.transactionId = transactionId;
        this.book = book;
        this.member = member;
        this.borrowedDate = borrowedDate;
        this.returnDate = returnDate;
        this.returned = returned;
    }

    // Getters and Setters for all attributes
    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Date getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(Date borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public boolean isReturned() {
        return returned;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
    }

    // Method to display transaction details
    public String toString() {
        return "Transaction ID: " + transactionId + "\nBook: " + book.getTitle() + "\nMember: " + member.getName() +
                "\nBorrowed Date: " + borrowedDate + "\nReturn Date: " + returnDate + "\nReturned: " + returned;
    }
}