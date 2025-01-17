package javaProgram;

public class Vowels {
	
	// write a code to print Vowels
	// Vowels means a,e i,o,u sometimes y
	
	public void printVowels() {
		
		String s= "sarvesh naik is from sindhudurg";
		
		char s1[] =s.toCharArray();
		for(int i=0;i<s1.length;i++) {
			if(s1[i]=='a'||s1[i]=='e'||s1[i]=='i'||s1[i]=='o'||s1[i]=='u'||s1[i]=='y') {
				System.out.print(s1[i]);
			}
			
		}
	}
	
	// write a code to count vowels
	
	public void countVowels() {
		String s= "sarvesh naik is from sindhudurg";
		char s1[]=s.toCharArray();
		int count=0;
		for(int i=0;i<s1.length;i++) {
			if(s1[i]=='a'||s1[i]=='e'||s1[i]=='i'||s1[i]=='o'||s1[i]=='u'||s1[i]=='y') {
				count++;
			}
		}
		System.out.println(count);
	}
	
	
	
	public static void main(String[] args) {
		Vowels obj =new Vowels();
		obj.countVowels();
		
	}
	
}
