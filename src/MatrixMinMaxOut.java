public class MatrixMinMaxOut {
	public void matrixMinMaxOut(){
		// exc 1.6
		int border = 4;
		int[][] matrix = new int[border][border];

		for (int i = 0; i < border; i++) { // initializing matrix with random numbers < 50
			for (int j = 0; j < border; j++) {
				matrix[i][j] = (int)(Math.random() * 50);
			}
		}

		for (int i = 0; i < border; i++) {
			System.out.println();
			for (int j = 0; j < border; j++) {
				System.out.print(matrix[i][j] + " ");
			}
		}

		int min = matrix[0][0];
		int max = matrix[0][0];

		for (int i = 0; i < border; i++) {
			for (int j = 0; j < border; j++) {
				if(matrix[i][j] > max){
					max = matrix[i][j];
				}
				if(matrix[i][j] < min){
					min = matrix[i][j];
				}
			}
		}
		System.out.println("\nMax = " + max + " Min = " + min);
	}
}

