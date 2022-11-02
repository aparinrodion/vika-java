package by.bsu.calculator;

import by.bsu.connection.DBGateForCalculations;

public class CalculatorEngine implements Calculator {
    private final DBGateForCalculations dbGateForCalculations;

    public CalculatorEngine(DBGateForCalculations dbGateForCalculations) {
        this.dbGateForCalculations = dbGateForCalculations;
    }

    public int calc(int a, int b) {
        return (a + b) * dbGateForCalculations.getValueFromDB();
    }

    public int process(int a, int b) {
        return (a - b) * dbGateForCalculations.getValueFromDB();
    }
}
