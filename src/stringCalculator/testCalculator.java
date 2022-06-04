package stringCalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class testCalculator {

	@Test
	public void emptyString()
	{
		assertEquals(0, Calculator.add(""));
	}
	
	@Test
	public void singleInputString() {
		assertEquals(1, Calculator.add("1"));
	}
	
	@Test
	public void twoInputStringSeparatedByComma(){
		assertEquals(3, Calculator.add("1,2"));
	}
}
