import java.util.Scanner;

public class ResizeArray {
	public static void main(String[] args) {
		int[] array = new int[5];
		int newSize;

		Scanner in = new Scanner(System.in);
		System.out.print("Enter the new size for the array: ");
		newSize = in.nextInt();

		array = resize(array, newSize);

		System.out.println("The array size after resizing is: " + array.length);

	}

	public static int[] resize (int[] array, int size) {
		int[] copy = new int[size];

		if (array.length > size) {
			for (int i = 0; i < size; i++) {
				copy[i] = array[i];
			}
		} else {
			for (int i = 0; i < array.length; i++) {
				copy[i] = array[i];
			}
		}

		return copy;
	}
}

