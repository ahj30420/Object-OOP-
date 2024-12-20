package chapter10.step04;

import chapter10.Call;
import chapter10.Money;

import java.time.Duration;

public class NightlyDiscountPhone extends Phone{
    private static final int LATE_NIGHT_HOUR = 22;

    private Money nightlyAmount;
    private Money regularAmount;
    private Duration seconds;

    public NightlyDiscountPhone(Money nightlyAmount, Money regularAmount, Duration seconds) {
        this.nightlyAmount = nightlyAmount;
        this.regularAmount = regularAmount;
        this.seconds = seconds;
    }

    @Override
    protected Money calculateCallFee(Call call){
        if(call.getFrom().getHour() >= LATE_NIGHT_HOUR){
           return nightlyAmount.times(call.getDuration().getSeconds() / seconds.getSeconds());
        } else{
            return regularAmount.times(call.getDuration().getSeconds() / seconds.getSeconds());
        }
    }
}
