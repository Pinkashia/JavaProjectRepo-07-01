package Exception_pkg;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		int[] ar= {1,3,4,5,6};
		String s= null;
		try
		{
		
			int res= num1/num2;
			System.out.println(res);
			//System.out.println(ar[5]);
			System.out.println(s.lastIndexOf(0));
			
			
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("User should enter non-zero values");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Trying to access an invalid index");
		}
		catch(NullPointerException e)
		{
			System.out.println("String is null,enter a valid");
		}
		catch(Exception e)
		{
			System.out.println("Trying to access an invalid index");
		}
		/*finally
		{
			System.out.println("rest of the statements");
		}*/
		System.out.println("rest of the statements");
	}

}
