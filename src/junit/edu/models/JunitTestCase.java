package junit.edu.models;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitTestCase {
	@Test
	public void testMaxmin() {
		int i =DemojUnit.maxOfTwoNumberInterger(4, 7);
		assertEquals(7, i);
	}

}
