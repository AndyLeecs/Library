package Service;

/**
 * @author andi
 */
public interface BorrowStrategy {
    void borrow(int userID, int bookID);
}
