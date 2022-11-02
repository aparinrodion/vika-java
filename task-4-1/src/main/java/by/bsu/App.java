package by.bsu;

import by.bsu.factorialcalculator.FactorialCalculator;

public class App {
    public static void main(String[] args) {
        FactorialCalculator calculator = new FactorialCalculator();
        System.out.println(calculator.getFirstNFactorials(3));
    }
}
