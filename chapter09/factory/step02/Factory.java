package chapter09.factory.step02;

import chapter09.AmountDiscountPolicy;
import chapter09.Money;
import chapter09.Movie;

import java.time.Duration;

public class Factory {
    public Movie createAvatarMovie() {
        return new Movie("아바타",
                Duration.ofMinutes(120),
                Money.wons(10000),
                new AmountDiscountPolicy());
    }
}
