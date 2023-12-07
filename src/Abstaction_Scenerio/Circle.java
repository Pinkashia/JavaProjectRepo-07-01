package Abstaction_Scenerio;

public class Circle extends Shape {
	int side;
	
	public Circle(int s)
	{
		side=s;
	}

	public static void main(String[] args) {
		
		Circle obj = new Circle(5);
		obj.getArea();

	}
	
	@Override
	public void getArea() {
		 double ar = 3.14 * side*side;
		 System.out.println(ar);
		
	}

	@Override
	public void getPerimeter() {
		
		
	}

	@Override
	public int p() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
