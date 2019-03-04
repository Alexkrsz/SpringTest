package lesson1;

public class Factorial {

	public static int factorial (int N)
	 {
		if (N <= 1)
			
			return 1;
		
		else
			
		 return (N * factorial(N-1));
	 }
	public static void main(String[] args) {
		int n;
		n = 5;
 		n = factorial(n);
		System.out.println("The factorial of n is " + n);

	}
	
	

}
