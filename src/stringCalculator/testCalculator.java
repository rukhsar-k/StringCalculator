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
	
	@Test
    public void moreThanTwoInputStringSeparatedByComma(){
    	assertEquals(6, Calculator.add("1,2,3"));
    }
	
	@Test
    public void inputStringWithNewLine(){
    	assertEquals(6, Calculator.add("1\n2,3"));
    }
	
	@Test
    public void inputStringOfOtherDelimiter(){
    	assertEquals(3, Calculator.add("//;\n1;2"));
    }
	
	@Test
    public void inputStringWithNegativeNum(){
    	try {
			Calculator.add("-1,2");
		}
		catch (IllegalArgumentException e){
			assertEquals(e.getMessage(), "Negatives not allowed");
		}
    }
}
