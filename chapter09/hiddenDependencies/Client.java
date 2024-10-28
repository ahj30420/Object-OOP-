package chapter09.hiddenDependencies;

import chapter09.AmountDiscountPolicy;
import chapter09.Money;

import java.time.Duration;

public class Client {
    public static void main(String[] args) {
        ServiceLocator.provide(new AmountDiscountPolicy());
        Movie avatar = new Movie("아바타",
                Duration.ofMinutes(120),
                Money.wons(10000));
    }
}