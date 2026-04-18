/**
 * A simple Calculator class that provides basic mathematical operations.
 */
public class Calculator {

    /**
     * Adds two integers and returns the result.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts the second integer from the first and returns the result.
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers and returns the result.
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides the first integer by the second and returns the result.
     * Throws an IllegalArgumentException if the divisor is zero.
     */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    /**
     * Returns the modulus (remainder) of the first integer divided by the second.
     * Throws an IllegalArgumentException if the divisor is zero.
     */
    public int modulus(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot take modulus by zero");
        }
        return a % b;
    }

    /**
     * Calculates and returns the result of raising the base to the power of the exponent.
     */
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    /**
     * Returns the square root of the given number.
     * Throws an IllegalArgumentException if the input is negative.
     */
    public double squareRoot(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Cannot take square root of a negative number");
        }
        return Math.sqrt(a);
    }

    /**
     * Returns the absolute value of the given integer.
     */
    public int absolute(int a) {
        return Math.abs(a);
    }

    /**
     * Calculates the factorial of a non-negative integer.
     * Throws an IllegalArgumentException if the input is negative.
     */
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Cannot calculate factorial of a negative number");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Calculates the average of two integers and returns the result as a double.
     */
    public double average(int a, int b) {
        return (a + b) / 2.0;
    }
}