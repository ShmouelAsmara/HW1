
// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {

	public static void main(String[] args) {
		// I dont know how to put the range from the user so
		// I creat an integer that decide the range
		int range = 100;
		int a = (int) (Math.random() * range) + 1;
		int b = (int) (Math.random() * range) + 1;
		int c = (int) (Math.random() * range) + 1;

		while (a < b && a < c) {
			System.out.println(a);
			if (b < c) {
				System.out.println(b);
				System.out.println(c);
			} else
				System.out.println(c);
			System.out.println(b);

			return;
		}
		while (b < a && b < c) {
			System.out.print(b);
			if (a < c) {
				System.out.println(a);
				System.out.println(c);
			} else
				System.out.println(c);
			System.out.println(b);
			return;
		}

		while (c < a && c < b) {
			System.out.println(c);
			if (a < b) {
				System.out.println(a);
				System.out.println(b);
			} else
				System.out.println(b);
			System.out.println(a);
			return;
		}
	}

}
