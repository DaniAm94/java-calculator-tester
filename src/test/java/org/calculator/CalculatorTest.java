package org.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertEquals(8.0, Calculator.add(5.0f,3.0f), "Deve restituire 8.0");
        assertEquals(2.0, Calculator.add(5.0f,-3.0f));
    }

    @Test
    void subtract() {
        assertEquals(8.0, Calculator.subtract(12.0f,4.0f));
        assertEquals(16.0, Calculator.subtract(12.0f,-4.0f));
        assertEquals(0.0, Calculator.subtract(6.5f,6.5f));
    }

    @Test
    void multiply() {
        assertEquals(12.0, Calculator.multiply(3.0f, 4.0f));
        assertEquals(0.0, Calculator.multiply(3.0f, 0.0f));
        assertEquals(0.0, Calculator.multiply(-3.0f, 0.0f));
        assertEquals(-12.0, Calculator.multiply(3.0f, -4.0f));

    }

    @Test
    void divide() {
        assertEquals(3.0, Calculator.divide(12.0f, 4.0f));
        assertEquals(0.0, Calculator.divide(0.0f, -4.0f));
        assertEquals(0.0, Calculator.divide(0.0f, 4.0f));
        assertEquals(Float.NaN, Calculator.divide(0.0f, 0.0f));
        assertEquals((float) Double.POSITIVE_INFINITY, Calculator.divide(2.0f, 0.0f));
    }
}