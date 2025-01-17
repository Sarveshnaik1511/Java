package basic;

public class Operators_Practice {
	
	
	public void rectangle() {
		// Length and breadth of a rectangle are 5 and 7 respectively. 
				//Write a program to calculate the area and perimeter of the rectangle.
				
				int l= 5;
				int b=7;
				
				int a= l*b;
				int p= 2*(l+b);
				
				System.out.println( " Length of rectangle is :"+a +"\n Perimeter of a rectangle is :" +p);	
	}
	
	public static void triangle() {
		//Write a program to calculate the perimeter of a triangle having sides of length 2,3 and 5 units.
		int a= 2,b=3,c=5;
		int d= a+b+c;
		
		System.out.println(" Perimeter of triangle is :"+ d);
	}
	
	public void add() {
//	Write a program to add 8 to the number 2345 and then divide it by 3.
//	Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result.
		
		int a= 2345;
		int b= 8;
		int c= a +b;
		int d= c/3;
		int e= d%5;
		int result =e*5;
		
		System.out.println(" the result is :"+ result);
		 // System.out.println((((8+2345)/3)%5)*5); // same as above
		
		
	}
	
	public static void equal() {
		// Write a program to check if the two numbers 23 and 45 are equal.
		
		int a= 20;
		int b=450;
		
		System.out.println(a == b);
		
	}
	

	public static void main(String [] args) {
		
		Operators_Practice obj = new Operators_Practice();
		obj.rectangle();
		Operators_Practice.triangle();
		
		obj.add();
		Operators_Practice.equal();
		
		
		
		 
	}
}
