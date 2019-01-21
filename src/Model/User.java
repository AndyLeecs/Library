package Model;

import util.Role;

/**
 * 用户的数据库存储实体类
 * @author law
 */
public class User {

    private int userID;

    private String username;

    private Role role;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

}
