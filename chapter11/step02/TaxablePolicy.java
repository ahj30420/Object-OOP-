package chapter11.step02;

import chapter11.Money;

public class TaxablePolicy extends AdditionalRatePolicy{
    private double taxRate;

    public TaxablePolicy(RatePolicy next, double taxRate) {
        super(next);
        this.taxRate = taxRate;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return fee.plus(fee.times(taxRate));
    }
}
