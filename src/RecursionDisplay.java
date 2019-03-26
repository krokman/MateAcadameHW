public class RecursionDisplay {
	public static void main(String[] args) {
		RecursionDisplay recursionDisplay = new RecursionDisplay();
		int recursionNumber = 6;
		int number = 3;
		int numberOfRowElements = 4;

		System.out.println(recursionDisplay.fibonacci(recursionNumber));
		System.out.println(recursionDisplay.factorial(0));
		System.out.println(recursionDisplay.taylor(number, numberOfRowElements));
	}

	public int factorial(int number) {
		int result;
		if (number == 0) {
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

	public double taylor(int numberOfRowElements, int number) { // e^x
		if (numberOfRowElements == 0) {
			return 1;
		}
		double result;
		result = taylor(numberOfRowElements - 1, number) + Math.pow(number, numberOfRowElements) / factorial(numberOfRowElements);
		return result;
	}
}
