package Driver;

import Model.PenaltyRecord;

/**
 * ��ʱд������ȷ����ʹ�ã���Ŀ��ɺ��ɾ��
 * @author law
 */
public interface Component2Driver {

    /**
     * �����û��Ľ��鷣��
     * @param userID �û�ID
     */
    public void GeneratePenaltyRecord(int userID);


    /**
     * �����û��Ľ��ļ�¼����
     * @param userID �û�ID
     * ����Ҫ�����ʺ����û���������ʾ�ĸ�ʽ��
     */
    public void GenerateBorrowRecord(int userID);


    /**
     * �ⲿ����ID�����û���Ϣ��ʵ�ֿ��������ɲ�ͬ�ķ�����
     * @param departmentID �ⲿ����ID
     */
    public void visitUserInfo(int departmentID);

}
