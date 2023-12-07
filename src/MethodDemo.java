
public class MethodDemo {
	
	//Data Members
	
	int id;
	String name;
	//Method - code reusability
	
	
	
	//constructor
	//Method
	
	//1.
	public void setData(int id, String nam)
	{
		this.id = id;
		this.name = nam;
	}
	
	{
		
	}
	
	//3.
	public int add(int a, int b)
	{
		int sum = a+b;
		return sum; 
	}
	
	//4. Returntype with no arguments
	
	//2.
	public void printData()
	{
		System.out.println(id);
		System.out.println(name);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodDemo m1 = new MethodDemo();
		int temp= m1.add(34, 340);
		m1.setData(1, "Rahul");
		
		System.out.println(m1.add(34, 340));
		m1.add(temp, temp);
		
		MethodDemo2 m2 = new MethodDemo2();
		m2.display();
		
		
	}

}
