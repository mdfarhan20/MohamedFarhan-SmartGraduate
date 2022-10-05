import java.util.Scanner;

class WhileLoopDemo {
	public static void main(String[] args) {
		int number, sum = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("\nPlease Enter any integer value below 10: ");	
		number = sc.nextInt();

		while (number <= 10) {
			sum += number;
			number++;
		}

		System.out.printf("Sum of the Numbers from the While Loop is: %d", sum);
	}
}