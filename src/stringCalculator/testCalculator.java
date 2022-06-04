package stringCalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class testCalculator {

	@Test
	public void emptyString()
	{
		assertEquals(0, Calculator.add(""));
	}
}
