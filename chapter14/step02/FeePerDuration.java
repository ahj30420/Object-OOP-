package chapter14.step02;

import chapter14.Money;
import chapter14.DateTimeInterval;

import java.time.Duration;

public class FeePerDuration {
    private Money fee;
    private Duration duration;

    public FeePerDuration(Money fee, Duration duration) {
        this.fee = fee;
        this.duration = duration;
    }

    public Money calculate(DateTimeInterval interval){
        return fee.times(Math.ceil((double)interval.duration().toNanos() / duration.toNanos()));
    }
}
