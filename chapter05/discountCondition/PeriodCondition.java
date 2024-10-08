package chapter05.discountCondition;

import chapter05.Screening;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class PeriodCondition implements DiscountCondition {
    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    public PeriodCondition(DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime) {
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.getWhenScreened().getDayOfMonth() == dayOfWeek.getValue() &&
                !startTime.isAfter(screening.getWhenScreened().toLocalTime()) &&
                !endTime.isBefore(screening.getWhenScreened().toLocalTime());
    }
}
