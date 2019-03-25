public class MatrixMinMaxOut {
	public int[][] createMatrix(int borderI, int borderJ) {
		int[][] matrix = new int[borderI][borderJ];

		for (int i = 0; i < matrix.length; i++) { // initializing matrix with random numbers < 50
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 50);
			}
		}
		return matrix;
	}

	public void matrixMin(int[][] matrix) {
		// exc 1.6
		int min = matrix[0][0];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < min) {
					min = matrix[i][j];
				}
			}
		}
		System.out.println("\nMin =" + min);
	}

	public void matrixMax(int[][] matrix) {
		// exc 1.6
		int max = matrix[0][0];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] > max) {
					max = matrix[i][j];
				}
			}
		}
		System.out.println("\nMin =" + max);
	}
}

