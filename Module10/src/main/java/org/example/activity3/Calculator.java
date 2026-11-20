package org.example.activity3;

// 3.1 Create Calculator class

public class Calculator {

// 3.1.1 Create 2 add methods (apply method overloading - name of method should be same)

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    // 3.1.2 Create subtract method

    public int subtract(int a, int b) {
        return a - b;
    }

    // 3.1.3 Create divide method (apply java exception and write try and catch of invalid inputs)

    public int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Incorrect calculation");
            throw e;
        }

    }

    // 3.1.4 Create multiply method ( apply customized exception for invalid input - compulsory to write try catch even if you use throws)

    public int multiply(int a, int b) throws InvalidInputException {

        try {
            if (a < 0 || b < 0) {
                throw new InvalidInputException();
            }

            return a * b;

        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
            throw e;
        }

    }

}
