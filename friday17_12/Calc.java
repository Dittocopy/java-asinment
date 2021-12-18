package friday17_12;

import java.util.Scanner;

class Calc {

	public static void main(String[] args) {

		int days, a = 0, y = 1;
		Scanner cs = new Scanner(System.in);
		System.out.print("enter dayes:");
		days = cs.nextInt();

		for (int i = 0; i <= days; i++) {

			a += y;
			y = y + y;

			System.out.println(a);
			System.out.println(y);
			System.out.println();
		}

	}

}
