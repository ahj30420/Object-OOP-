package chapter11.step01;

import chapter11.Call;
import chapter11.Money;

import java.util.ArrayList;
import java.util.List;

public abstract class Phone {
    private List<Call> calls = new ArrayList<>();

    public Money calculateFee(){
        Money result = Money.ZERO;

        for(Call call : calls){
            result = result.plus(calculateCallFee(call));
        }

        return result;
    }

    public List<Call> getCalls() {
        return calls;
    }

    protected Money afterCalculated(Money fee){
        return fee;
    }

    protected abstract Money calculateCallFee(Call call);
}
