public class ManipulateProtectedData {
	public static void manipulateData(ProtectedData obj) {
		obj.num1 = 20;
		obj.num2 = 45;

		int sumResult = obj.sum(obj.num1, obj.num2);
		System.out.println("The manipulated protected data result is :" + sumResult);
	}

	public static void main(String[] args) {
		ProtectedData obj = new ProtectedData();
		manipulateData(obj);
	}
}

class ProtectedData {
	protected int num1, num2;

	protected int sum (int num1, int num2) {
		return num1 + num2;
	} 
}