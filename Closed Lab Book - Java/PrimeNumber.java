import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		int number;
		int count = 0;
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a positive integer: ");
		number = in.nextInt();

		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				count++;
			}
		}

		if (count == 1) {
			System.out.println(number + " is a prime number");
		} else {
			System.out.println(number + " is not a prime number");
		}
	}
}