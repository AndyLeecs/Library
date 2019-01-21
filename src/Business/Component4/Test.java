package Business.Component4;

import Business.Admin;
import Business.Teacher;

import java.util.ArrayList;
import java.util.List;

/**
 * @author andi
 */
public class Test {
    public static void main(String args[])
    {
        Admin admin = new Admin();
        List<Observer> observers = new ArrayList<>();
        observers.add(admin);

        Teacher teacher = new Teacher(observers,null);
        teacher.setUsername("zhang");
    }
}
