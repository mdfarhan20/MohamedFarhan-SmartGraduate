class Test {
	int a;
	Test (int a) {
		this.a = a;
	}
}

public class NoArgumentInstantiate {
	public static void main(String[] args) {
		Test obj = new Test();
	}
}