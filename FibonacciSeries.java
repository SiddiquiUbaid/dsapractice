package dsapractice;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an index to find fibancci sum: ");
		int index = input.nextInt();
	
		int result = fibonacci(index);
		
		System.out.println("fibonacci sum for index " + index + " is: " + result);
	}
	
	public static int fibonacci(int index) {
		
		if(index == 0)
			return 0;
		
		else if(index == 1)
			return 1;
		
		else 
			return fibonacci(index-1) + fibonacci(index-2);
		
	}
	

}
