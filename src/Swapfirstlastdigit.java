import java.util.Scanner;

public class Swapfirstlastdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, temp;
		
		int digits=0, rem, remTemp, rev=0, r, digitsTemp;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the Number: ");
		num = scan.nextInt();

		temp = num;
		while(temp>0)
		{
			digits++;
			temp = temp/10;
		}
		if(digits<2)
		{
			System.out.println("\nInterchange not possible.");
		}
		else if(digits==2)
		{
			temp = num;
			while(temp>0)
			{
				rem = temp%10;
				rev = (rev*10) + rem;
				temp = temp/10;
			}
			System.out.println("\nFirst and Last Digit Interchanged Successfully!");
			System.out.println("\nThe New Number = " +rev);
		}
		else
		{
			temp = num;   //432
			while(temp>0)
			{
				rem = temp%10;  //2  3  4
				rev = (rev*10) + rem;  //2 23  234
				temp = temp/10; //43 4 0
			}
					
			r = rev;   //234
			rev = 0;   //0 //20
			temp = num;    //432
			digitsTemp = digits;  //3
			while(temp>0)    //432>0   43>0  4>0
			{
				remTemp = r%10;  //4  3   2
				if(digitsTemp==digits || digitsTemp==1)   //3==3 || 3==1   //2==3 || 2==1   //1==3 || 1==1
				{
					rem = temp%10;  //2   4
					rev = (rev*10) + rem;  //2   //23*10 + 4-> 234
					System.out.println("intermediate 1 "+rev);
				}
				else
				{
					rev = (rev*10) + remTemp;     //23  
					System.out.println("intermediate 2 "+rev);
				}
				
				r = r/10;  //23  //2  //0
				temp = temp/10;  //43   //4   //0
				digitsTemp--; //2 //1   //0
			}
			System.out.println("\nFirst and Last Digit Interchanged Successfully!");
			System.out.println("\nThe new number = " +rev);
			
		}
	}

}

