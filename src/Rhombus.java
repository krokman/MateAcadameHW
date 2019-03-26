public class Rhombus {

	public static void main(String[] args) {
		rhombus(6);
	}

	public static void rhombus(int size) {
		int sizeOfRhombus = size - 1;
		for (int i = 0; i < size; i++) {
			// loop for initially space,
			// before star printing
			for (int j = 0; j < sizeOfRhombus; j++)
				System.out.print(" ");

			// Print i+1 stars
			for (int j = 0; j <= i; j++)
				System.out.print("* ");

			System.out.print("\n");
			sizeOfRhombus--;
		}

		// Repeat again in
		// reverse order
		sizeOfRhombus = 1;

		// run loop (parent loop)
		// till number of rows
		for (int i = size - 1; i > 0; i--) {
			// loop for initially space,
			// before star printing
			for (int j = 0; j < sizeOfRhombus; j++)
				System.out.print(" ");

			// Print i stars
			for (int j = 0; j < i; j++)
				System.out.print("* ");

			System.out.print("\n");
			sizeOfRhombus++;
		}
	}
}
