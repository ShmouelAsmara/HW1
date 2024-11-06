// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args) {
		// Replace this comment with your code
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);
		double rateClac = (rate / 100);
		double futureValue = currentValue * Math.pow((1 + rateClac), years);

		System.out.print(
				"After " + years + " years, a " + "$" + currentValue + " saved at " + rate + "% will yield $"
						+ ((int) futureValue));
	}
}