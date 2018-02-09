package iWantToGood;

public class SoYouWantToBeGood {
	public static void main(String[] args) {
		int x = 3;
		if (x > 2) {
			System.out.print("a");
		}

		x = x - 1;
		System.out.print("-");
		if (x == 2) {
			System.out.print("b c");
		}

		x = x - 1;
		System.out.print("-");

		while (x > 0) {
			if (x == 1) {
				System.out.print("d");
				x = x - 1;
			}
		}

	}
}