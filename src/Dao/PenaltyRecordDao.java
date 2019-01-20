package Dao;

import Model.PenaltyRecord;

/**
 * @author law
 */
public interface PenaltyRecordDao {

    /**
     *  根据需求， component2 在使用生成罚单的时候可能会用到这个类
     */
    public void insert(PenaltyRecord penaltyRecord);

}
