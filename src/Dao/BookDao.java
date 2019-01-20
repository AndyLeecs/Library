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
     *  根据需求，会在 component3 中使用到这个API,获得电子书的内容
     */
    public BookContent getBookContent(int bookKindID, Format format);

    /**
     * 根据需求，component1 在检查图书是否被借走， component2 在进行图书信息的管理的时候可能会用到
     */
    public Book getBookInfo(int bookID);

    /**
     * 根据需求，component2 在图书信息管理的时候可能会用到这个接口
     */
    public ArrayList<Book> getAll();

    /**
     * 根据需求，component2 在图书信息管理的时候可能会用到这个接口
     */
    public void insert(Book book);

    /**
     * 根据需求，component2 在图书信息管理的时候可能会用到这个接口
     */
    public void update(Book book);


}
