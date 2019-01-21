package Business;

import Business.Component4.Observed;
import Business.Component4.Observer;

import java.util.List;

/**
 * @author andi
 */
public abstract class AbstractUser{
    protected int userID;

    protected String username;

    public void setUserID(int userID) {
        this.userID = userID;
    }

}
