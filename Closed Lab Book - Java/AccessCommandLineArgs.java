public class AccessCommandLineArgs {
	public static void main(String[] args) {

		if (args.length != 0) {
			System.out.println("The command line arguments are: ");
			for (int i = 0; i < args.length; i++) {
				System.out.println("args [" + i + "] is: " + args[i]);
			}
		} else {
			System.out.println("There are no command line arguments..");
		}
	}
}