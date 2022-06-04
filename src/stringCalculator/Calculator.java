package stringCalculator;

public class Calculator {

	public static int add(String input) {
		String[] num = input.split(","); 
		
		if(input.equals(""))
			return 0;
		if(input.length() == 1)
			return stringToInt(input);
		else
			return stringToInt(num[0]) + stringToInt(num[1]);
	}

	private static int stringToInt(String n) {
		return Integer.parseInt(n);
	}
}