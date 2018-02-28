package quiz2;

import static org.junit.Assert.*;

import org.junit.Test;

public class testing {
	@Test
	public void testIP(){
	
		car testCar = new car (35000, 0, 60, 10);
		double expectedValue = 9618.79;
		double result = testCar.ip();
		assertEquals(expectedValue, result, 0.01);
		
	}
	public void testPay() {
		car testCar2 = new car (35000, 0 ,60, 10);
		double expected = 743.65;
		double result2 = testCar2.payment();
		assertEquals(expected,result2, 0.01);
	}
}

