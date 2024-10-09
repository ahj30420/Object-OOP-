package chapter05.discountCondition.step02;

import chapter05.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
