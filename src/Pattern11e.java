
public class Pattern11e {
	//Write a program to enter any number and print it in words.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 3;
		int space = n - 1;
		int k=1;
		int num=2;
	      
        // run loop (parent loop) 
        // till number of rows
        for (int i = 1; i <= n; i++)
        {
            // loop for initially space, 
            // before num printing
            for (int j = 1; j <= space; j++)
                System.out.print(" ");
      
            // Print 
            for (int j=1 ; j<=i ; j++) //1  //2,3  //3 4 5 j value
            {   
            	num= 2*k;
            	System.out.print(num + " ");
            	k++;
            }
                  
            System.out.println();
            space--;
        }
        space =1;
        for (int i = 1; i <= n-1; i++)
        {
            // loop for initially space, 
            // before num printing
            for (int j = 1; j <= space; j++)
                System.out.print(" ");
      
            // Print 
            for (int j=1 ; j<=n-i ; j++) // 1,2 //2
            {   
            	num= 2*k;
            	System.out.print(num + " ");
            	k++;
            }
                  
            System.out.println();
            space++;
        }
	}

}
