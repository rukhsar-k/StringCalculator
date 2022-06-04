package stringCalculator;

public class Calculator {

	public static int add(String input) {
		String[] num = input.split(","); 
		int sum = 0;
		
		if(input.equals(""))
			return 0;
		if(input.length() == 1)
			return stringToInt(input);
		else {
			for(String currentNum : num)
				sum += stringToInt(currentNum);
			return sum;
		}
	}

	private static int stringToInt(String n) {
		return Integer.parseInt(n);
	}
}