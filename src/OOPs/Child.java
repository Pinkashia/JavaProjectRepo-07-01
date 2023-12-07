package OOPs;

public class Child extends Parent {
	
	int c,d;
	
	public Child(int id, String name, int c1, int d1) {
		super(id, name); //super()- is used to call the constructor of parent class
		c=c1;
		d=d1;
	}

	double rate;
	
	public void display()
	{
		super.printData();
		printData();
		System.out.println(c);
		System.out.println(d);
	}
	
	
	public void set_appr_rate()
	{
		rate=5;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child c1= new Child(1,"Rahul", 10,12);
		//c1.display();
		c1.printData();
		
		//c1.set_appr_rate();

	}

}
