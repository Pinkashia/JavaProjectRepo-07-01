
public class Operator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Shift Operators  >> Right 
		//   << Left
		
		//b=8 -> 00001000  b>>2  00000010 2
		int var1=8;
		System.out.println(var1>>2);  //var / 2^ no of shift
		// 8/2^2 -> 8/4 ->2
		
		System.out.println(var1<<2);//var * 2 ^ no of shift
		// 8*2^2  -> 8*4->32
		// 2^3 ->8
		
		  
		//Relational Operator > < >= <= Comparison
		 //                     ==  !=
		
		
		// Ternary Operator/Conditional Operator
		// expr1 ? expr2 : expr3  {if then else}
		
		int a=4;
		int b=10;
		
		int res= a<b ? a :b ; // 4<10
		System.out.println(res);
		
		//Assignment Operator var = val
		
		// a+=8  -> a= a+8
		//b-=4 -> b=b-4
		//b*=13  -> b=b*13
		
		
		
	}

}
