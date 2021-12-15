package wed;

/*8)package assignment;*/

public class DisplayNumbers {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		
		System.out.println("display number using println"+a+" "+b+" "+c+" "+d);
		
		System.out.print("display nnumber using print: "+a+" ");
		System.out.print(b+" ");
		System.out.print(c+" ");
		System.out.print(d+" ");
		
		System.out.println("\n");
		
		System.out.printf("%d %d %d %d ",a,b,c,d);
	}
}