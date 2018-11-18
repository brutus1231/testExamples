package pl.sda;

import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

public class CalculatorTest {

    private static int scale;

    @BeforeAll
    static void beforeAll() {
        System.out.println("before all");
        scale = 2;
    }

    @AfterAll
    static void afterAll(){
        System.out.println("after all");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("before each");
    }

    @AfterEach
    void afterEach() {
        System.out.println("after each");
    }

    @Test
    void testAdd() {
        //given
        Calculator calculator = new Calculator();
        //when
        Integer addResult = calculator.add(3, 5);
        Integer result = 8;
        //then
        assertEquals(addResult, result);
    }

    @Test
    void testMinusNumbers() {
        //given
        Calculator calculator = new Calculator();
        //when
        Integer addResult = calculator.add(-3, -5);
        //then
        Integer result = -8;
        Assertions.assertEquals(addResult, result);
    }

//    @Disabled
    @Test
    void testReturn10WhenSubtract10AndZero(){
        Calculator calculator = new Calculator();
        Integer subtractResult = calculator.subtract(10, 0);
        assertTrue(subtractResult == 10);
    }

    @ParameterizedTest
    @MethodSource("addNumberProvider")
    void testParametrizedAdd(Integer first, Integer second,
                             Integer result) {
        Calculator calculator = new Calculator();
        Integer addResult = calculator.add(first, second);
        assertEquals(result, addResult);
        Assertions.assertNotNull(addResult);
    }

    static Stream<Arguments> addNumberProvider() {
        return Stream.of(
            arguments(1,2,3),
            arguments(3,5,8),
            arguments(0,7,7)
        );
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,5})
    void testValueSourceAdd(Integer number){
        //given
        Calculator calculator = new Calculator();
        //when
        Integer addResult = calculator.add(number, number);
        Integer result = 2 * number;
        //then
        Assertions.assertEquals(addResult, result);
    }

    @Test
    void testShouldThrowDivideByZeroException() {
        //given
        Calculator calculator = new Calculator();
        //when
        //then
        Assertions.assertThrows(DivideByZeroDenominatorException.class,
                () -> calculator.divide(9,0));
        Assertions.assertDoesNotThrow(() -> calculator.divide(9,1));
    }
}
