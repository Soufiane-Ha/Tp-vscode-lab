package org.example;

public class Calculator {

    public double calculateResult(double firstNumber, double secondNumber) {

        double sum = firstNumber + secondNumber;
        double multiplication = firstNumber * secondNumber;

        return sum / multiplication;
    }

    public void printResult(double result) {
        System.out.println("Result: " + result);
    }
}