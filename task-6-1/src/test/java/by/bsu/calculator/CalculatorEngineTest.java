package by.bsu.calculator;

import by.bsu.connection.DBGateForCalculations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CalculatorEngineTest {
    private final DBGateForCalculations dbGateForCalculations = Mockito.mock(DBGateForCalculations.class);
    private final Calculator calculator = new CalculatorEngine(dbGateForCalculations);

    @Test
    public void testCalc() {
        Mockito.when(dbGateForCalculations.getValueFromDB()).thenReturn(1);
        Assertions.assertEquals(7, calculator.calc(4, 3));
    }

    @Test
    public void testProcess() {
        Mockito.when(dbGateForCalculations.getValueFromDB()).thenReturn(1);
        Assertions.assertEquals(5, calculator.process(7, 2));
    }
}