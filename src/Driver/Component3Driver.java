package Driver;

import util.Format;

/**
 * 暂时写出来明确需求使用，项目完成后就删掉
 * @author law
 */
public interface Component3Driver {

    /**
     * 用户阅读电子书
     * @param userID 用户ID
     * @param bookKindID 图书种类ID
     * @param format 图书文件格式
     * 返回值还没有想好
     */
    public void read(int userID, int bookKindID, Format format);

}
