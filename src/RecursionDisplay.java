import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursionDisplay {
	public int factorial(int number) {
		int result;
		if (number == 1) {
			return 1;
		}
		result = factorial(number - 1) * number;
		return result;
	}

	public long fibonacci(int number) {
		if (number <= 1) {
			return number;
		} else {
			return fibonacci(number - 1) + fibonacci(number - 2);
		}
	}

	private static double getCosTaylor(double y, double x) {
		if (y > 999) {
			return 1;
		}
		return 1 - x * x / ((2 * y - 1) * 2 * y) * getCosTaylor(y + 1, x);
	}

	private static double getSinTaylor(double y, double x) {
		return getCosTaylor(y, x - 1.569);
	}
}
