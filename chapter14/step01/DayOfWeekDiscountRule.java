package chapter14.step01;

import chapter14.DateTimeInterval;
import chapter14.Money;

import java.time.DayOfWeek;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class DayOfWeekDiscountRule {
    private List<DayOfWeek> daysOfWeek = new ArrayList<>();
    private Duration duration = Duration.ZERO;
    private Money amount = Money.ZERO;

    public DayOfWeekDiscountRule(List<DayOfWeek> daysOfWeek, Duration duration, Money amount) {
        this.daysOfWeek = daysOfWeek;
        this.duration = duration;
        this.amount = amount;
    }

    public Money calculate(DateTimeInterval interval){
        if(daysOfWeek.contains(interval.getFrom().getDayOfWeek())){
            return amount.times(interval.duration().getSeconds() / duration.getSeconds());
        }

        return Money.ZERO;
    }


}
