package basic;

public class Conditional_Practice {
	
	public void positive() {
		
//		Write a Java program to print whether number is positive or negative.
		int a=0;
		if (a>0) {
			System.out.println(" The number is Positive");
		}
		else if (a<0){
			System.out.println(" The number is negative");
		}
		else {
			System.out.println(" The number is Zero");
		}
	
	}

	public static void main(String[] args) {
		Conditional_Practice obj = new Conditional_Practice();
		obj.positive();
	}

}
