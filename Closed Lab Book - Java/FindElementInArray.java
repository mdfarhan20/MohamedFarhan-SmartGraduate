import java.util.Scanner;

public class FindElementInArray {
	public static void main(String[] args) {
		int elementToFind;
		int[] array = {10, 23, 43, 55, 67};

		Scanner in = new Scanner(System.in);

		System.out.print("Enter the element to find: ");
		elementToFind = in.nextInt();

		findPositionInArray(array, elementToFind);
	}

	public static void findPositionInArray(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				System.out.println(key + " is found at index " + i);
				return;
			}
		}

		System.out.println("The element is not found in the given array..");
	}
}