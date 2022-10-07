public class ReverseElementsInArray {
	public static void main(String[] args) {
		int[] array = {32, 21, 3, 2, 13};

		System.out.println("Before reverse: ");
		printArray(array);

		reverse(array);

		System.out.println("After reverse: ");
		printArray(array);
	}

	public static void reverse(int[] array) {
		int temp, fIdx, bIdx;

		for (fIdx = 0, bIdx = array.length - 1; fIdx < bIdx; fIdx++, bIdx--) {
			temp = array[fIdx];
			array[fIdx] = array[bIdx];
			array[bIdx] = temp;
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