package pojo;

import java.math.BigDecimal;

public abstract class Account {

    private BigDecimal accountId;
    private double value;
    private InterestRateBehavior interestRateBehavior;

    public Account(InterestRateBehavior interestRateBehavior) {
        this.interestRateBehavior = interestRateBehavior;
    }

    public BigDecimal getAccountId(){
        return accountId;
    }

    public double getValue() {
        return value;
    }

    public double getMouthComission() {
        return interestRateBehavior.getMounthСommission();
    }

    public double getPaymentComission() {
        return interestRateBehavior.getPaymentComission();
    }

}
