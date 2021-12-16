package dsapractice;
public class FactorialExample {

	public static void main(String[] args) throws StackOverflowError {
		// TODO Auto-generated method stub
		int n = 4;
		
		int result = factorial(n);
		
		System.out.println("factorial of " + n + " is : " + result);
		
	}
	
	public static int factorial(int n) {
		
		if(n == 1) {
			return 1;
		}
			
		else {
			return n * factorial(n-1);
		}
	}

}
