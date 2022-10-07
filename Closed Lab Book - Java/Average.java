import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		int n, numberIn, sum = 0;
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the number of values: ");
		n = in.nextInt();

		System.out.print("Enter the values (seperated by spaces): ");
		for (int i = 1; i <= n; i++) {
			numberIn = in.nextInt();
			sum += numberIn;
		}

		System.out.printf("The average of the numbers is: %.2f", average(sum, n));
		

	}

	public static double average(int sum, int n) {
		return (double) sum / n;
	}
}