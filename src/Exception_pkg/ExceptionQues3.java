package Exception_pkg;
//Write a Java program to create a method that takes a string as input and throws an exception 
//if the string does not contain vowels.

public class ExceptionQues3 {


	public static void checkVowels(String text)
	{
		boolean containsVowels = false;
		int countVowels = 0;
		String vowels = "aeiouAEIOU";

		for (int i = 0; i < text.length(); i++) 
		{
			char ch = text.charAt(i);//A
			//vowels.contains(String.valueOf(ch));
			
			if (vowels.contains(String.valueOf(ch))) {
				containsVowels = true;
				countVowels++;
				break;
			}
		}
		if (!containsVowels) {
			throw new IllegalArgumentException("String does not contain any vowels.");
		}
	}


	public static void main(String[] args) {

		try {
			String text = "Fly";

			System.out.println("Original string: " + text);
			checkVowels(text);
			
			
			System.out.println("String contains vowels.");
		} 
		catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
