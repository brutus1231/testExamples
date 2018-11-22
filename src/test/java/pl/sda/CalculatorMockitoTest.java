package pl.sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.math.BigDecimal;

public class CalculatorMockitoTest {

    @Test
    void testCommission() {
        PremiumCalcultor premiumCalcultor = Mockito.mock(PremiumCalcultor.class);
        Calculator calculator = new Calculator(premiumCalcultor);

        Mockito.when(premiumCalcultor.calculateCommission(Mockito.any(BigDecimal.class))).thenReturn(BigDecimal.ZERO);
        BigDecimal commission = calculator.calculateCommission(BigDecimal.TEN, 1);


        Assertions.assertNotNull(commission);

    }
}
