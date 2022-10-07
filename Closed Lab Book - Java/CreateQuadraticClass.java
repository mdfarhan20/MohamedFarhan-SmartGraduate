public class CreateQuadraticClass {
	public static void main(String[] args) {
		QuadraticFunction q1 = new QuadraticFunction();
		QuadraticFunction q2 = new QuadraticFunction(10, 5, 7);

		q1.updateValues(2, 4, 5);

		q1.compute(3);
		q2.compute(5);
	}
}

class QuadraticFunction {
	int a, b, c;
	private int result = 0;

	QuadraticFunction () {
		a = 1;
		b = 1;
		c = 1;
	}

	QuadraticFunction (int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	int getValueA () {
		return a;
	}

	int getValueB () {
		return b;
	}

	int getValueC () {
		return c;
	}

	void updateValues (int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	void compute(int x) {
		result = (a * x * x) + (b * x) + c;
		System.out.println("The result is: " + result);
	}
}