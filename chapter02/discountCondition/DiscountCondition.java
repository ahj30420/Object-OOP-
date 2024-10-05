package chapter02.discountCondition;

import chapter02.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
