package pl.sda;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;

public class Main {

    public static void main(String[] args) {


        BigDecimal first = new BigDecimal("10.01");
        BigDecimal second = new BigDecimal("10.01");

        System.out.println(first.subtract(second).abs());
        System.out.println(first.subtract(second).abs().compareTo(new BigDecimal("0.01")) <= 0);

        String percentage = "18%";
        System.out.println(new BigDecimal(percentage.trim().replace("%", "")).divide(BigDecimal.valueOf(100)));

        System.out.println(new BigDecimal("1.55").divide(new BigDecimal("99.8"), RoundingMode.HALF_UP));

    }
}
