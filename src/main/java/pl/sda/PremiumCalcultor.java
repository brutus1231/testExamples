package pl.sda;

import java.math.BigDecimal;

public class PremiumCalcultor {

    BigDecimal calculateCommission(BigDecimal initalCommission) {
        return initalCommission.min(BigDecimal.ONE);
    }
}
