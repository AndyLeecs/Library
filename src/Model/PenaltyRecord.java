package Model;

/**
 * @author law
 */
public class PenaltyRecord {

    private int penaltyID;

    private int userID;

    private int bookID;

    private long timeStamp;

    private int money;

    private boolean isPaid;

    public int getPenaltyID() {
        return penaltyID;
    }

    public void setPenaltyID(int penaltyID) {
        this.penaltyID = penaltyID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }
}
