
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//Declaring an Array:  datatype[] arrayname;  or datatype arrayname[];
		int[] arr2;
		arr2 = new int[4]; //Instantiation of an array // 0 to 3- 0,1,2,3

		//Initializing the array
		arr2[0]= 5;
		arr2[1]= 67;
		arr2[2]= 15;
		arr2[3]= 62;

		//System.out.println(arr2[2]); //arrayname[index]

		//Print or Traverse - > Loops
		for(int i=0 ; i<=3; i++)
		{
			System.out.println(arr2[i]);
		}

		//Printing even/odd index
		for(int i=1 ; i<=10; i=i+2)
		{
			System.out.println(arr2[i]);
		}



		//Declare & initialize
		int[] arr1 = {1,2,3,4,5};
		char[] c= {'a', 'b', 'c'};


	}

}
