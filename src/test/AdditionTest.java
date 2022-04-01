package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdditionTest {

	@Test
	void Addition() {
		Addition a = new Addition();
		int res = a.add(10, 20);
		assertEquals(30,res);
		
	}

}
