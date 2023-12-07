
public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "Java";
		String s2= new String("Java");
		
		if(s1==s2) // == Shallow Comparison
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}

		if(s1.equals(s2)) // Deep Comparison
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}
		
		char[] arr= {'J', 'a','v','a'}; //Mutable
		arr[1]= 'i';
		for(int i=0 ; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		
		String title = "Java"; //Immutable
		String s3= "J2ee";
		title = title.concat(s3);
		System.out.println(title);
		
	   System.out.println(s3.charAt(0));
		
		
		int num=6;
		char c= 'a';//97
		String s ="is";
		String ss= new String(" whole no");
		
		//+  a+b
		//a+=b -> a=a+b
		//num+num -> add  num+string-> concat  string+nu -> concat string+string->concat
		System.out.println(num+s+c+ss);
		
	    //String s4= s^4;
		//System.out.println(s*4);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
