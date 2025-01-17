package basic;

public class JavaPattern {
	
	//*****
	//*   *
	//*   *
	//*****

		public static void main(String[] args) {
			
		for(int a=1; a<=4;a++) {
			
			for(int b=1;b<=5;b++) {
				
				if(a==1 ||b==1 || a== 4||b==5) {
					
					System.out.print("*");
					
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
//		*
//		* *
//		* * *
//		* * * *
//		* * * * *
		
		for(int a=1;a<=5;a++) {
			for(int b=1;b<=a;b++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
		
		//    ****
		//    ***
		//    **
		//    *
		
		for(int c=1;c<=5;c++) {
			for(int d=5;d>=c;d--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//    *
		//   **
		//  ***
		// ****
			
		 for(int a=1;a<=4;a++) {
			 for(int b=1;b<=4-a;b++) {
				 System.out.print(" ");
			 }
			 for(int c=1;c<=a;c++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 
//		       *
//		      * *
//		     * * *
//		    * * * *
//		   * * * * *
//		  * * * * * *
		for(int a=1;a<=6;a++) {
			for(int  b=6;b>a;b--) {
				System.out.print(" ");
			}
			for(int c=1;c<=a;c++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	
//		   
		

//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*
		for(int a=1;a<=5;a++) {
			for(int b=1;b<=a;b++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
		for(int c=1;c<=4;c++) {
			for(int d=4;d>=c;d--) {
				System.out.print("* ");
			}
			System.out.println();
		}

//    *****
//    ****
//    ***
//	  **
//	  *
//	  **
//	  ***
//	  ****
//	  *****
		for(int c=1;c<=5;c++) {
			for(int d=5;d>=c;d--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int a=2;a<=5;a++) {
			for(int b=1;b<=a;b++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
		
		
		 }
		
	
		}

