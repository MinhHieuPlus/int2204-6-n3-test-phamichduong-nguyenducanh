package junit.edu.models;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestArray {
	@Test
	public void testArray() {
		int min = DemojUnit.elementMinOfArray(new int[] {1,2,3,4,5});
		assertEquals(1, 1);
		assertEquals(DemojUnit.elementMinOfArray(new int[] {9,9,9,9,9,9,9}), 9);
	}
//	@Test(expected = IllegalArgumentException.class)
//	public void emptyArrayIsNotAcceptedArgument() {
//		DemojUnit obj = new DemojUnit();
//		obj.elementMinOfArray(new int[] {});
//	}
}
