package Service;

/**
 * @author andi
 */
public abstract class Customer extends User {
    private BorrowStrategy borrowStrategy;

    public Customer(BorrowStrategy borrowStrategy)
    {
        this.borrowStrategy = borrowStrategy;
    }

    public void borrow(int bookID)
    {
        borrowStrategy.borrow(userID, bookID);
    }
}
