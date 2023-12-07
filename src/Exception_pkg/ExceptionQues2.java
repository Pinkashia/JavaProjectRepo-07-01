package Exception_pkg;

import java.util.Scanner;

public class ExceptionQues2 {


	public static void Method1(int number) {
		try {

			if (number % 2 != 0) {
				throw new IllegalArgumentException(number + " is odd.");
			}
			else {
			System.out.println(number + " is even.");
			}

		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		Method1(n); // or ExceptionQues2.Method1(n);
		
		
	}
}
