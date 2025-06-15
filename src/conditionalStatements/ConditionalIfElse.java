package conditionalStatements;

import java.util.Scanner;

public class ConditionalIfElse {
	
	//Write a program that takes a student's score as input and outputs their corresponding letter grade using conditional statements 
	//(e.g., A for scores 90 and above, B for scores 80-89, etc
	
	public String studentsGrade() {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Students Score: ");
		int a=sc.nextInt();
		sc.close();
		
		System.out.println("Your marks is: "+a);
		
		
		
		if(a>=90) {
			return "A Grade";
			
		}
		else if(a>=80) {
			return "B Grade";

		}
		else if(a>=70) {
			return "C Grage";

		}
		else if(a>=40) {
			return "D Grade";

		}
		else {
			return "Better luck next time";
			
		}
			
	}
	
	//Create a program that takes three integer inputs representing the lengths of the sides of a triangle and
	//determines whether it is equilateral, isosceles, scalene, or not a triangle at all.
	
	
	public String triangle() {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Side 1");
		int side1=sc.nextInt();
		System.out.println("Enter Side 2");
		int side2=sc.nextInt();
		System.out.println("Enter side 3");
		int side3 =sc.nextInt();
		
		sc.close();
		
		if(side1==side2&&side3==side1) {
			return "It is an equilateral triangle";
		}
		else if(side1==side2|| side2==side3 || side3==side1) {
			return "It is an isosceles triangle";
		}
		else {
			return "It is a scalene triangle";
		}
	}
	
	
	// ternary operator
	
	
	public String ternary() {
		int a=25;
		String value=(a>=256)? "Answer is correct": "Answer is incorrect";
		return value;
	}
	
	
	
	public static void main(String [] args) {
		
		ConditionalIfElse obj =new ConditionalIfElse();
//		String ans = obj.ternary();
//		System.out.println(ans);
		obj.studentsGrade();
		
		
	}

}
