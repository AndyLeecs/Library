package Business.Component3;

import util.Format;

/**
 * @author andi
 */
public class ReaderFactory {
    public static Reader createReader(Format format)
    {
        if (format == Format.Doc)
            return new DocReader();
        else if (format == Format.Pdf)
            return new PdfReader();
        else {
            assert false;
            return null;
        }
    }
}
