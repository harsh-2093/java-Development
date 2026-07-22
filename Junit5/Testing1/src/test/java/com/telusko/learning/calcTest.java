package com.telusko.learning;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void testDivide() {
        calc c = new calc();

        // Assert that 10 / 2 equals 5
        assertEquals(5, c.divide(10, 2));
    }

    @Test
    void testDivideByZero() {
        calc c = new calc();

        // Optional: Assert that dividing by zero throws an ArithmeticException
        assertThrows(ArithmeticException.class, () -> c.divide(10, 0));
    }
}