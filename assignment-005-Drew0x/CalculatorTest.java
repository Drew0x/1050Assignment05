import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	final double delta = 0.0000001; // gives a consistent value to ensure that assert equals works with a double value given a degree of variation
	
	@Test//Testing the add function by adding two generic numbers to ensure it works
	public void testadd() 
	{
		Calculator obj1 = new Calculator();
		int testVariable = obj1.add(3, 5);
		assertEquals(8, testVariable);
		testVariable = obj1.add(500,500);
		assertEquals(1000, testVariable);
		testVariable = obj1.add(-2,-2);
		assertEquals(-4, testVariable);
	}
	
	@Test//Testing the subtract function by subtracting two generic numbers to ensure it works.
	public void testsubtract() {
		Calculator obj2 = new Calculator();
		int testVariable = obj2.subtract(5, 3);
		assertEquals(2, testVariable);
		testVariable = obj2.subtract(-5, -5);
		assertEquals(0, testVariable);
		testVariable = obj2.subtract(5000,-4592);
		assertEquals(9592, testVariable);
	}
	
	@Test//Testing the multiplication function by multiplying two numbers to ensure it works.
	public void testMultiplication() {
		Calculator obj3 = new Calculator();
		int testVariable = obj3.multiply(2,2);
		assertEquals(4, testVariable);	
		testVariable = obj3.multiply(-4, -4);
		assertEquals(16, testVariable);
		testVariable = obj3.multiply(1000, 5);
		assertEquals(5000, testVariable);
	}	
	
	@Test//Testing the dividing function with two values and two distinctions being a smaller number and a larger number and two numbers of the same.
	public void testdivde() {
		Calculator obj4 = new Calculator();
		int testVariable = obj4.divide(2,2);
		assertEquals(1, testVariable);
		testVariable = obj4.divide(2000,10);
		assertEquals(200,testVariable);
		testVariable = obj4.divide(0, 3);
		assertEquals(0,testVariable);
	}
	
	@Test //Testing the divide by zero to ensure it works. Assert equals verifies that the call out for the illegal argument is called out.
	public void testDivideByZero() {
		Calculator obj= new Calculator();
		Exception testing = assertThrows(IllegalArgumentException.class,() -> {
			obj.divide(10, 0);
		});
				assertEquals("Cannot divide by zero", testing.getMessage());
	}
	
	@Test //Tests to verify that a remaining value is obtained.
	public void testmodulus() {
		Calculator obj5 = new Calculator();
		int testVariable = obj5.modulus(17,7);
		assertEquals(3, testVariable);
		testVariable = obj5.modulus(25,6);
		assertEquals(1,testVariable);
		testVariable = obj5.modulus(-5, 2);
		assertEquals(-1,testVariable);
	}
	
	@Test //Tests to verify that the assertThrows calls the illegal argument exception to verify it works when modulus by 0 is called.
	public void testmodulusZero() {
		Calculator obj= new Calculator();
		Exception testing = assertThrows(IllegalArgumentException.class,() -> {
			obj.modulus(5,0);
	});
			assertEquals("Cannot take modulus by zero", testing.getMessage());
	}
		
	@Test//Tests the exponent values with the delta variable. Allows to int variables to be called but a double result
	public void testExponent() {
		Calculator c1 = new Calculator();
		double result = c1.power(2,3);
		assertEquals(8.0 ,result, delta);
		result =c1.power(5, 5);
		assertEquals(3125, result,delta);
	}
	
	@Test //Tests the square root function to verify that the degree of accuracy is correct using the delta call out with a double variable
	public void testsquareRoot() {
		Calculator obj7 = new Calculator();
		double testVariable = obj7.squareRoot(4.0);
		assertEquals(2.0, testVariable, delta);// setup accuracy how  to specify number of decimal 2 v 2.0	
		testVariable = obj7.squareRoot(169);
		assertEquals(13, testVariable, delta);
		testVariable = obj7.squareRoot(0);
		assertEquals(0, testVariable,delta);
	}
	
	@Test //Tests the negative square root call out to ensure an illegal argument exception is thrown
	public void testnegativeSquareroot() {
		Calculator obj= new Calculator();
		Exception testing = assertThrows(IllegalArgumentException.class,() -> {
			obj.squareRoot(-10);
	});
			assertEquals("Cannot take square root of a negative number", testing.getMessage());
	}
	
	@Test //Tests the absolute value function using a positive and negative value to ensure it operates correctly
	public void testAbsolute() {
		Calculator obj8 = new Calculator();
		int testVariable = obj8.absolute(5);
		assertEquals(5,testVariable);
		testVariable = obj8.absolute(-5);
		assertEquals(5, testVariable);
		testVariable = obj8.absolute(-5959);
		assertEquals(5959,testVariable);
	}
	
	@Test //Tests the factorial function
	public void testfactorial() {
		Calculator obj9 = new Calculator();
		int testVariable = obj9.factorial(5);
		assertEquals(120, testVariable);
	}
	
	@Test //Tests to verify that an illegal argument exception is thrown in the condition that the factorial is 0
	public void testfactorialisZero() {
		Calculator obj= new Calculator();
		Exception Testing = assertThrows(IllegalArgumentException.class,() -> {
			obj.factorial(-5);
	});
			assertEquals("Cannot calculate factorial of a negative number", Testing.getMessage());
	}		
	
	@Test //Tests the average function with two int inputs and a double output.
	public void testAverage() {
		Calculator obj10 = new Calculator();
		double testVariable = obj10.average(5, 5);
		assertEquals(5.0, testVariable, delta);
		testVariable = obj10.average(30, 2);
		assertEquals(16, testVariable, delta);
 
	}
	
	
}

/*The total code coverage was 100% for calculator and the test file with the assignment 
 * resulting a 95% coverage percentage. Each code path was covered. 
 */

