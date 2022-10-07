public class PrimitiveTypes {
	public static void main(String[] args) {
		byte byteVar = 10;
		byteVar = 20

		short shortVar = 1000;
		shortVar = 2000;

		int intVar = 10000;
		intVar = 20000;

		long longVar = 100000000L;
		longVar = 2000000000L;

		float floatVar = 23.45f;
		floatVar = 4.5f;

		double doubleVar = 45.34255;
		doubleVar = 3.2312;

		char charVar = 'A';
		charVar = 'b';

		String stringVar = "Hello there..";
		stringVar = "Is this the result you expected..";

		boolean booleanVar = true;
		booleanVar = false;

		// Type Casting

		intVar = (int)byteVar;
		byteVar = (byte)intVar;

		intVar = (int)floatVar;
		doubleVar = (double)intVar;

		charVar = (char)intVar;
		byteVar = (byte)booleanVar;

		System.out.println("Default value of byte is: " + byteVar);
		System.out.println("Default value of short is: " + shortVar);
		System.out.println("Default value of int is: " + intVar);
		System.out.println("Default value of long is: " + longVar);
		System.out.println("Default value of float is: " + floatVar);
		System.out.println("Default value of double is: " + doubleVar);
		System.out.println("Default value of char is: " + charVar);
		System.out.println("Default value of string is: " + stringVar);
		System.out.println("Default value of boolean is: " + booleanVar);

	}
}