package OOPs;

public class MethodOverloadingDemo {
	
	public int add(int a, int b)
	{
		return a+b;
	}
	public int add(double a, double b)
	{
		return (int) (a+b);
	}
	
	public void add(int c, int d, String s)
	{
		System.out.println(c+d+" "+s);
	}

	public String add(String a, String b)
	{
		String temp = a.concat(b);
		return temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingDemo m1= new MethodOverloadingDemo();
		m1.add("abc", "cd");
		m1.add(4, 5);
		

	}

}
