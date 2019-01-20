package Model;

import util.Format;

/**
 * @author law
 */
public class BookContent {

    /**
     *  �� book ���е� bookKindID ��ͬ
     */
    private int bookKindID;

    /**
     *  �ٶ��Ķ�ͼ����������ļ���ʽ�洢��location �����Ǳ���Ҳ������URL
     */
    private String location;

    /**
     *  ͼ��ĸ�ʽ
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
