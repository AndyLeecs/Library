package Business.Component3;

/**
 * @author andi
 */
public class DocReader implements Reader {
    @Override
    public void read(int bookKindID) {
        System.out.println("reading doc");
    }
}
