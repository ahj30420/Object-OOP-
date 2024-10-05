package chapter02.discountPolicy;

import chapter02.discountCondition.DiscountCondition;
import chapter02.Money;
import chapter02.Screening;

public class PercentDiscountPolicy extends DefaultdiscountPolicy {
    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
