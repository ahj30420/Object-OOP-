package chapter11.step02;

import chapter11.Call;
import chapter11.Money;

import java.util.ArrayList;
import java.util.List;

public abstract class Phone {
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
}
