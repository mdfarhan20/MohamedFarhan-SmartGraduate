public class StaticInNonStatic {
	static int staticVar = 10;

	public static void main(String[] args) {
		StaticInNonStatic obj = new StaticInNonStatic();
		obj.nonStaticMethod();
	}

	public void nonStaticMethod() {
		System.out.println("The static variable value is: " + staticVar);
	}
}