
// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {

	public static void main(String[] args) {
		// I dont know how to put the range from the user so
		// I creat an integer that decide the range
		int range = 100;
		int A = (int) (Math.random() * range) + 1;
		int B = (int) (Math.random() * range) + 1;
		int C = (int) (Math.random() * range) + 1;

		while (A < B && A < C) {
			System.out.println(A);
			if (B < C) {
				System.out.println(B);
				System.out.println(C);
			} else
				System.out.println(C);
			System.out.println(B);
			return;

		}

		while (B < A && B < C) {
			System.out.println(B);
			if (A < C) {
				System.out.println(A);
				System.out.println(C);
			} else
				System.out.println(C);
			System.out.println(A);
			return;
		}

		while (C < A && C < B) {
			System.out.println(C);
			if (A < B) {
				System.out.println(A);
				System.out.println(B);
			} else
				System.out.println(B);
			System.out.println(A);
			return;
		}
	}

}
