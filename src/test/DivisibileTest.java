package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivisibileTest {

	@Test
	void test() {
		Divisibile d = new Divisibile();
		int res = d.div(50, 5);
		assertEquals(10, res);
	}

}
