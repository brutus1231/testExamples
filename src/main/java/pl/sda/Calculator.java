package pl.sda;

public class Calculator {

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
}
