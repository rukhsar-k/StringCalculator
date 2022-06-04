package stringCalculator;

public class Calculator {

	public static int add(String num) {
		if(num.equals(""))
			return 0;
		else
			return Integer.parseInt(num);
	}
}
