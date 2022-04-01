package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AirthmeticOPerationsTest {

//	// unit testing  -> effectives, efficiency and robustness of the code
//
	@Test
	void mutiplicationTest() {
		AirthmeticOperations mc = new AirthmeticOperations();
		int res = mc.multiply(5, 4);
		assertEquals(20, res); //// assertions
		
	}
	
	@Test
	void mutiplicationThreeTest() {
		AirthmeticOperations mc = new AirthmeticOperations();
		int res = mc.multiply(1,2,3);
		assertEquals(6, res); // assertions
		
	}

	@Test
	void additionTest() {
		AirthmeticOperations ao = new AirthmeticOperations();
		int res =ao.addition(3,5);
		assertEquals(8, res);
		
		
	}
	@Test
	void substractionTest() {
		AirthmeticOperations ao = new AirthmeticOperations();
		int res =ao.substraction(10,5);
		assertEquals(5, res);
	}

	@Test
	void divisibleTest() {
		AirthmeticOperations ao = new AirthmeticOperations();
		int res = ao.divisable(100, 5);
		assertEquals(20, res);
	}
@Test
void remainderTest() {
	AirthmeticOperations ao = new AirthmeticOperations();
	 int res = ao.remainder(10, 5);
	 assertEquals(0, res);
}
}
