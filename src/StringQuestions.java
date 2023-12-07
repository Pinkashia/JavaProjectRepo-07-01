
public class StringQuestions {
	public static void main(String[] args) {
		
		String str= "mmprogramming";
    	char c = 'm';
    	int count=0;
		for (int i=0; i< str.length(); i++)
        {	
    
            if (str.charAt(i) == c) {
            	count++;
            }
            
        }
		System.out.println(count);
	}

}
