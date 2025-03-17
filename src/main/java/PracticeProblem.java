import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticeProblem {

	public static int calculate(int x, int y, char c) {
		switch(c) {
			case '+':
				return x + y;

			case '-':
				return x - y;

			case '*':
				return x * y;

			case '/':
				return x / y;
				
			
			case '%':
				return x % y;

			case '^':
				return (int) Math.pow(x, y);
			default:
				return 0;
		}


		}
	
	final static int MAXIMUM = 10;
	
	public static boolean totalWordsChecker(String str) {
		if (str == null || str.isEmpty()) {
			return true;
		}
		Pattern pattern = Pattern.compile("[a-zA-Z0-9'_]++");
		Matcher matcher = pattern.matcher(str);

		int countWords = 0;
		while (matcher.find()) {
			countWords++;
			if (countWords > MAXIMUM) {
				return false;
			}
		}
		return true;
	}

	public static String minString(String str1, String str2, String str3) {

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		str3 = str3.toLowerCase();

		if (str1.compareTo(str2) <= 0 && str1.compareTo(str3) <= 0) {
			return str1;
		} else if (str2.compareTo(str1) <= 0 && str2.compareTo(str3) <= 0) {
			return str2;
		} else {
			return str3;
		}
    }
	

	
	
	public static void main(String args[]) {
		int result = calculate(4, 2, '+');
		System.out.println(result);
		int result1 = calculate(4, 2, '-');
		System.out.println(result1);
		int result2 = calculate(4, 2, '*');
		System.out.println(result2);
		int result3 = calculate(4, 2, '/');
		System.out.println(result3);
		int result4 = calculate(4, 2, '%');
		System.out.println(result4);
		int result5 = calculate(2, 3, '^');
		System.out.println(result5);

		boolean result6 = totalWordsChecker("This sentence is going to have words that are more than ten.");
		System.out.println(result6);

		String result7 = minString("b", "a", "c");
		System.out.println(result7);
		
	}

}
