public class ComputePI {
	public static void main(String[] args) {
		double sum = 0.0;
		int MAX_DENOMINATOR = 1000;

		for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator += 2) {
			if (denominator % 4 == 1) {
				sum += 1.0 / denominator;
			} else if (denominator % 4 == 3) {
				sum -= 1.0 / denominator;
			} else {
				System.out.println("Impossible!!!");
			}
		}

		System.out.println("The sum is: " + sum);

		/*

		MAX_DENOMINATOR
			1000 = 0.7848981638974463
			10000 = 0.7853481633979478
			1000000 = 0.785397663397423

		*/ 
	}
}