package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringConcatTest {
	

	@Test
	void stringTest() {
	
		
		StringCancatination st = new StringCancatination();
		String res = st.concat("mani", "raja");
		assertEquals("MANIRAJA", res);
	}
	

}


//prime number logic true/false

