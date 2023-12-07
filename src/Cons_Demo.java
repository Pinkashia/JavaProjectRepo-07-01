
public class Cons_Demo {
	int a;
	int b;
	
	public Cons_Demo()
	{
		a= 2;
		b=7;
		System.out.println("Constructer1");
	}
	public Cons_Demo( int temp1, int temp2)
	{
		a= temp1;
		b= temp2;
		
		System.out.println("Constructer2");
	}
	public Cons_Demo( int temp1, int temp2, int temp3)
	{
		System.out.println("Constructer3");
	}
	public static void main(String[] args) {
		
		Cons_Demo c1= new Cons_Demo();
		
		Cons_Demo c2= new Cons_Demo(1,2);
		
		

	}

}
