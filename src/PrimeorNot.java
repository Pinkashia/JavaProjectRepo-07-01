import java.util.Scanner;

public class PrimeorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Prime Number ->divisble 1 or itself
		//eg: 2,3,5,7etc.
		
		///1.input of number from user 
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt(); //5
		boolean status= false;
	
		
		for(int i= 2 ;  i<=num/2 ; i++)  //2<=5 i=2   //i=3 3<=5 //i=4 4<=5   //i=5 5<5
		{
			if (num % i == 0)    //5%2-> 1   //5%3->2 2==0 X  //5%4->1 ==0 X
			{
				status = true;
				break;
			}
	
		}
		 //status-> false
		
		if(!status )
		{
			System.out.println("Number is prime");
		}
		else
		{
			System.out.println("Number is not prime");
		}
		
		
		
		//out of the loop
		

	}

}
