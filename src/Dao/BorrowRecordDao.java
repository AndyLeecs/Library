package Dao;

import Model.BorrowRecord;

import java.util.ArrayList;

/**
 * @author law
 */
public interface BorrowRecordDao {

    /**
     * 根据需求， 在 component1 中可能会使用到这个接口， 借阅图书完毕之后
     */
    public void insert(BorrowRecord borrowRecord);

    /**
     * 根据需求， 在 component1 中可能会使用到这个接口， 借阅前要检查借阅信息。  component2 在管理借阅信息的时候也会用到这个。
     */
    public ArrayList<BorrowRecord> getAll();

}
