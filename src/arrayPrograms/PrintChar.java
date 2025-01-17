package arrayPrograms;

public class PrintChar {
	public void charArray() {
		
		char c[]= {'s','a','r','v','e','s','h'};
		
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]);
		}
	}
	
	public static void main(String[] args) {
		PrintChar obj =new PrintChar();
		obj.charArray();
		
	}
}
