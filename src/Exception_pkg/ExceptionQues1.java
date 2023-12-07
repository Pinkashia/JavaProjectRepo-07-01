package Exception_pkg;

import java.util.Scanner;
//Write a Java program that throws an exception and catch it using a try-catch block.
public class ExceptionQues1 {

	public static int divideNumbers(int dividend, int divisor) {
		
		if (divisor == 0) {
			
			throw new ArithmeticException("Cannot divide the given number by zero!");
		}
		return dividend / divisor;
		
	}
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n1= sc.nextInt();
		int n2= sc.nextInt();
		
		try 
		{
			int result = divideNumbers(n1, n2);
			System.out.println("Result: " + result);
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("Error: " + e.getMessage());
			//e.printStackTrace();
		}

	}

}
