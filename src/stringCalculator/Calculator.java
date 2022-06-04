package stringCalculator;

public class Calculator {

	public static int add(String input) {
		int sum = 0;
		
		if(input.equals(""))
			return 0;
		else {
			String delimiter = ",";
			if(input.matches("//(.*)\n(.*)")){
				delimiter = Character.toString(input.charAt(2));
				input = input.substring(4);
			}
			
			String numList[] = input.split(delimiter + "|\n");for(String currentNum : numList)
			sum += stringToInt(currentNum);
			return sum;
		}
	}

	private static int stringToInt(String n) {
		return Integer.parseInt(n);
	}
}