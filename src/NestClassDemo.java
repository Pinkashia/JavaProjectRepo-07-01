
public class NestClassDemo {
	
	int a;
	
	public class InnerClass{
		
		int b;
		
		public void p()
		{
			System.out.println("Hello Inner");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Object Creation when inner class static
		//Outer.Inner objectname = new Outer.Inner()
		
		//Object Creation when inner class is non-static
		//1.Outer.Inner objectname = Outerclassobject.new Inner()
		NestClassDemo obj = new NestClassDemo();
		NestClassDemo.InnerClass obj1 =obj.new InnerClass();
		

		//2.Outer.Inner objectname = new Outer().new Inner()
		NestClassDemo.InnerClass obj2 =new NestClassDemo().new InnerClass();
		
		obj1.b=10;
		obj2.p();
		

	}

}
