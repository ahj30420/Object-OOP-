package chapter11.step02;

import chapter11.Call;
import chapter11.Money;

import java.time.Duration;

public class RegularPolicy extends BasicRatePolicy{

    private Money amount;
    private Duration seconds;

    public RegularPolicy(Money amount, Duration seconds) {
        this.amount = amount;
        this.seconds = seconds;
    }

    @Override
    protected Money calculateCallFee(Call call) {
        return amount.times(call.getDuration().getSeconds() / seconds.getSeconds());
    }
}
