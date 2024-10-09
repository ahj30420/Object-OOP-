package chapter05.movie.step02;

import chapter05.Money;
import chapter05.discountCondition.step02.DiscountCondition;

import java.time.Duration;

public class PercentDiscountMovie extends Movie{
    private double percent;

    public PercentDiscountMovie(String title, Duration duration, Money fee, double percent, DiscountCondition... discountConditions) {
        super(title, duration, fee, discountConditions);
        this.percent = percent;
    }

    @Override
    protected Money calculateDiscountAmount() {
        return getFee().times(percent);
    }
}
