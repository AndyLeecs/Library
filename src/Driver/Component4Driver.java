package Driver;

import Model.User;

/**
 * 暂时写出来明确需求使用，项目完成后就删掉
 * @author law
 */
public interface Component4Driver {

    /**
     * 更新用户信息的接口
     * @param user 用户信息， 这里现在还是数据层的，如果view 层的用户模型不同就替换掉
     */
    public void updateUserInfo(User user);

}
