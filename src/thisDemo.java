
public class thisDemo {
	
	int a;
	int b;
	
	public thisDemo()
	{
		System.out.println("Default Constructor");
			
	}
	public thisDemo(int t)
	{
		this();
		this.b=t; //b=t
		System.out.println(b);
		
	}
	
	public void initialize(int a)
	{
		this.a=a;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		thisDemo obj = new thisDemo(9);
		obj.initialize(5);
	}

}
