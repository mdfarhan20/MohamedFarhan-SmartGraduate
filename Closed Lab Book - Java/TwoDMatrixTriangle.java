public class TwoDMatrixTriangle {
	public static void main(String[] args) {
		int[][] matrix = {
			{1},
			{2, 3},
			{4, 5, 6},
			{7, 8, 9, 10}
		};

		printMatrix(matrix);
	}

	public static void printMatrix(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.printf("%4d ", matrix[row][col]);
			}
			System.out.println();
		}
	}
}