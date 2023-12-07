import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// WAP to reverse a number
		
		//1.input of number from user 
		//2. digit extract -> print  - Loop -> no of digits
		
		// 123  -->  321
		
		///1.input of number from user 
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		
		int rev=0;
		
		int count=0;
		while(num>0) //123>0  //12>0 //1>0
		{
			int rem = num % 10;  //123%10 -> 3  //12%10 ->2  //1%10->1
			rev= rev*10 +rem; //rev= 0*10 +3 ->3  //rev= 3*10 +2 = 32  // rev= 32*10 +1 = 321
			
			num= num/10; //123->12  12/10->1  
		}
		System.out.println(rev);
	}

}
