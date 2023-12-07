
public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//  Classname objectname= new classname();
		StringBuffer sb1= new StringBuffer();//16
		StringBuffer sb2= new StringBuffer("micro");//21
		StringBuffer sb= new StringBuffer(20);
		
		String s1= "abc";
		
		System.out.println(sb2);
		//append abc to micro
		sb2.append(s1); 
		System.out.println(sb2);
		
		int c= sb2.capacity(); //not the actual characters
		int d= sb2.length(); // no of characters
		System.out.println(d);
		
		//sb2.deleteCharAt(d)
		sb2.delete(1, 3); //1 upto 3
		System.out.println(sb2);
		
		
		
		
		
		

	}

}
