package chapter14.step01;

import chapter14.Call;
import chapter14.DateTimeInterval;
import chapter14.Money;

import java.util.ArrayList;
import java.util.List;

public class DayOfWeekDiscountPolicy extends BasicRatePolicy{
    private List<DayOfWeekDiscountRule> rules = new ArrayList<>();

    public DayOfWeekDiscountPolicy(List<DayOfWeekDiscountRule> rules) {
        this.rules = rules;
    }

    @Override
    protected Money calculateCallFee(Call call) {
        Money result = Money.ZERO;
        for(DateTimeInterval interval : call.getInterval().splitByDay()){
            for(DayOfWeekDiscountRule rule : rules){
                result.plus(rule.calculate(interval));
            }
        }
        return result;
    }
}
