package advance;

public class SwapWithout3rdVariable {

	
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("Before swapping");
		System.out.println(" value of A is: "+a +" & value of B is: "+b);
		
		
		a= a+b;   //a = 10+20 = 30
		b= a-b;   //b = 30-20 = 10
		a= a-b;   //a = 30-10 = 20
		
		System.out.println("After swapping");
		System.out.println(" value of A is: "+a +" & value of B is: "+b);
		
		
		
	}
	
	
}
