package Dao;

import Model.User;

import java.util.ArrayList;

/**
 * @author law
 */
public interface UserDao {

    /**
     * 根据需求，可能会在 Component2 中有新增用户
     */
    public void insert(User user);

    /**
     * 根据需求，可能会在 Component2 的搜索和管理用户信息中用到这个借口
     */
    public ArrayList<User> getAllUser();

    /**
     * 根据需求， 可能会在 Component2的管理用户信息，和Component4 的 更新用户信息用到这个接口
     */
    public User getUser(int userID);

    /**
     * 根据需求， 可能会在 Component4 的更新用户信息使用到这个接口
     */
    public void updateUser(User user);

}
