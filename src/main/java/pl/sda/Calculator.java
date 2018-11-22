package pl.sda;

import java.math.BigDecimal;

public class Calculator {

    PremiumCalcultor premiumCalcultor;

    public Calculator(PremiumCalcultor premiumCalcultor){
        this.premiumCalcultor = premiumCalcultor;
    }

    public Integer add(Integer first, Integer next) {
        return first + next;
    }

    Integer subtract(Integer first, Integer next){
        return first - next;
    }

    Integer multiply(Integer first, Integer next){
        throw new NullPointerException();
    }

    Integer divide(Integer first, Integer second) {

        if (second == 0) {
            throw new DivideByZeroDenominatorException();
        }
        return first/second;
    }

    BigDecimal calculateCommission(BigDecimal initalCommission, int type){
        BigDecimal grossCommission = initalCommission.multiply(new BigDecimal(1.23));
        BigDecimal premiumCommission = premiumCalcultor.calculateCommission(grossCommission);
        if (type == 1) {
            return grossCommission;
        }
        return premiumCommission;

    }
}
