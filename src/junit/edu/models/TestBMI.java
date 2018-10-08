package junit.edu.models;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestBMI {
	@Test
	public void testWeightHeight() {
		String demo = DemojUnit.BMI(60.0, 1.75);
		assertEquals("Bình thường", demo);
		
	}
}
