package basic;

public class If_else_nested {
	
	public void sample() {
		// pattern 1
		
				for(int a=1;a<=5;a++) {
					for(int b=1;b<=5;b++) {
						System.out.print(b)	;	}
					
					System.out.println();
					
				}
				// pattern 2
				
				
				for(int c=1; c<=4;c++) {
					
					for(int d=1; d<=4;d++) {
						System.out.print("*");
					}
					System.out.println();
				}
				// pattern 3
				
				for(int e=1; e<=5;e++) {
					for(int f=1; f<=e;f++) {
						System.out.print("+");
					}
					System.out.println();
				}
				
	}
	
	
	public static void main(String[] args) {
		
		If_else_nested obj = new If_else_nested();
		
		obj.sample();
	}
}
