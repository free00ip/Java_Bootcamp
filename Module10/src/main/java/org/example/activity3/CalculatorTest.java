package org.example.activity3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

// 3.2 Create CalculatorTest class (Min 10 tests in total - please read below)

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
        calculator = null;
    }

    @Test
    public void testSumSub() {

        /* Min 4 test cases of add method (use both overloaded methods, don't just create 4 test cases for 1 method) and min 2 cases for subtract method */

        assertEquals(5, calculator.add(1, 4));
        assertEquals(-5, calculator.add(-3, -2));

        assertEquals(3.2, calculator.add(0, 3.2), 0.0001);
        assertEquals(-3.7, calculator.add(-3.7, 0), 0.0001);
        assertEquals(-40.3, calculator.add(-5.8, -34.5), 0.0001);

        assertEquals(-2, calculator.subtract(2, 4));
        assertEquals(2, calculator.subtract(5, 3));
        assertEquals(-3, calculator.subtract(0, 3));
        assertEquals(5, calculator.subtract(5, 0));

    }

    @Test
    public void testDiv() {

        /* Min 2 test cases of divide method, multiply method (should have at least 1 case of exception handling test condition) */

        assertEquals(5, calculator.divide(10, 2));
        assertEquals(-3, calculator.divide(-9, 3));


    }

    @Test
    public void testDivError() {

        /* Min 2 test cases of divide method, multiply method (should have at least 1 case of exception handling test condition) */

        boolean exceptionCaught = false;

        try {
            calculator.divide(5, 0);
        } catch (ArithmeticException e) {
            exceptionCaught = true;
        }

        assertEquals(true, exceptionCaught);

    }

    @Test
    public void testMul() throws InvalidInputException {

        /* Min 2 test cases of divide method, multiply method (should have at least 1 case of exception handling test condition) */

        assertEquals(9, calculator.multiply(3, 3));
        assertEquals(0, calculator.multiply(0, 5));


        boolean exceptionCaught = false;
        try {
            calculator.multiply(-2, 4);
        } catch (InvalidInputException e) {
            exceptionCaught = true;
            assertEquals("Negative arguments are not allowed", e.getMessage());
        }

        assertEquals(true, exceptionCaught);

        exceptionCaught = false;
        try {
            calculator.multiply(2, -6);
        } catch (InvalidInputException e) {
            exceptionCaught = true;
            assertEquals("Negative arguments are not allowed", e.getMessage());
        }

        assertEquals(true, exceptionCaught);

    }

    // 3.2.3 Optional: Run by coverage and try to get 100% coverage of tests
    // *done
}
