package Business.Component1;

import java.util.List;

/**
 * @author andi
 */
public class NoCategoryLimitBorrowStrategy extends BorrowStrategy {

    public NoCategoryLimitBorrowStrategy(int max, int borrow_days_limit)
    {
        this.max = max;
        this.borrow_days_limit = borrow_days_limit;
    }

    @Override
    protected boolean hasCategoryLimit() {
        return false;
    }

    @Override
    protected boolean hasMaxLimit() {
        return true;
    }

    @Override
    protected boolean hasBorrowDaysLimit() {
        return true;
    }
}
