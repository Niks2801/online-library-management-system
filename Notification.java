public class Notification {

    private int notificationId;
    private String message;
    private Member recipient;
    private Date sentDate;

    // Constructor with all attributes
    public Notification(int notificationId, String message, Member recipient, Date sentDate) {
        this.notificationId = notificationId;
        this.message = message;
        this.recipient = recipient;
        this.sentDate = sentDate;
    }

    // Getters and Setters for all attributes
    public int getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(int notificationId) {
        this.notificationId = notificationId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Member getRecipient() {
        return recipient;
    }

    public void setRecipient(Member recipient) {
        this.recipient = recipient;
    }

    public Date getSentDate() {
        return sentDate;
    }

    public void setSentDate(Date sentDate) {
        this.sentDate = sentDate;
    }

    // Method to display notification details
    public String toString() {
        return "Notification ID: " + notificationId + "\nMessage: " + message + "\nRecipient: " + recipient.getName() +
                "\nSent Date: " + sentDate;
    }
}