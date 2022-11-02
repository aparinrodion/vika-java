package by.bsu;

import by.bsu.exception.IncorrectParameter;
import by.bsu.factorialcalculator.FactorialCalculator;

public class App {
    public static void main(String[] args) {
        FactorialCalculator calculator = new FactorialCalculator();
        try {
            System.out.println(calculator.getFirstNFactorials(3));
        } catch (IncorrectParameter e) {
            System.out.println(e.getMessage());
        }
    }
}
