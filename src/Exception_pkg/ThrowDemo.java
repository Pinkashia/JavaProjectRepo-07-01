package Exception_pkg;

import java.util.Scanner;

public class ThrowDemo {
	
	public void validation_Age(int age)
	{
		if(age<13)
		{
			throw new ArithmeticException(); //Raising exception explicitly
		}
		else
		{
			System.out.println("User account is successfully created");
		}
	}
	
	public static void main(String[] args) {
		 
		Scanner sc= new Scanner(System.in);
		int ag= sc.nextInt();
		
		ThrowDemo obj= new ThrowDemo();
		//obj.validation_Age(ag);
		
		try {
			obj.validation_Age(ag);
			
		}
		catch(ArithmeticException e1)
		{
			System.out.println("User age is not in the permitted range");
		}
	
		
	}
	
	

}
