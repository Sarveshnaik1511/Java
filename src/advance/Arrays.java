 package advance;

public class Arrays {
	
	
	public void array_practice() {
		
		int a[] = {5,4,8,9,6,5,2,4,5,8,55,8,9,6,8,50,8};
		System.out.println(a[3]);
		String s[]= {"sarvesh","naik","shelpiwadi","dodamarg"};
		
		String so =s[2];
		System.out.println(so);
		
		int b[]=new  int[2];
		b[0]=10;
		b[1]=11;
		System.out.println(b[0]);
		
		String s2[]= new String[6];
		s2[0]="maharashtra";
		s2[1]="sindhudurg";
		s2[2]="bhedshi";
		s2[3]="shelpiwadi";
		s2[4]="dodamarg";
		s2[5]="pikule";
		System.out.println(s2[5]);
		int l=s2.length;
		System.out.println(l);
		
		// code to display all array of string items
		
		for(int i=0;i<s2.length;i++) {
			System.out.print(s2[i]+ " ");
		}
		
		
	}
	
	// write a program to find largest number in a a array
	
	public void LargestNum() {
		
		int a[]= {1,5,8,6,9,7,222,44,8,6,99}; 
		int largest =a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]> largest) {
				largest=a[i];
			}
		}
		System.out.println(largest);
		
	}
	
	public void largestnumber() {
		int [] number= {1,55,89,54,62,8};
		 int largest=number[0];
		for(int i=0;i<number.length;i++) {
			if(number[i]>largest) {
				largest=number[i];
			}
		}
		System.out.println(largest);
	}
	
	// write a program to find smallest number in a a array
	
	public void SmallestNum() {
		int a[]= {66,5,8,6,9,7,222,44,8,6,99}; 
		
		int smallest= a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<smallest) {
				smallest=a[i];
			}
			
		}
		System.out.println(smallest);
		
	}
	
	// Program to print the elements of an array
	
	public void PrintElement() {
		int a[]= new int[4];
		a[0]=5;
		a[1]=24;
		a[2]=14;
		a[3]=18;
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	
	
	// Program to print the elements of an array in reverse order
	
	public void PrintElementInReverse() {
		int a[]= {1,5,8,6,9,7,55,12,45};
		for(int i=a.length-1;i>0;i--) {
			System.out.println(a[i]);
		}
	}
	
	
	//Program to print the elements of an array present on even position
	
	
	public void PrintEvenPosition() {
		String s[]= {"sarvesh","rohit","rajendra","virat","akshay"};
		//position  {   1     ,   2   ,    3      ,   4   ,   5   }
		//here index 2 & 4 should print
		for(int i=1;i<s.length;i=i+2) {
			System.out.println(s[i]);
		}
		
		
	}
	
	//Program to print the elements of an array present on odd position
	
	public void PrintOddPosition()
	{
		String s[]= {"sarvesh","rohit","rajendra","virat","akshay"};
		//position  {   1     ,   2   ,    3      ,   4   ,   5   }
		//here index 1 & 3,5 should print
		
		for(int i=0;i<s.length;i=i+2) {
			System.out.println(s[i]);
		}
		
	}	
	
	
	//Program to print the sum of all the items of the array
	
	public void PrintSum() {
		int a[]= {1,2,3,4,5};
		int b=0;
		for(int i=0;i<a.length;i++) {
			b=b+a[i];	
		}
		System.out.println(b);
	}
	
	

	
	//Program to sort the elements of an array in ascending order
	public void AscendingArray() {
		
		int a[]= {1,4,3,6,7,5,8,22};
		    
		System.out.println("These are array list given");
		
		for(int i=0;i<a.length;i++) {
			
			System.out.print(a[i]+ " ");
		}
		// ascending
		
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		System.out.println();
		System.out.println("array in accending order");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
			}
	}
	
	// ascending array practice
	
	public void ascedingPractice() {
		
		int array[]= {10,2,45,88,65,45,23,12};
		int temp=0;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					temp=array[j];
					array[j]=array[i];
					array[i]=temp;
				}
			}
			System.out.println(array[i]);
		}
	}
	
	
	//Program to sort the elements of an array in descending order
	
	public void DescendingArray() {
		int a[]= {1,4,3,6,7,5,8,22};
		
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+ " ");
		}
		
	}
	
	//Program to check java Array are mutable or immutable
	
	public void Checkmutable() {
	String s[]= {"sarvesh" ,"Ashwini","Alka","Shivprasad"};
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		
		s[2]= "chaitali";
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}
	
	// find Max number in given array
	
	public void maxNum() {
		
		int a[]= {20,54,85,65,42,89,98,10};
		
		int max=a[0];
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>max) {
				max=a[i];
			}
			
		}
		System.out.println(max);
		
	}
	
	// find min number in given array
	
	public void minNum() {
	
	int a[]= {50,54,85,65,42,89,98};
	
	int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(min);
	
	}
	
	// factorial of given array

		public void fact() {
			int num[]= {20,5,10,4};
			
			for(int i=0;i<num.length;i++) {
				long fact=1;
				for(int j=1;j<=num[i];j++) {
					fact=fact*j;
				}
				
				System.out.println("factorial of " +num[i] +" is "+fact);
			}
		}
	
		// practice factorial
		
		public void practiceFact() {
			
			int fact[]= {5,6,4,3};
			
			for(int i=0;i<fact.length;i++) {
				int factorial=1;
				
				for(int j=1;j<=fact[i];j++) {
					factorial= factorial*j;
				}
				System.out.println(factorial);
			}
		}
		
		public void ascendind() {
			int [] num = {1,5,6,9,8,8,9,55,7};
			int temp=0;
			for(int i=0;i<num.length;i++) {
				for(int j=i+1;j<num.length;j++) {
					if(num[j]>num[i]) {
						temp=num[j];
						num[j]=num[i];
						num[i]=temp;
						
					}
				}
				System.out.print(num[i]+" ");
			}
		}
		
		// remove duplicate from int array
		
		public void removeDuplicateFromIntArray() {
			
			 int[] num = {1, 5, 6, 8, 55, 9, 55, 4, 5, 1, 8};

		        // Remove duplicates by marking them with 0
		        for (int i = 0; i < num.length; i++) {
		            for (int j = i + 1; j < num.length; j++) {
		                if (num[i] == num[j]) {
		                    num[j] = 0; // Mark duplicate as 0
		                }
		            }
		        }
		        // so now the new num = 1,5,6,8,55,9,0,4,0,0,0
		        // so use loop on this
		        
		        // Print unique numbers (those not marked as 0)
		        for (int i = 0; i < num.length; i++) {
		            if (num[i] > 0) {
		                System.out.print(num[i]+" ");
		            }
		        }
		}
		
		
		
		
		//remove duplicate from String array
		public void removeDuplicateFromStringArray() {
			
			String[] s = {"Sarvesh", "is", "sarvesh", "is", "sarvesh","is","sarvesh","ulhas"};

	        // Using nested loops to find and remove duplicates
	        for (int i = 0; i < s.length; i++) {
	            for (int j = i + 1; j < s.length; j++) {
	                // Use equalsIgnoreCase() to compare strings ignoring case
	                if (s[i].equalsIgnoreCase(s[j])) {
	                    s[j] = ""; // Replace duplicate with an empty string
	                }
	            }
	        }
	        // new s[] is sarvesh ,is, "" ,"", so now we have to use loop on this new s[]
	        // Print unique strings
	        for (int i = 0; i < s.length; i++) {
	            // Check if the string is not empty and has length > 0
	            if (s[i].length() > 0) {
	                System.out.print(s[i]+" ");
	            }
	        }
		}
		
		
		//remove duplicates from array
		
		public void removeDuplicates() {
			String[] s = {"sarvesh","15","30","15","sarvesh"};
			for(int i=0;i<s.length;i++) {
				for(int j=i+1;j<s.length;j++) {
					if(s[i].equalsIgnoreCase(s[j])) {
						s[j]="";
					}
				}
			}
			for(int i=0;i<s.length;i++) {
				if(s.length>0) {
					System.out.print(s[i]);
				}
				System.out.print(" ");
			}
			
		}
		
		
		
		// program to find second largest and second smallest numbers from array
		
		public void printSecondSmallestAndSecondLargestNumber() {
		        int [] a={1,5,8,9,6,7,2,3,6,5};
		        
		        
		        // first make it in ascending order
		        for(int i=0;i<a.length;i++){
		            int temp=0;
		            for(int j=i+1;j<a.length;j++){
		                if(a[i]>a[j]){
		                    temp=a[i];
		                    a[i]=a[j];
		                    a[j]=temp;
		                }     
		            }
		        }
		        
		        //print numbers in assending orders 
		        System.out.print("given sorted numbers are: ");
		        for(int i=0;i<a.length;i++){
		            System.out.print(a[i]+" ");
		        }
		         System.out.println();
		         // a[1] means number at 2nd index
		            System.out.println("second smallest number is: "+a[1]);
		         // a[a.length-2] means second highest index
		            System.out.println("second largest number is: "+a[a.length-2]);
		    }
		
		
	public static void main(String[] args) {
		Arrays obj = new Arrays();
		obj.printSecondSmallestAndSecondLargestNumber();
	}

}


