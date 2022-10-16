import java.util.Scanner;

public class CeasarCode {
	public static void main(String[] args) {
		String inStr, cipheredText = "";
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a plaintext string: ");
		inStr = in.next().toUpperCase();

		for (int chIndex = 0; chIndex < inStr.length(); chIndex++) {
			char ch = inStr.charAt(chIndex);
			ch = (char)(ch + 3);
			cipheredText += ch;
		}

		System.out.println("The ciphertext string is: " + cipheredText);
	}
}