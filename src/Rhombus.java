public class Rhombus {

	public static void main(String[] args) {
		Rhombus rhombus = new Rhombus();
		rhombus.Rhombus(6);
	}

	public void Rhombus(int size) {
		size = size / 2;
		for (int i = 1; i < size + 1; ++i) { // diamond top
			for (int j = size + 1; j > i; --j) {
				System.out.print(" ");
			}

			for (int j = 1; j < 2 * i; ++j) {
				System.out.print("*");
			}

			System.out.println();
		}
		for (int i = size + 1; i >= 1; --i) { //diamond bottom
			for (int j = size + 1; j > i; --j) {
				System.out.print(" ");
			}
			for (int j = 1; j < i * 2; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
