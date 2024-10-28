package chapter09.factory.step01;

import chapter09.AmountDiscountPolicy;
import chapter09.Money;
import chapter09.Movie;

import java.time.Duration;

public class Client {
    public Money getAvatarFee(){
        Movie avatar = new Movie("아바타",
                Duration.ofMinutes(120),
                Money.wons(10000),
                new AmountDiscountPolicy());

        return avatar.getFee();
    }
}
