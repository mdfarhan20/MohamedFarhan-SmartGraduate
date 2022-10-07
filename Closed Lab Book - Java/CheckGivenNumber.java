import java.util.Scanner;

public class CheckGivenNumber {
	public static void main(String[] args) {
		int num;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a positive interger: ");
		num = in.nextInt();

		if (isPerfect(num)) {
			System.out.println(num + " is an Perfect number");
		} else if (isPalindrome(num)) {
			System.out.println(num + " is a Palinedrome number");
		} else if (isArmstrong(num)) {
			System.out.println(num + " is a Armstrong number");
		} else {
			System.out.println(num + " is not an Armstrong number or a Perfect number or a Palindrome number");
		}
	}

	public static boolean isArmstrong (int num) {
		int numCopy = num;
		int numberOfDigits = 0, sum = 0;

		while (num > 0) {
			num /= 10;
			numberOfDigits++;
		}

		num = numCopy;

		while (num > 0) {
			sum += Math.pow(num % 10, numberOfDigits);
			num /= 10;
		}

		if (sum == numCopy) {
			return true;
		}

		return false;


	}

	public static boolean isPerfect (int num) {
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}

		if (sum == num) {
			return true;
		}
		return false;
	}

	public static boolean isPalindrome (int num) {
		int reverse = 0, numCopy = num;

		while (num > 0) {
			reverse = (reverse * 10) + (num % 10);
			num /= 10;
		}

		if (numCopy == reverse) {
			return true;
		}

		return false;
	}
}