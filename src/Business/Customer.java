package Business;

import Business.Component1.BorrowStrategy;
import Business.Component3.Reader;
import Business.Component3.ReaderFactory;
import Business.Component4.Observed;
import Business.Component4.Observer;
import util.Format;

import java.util.List;

/**
 * @author andi
 */
public abstract class Customer extends AbstractUser implements Observed {
    private BorrowStrategy borrowStrategy;

    private List<Observer> observers;

    public Customer(List<Observer> observers, BorrowStrategy borrowStrategy)
    {
        this.observers = observers;
        this.borrowStrategy = borrowStrategy;
    }

    public void borrow(int bookID)
    {
        borrowStrategy.borrow(userID, bookID);
    }

    public void read(int bookKindID, Format format){
        Reader reader = ReaderFactory.createReader(format);
        if (reader != null)
            reader.read(bookKindID);
    }

    @Override
    public void setUserID(int userID) {
        super.setUserID(userID);
        System.out.println("userID is set to "+userID);
        notifyObserver();
    }

    public void setUsername(String username) {
        this.username = username;
        System.out.println("username is set to "+username);
        notifyObserver();
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers)
            observer.notified(userID);
    }

}
