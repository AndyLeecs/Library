package Business.Component1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author andi
 */
public abstract class BorrowStrategy {
    protected List<String> categories = new ArrayList<>();
    protected int max = 0;
    protected int borrow_days_limit = 0;

    /**
     * 返回值（包括里面小方法的返回值）正常应该是ResultMessage之类的
     */
    public final void borrow(int userID, int bookID)
    {
        if (hasCategoryLimit())
            checkValidCategory(bookID);
        if (hasMaxLimit())
            checkMax(userID);
        addBorrowRecord(userID, bookID);
    }

    protected abstract boolean hasCategoryLimit();

    private void checkValidCategory(int bookID)
    {
        System.out.println(bookID +" is in valid category");
    }

    protected abstract boolean hasMaxLimit();

    private void checkMax(int userID)
    {
        System.out.println(userID + " can still borrow books");
    }

    protected abstract boolean hasBorrowDaysLimit();

    private void addBorrowRecord(int userID, int bookID)
    {
        String message = userID +" borrow "+bookID;
        if (hasBorrowDaysLimit())
            System.out.println( message+" for "+borrow_days_limit+" days ");
        else 
            System.out.println(message);
            
    }

}
