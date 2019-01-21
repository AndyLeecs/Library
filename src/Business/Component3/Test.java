package Business.Component3;

import Business.Student;
import util.Format;

/**
 * @author andi
 */
public class Test {
    public static void main(String args[])
    {
        Student student = new Student(null, null);
        Reader reader = ReaderFactory.createReader(Format.Doc);
        reader.read(45);
    }
}
