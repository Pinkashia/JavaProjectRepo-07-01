import java.util.Scanner;

public class DigitofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// WAP to print digits of a number
		
		//1.input of number from user 
		//2. digit extract -> print  - Loop -> no of digits
		
		///1.input of number from user 
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		
		//2.digit extract
		// 50/10 -> 5
		// 50%10 -> 0  -> 5%10 ->5
		
		// 123%10 -> 3     12%10-> 2  1%10->1
		// 123/10 -> 12      12/10->1  1/10->0
		int count=0;
		while(num>0)
		{
			int d= num%10;//3 //2
			count++;
			System.out.println(d);
			num= num/10; //123->12  ->1
		}
		//System.out.println(count);
		
		
		

	}

}
