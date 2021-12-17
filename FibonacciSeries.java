package dsapractice;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int index = 7;
		int result = fibonacci(index);
		
		System.out.println("fibonacci sum for index " + " is " + result);
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
