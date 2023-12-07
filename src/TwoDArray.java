
public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * 2 3 6
		 * 2 3 4
		 * 6 8 9
		 */
		
		int[][] array1 = new int[3][3]; //3 rows 3 cols
		
		//arr[index] 
		// arrayname[row-index][col-index]  -Accessing an elemnt in 2-D array
		array1[0][0]=3;
		array1[0][1]=5;
		array1[0][2]=7;
		array1[1][0]=13;
		array1[1][1]=15;
		array1[1][2]=8;
		array1[2][0]=2;
		array1[2][1]=4;
		array1[2][2]=17;
		
		for(int r=0 ; r<3 ;r++)
		{ //r=0->1->2
			for(int c=0 ; c<3 ;c++)
			{
				System.out.print(array1[r][c]+ " "); //r=0,c=0 //r=0,c=1 //r=0,c=2
			}
			System.out.println();			
		}
	}

}
