package Dao;

import Model.Book;
import Model.BookContent;
import util.Format;

import java.util.ArrayList;

/**
 * @author law
 */
public interface BookDao {

    /**
     *  �������󣬻��� component3 ��ʹ�õ����API,��õ����������
     */
    public BookContent getBookContent(int bookKindID, Format format);

    /**
     * ��������component1 �ڼ��ͼ���Ƿ񱻽��ߣ� component2 �ڽ���ͼ����Ϣ�Ĺ����ʱ����ܻ��õ�
     */
    public Book getBookInfo(int bookID);

    /**
     * ��������component2 ��ͼ����Ϣ�����ʱ����ܻ��õ�����ӿ�
     */
    public ArrayList<Book> getAll();

    /**
     * ��������component2 ��ͼ����Ϣ�����ʱ����ܻ��õ�����ӿ�
     */
    public void insert(Book book);

    /**
     * ��������component2 ��ͼ����Ϣ�����ʱ����ܻ��õ�����ӿ�
     */
    public void update(Book book);


}
