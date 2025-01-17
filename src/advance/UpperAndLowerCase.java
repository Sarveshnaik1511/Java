package advance;

public class UpperAndLowerCase {
	public static void main(String[] args) {
		
		String name ="SaRvcEh NaIK";
		
		
		for(int i =0;i<name.length();i++) {
			char c = name.charAt(i);
			if(Character.isUpperCase(c)==true) {
				System.out.print(Character.toLowerCase(c));
			}
			else {
				System.out.print(Character.toUpperCase(c));
			}
			
		}
		
	}

}
