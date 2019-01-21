package Business;

import Business.Component4.Observer;

import java.util.List;

/**
 * @author andi
 */
public class Admin extends AbstractUser implements Observer{

    @Override
    public void notified(int userID) {
        System.out.println(userID+" changes userinfo");
    }
}
