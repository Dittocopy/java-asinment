package thusday;

import java.util.Arrays;
import java.util.Scanner;

//Java program to implement Jump Exponential Search.

public class Exponentialsearch {

	public static void main(String[] args) {
		int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 21, 34, 45, 91, 120, 130, 456, 564};
		
		System.out.println(Arrays.toString(nums));
		System.out.println();
        
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input an element to search:");
		
		int search_num = sc.nextInt();
		
		// Find the index of searched item
       int index_result = exponentialSearch(nums, search_num);

       System.out.println(search_num + " is found at index " + index_result);		
		
	}

	private static int exponentialSearch(int[] arr, int i) {
		int start = 0;
		
		if(arr[start] == i)
			return start;
		start=1;
		while(start< arr.length && arr[start] <= i) {
			start*=2;
		}
		return Arrays.binarySearch(arr, start/2, Math.min(start, arr.length), i);
	}
}
