// Splits a restaurant bill evenly among three diners.
public class Bill3 {

	public static void main(String[] args) {

		String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		Double Bill = Double.parseDouble(args[3]);

		double Calculation = Bill / 3;
		String SplitBill = String.valueOf(Calculation);

		System.out.println("Dear " + name1 + "," + name2 + ",and " + name3 + ":pay " + SplitBill + " Shekels each.");

	}
}
