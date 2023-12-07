import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int size= sc.nextInt();

		int[] arr = new int[size];

		// Initialize the array by taking input from user
		for(int i=0 ; i< arr.length; i++) // 0 to length-1
		{
			arr[i]= sc.nextInt();
		}
		
		//Traverse
		for(int i=0 ; i< arr.length; i++) // 0 to length-1
		{
			System.out.print("  "+arr[i]);
		}
	}

}
