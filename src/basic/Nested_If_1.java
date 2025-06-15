package basic;

public class Nested_If_1 {

// check and give o/p 
	
	// number is >100
	//number is <50
	public static void main(String [] args) {
		
		int num=5;
		
		if(num<50) {
			System.out.println("entered number is less than 50");
			 
			if(num>100) {
				System.out.println("Number is greater than 100");
			}
			else {
				System.out.println("Number is less then 100");
			}
		}
		else {
			System.out.println("wrong");
		}
	}
}
