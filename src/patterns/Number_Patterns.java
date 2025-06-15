package patterns;

public class Number_Patterns {
public void pattern11() {
		
//		11111
//		22222
//		33333
//		44444
//		55555

		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(i);
			}
			System.out.println(); 
		}
	}
	
	public void pattern12() {
		
//		12345
//		12345
//		12345
//		12345
//		12345
		
		for(int i= 1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public void pattern13() {
		
//		1
//		22
//		333
//		4444
//		55555
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public void pattern14() {
		
//		11111
//		2222
//		333
//		44
//		5
		
		for(int i=1;i<=5;i++) {
			for(int j =5;j>=i;j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public void pattern15() {
		
//		54321
//		5432
//		543
//		54
//		5
		
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public void pattern16() {
		
//			 1 
//		    2 2 
//		   3 3 3 
//		  4 4 4 4 
//		 5 5 5 5 5 
		
		for(int i=1;i<=5;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(i +" ");
			}
			System.out.println();
		}
	}
	
	public void pattern17() {
		
//		 1 1 1 1 1 
//		  2 2 2 2 
//		   3 3 3 
//		    4 4 
//		     5 
		
		for(int i= 1;i<=5;i++) {
			for(int j= 1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--) {
				System.out.print(i+ " ");
			}
			System.out.println();
		}
	}
	
	public void pattern18() {
		
//		 5 4 3 2 1 
//		  5 4 3 2 
//		   5 4 3 
//		    5 4 
//		     5 

		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
	
	public void pattern19() {
		
//			1 
//		   1 2 
//		  1 2 3 
//		 1 2 3 4 
//		1 2 3 4 5
		
		for(int i=1;i<=5;i++) {
			for (int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
	
	public void pattern20() {
		
//			1 
//		   2 2 
//		  3 3 3 
//		 4 4 4 4 
//		5 5 5 5 5 
		
		for(int i=1;i<=5;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}
	public void pattern21() {
		
//			1 
//		   1 2 
//		  1 2 3 
//		 1 2 3 4 
//		1 2 3 4 5 
		
		for(int i=1;i<=5;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k+ " ");
			}
			System.out.println();
		}
	}
	
	public void pattern22() {
//		1 
//		2 3 
//		4 5 6 
//		7 8 9 10 
		
		int count=0;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				count++;
				System.out.print(count);
			}
			System.out.println();
		}
	}
	
	public void pattern23() {
		
//		1 
//		2 1 
//		3 2 1 
//		4 3 2 1 
//		5 4 3 2 1
		
		for(int i=1;i<=5;i++) {
			for(int j=i;j>=1;j--) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		Number_Patterns obj=new Number_Patterns();
		obj.pattern23();
	}
}
