package by.bsu.factorialcalculator;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FactorialCalculator {
    public List<BigInteger> getFirstNFactorials(int n) {
        if (n == 0) {
            return new ArrayList<>();
        }

        List<BigInteger> factorials = new ArrayList<>();
        factorials.add(BigInteger.ONE);

        for (int i = 0; i < n-1; i++) {
            BigInteger factorial = factorials.get(i).multiply(BigInteger.valueOf(i + 2));
            factorials.add(factorial);
        }
        return factorials;
    }
}
