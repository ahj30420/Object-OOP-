package chapter11.step01;

import chapter11.Money;

import java.time.Duration;

public class TaxableNightlylDiscountoPhone extends NightlyDiscountPhone{
    private double taxRate;

    public TaxableNightlylDiscountoPhone(Money nightlyAmount, Money regularAmount, Duration seconds, double taxRate) {
        super(nightlyAmount, regularAmount, seconds);
        this.taxRate = taxRate;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return fee.plus(fee.times(taxRate));
    }
}
