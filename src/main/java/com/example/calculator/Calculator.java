package com.example.calculator;

/**
 * A simple calculator class for basic arithmetic operations
 */
public class Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
    
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return (double) a / b;
    }
    
    public int modulo(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Modulo by zero is not allowed");
        }
        return a % b;
    }
    
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
    
    public double squareRoot(double number) {
        if (number < 0) {
            throw new ArithmeticException("Cannot calculate square root of negative number");
        }
        return Math.sqrt(number);
    }
}
