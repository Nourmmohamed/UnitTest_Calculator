import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDemo {

    private static CalculatorFunctions cf;

    @BeforeAll
    public static void init(){
        cf = new CalculatorFunctions();
    }

    @Test
    public void additionTest() {
        double add = cf.addition(10, 2);
        assertEquals(12, add);
    }

    @Test
    public void subtractionTest() {
        double sub = cf.subtraction(10, 2);
        assertEquals(8, sub);
    }

    @Test
    public void multiplicationTest() {
        double mul = cf.multiplication(10, 2);
        assertEquals(20, mul);
    }

    @Test
    public void divisionTest(){
        double div = cf.division(10,2);
        assertEquals(5, div);

    }
    @Test
    public void squareTest(){
        double sqr = cf.square(10);
        assertEquals(100, sqr);

    }
    @Test
    public void modularTest(){
        double mod = cf.modular(10,2);
        assertEquals(0, mod);

    }
}
