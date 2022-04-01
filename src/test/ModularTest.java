package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ModularTest {

	@Test
	void test() {
		Modular m = new Modular();
		int res = m.mod(10, 2);
		assertEquals(0, res);
		
	}

}
