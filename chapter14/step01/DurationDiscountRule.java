package chapter14.step01;

import chapter14.Call;
import chapter14.Money;
import chapter14.Phone;

import java.time.Duration;

public class DurationDiscountRule extends FixedFeePolicy{
    private Duration from;
    private Duration to;

    public DurationDiscountRule(Money amount, Duration seconds, Duration from, Duration to) {
        super(amount, seconds);
        this.from = from;
        this.to = to;
    }

    public Money calculate(Call call) {
        if(call.getDuration().compareTo(to) > 0){
            return Money.ZERO;
        }

        if(call.getDuration().compareTo(from) < 0){
            return Money.ZERO;
        }

        //부모 클래스의  calculateFee(phone)은 Phone 클래스를 파라미터로 받는다.
        //calculateFee(phone)을 재사용하기 위해
        //데이터를 전달할 용도로 임시 Phone을 만든다.
        Phone phone = new Phone(null);
        phone.call(new Call(call.getFrom().plus(from),
                call.getDuration().compareTo(to) > 0 ? call.getFrom().plus(to) : call.getTo()));

        return super.calculateFee(phone);
    }
}
