package test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import logic.WeightConversion;;

public class TestWeightConversion {
	@Test
	public void TestPoundsToKilos(){
		WeightConversion weights = new WeightConversion();
		double kilos = weights.PoundsToKilos(1.0);
		assertEquals(kilos,  0.454, 0);
	}
	
	@Test
	public void TestKilosToPounds(){
		WeightConversion weights = new WeightConversion();
		double pounds = weights.KilosToPounds(0.454);
		assertEquals(pounds, 1.0, 0);
	}
}
