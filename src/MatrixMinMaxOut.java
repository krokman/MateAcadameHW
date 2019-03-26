public class MatrixMinMaxOut {
	public static void main(String[] args) {
		MatrixMinMaxOut test = new MatrixMinMaxOut();
		int[][] matrixTest = test.createMatrix(4, 6);
		test.matrixMax(matrixTest);
		test.matrixMin(matrixTest);
	}

	public int[][] createMatrix(int matrixRows, int matrixColumns) {
		int[][] matrix = new int[matrixRows][matrixColumns];
		// initializing matrix with random numbers < 50
		for (int i = 0; i < matrix.length; i++) {
			System.out.println();
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 50);
				System.out.print(matrix[i][j] + " ");
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
		System.out.println("\nMax =" + max);
	}
}

