package basic;

public class Test_Practice {
	
	public static void odd() {
		
		for(int i=1;i<=10;i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
	}
	
	public static void patt() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++){
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public static void patt1() {
		
		for(int i=1;i<=5;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			
			for(int l =1;l<=i-1;l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	int a=20;
	
	public  void str() {
		
		String s ="Sarvesh";
		String t ="sarvesh";
		System.out.println(s);
		char c = s.charAt(5);
		System.out.println(c);
		int l = s.length();
		System.out.println(l);
		boolean b = s.equals(t);
		System.out.println(b);
		boolean bb= s.equalsIgnoreCase(t);
		System.out.println(bb);
		String ss= s.concat(" Naik");
		System.out.println(ss);
		System.out.println(s);
		String u = s.toUpperCase();
		System.out.println(u);
		String ll =s.toLowerCase();
		System.out.println(ll);
	}
	
	
	public static void main(String[] args) {
		Test_Practice  obj =new Test_Practice();
	
		obj.str();
	}

}
