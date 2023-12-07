
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String title = "Java"; //Immutable
		String s3= "J2ee";
		
		title = title.concat(s3);
		System.out.println(title);

		System.out.println(s3.charAt(0)); 
		
		int size= s3.length();
		
		String stat= "This is SDET Batch";
		String[] word= stat.split("i");
		for(int i=0 ; i<word.length; i++)
		{
			System.out.println(word[i]);
			
		}

	}

}
