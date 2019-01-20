package Model;

/**
 *
 * @author law
 */
public class Book {

    /**
     *  ÿһ��ͼ���ID���ǽ��ĺ͹黹�ĵ�λ
     */
    private int bookID;

    /**
     *  ������ͼ���ID�� ���硶�����ȫ�� �����кܶ౾������ǡ������ȫ��ID�� ���Ķ��ĵ�λ
     */
    private int bookKindID;

    private String name;

    /**
     *  ����������ģʽ�õ�������ͱ��ö��
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
