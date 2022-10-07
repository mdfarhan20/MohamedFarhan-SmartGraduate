import java.util.Scanner;

public class DayInAMonth {
	public static void main(String[] args) {
		String month;
		int year;
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a month (in words): ");
		month = in.next().toLowerCase();

		switch (month) {
			case "january":
				System.out.println("31 days");
				break;
			case "february":
				System.out.print("Enter the year: ");
				year = in.nextInt();
				if (year % 4 == 0) {
					System.out.println("29 days");
				} else {
					System.out.println("28 days");
				}
				break;
			case "march":
				System.out.println("31 days");
				break;
			case "april":
				System.out.println("30 days");
				break;
			case "may":
				System.out.println("31 days");
				break;
			case "june":
				System.out.println("30 days");
				break;
			case "july":
				System.out.println("31 days");
				break;
			case "august":
				System.out.println("31 days");
				break;
			case "september":
				System.out.println("30 days");
				break;
			case "october":
				System.out.println("31 days");
				break;
			case "november":
				System.out.println("30 days");
				break;
			case "december":
				System.out.println("31 days");
				break;
			default:
				System.out.println("Pretty sure, " + month + " is not a real month");
		}
	}
}