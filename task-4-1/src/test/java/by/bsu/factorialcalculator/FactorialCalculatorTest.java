package by.bsu.factorialcalculator;

import junit.framework.TestCase;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FactorialCalculatorTest extends TestCase {
    private final FactorialCalculator calculator = new FactorialCalculator();


    public void testGetFirstNFactorials() {
        int i = 0;
        List<BigInteger> result = calculator.getFirstNFactorials(i);
        List<BigInteger> expected = new ArrayList<>();

        assertEquals(expected, result);

        i = 1;
        result = calculator.getFirstNFactorials(i);
        expected = List.of(BigInteger.ONE);

        assertEquals(expected, result);

        i = 3;
        result = calculator.getFirstNFactorials(i);
        expected = List.of(
                BigInteger.ONE,
                BigInteger.TWO,
                BigInteger.TWO.multiply(BigInteger.valueOf(3))
        );

        assertEquals(expected, result);
    }
}