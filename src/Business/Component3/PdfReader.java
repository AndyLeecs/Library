package Business.Component3;

/**
 * @author andi
 */
public class PdfReader implements Reader{
    @Override
    public void read(int bookKindID) {
        System.out.println("reading pdf");
    }
}
