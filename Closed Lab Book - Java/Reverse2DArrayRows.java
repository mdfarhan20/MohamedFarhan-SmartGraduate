public class Reverse2DArrayRows {
	public static void main(String[] args) {
		int[][] array = {
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 10, 11, 12}
		};

		System.out.println("Array before reverse: ");
		printMatrix(array);

		reverse(array);

		System.out.println("Array after reverse: ");
		printMatrix(array);


	}

	public static void reverse(int[][] array) {
		int temp, fIdx, bIdx;

		for (int row = 0; row < array.length; row++) {
			for (fIdx = 0, bIdx = array[row].length - 1; fIdx < bIdx; fIdx++, bIdx--) {
				temp = array[row][fIdx];
				array[row][fIdx] = array[row][bIdx];
				array[row][bIdx] = temp;
			}
		}
	}	

	public static void printMatrix(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				System.out.printf("%4d ", matrix[row][col]);
			}
			System.out.println();
		}
	}
}