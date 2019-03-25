import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DegreeOf {
	public void degreeOf() {
		// exc 1.3
		System.out.println("\nWrite number and power of number");

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			int number = Integer.parseInt(reader.readLine());
			int degree = Integer.parseInt(reader.readLine());
			int buff = number;

			if (degree == 0) {
				number = 1;
			}
			for (int i = 0; i < degree - 1; i++) {
				number *= buff;
			}
			System.out.println(number);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

