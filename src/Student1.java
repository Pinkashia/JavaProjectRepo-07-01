
public class Student1 {

	//Instance Variables
	int id;
	String name;

	//Static  or Class Variable
	static String section= "A";


	//Methods
	public void printData()
	{  
		System.out.println(id);
		System.out.println(name);
		display_sec();
	}

	public static void display_sec()
	{
		System.out.println(section);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//Student 1 object
		Student1 obj= new Student1();

		//Accessing object : objectvar.var or objectvar.method()
		obj.id= 1;
		obj.name = "Parth";
		System.out.println(Student1.section);
		Student1.section ="B";

		//Student 1 object
		Student1 obj1= new Student1();
		obj1.id= 2;
		obj1.name = "Anish";
		System.out.println(obj.section);
		//Accessing static variables:  Classname.var or obj.section obj1.section
		System.out.println(Student1.section);
		
		

		obj.printData();



	}

}
