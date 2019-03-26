public class RecursionDisplay {
	public static void main(String[] args) {
		RecursionDisplay recursionDisplay = new RecursionDisplay();
		int recursionNumber = 6;
		int e = 3;
		int x = 4;

		System.out.println(recursionDisplay.fibonacci(recursionNumber));
		System.out.println(recursionDisplay.factorial(recursionNumber));
		System.out.println(recursionDisplay.taylor(e, x));
	}

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

	public double taylor(int e, int x) { // e^x
		if (e == 1) {
			return 1;
		}
		double result;
		result = taylor(x, e - 1) + Math.pow(x, e - 1) / factorial(e - 1);
		return result;
	}
}
