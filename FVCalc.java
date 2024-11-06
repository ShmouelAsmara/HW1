// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args) {
		// Replace this comment with your code
		int currentValue = Integer.parseInt(args[0]);
		int rate = Integer.parseInt(args[1]);
		int years = Integer.parseInt(args[2]);

		int futureValue = currentValue * (1 + rate) ^ years;
		System.out.print(
				"After" + years + "years, " + "$" + currentValue + " saved at" + rate + "% will yield $" + futureValue);
	}
}