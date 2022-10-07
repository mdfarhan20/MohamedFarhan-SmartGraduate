public class CalculateInvestmentWorth {
	public static void main(String[] args) {
		double investment = 14000.00;
		double amountCopy = investment;

		investment += amountCopy * 0.4;
		investment -= 1500;
		investment += amountCopy * 0/12;


		System.out.printf("The investment after 3 years: $%.2f", investment);
	}
}