package chapter14;

import java.util.ArrayList;
import java.util.List;

public class Phone {
    private RatePolicy ratePolicy;
    private List<Call> calls = new ArrayList<Call>();

    public Phone(RatePolicy ratePolic) {
        this.ratePolicy = ratePolicy;
    }

    public List<Call> getCalls() {
        return calls;
    }

    public Money calculateFee(){
        return ratePolicy.calculateFee(this);
    }

    public void call(Call call) {
    }
}
