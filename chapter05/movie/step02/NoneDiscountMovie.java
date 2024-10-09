package chapter05.movie.step02;

import chapter05.Money;
import chapter05.discountCondition.step02.DiscountCondition;

import java.time.Duration;

public class NoneDiscountMovie extends Movie {
    public NoneDiscountMovie(String title, Duration duration, Money fee, DiscountCondition... discountConditions) {
        super(title, duration, fee, discountConditions);
    }

    @Override
    protected Money calculateDiscountAmount() {
        return Money.ZERO;
    }
}
