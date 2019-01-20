package Model;

import util.Format;

/**
 * @author law
 */
public class BookContent {

    /**
     *  和 book 类中的 bookKindID 相同
     */
    private int bookKindID;

    /**
     *  假定阅读图书的内容以文件形式存储，location 可是是本地也可以是URL
     */
    private String location;

    /**
     *  图书的格式
     */
    private Format bookFormat;

    public int getBookKindID() {
        return bookKindID;
    }

    public void setBookKindID(int bookKindID) {
        this.bookKindID = bookKindID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Format getBookFormat() {
        return bookFormat;
    }

    public void setBookFormat(Format bookFormat) {
        this.bookFormat = bookFormat;
    }
}
