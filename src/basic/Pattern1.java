package basic;

public class Pattern1 {
	
	public void test() {
	
		
		for(int i=1;i<=5;i++) {
			for (int j= 1;j>=5;j--) {
				
				System.out.println(" ");
			}
			System.out.println(" *");
			
		}
			
		
		
	}
	

	public static void main(String [] args) {
		Pattern1 obj = new Pattern1();
		obj.test();
		
	}
	
}