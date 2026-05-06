package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testCalc() {
        Calculator calculator = new Calculator();

        double result = calculator.calculateResult(2, 3);

        assertEquals(0.8333, result, 0.0001);
    }
}