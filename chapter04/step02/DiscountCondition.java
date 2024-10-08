package chapter04.step02;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class DiscountCondition {
    private DiscountConditionType type;
    private int sequence;
    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    public DiscountConditionType getType() {
        return type;
    }

    public boolean isDiscountable(DayOfWeek dayOfWeek, LocalTime time) {
        if(type != DiscountConditionType.PERIOD){
            throw new IllegalArgumentException("DiscountConditionType must be PERIOD");
        }

        return this.dayOfWeek.equals(dayOfWeek) &&
                !this.startTime.isAfter(time) &&
                !this.endTime.isBefore(time);
    }

    public boolean isDiscountable(int sequence){
        if(type != DiscountConditionType.SEQUENCE){
            throw new IllegalArgumentException("DiscountConditionType must be SEQUENCE");
        }

        return this.sequence == sequence;
    }
}
