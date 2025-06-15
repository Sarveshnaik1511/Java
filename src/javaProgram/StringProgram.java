package javaProgram;

public class StringProgram {
	
	// write a code to Reverse a code
	
	public void reverseSentance() {
		
		String s =" i.like.this.program.very.much";
		
		String s1[]=s.split("\\.");
		for(int i=s1.length-1;i>=0;i--) {
			String s3 =s1[i]; 
			for(int j=0;j<s3.length();j++) {
				System.out.print(s3.charAt(j));
			}
			if(i!=0) { 
				System.out.print(".");
			}
			System.out.print("");
			
		}
		
	}
	
	public void reverseSentance1() {
		
		String s ="maharashtra from is sarvesh";
		String[]s1= s.split(" ");
		for(int i=s1.length-1;i>=0;i--) {
			String s2 =s1[i];
			for(int j=0;j<s2.length();j++) {
				System.out.print(s2.charAt(j));
			}
			System.out.print(" ");
		}
	}
	
	
	// write a code to reverse word from string which are on odd position
	
	public void reverseOddPositionWord() {
		String intro="sarvesh is from maharashtra";
		
		String intro1[]=intro.split(" ");
		for(int i=0;i<intro1.length;i++) {
		if((i+1)%2 !=0) {
			String intro2 =intro1[i];
			for(int j=intro2.length()-1;j>=0;j--) {
				System.out.print(intro2.charAt(j));
			}
		}
		else {
			System.out.print(intro1[i]);
		}
		System.out.print(" ");
		
		}
	}
	
	// write a code to reverse word from string which are on even position
	
	public void reverseEvenPositionWord() {
		String s="sarvesh is from maharashtra";
		String [] s1 =s.split(" ");
		
		for(int i=0;i<s1.length;i++) {
			String s2 =s1[i];
			if((i+1)%2==0) {
				for(int j=s2.length()-1;j>=0;j--) {
					System.out.print(s2.charAt(j));
				}
			}
			else {
				System.out.print(s1[i]);
			}
			System.out.print(" ");
		}
		
	}
	public static void main(String[] args) {
		StringProgram obj =new StringProgram();
		obj.reverseSentance();
	}

}
