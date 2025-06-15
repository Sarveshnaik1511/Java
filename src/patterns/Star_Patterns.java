package patterns;

public class Star_Patterns {
public void pattern1() {
		
//		* * * * 
//		* * * * 
//		* * * * 
//		* * * * 
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}	
	}
	
	
	public void pattern2() {
		
//		*  
//		* * 
//		* * * 
//		* * * * 
//		* * * * * 

		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	public void pattern3() {
		
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		* 
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void pattern4() {
		
//		* * * * * 
//		  * * * *
//			* * *
//			  * *	
//				*
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++ ) {
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void pattern5() {
		
//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		* 

		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=4;i>=1;i--) {
			for(int j= 1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	public void pattern6() {
		
//			*
//		   **
//		  ***
//		 ****
//		*****

		// to create below pattern we have to create above pattern first
		// and we can add space in statement and can create below pattern
		
//		 	* 							
//		   * *  				
//		  * * * 
//		 * * * * 
//		* * * * * 
		
	for(int i=1;i<=5;i++) {
		for(int j=5;j>=i;j--) {
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
//		Below logic can be used to print half pyramid star pattern
//
//	for(int i=1;i<=5;i++) {
//		for(int j=4;j>=i;j--) {
//			System.out.print(" ");
//		}
//		
//		for(int k=1;k<=i;k++) {
//			System.out.print("*");
//		}
//		
//		for(int l =1;l<=i-1;l++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
		
	}
	
	public void pattern7() {
		
//		 * * * * * 
//		  * * * * 
//		   * * * 
//		    * * 
//		     * 
		     
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	public void pattern8() {
		
//		    * 
//		   * * 
//		  * * * 
//		 * * * * 
//		* * * * * 
//		 * * * * 
//		  * * * 
//		   * * 
//		    * 
		    
		
		for(int i=1;i<=5;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=4;k>=i;k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	public void pattern9() {
		
//		       *
//		      **
//		     ***
//		    ****
//		   *****
//		    ****
//		     *** 
//		      ** 
//		       *
		
		for(int i=1;i<=5;i++) {
			for(int j=4; j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=4;k>=i;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
}
	public void pattern10(){
		
//		*****
//		****
//		***
//		**
//		*
//		**
//		***
//		****
//		*****
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		 
		for(int i=2;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Star_Patterns obj =new Star_Patterns();
		obj.pattern8();
	}

}
