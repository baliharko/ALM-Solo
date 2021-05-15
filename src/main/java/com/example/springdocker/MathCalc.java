package com.example.springdocker;

public class MathCalc {

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(double a, double b) {
       if (b == 0) {
           throw new ArithmeticException("Division by zero");
       }

       return a / b;
    }
}
