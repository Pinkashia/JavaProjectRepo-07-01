import java.util.Scanner;

public class MethodDemo2 {
	int[] arr;

	public void read()
	{
		Scanner sc= new Scanner(System.in);
		int size= sc.nextInt();
		arr = new int[size];
		for(int i=0 ; i<arr.length ;i++)
		{
			arr[i]= sc.nextInt();
		}

	}
	public void display()
	{
		for(int i=0 ; i<arr.length ;i++)
		{
			System.out.println(arr[i]);
		}

	}

	public void find_largest()
	{

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo2 m1 = new MethodDemo2();
		m1.read();
		m1.display();


	}

}
