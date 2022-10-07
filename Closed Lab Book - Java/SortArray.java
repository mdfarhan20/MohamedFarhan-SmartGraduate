public class SortArray {
	public static void main(String[] args) {
		int[] array = {23, 1, 43, 52, 22};

		System.out.print("Before Sort: ");
		printArray(array);

		sortArray(array);

		System.out.print("After Sort: ");
		printArray(array);

	}

	public static void sortArray(int[] array) {
		int temp, swaps = 0;

		for (int i = 0; i < array.length; i++) {
			swaps = 0;
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;

					++swaps;
				}
			}

			if (swaps == 0) {
				break;
			}
		}
	}

	public static void printArray(int[] array) {
		System.out.print("The values are: [");
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				System.out.print(array[i]);
			} else {
				System.out.print(", " + array[i]);
			}

		}
		System.out.println("]");
	}

}