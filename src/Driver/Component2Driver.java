package Driver;

import Model.PenaltyRecord;

/**
 * 暂时写出来明确需求使用，项目完成后就删掉
 * @author law
 */
public interface Component2Driver {

    /**
     * 产生用户的借书罚单
     * @param userID 用户ID
     */
    public void GeneratePenaltyRecord(int userID);


    /**
     * 产生用户的借阅记录报告
     * @param userID 用户ID
     * 可能要返回适合在用户界面上显示的格式？
     */
    public void GenerateBorrowRecord(int userID);


    /**
     * 外部部门ID访问用户信息，实现可能是生成不同的访问类
     * @param departmentID 外部部门ID
     */
    public void visitUserInfo(int departmentID);

}
