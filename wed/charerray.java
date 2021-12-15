package wed;

import java.util.Scanner;

public class charerray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string here:");
		String s = sc.nextLine();
		char[] arr = s.toCharArray();
		System.out.print(arr);
	}
}