package com.example.springdocker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathCalcTest {

    MathCalc mathCalc;

    @BeforeEach
    public void init() {
        mathCalc = new MathCalc();
    }

    @Test
    @DisplayName("MathCalc - addition")
    public void addTest() {
        assertEquals(14, mathCalc.add(7, 7));
        assertEquals(14, mathCalc.add(9, 5));
        assertEquals(14, mathCalc.add(1, 13));
        assertEquals(14, mathCalc.add(-14, 28));
    }

    @Test
    @DisplayName("MathCalc - multiplication")
    public void multiplyTest() {
        assertEquals(49, mathCalc.multiply(7, 7));
        assertEquals(45, mathCalc.multiply(9, 5));
        assertEquals(13, mathCalc.multiply(1, 13));
        assertEquals(-56, mathCalc.multiply(-2, 28));
    }

    @Test
    @DisplayName("MathCalc - division")
    public void divideTest() {
        assertEquals(3.5, mathCalc.divide(7, 2));
        assertEquals(1.8, mathCalc.divide(9, 5));
        assertEquals(6.5, mathCalc.divide(13, 2));
        assertEquals(2, mathCalc.divide(10, 5));
    }

    @Test
    @DisplayName("MathCalc - assert throw ArithmeticException when /0")
    public void divideThrowsExceptionTest() {
        assertThrows(ArithmeticException.class, () -> mathCalc.divide(1, 0));
    }

}