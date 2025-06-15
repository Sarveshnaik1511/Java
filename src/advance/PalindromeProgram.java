package advance;

public class PalindromeProgram {
	
	
	// write a code to print palindrome number upto 1000;
	
	public void palindromeUpto1000() {
		
        int num=1000;
		
		for(int i=1;i<=num;i++) {
			int temp=i;
			int rem=0;
			int result=0;
			
			while(temp>0) {
				rem=temp%10; 
				result=result*10+rem;
				temp=temp/10;
				
			}
			if(result==i) {
				System.out.println(i);
			}
			
		}
		
		
	}
	 
	
	// write a code to check given number is palindrome or not
	
	public void checkPalindrome() {
		//int reminder=0;
		int num=1551;
		int temp=num;
		int result=0;
		
		while(num>0) {
			
		int	reminder =num%10;
			
			System.out.print(reminder);
			result=result*10 + reminder;
			num=num/10;
			
			
		}
//		for(;num>0;num=num/10) {
//			reminder =num%10;
//			System.out.print(reminder);
//			result=result*10 +reminder;
//		}
		
		System.out.println();
		if(temp==result) {
			System.out.println("palimdrone");
		}
		else {
			System.out.println("non palimdrone");
		}
		
	}
	
	public static void main(String[] args) {
		PalindromeProgram obj =new PalindromeProgram();
		obj.checkPalindrome();
		
	}
}

