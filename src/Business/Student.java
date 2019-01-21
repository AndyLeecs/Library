package Business;

import Business.Component1.BorrowStrategy;
import Business.Component4.Observer;

import java.util.List;

/**
 * @author andi
 */
public class Student extends Customer {
    public Student(List<Observer> observers, BorrowStrategy borrowStrategy) {
        super(observers,borrowStrategy);
    }
}
