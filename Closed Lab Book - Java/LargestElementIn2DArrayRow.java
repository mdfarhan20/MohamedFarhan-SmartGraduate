public class LargestElementIn2DArrayRow {
	public static void main(String[] args) {
		int[][] array = {
			{43, 45, 23, 2},
			{52, 43, 12, 67},
			{9, 13, 11}
		};

		int largestInRow;

		for (int row = 0; row < array.length; row++) {
			largestInRow = largestInArray(array[row]);
			System.out.println("The largest element in row " + (row + 1) + " is: " + largestInRow);
		}
	}

	public static int largestInArray(int[] array) {
		int largest = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > largest) {
				largest = array[i];
			}
		}

		return largest;
	}
}