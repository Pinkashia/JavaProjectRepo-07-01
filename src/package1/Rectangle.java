package package1;

import java.util.Scanner;

public class Rectangle {
	
	//Data Member - Instance Variable
	double length;
	double breadth;
	
	//Static Variable or class variable
	static String colour= "Red";

	
	//Method
	/*
	 *  access-modifier return-type methodname(parameters)
	 *  {
	 *   // implementation
	 *  }
	 * 
	 */
	
	public void setData(double d, double e)
	{
		
		length =d;
		breadth= e;
		
	}
	
	public void perimeter()
	{
		double temp = 2*(length+breadth);
		System.out.println(temp);
		
	}
	
	public double area()
	{
		double ar= length * breadth;
		return ar;
		
	}

	public static void main(String[] args) {
		
		
		Rectangle r1 = new Rectangle();
		
		Scanner sc= new Scanner(System.in);
		double num1= sc.nextDouble();
		double num2= sc.nextDouble();
		
		// Accessing variable or methods of a class - objectname.var or objectname.method()
		r1.setData(num1, num2);
		r1.perimeter();
		System.out.println(r1.area());
		//double ar1= r1.area();
		//System.out.println(ar1);
		//Accessing static variables:  Classname.var or obj.section obj1.section

	}

}
