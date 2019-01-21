package Business.Component1;

import java.sql.PreparedStatement;
import java.util.List;

/**
 * @author andi
 */
public class PreliminaryBorrowStrategy extends BorrowStrategy {

    public PreliminaryBorrowStrategy(List<String> categories, int max, int borrow_days_limit)
    {
        this.categories = categories;
        this.max = max;
        this.borrow_days_limit = borrow_days_limit;
    }

    @Override
    protected boolean hasCategoryLimit() {
        return true;
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
