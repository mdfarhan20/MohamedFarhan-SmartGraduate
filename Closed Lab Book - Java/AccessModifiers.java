public class Test {
	int defaultVar = 5;
	public int publicVar = 10;
	protected int protectedVar = 20;
	private int privateVar = 30;

	void defaultMethod() {
		System.out.println("Default Method");
	}

	public void publicMethod() {
		System.out.println("Default Method");
	}

	protected void protectedMethod() {
		System.out.println("Default Method");
	}

	private void privateMethod() {
		System.out.println("Default Method");
	}

}

public class AccessModifiers {
	public static void main(String[] args) {
		Test obj = new Test();

		obj.defaultVar = 25;
		obj.publicVar = 35;
		obj.protectedVar = 45;
		obj.privateVar = 75;

		obj.defaultMethod();
		obj.publicMethod();
		obj.protectedMethod();
		obj.privateMethod();
	}
}