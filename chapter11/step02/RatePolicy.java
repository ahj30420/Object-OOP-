package chapter11.step02;

import chapter11.Money;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}
