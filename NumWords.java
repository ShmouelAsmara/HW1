// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		// Replace this comment with your code
		int checkNumber = Integer.parseInt(args[0]);
		int hundreds = (checkNumber / 100) % 10;
		int tens = (checkNumber / 10) % 10;
		int ones = (checkNumber % 10);
		if (checkNumber > 999) {
			int max = (checkNumber / 100);
			System.out.println(max + " hundreds, " + tens + " tens, and " + ones + " ones.");
			return;
		} else {
			System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
		}
	}
}
