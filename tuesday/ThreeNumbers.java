package wed;

/*9)package assignment;*/

import java.util.Scanner;

public class ThreeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter 2nd no: ");
		int num2 = sc.nextInt();
		
		System.out.println("Enter 3rd no: ");
		int num3 = sc.nextInt();
		
		int sum = num1 + num2 + num3;
		System.out.println("sum of numbers is: "+sum);
		
		int avg = sum/3;
		System.out.println("Average of sum is: "+avg);
		
		int product = num1*num2*num3;
		System.out.println("Product of numbers is: "+product);
		
		if(num1>num2 && num1>num3) {
			System.out.println(num1+" is greater");
		}
		else if(num2>num1 && num2>num3){
			System.out.println(num2+" is greater");
		}
		else {
			System.out.println(num3+" is greater");
		}
	}
}