package Model;

import util.Role;

/**
 * �û������ݿ�洢ʵ����
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
