package advance;




public class String_Methods {

	// Program to reverse String all characters

	public void String_reverse() {

		String s= " Arise Traning"; 

		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
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
	
	
	public void StringMethodPractice() {
		String s= "my name is sarvesh naik";
		String s1= "my Name is Sarvesh Naik";
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.charAt(3));
		System.out.println(s1.equals(s));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.concat(" " +s1));
		System.out.println(s.compareToIgnoreCase(s1));
		System.out.println(s.contains("sarvesh"));
		System.out.println(s.contains("ar"));
		System.out.println(s1.indexOf("s"));
		System.out.println(s.indexOf(4));
		System.out.println(s.replace("sarvesh", "sss"));
		System.out.println(s.replaceFirst(s, s1));
		System.out.println(s.trim());
		
		
	}
	




	public static void main(String[] args) {
		String_Methods obj=new String_Methods();
		obj.StringMethodPractice() ;
	}
}



