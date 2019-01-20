package Dao;

import Model.User;

import java.util.ArrayList;

/**
 * @author law
 */
public interface UserDao {

    /**
     * �������󣬿��ܻ��� Component2 ���������û�
     */
    public void insert(User user);

    /**
     * �������󣬿��ܻ��� Component2 �������͹����û���Ϣ���õ�������
     */
    public ArrayList<User> getAllUser();

    /**
     * �������� ���ܻ��� Component2�Ĺ����û���Ϣ����Component4 �� �����û���Ϣ�õ�����ӿ�
     */
    public User getUser(int userID);

    /**
     * �������� ���ܻ��� Component4 �ĸ����û���Ϣʹ�õ�����ӿ�
     */
    public void updateUser(User user);

}
