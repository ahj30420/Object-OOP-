package chapter05.movie.step01;

import chapter05.Money;
import chapter05.MovieType;
import chapter05.Screening;
import chapter05.discountCondition.step02.DiscountCondition;

import java.time.Duration;
import java.util.List;

public class Movie {
    private String title;
    private Duration duration;
    private Money fee;
    private List<DiscountCondition> discountConditions;

    private MovieType movieType;
    private Money discountAmount;
    private double discountPercentage;

    public Money calculateMovieFee(Screening screening){
        if(isDiscountable(screening)){
            return fee.minus(calculateDiscountAmount());
        }

        return fee;
    }

    private  boolean isDiscountable(Screening screening){
        return discountConditions.stream()
                .anyMatch(condition -> condition.isSatisfiedBy(screening));
    }


    private Money calculateDiscountAmount(){
        switch (movieType){
            case AMOUNT_DISCOUNT:
                return calculateAmountDiscountAmount();
            case PERCENT_DISCOUNT:
                return calculatePercentDiscountAmount();
            case NONE_DISCOUNT:
                return calculateNoneDiscountAmount();
        }

        throw new IllegalArgumentException("Unsupported movie type");
    }

    private Money calculateAmountDiscountAmount(){
        return discountAmount;
    }

    private Money calculatePercentDiscountAmount(){
        return fee.times(discountPercentage);
    }

    private Money calculateNoneDiscountAmount(){
        return Money.ZERO;
    }
}
