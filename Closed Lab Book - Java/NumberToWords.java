import java.util.Scanner;

public class NumberToWords {
	public static void main(String[] args) {
		int number;
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a positive integer: ");
		number = in.nextInt();

		System.out.println(number + " in words is:" + numToWords(number));
	}

	public static String numToWords (int num) {
		String numberString = "";
		int lastDigit;

		while (num > 0) {
			lastDigit = num % 10;
			switch (lastDigit) {
				case 1:
					numberString = " one" + numberString;
					break; 
				case 2:
					numberString = " two" + numberString;
					break;
				case 3:
					numberString = " three" + numberString;
					break;
				case 4:
					numberString = " four" + numberString;
					break;
				case 5:
					numberString = " five" + numberString;
					break;
				case 6:
					numberString = " six" + numberString;
					break;
				case 7:
					numberString = " seven" + numberString;
					break;
				case 8:
					numberString = " eight" + numberString;
					break;
				case 9:
					numberString = " nine" + numberString;
					break;
				default:
					System.out.println("INVALID");
			}

			num /= 10;
		}

		return numberString;
	}
}