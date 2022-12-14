import java.util.Scanner;

public class NumberPatternC {
	public static void main(String[] args) {
		int size;
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the size: ");
		size = in.nextInt();

		for (int row = 1; row <= size; ++row) {
			for (int col = size; col >= 1; --col) {
				if (col <= row) {
					System.out.printf("%d ", col);
				} else {
					System.out.print("  ");
				}
			} 
			System.out.println("\n");
		}
	}
}