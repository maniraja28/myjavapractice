package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubstractionTest {

	@Test
	void test() {
		Substraction s = new Substraction();
		int res = s.sub(30, 20);
		assertEquals(10, res);
	}

}
