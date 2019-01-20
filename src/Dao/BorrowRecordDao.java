package Dao;

import Model.BorrowRecord;

import java.util.ArrayList;

/**
 * @author law
 */
public interface BorrowRecordDao {

    /**
     * �������� �� component1 �п��ܻ�ʹ�õ�����ӿڣ� ����ͼ�����֮��
     */
    public void insert(BorrowRecord borrowRecord);

    /**
     * �������� �� component1 �п��ܻ�ʹ�õ�����ӿڣ� ����ǰҪ��������Ϣ��  component2 �ڹ��������Ϣ��ʱ��Ҳ���õ������
     */
    public ArrayList<BorrowRecord> getAll();

}
