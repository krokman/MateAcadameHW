public class DegreeOf {
	public static void main(String[] args) {
		DegreeOf test = new DegreeOf();
		System.out.println(test.degreeOf(5, 4));
	}

	public int degreeOf(int number, int degree) {
		// exc 1.3
		int buff = number;

		if (degree == 0) {
			number = 1;
		}
		for (int i = 0; i < degree - 1; i++) {
			number *= buff;
		}
		return number;
	}
}

