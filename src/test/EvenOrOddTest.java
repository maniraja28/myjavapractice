package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EvenOrOddTest {

	@Test
	void evenOrOddTest() {
		EvenOrOdd eoo = new EvenOrOdd();
		boolean res = eoo.isEvenOrOdd(20);
		assertEquals(true, res);
		
	}

}
