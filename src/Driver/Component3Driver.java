package Driver;

import util.Format;

/**
 * ��ʱд������ȷ����ʹ�ã���Ŀ��ɺ��ɾ��
 * @author law
 */
public interface Component3Driver {

    /**
     * �û��Ķ�������
     * @param userID �û�ID
     * @param bookKindID ͼ������ID
     * @param format ͼ���ļ���ʽ
     * ����ֵ��û�����
     */
    public void read(int userID, int bookKindID, Format format);

}
