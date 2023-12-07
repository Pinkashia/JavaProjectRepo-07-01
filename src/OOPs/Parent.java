package OOPs;

public class Parent {
	
	int employee_id;
	String employee_name;
	final String department ="IT";
	
	public Parent(int id, String name)
	{
		employee_id= id;
		employee_name=name;
	}
	
	public void printData()
	{
		System.out.println(employee_id);
		System.out.println(employee_name);
	}

}
