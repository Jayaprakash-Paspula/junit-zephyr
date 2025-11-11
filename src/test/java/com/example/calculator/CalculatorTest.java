package com.example.calculator;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@Epic("Calculator Operations")
@Feature("Basic Arithmetic")
public class CalculatorTest {
    
    private Calculator calculator;
    
    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }
    
    @Test
    @Story("Addition")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test addition of two positive numbers")
    @DisplayName("Add two positive numbers")
    @TmsLink("CALC-001")
    public void testAddPositiveNumbers() {
        int result = calculator.add(5, 3);
        assertEquals(8, result, "5 + 3 should equal 8");
    }
    
    @Test
    @Story("Addition")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test addition with negative numbers")
    @DisplayName("Add positive and negative numbers")
    @TmsLink("CALC-002")
    public void testAddWithNegative() {
        int result = calculator.add(10, -5);
        assertEquals(5, result, "10 + (-5) should equal 5");
    }
    
    @Test
    @Story("Subtraction")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test subtraction of two numbers")
    @DisplayName("Subtract two numbers")
    @TmsLink("CALC-003")
    public void testSubtract() {
        int result = calculator.subtract(10, 4);
        assertEquals(6, result, "10 - 4 should equal 6");
    }
    
    @Test
    @Story("Multiplication")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test multiplication of two numbers")
    @DisplayName("Multiply two numbers")
    @TmsLink("CALC-004")
    public void testMultiply() {
        int result = calculator.multiply(6, 7);
        assertEquals(42, result, "6 * 7 should equal 42");
    }
    
    @Test
    @Story("Division")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test division of two numbers")
    @DisplayName("Divide two numbers")
    @TmsLink("CALC-005")
    public void testDivide() {
        double result = calculator.divide(10, 2);
        assertEquals(5.0, result, 0.001, "10 / 2 should equal 5.0");
    }
    
    @Test
    @Story("Division")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Test division by zero throws exception")
    @DisplayName("Division by zero should throw exception")
    @TmsLink("CALC-006")
    public void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }
    
    @Test
    @Story("Modulo")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test modulo operation")
    @DisplayName("Calculate modulo of two numbers")
    @TmsLink("CALC-007")
    public void testModulo() {
        int result = calculator.modulo(10, 3);
        assertEquals(1, result, "10 % 3 should equal 1");
    }
    
    @Test
    @Story("Modulo")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test modulo by zero throws exception")
    @DisplayName("Modulo by zero should throw exception")
    @TmsLink("CALC-008")
    public void testModuloByZero() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.modulo(10, 0);
        });
    }
    
    @Test
    @Story("Power")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test power calculation")
    @DisplayName("Calculate power of a number")
    @TmsLink("CALC-009")
    public void testPower() {
        double result = calculator.power(2, 3);
        assertEquals(8.0, result, 0.001, "2^3 should equal 8.0");
    }
    
    @Test
    @Story("Square Root")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test square root calculation")
    @DisplayName("Calculate square root")
    @TmsLink("CALC-010")
    public void testSquareRoot() {
        double result = calculator.squareRoot(16);
        assertEquals(4.0, result, 0.001, "√16 should equal 4.0");
    }
    
    @Test
    @Story("Square Root")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test square root of negative number throws exception")
    @DisplayName("Square root of negative should throw exception")
    @TmsLink("CALC-011")
    public void testSquareRootNegative() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.squareRoot(-1);
        });
        assertTrue(exception.getMessage().contains("negative"));
    }
    
    @AfterEach
    public void tearDown() {
        calculator = null;
    }
}
