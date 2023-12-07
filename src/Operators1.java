
public class Operators1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Unary Operators-  ++ --
		//postfix  expr++  , expr--
		//prefix   ++expr  , --expr
		
		
	int var1= 10; //11
	
	System.out.println(var1++); // var1= var1+1 //10
	
	System.out.println(var1);  //11
	System.out.println(++var1);	// var1= var1+1= 11+1 ->12
	
	
	
	System.out.println(var1--); //12  var1= 12-> 11
	System.out.println(var1);
	System.out.println(--var1);	// 10  var1->11 ->10
	System.out.println(var1);
	
	int var2=9;
	int var3= 6;
	System.out.println(var3++ + --var2+ ++var3);
	System.out.println(var3);
	System.out.println(var2);
	
	// Binary Operator : / * % 
	// + - 
	int a= 12, b=24;
	int res = a+b;
	System.out.println(res);
	
	System.out.println(a+b);
	
	}

}
