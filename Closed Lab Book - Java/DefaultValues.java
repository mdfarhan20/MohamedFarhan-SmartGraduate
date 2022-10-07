public class DefaultValues {
	public static void main(String[] args) {
		byte byteVar;
		short shortVar;
		int intVar;
		long longVar;

		float floatVar;
		double doubleVar;

		char charVar;
		String stringVar;

		boolean booleanVar;

		System.out.println("Default value of byte is: " + byteVar);
		System.out.println("Default value of short is: " + shortVar);
		System.out.println("Default value of int is: " + intVar);
		System.out.println("Default value of long is: " + longVar);
		System.out.println("Default value of float is: " + floatVar);
		System.out.println("Default value of double is: " + doubleVar);
		System.out.println("Default value of char is: " + charVar);
		System.out.println("Default value of string is: " + stringVar);
		System.out.println("Default value of boolean is: " + booleanVar);

		// error: primitive types do not get default values
	}
}