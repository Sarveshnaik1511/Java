package advance;

public class String_Programs {

	// find repeated character in a string and count them
	
	public void Repeated() {
		
		String s="i am sarvesh naik";
		
		s=s.toLowerCase();
		
		
		char c [] =s.toCharArray();
		
		
		for(int i=0;i<c.length;i++) {
			int count=1;
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j] && c[j]!=' ') {
					count++;
					c[j]=' ';
				}
			}
			if(count>1 ) {
				System.out.println(c[i] +" repeated "+ count+ " times");
			}
		}
	}
	
	// program to count white spaces in string

		public void WhiteSpace() {
			String s= "sarvesh naik is from sindhudurg";
			int count =0;
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)==' ') {
					count++;
				}
			}
			System.out.println(count);
			
		}
		
		// reverse the string without changing word positions
		
		public void ReverseWithoutChangingWordposition() {
			
			String s= "my name is sarvesh naik";
					
			System.out.println(s);
			
			String s1[]=s.split(" ");
			
			for(int i=0;i<s1.length;i++) {
				String s2=s1[i];
				for(int j=s2.length()-1;j>=0;j--) {
					System.out.print(s2.charAt(j));
				}
				System.out.print(" ");
			}
		}
		
		
		// count number of words in java string
		
		public void countWords() {
			String s="sarvesh is from maharastra";
			
			String s1[]=s.split(" ");
			
			System.out.println(s1.length);
				
		}
		
		
		
		// count number of characters in a given string
		
		public void countChar() {
			String s= "Sarvesh is from maharahtra";
			
			char s1[]=s.toCharArray();      /* both method can be used to find the number of characters;*/
			String s2[]=s.split("");          
			System.out.println(s1.length);
			System.out.println(s2.length);
			
		}
		
		
		// code to reverse a sentence word by word
		
		public void reverseSentence() {
			
			String s="sarvesh naik";
			
			String s1[]=s.split(" ");
			
			for(int i=s1.length-1;i>=0;i--) {
				System.out.print(s1[i]+" ");
			}
		}
		
		// code to find index of character in string
		public void indexOfString(){
			String name="sarvesh naik";
			
			System.out.println(name.indexOf('n'));
			 
		}
		
		
		
		
		// code to get upper, lower, numbers and special characters from string
		
		public void getAlltypesOfValueFromString() {
			String s ="Fajdh yYg8yg@3532 123212 Jigiyt^ *658";
	        
	        System.out.println(s);
	        
	        char[] c =s.toCharArray();
	        String uppercase ="";
	        String lowercase ="";
	        String numbers ="";
	        String specialChar="";
	        
	        for(int i=0;i<c.length;i++){
	            if(Character.isUpperCase(c[i])){
	                uppercase =uppercase+c[i];
	            }
	           else if(Character.isLowerCase(c[i])){
	                lowercase =lowercase+c[i];
	            }
	           else if(Character.isDigit(c[i])){
	                numbers =numbers+c[i];
	            }
	           else if (c[i]==' ') {
	        	   continue;
	           }
	            else{
	                specialChar= specialChar+c[i];
	            }
	            
	            
	        }
	        System.out.println("uppercase: "+uppercase+", lowercase: "+lowercase+", numbers: "+numbers+", specialChar: "+specialChar);
		}
		
		// code to reverse words
		
		public void reverseString() {
			String name = "Arise Academy";

			String[] splitted = name.split(" ");

			for (int i = 0; i < splitted.length; i++) {
				String individual = splitted[0];

				for (int j = individual.length() - 1; j >= 0; j--) {
					System.out.print(individual.charAt(j));
				}
			}
		}
		
		// Remove vowels from string
		public void removeVowels() {
			
			String s ="Rohit sharma is one of legends in cricket";
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)==('a') ||s.charAt(i)=='e' ||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u' ) {
					continue;
				}
				
				else {
					System.out.print(s.charAt(i));
				}
			}
			
		}
		
		//reverse word without change in position
		public void reverseWord() {
			String s ="arise academy";
			String s1[]=s.split(" ");
			
			for(int i=0;i<s1.length;i++) {
				String s2=s1[i];
				for(int j= s2.length()-1;j>=0;j--) {
					System.out.print(s2.charAt(j));
				}
				System.out.print(" ");
			}
		}
		
		
		//remove duplicate characters
		public void removeDuplicateCharacterS() {
		String s ="Rohit sharma is one of legends in cricket";
		char[] s1 =s.toCharArray();
		
		for(int i=0;i<s1.length;i++) {
			for(int j=i+1;j<s1.length;j++) {
				if(s1[i]==s1[j] && s1[j]!=' ') {
					s1[j]=' ';
					continue;
				}
			}
				System.out.print(s1[i]);
			
			
			
		}
		
	}
		public void removeDuplicateCharacters() {
			String s ="Rohit sharma is one of legends in cricket";
			char[] c= s.toCharArray();
			for (int i=0;i<c.length;i++) {
				for(int j=i+1;j<c.length;j++) {
					if(c[i]==c[j]&& c[j]!=' ') {
						c[j]=' ';
					}
				}
			}
			for(int i=0;i<c.length;i++) {
				if(c[i]!=' ') {
					System.out.print(c[i]);
				}
				
			}
		}
	
		
		
	public static void main(String[] args) {
		String_Programs obj =new String_Programs();
		obj.Repeated();
	}
	
}
