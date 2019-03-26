public class Rhombus {

	public static void main(String[] args) {
		rhombus(6);
	}

	public static void rhombus(int size) {
		int sizeOfRhombus = size * 2;
		double half = sizeOfRhombus / 2;

		for (int i = 1; i <= size; i++) {
			for (int j = 0; j <= sizeOfRhombus; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			sizeOfRhombus--;
			System.out.print("\n");
		}

		for (int i = sizeOfRhombus - 1; i >= 1; i--) {
			for (int j = 0; j <= half + 2; j++) {
				System.out.print(" ");
			}

			for (int j = i; j >= 1; j--) {
				System.out.print("* ");
			}

			half++;
			System.out.print("\n");
		}
	}
}
