import java.util.Scanner;

public class SearchElementInArray {
	public static void main(String[] args) {
		int[] array = {12, 23, 34, 45, 56, 67, 78, 89, 90, 56};
		int key;
		Scanner in = new Scanner(System.in);

		System.out.print("Enter an element to find: ");
		key = in.nextInt();

		searchElement(array, key);
	}

	public static void searchElement(int[] array, int key) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				count++;
				System.out.println(key + " is found at index " + i);
			}
		}

		if (count == 0) {
			System.out.println(key + " is not found in the array");
		} else if (count > 1) {
			System.out.println(key + " is found in the array " + count + " times");
		}
	}
}