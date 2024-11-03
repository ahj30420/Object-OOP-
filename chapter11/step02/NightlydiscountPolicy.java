package chapter11.step02;

import chapter11.Call;
import chapter11.Money;

import java.time.Duration;

public class NightlydiscountPolicy extends BasicRatePolicy{
    private static final int LATE_NIGHT_HOUR=22;

    private Money nightlyAmount;
    private Money regularAmount;
    private Duration seconds;

    public NightlydiscountPolicy(Money nightlyAmount, Money regularAmount, Duration seconds) {
        this.nightlyAmount = nightlyAmount;
        this.regularAmount = regularAmount;
        this.seconds = seconds;
    }

    @Override
    protected Money calculateCallFee(Call call) {
        if(call.getFrom().getHour() >= LATE_NIGHT_HOUR) {
            return nightlyAmount.times(call.getDuration().getSeconds() / seconds.getSeconds());
        }

        return regularAmount.times(call.getDuration().getSeconds() / seconds.getSeconds());
    }
}
