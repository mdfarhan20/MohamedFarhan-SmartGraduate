public class PrimeNumberList {
	public static void main(String[] args) {

		System.out.println("The prime numbers from 1 to 100 are: ");
		for (int num = 1; num <= 100; num++) {
			if (isPrime(num)) {
				System.out.print(num + " ");
			}
		}
	}

	public static boolean isPrime(int num) {
		int count = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				count++;
			}
		}

		if (count == 1) {
			return true;
		}

		return false;
	}
}