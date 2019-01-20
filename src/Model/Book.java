package Model;

/**
 *
 * @author law
 */
public class Book {

    /**
     *  每一本图书的ID，是借阅和归还的单位
     */
    private int bookID;

    /**
     *  所属的图书的ID， 比如《代码大全》 可能有很多本，这就是《代码大全的ID》 是阅读的单位
     */
    private int bookKindID;

    private String name;

    /**
     *  如果后面设计模式用到这个，就变成枚举
     */
    private String category;

    private boolean isBorrowed;

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public int getBookKindID() {
        return bookKindID;
    }

    public void setBookKindID(int bookKindID) {
        this.bookKindID = bookKindID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
}
