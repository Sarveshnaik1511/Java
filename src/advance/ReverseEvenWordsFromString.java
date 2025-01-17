package advance;

public class ReverseEvenWordsFromString {
	public static void main(String args[]) {
		
		String s= "Sarvesh Naik is from maharashtra";
		
		String[]s1= s.split(" ");
		
		for(int i=0;i<s1.length;i++) {
			String s2=s1[i];
			if(i%2!=0) {
				
				for(int j=s2.length()-1;j>=0;j--) {
					System.out.print(s2.charAt(j));
			}
				System.out.print(" ");
			}
			else {
				System.out.print(s2);
			}
			System.out.print(" ");
			
			}
			
		}
	}


