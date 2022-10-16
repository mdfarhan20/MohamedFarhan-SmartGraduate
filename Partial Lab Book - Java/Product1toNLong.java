public class Product1toNLong {
	public static void main(String[] args) {
		long product = 1;
		final int LOWERBOUND = 1;
		final int UPPERBOUND = 13;

		for (int num = LOWERBOUND; num <= UPPERBOUND; num++) {
			product *= num;
		}

		System.out.println("The Product is: " + product);

		// 1 - 13 = 6227020800
		// 1 - 14 = 87178291200
		// 1 - 20 = 2432902008176640000
		// 1 - 21 = -4249290049419214848 - Wrong

	}
}