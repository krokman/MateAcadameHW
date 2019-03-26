public class RecursionDisplay {
	public static void main(String[] args) {
		int recursionNumber = 6;
		int number = 3;
		int numberOfRowElements = 4;

		System.out.println(fibonacci(recursionNumber));
		System.out.println(factorial(0));
		System.out.println(taylor(number, numberOfRowElements));
	}

	public static int factorial(int number) {
		int result;
		if (number == 0) {
			return 1;
		}
		result = factorial(number - 1) * number;
		return result;
	}

	public static long fibonacci(int number) {
		if (number <= 1) {
			return number;
		} else {
			return fibonacci(number - 1) + fibonacci(number - 2);
		}
	}

	public static double taylor(int number, int numberOfRowElements) { // e^x
		if (numberOfRowElements == 0) {
			return 1;
		}
		double result;
		result = taylor(number - 1, numberOfRowElements) + Math.pow(number, numberOfRowElements) / factorial(numberOfRowElements);
		return result;
	}
}
