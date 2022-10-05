import java.util.Scanner;

public class FindAreaOfCircle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the Radius: ");
		double radius = scanner.nextDouble();

		double area = Math.PI * (radius * radius);
		double circumference = 2 * Math.PI * radius;

		System.out.println("The area of circle is: " + area);
		System.out.println("The circumference of circle is: " + circumference);
		
	}
}