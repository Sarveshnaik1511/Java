package basic;

public class If_else_ladder {

	
	public static void main(String[] args) {
		
		int marks=182;
	
		if (marks>100) {
			
			System.out.println("marks cannot be greater than 100");
		}
		else if (marks<0) {
			
			System.out.println("marks cannot be lower than 0");
		}
		else if(marks>=90) {
			System.out.println("you have got A+ Grade");
			}
		
		else if(marks>=80) {
			System.out.println("you have got A Grade");
	}
		
		else if (marks>=70) {
			System.out.println("you have got B+ Grade");
		}
		else if (marks>=60) {
			System.out.println("you have got B Grade");
		}
		else if (marks>=50) {
			System.out.println("you have got C Grade");
		}
		else if(marks>=40) {
			System.out.println("you have got D Grade");
		}
		
		else {
			System.out.println("you have failed");
		}
	}
}
