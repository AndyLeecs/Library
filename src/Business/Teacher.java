package Business;

import Business.Component1.BorrowStrategy;
import Business.Component4.Observer;

import java.util.List;

/**
 * @author andi
 */
public class Teacher extends Customer {
    public Teacher(List<Observer> observers, BorrowStrategy borrowStrategy) {
        super(observers,borrowStrategy);
    }
}

