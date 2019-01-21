package Business.Component1;

import Business.Student;
import Business.Teacher;

import java.util.ArrayList;
import java.util.List;

/**
 * @author andi
 */
public class Test {
    public static void main(String args[])
    {
        List<String> categories = new ArrayList<>();
        categories.add("IT");

        Student student = new Student(null, new PreliminaryBorrowStrategy(categories,3, 30 ));
        student.setUserID(5);
        System.out.println("I am a student");
        student.borrow(4);

        Teacher teacher = new Teacher(null, new NoCategoryLimitBorrowStrategy(2, 60));
        teacher.setUserID(6);
        System.out.println("I am a teacher");
        teacher.borrow(3);
    }
}
