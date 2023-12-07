import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string: ");
		String s1= sc.nextLine();
		//char[] S1= s1.toCharArray();

		boolean duplicate= false;
		for (int i = 0; i < s1.length(); i++)
		{
			for (int j = i + 1; j < s1.length(); j++)
			{ 
				//char temp1= s1.charAt(i);
				//char temp2= s1.charAt(j);
				//System.out.println(S1[i] + " " + S1[j]);
				//if(S1[i] == S1[j] && S1[i] != '')
				if(s1.charAt(i) == s1.charAt(j))
				{
					duplicate= true;
					break;

				}

				else
				{
					duplicate= false;
				}
				//

			}

		}
		System.out.println(duplicate);
	}
}


