package _02_gotta_catchem_all;

public class ExceptionMethods {
	
	static double divide(double dividend, double divisor) throws IllegalArgumentException {
		if (divisor == 0) {
			throw new IllegalArgumentException();
		}
		return dividend / divisor;
	}
	
	static String reverseString(String str) throws IllegalStateException {
		if (str.equals("") || str == null) {
			throw new IllegalStateException();
		}
		String thing = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			thing += str.charAt(i);
		}
		return thing;
	}
	
}
