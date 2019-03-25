import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursionDisplay {
	public int factorial(int number){
		int result;
		if (number == 1) {
			return 1;
		}
		result = factorial(number-1) * number;
		return result;
	}

	public long fibonacci(int number){
		if (number <= 1) {
			return number;
		}
		else {
			return fibonacci(number - 1) + fibonacci(number - 2);
		}
	}

	public int taylor(int number){
		if (number == 0) {
			return 1;
		}
		return number * taylor(number-1);
	}

	public void recursionDisplay(){
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("Number for recursions");
			int number = Integer.parseInt(reader.readLine());

			System.out.println("Fibonacci");
			for (int i = 0; i <= number; i++) {
				System.out.print(fibonacci(i) + " ");
			}

			System.out.println("\nTaylor sentence");
			for (int i = 0; i <= number; i++) {
				System.out.print(taylor(i) + " ");
			}

			System.out.println("\nFactorial");
			System.out.println(factorial(number));
		}
		catch (IOException e){
			e.printStackTrace();
		}
	}
}
