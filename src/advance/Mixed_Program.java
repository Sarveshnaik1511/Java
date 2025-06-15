package advance;

import java.util.Scanner;

public class Mixed_Program {

	
	// write a program to check given number is perfect square or not
	
	public void PerfectSquareNumber() {
		int a= 4;
		
		for(int i=0;i<a;i++) {
			if(i*i==a) {
				System.out.println(true);
			}
			else {
				continue;
			}
			
			
		}
	}
	
	// list of perfect square
	
	public void PerfectSquareList() {
		int n=100;
		for(int i=1;i<=n;i++) {
		   for(int j=1;j<=n;j++) {
			   if(j*j==i) {
				   System.out.println(i);
			   }
		   }
		}
		
	}
	
	
	
	
//	     *
//	    * *
//	   * * *
//	  * * * * 
	public void patt() {
//		for(int i=1;i<=4;i++) {
//			for(int j=3;j>=i;j--) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		for(int i=1;i<=4;i++) {
			for(int j=3;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			for(int l=1;l<=i-1;l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
	
	
	// list of prime number 
	
	public void PrimeNumberList() {
		
		int n=100;
		for(int i=2;i<=n;i++) {
			int count=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count++;
				}
				}
			if(count==0) {
				System.out.println(i+" ");
			}
		}
		
	}
	
	//check prime number
	public void PrimeNumber() {
		int num=5;
		int count=0;
		for(int i=2;i<num;i++) {
			if(num % i==0) {
				count++;
			}
		}
		if(count ==0) {
			System.out.println("its a prime number");
		}
		else {
			System.out.println("Not a prime number");
		}
		
		
	}
	
	
	// program to  reverse a number
	
	public void RevereNum()	{
//		int num=165;
//		while(num>0) {
//			int total = num%10;       // will get a reminder as 5
//			System.out.print(total);  // it will get printed here
//			num=num/10;				  // here will get quotient as 16
//									  // after that num becomes 16 and same process happens again
//		}
		
		
		for(int i=134;i>0;i=i/10) {
			int rem=i%10;
			System.out.print(rem);
			
		}
	}
	
	
	// prime
	public void prime() {
		
		
		
		int num=4;
		int count=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("given number is prime");
		}
		else {
			System.out.println("given number is not prime");
		}
	}
	
	
	// check odd even
	public void odd() {
		int num=20;
		if(num%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		
	}
	
	// list of odd-even numbers
	
	public void listOddEven() {
		int list=100;
		System.out.println("even numbers are: ");
		for(int i=1;i<=list;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
			
		}
		System.out.println();
		System.out.println("odd numbers are: ");
		for(int i=1;i<=list;i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}
		
		
	}
	
	//count space in string
	
	public void countSpace() {
		String s= "sarvesh naik is from maharashtra";
		
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				count=count+1;
			}
		}
		System.out.println(count);
		
		
	}
	
	// count duplicate character in string
	
	public void duplicateChar() {
	
	String s= "sarvesh naik is from maharashtra";
	 s=s.toLowerCase();
	 char c[]=s.toCharArray();
	 
	 for(int i=0;i<c.length;i++) {
		 int count=1;
		 for(int j=i+1;j<c.length;j++) {
			 
			 if(c[i]==c[j]&&c[j]!=' ') {
				 count++;
				 c[j]=' ';
			 }
		 }
		if(count>1) {
			 System.out.println(c[i]+" repeated "+count+" times");
		}
		 
	 }
	
	
	}
	
	// program for Fibonacci
	
	public void fibonacci() {
		int a=0;
		int b=1;
		int total=0;
		int upto=20;
		System.out.print(a +" "+b+" ");
		for(int i=2;i<=upto;i++) {
			total=a+b;
			System.out.print(total +" ");
			a=b;
			b=total;
		}
	}
	
	// program for palindrome
	
	public void palindrome() {
		
		int num=191;
		int temp=num;
		int rem=0;
		int result=0;
		while(temp>0) {
			rem=temp%10;
			result=result*10 +rem;
			temp=temp/10;
		}
		if(result==num) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}
	
	// list of panindrome
	
	public void palindromeList() {
		int num=500;
		
		for(int i=1;i<=num;i++) {
			int temp=i;
			int rem=0;
			int result=0;
			
			while(temp>0) {
			rem=temp%10;
			result= result*10+rem;
			temp=temp/10;
			
			}
			if(result==i) {
				System.out.println(i);
			}
		}
		
	}
	
	
	// reverse string
	
	public void reverseString() {
		
		String s="sarvesh naik";
		
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	}
	
	// reverse string without changing word position
	
	public void revStrWithoutWordPos() {
		
		String s="sarvesh naik is from maharashtra";
		
		String s1[] =s.split(" "); 
		
		for(int i=0;i<s1.length;i++) {
			String newString=s1[i];
			for(int j=newString.length()-1;j>=0;j--) {
				System.out.print(newString.charAt(j));
			}
			System.out.print(" ");
		}
		
	}
	
	
	// Armstrong number
	
	
	public void armstrong()
	{
		int num=153;
		int temp=num;
		int len=0;
		
		while(temp>0) {
			len=len+1;
			temp=temp/10;
		}
		
		int temp2=num;
		int rem=0;
		int arm=0;
		while(temp2>0) {
			rem=temp2%10;
			int multi=1;
			for(int i=1;i<=len;i++) {
				multi=multi*rem;
				
			}
			arm=arm+multi;
			
			temp2=temp2/10;
			
		}
		if(arm==num) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("Not armstrong");
		}
			
		
			
	}
	// max number
	public void maxNum()
	{
		int num[]= {20,50,45,89,10,22};
		int max=num[0];
		int min =num[0];
		
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
			}
			if(num[i]<min) {
				min=num[i];
			}
			
		}
		System.out.println("largest number is : "+max);
		System.out.println("smallest number is : "+min);
	}
	
	// factorial
	
	public void factorial() {
		int num=4;
		int fact=1;
		for(int i=num;i>0;i--) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
	
	
	// armstrong
	
	public void armstrong1() {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter limit of number");
		int a=sc.nextInt();
		sc.close();
		
		for(int i=1;i<=a;i++) {
			int temp=i;
			int length=0;
			while(temp>0) {
				length=length+1;
				temp=temp/10;
			}
			int temp2=i;
			int reminder;
			int arm=0;
			while(temp2>0) {
				
				int multi=1;
				reminder=temp2%10;
				for(int j=1;j<=length;j++) {
					multi=multi*reminder;
				}
				arm=arm+multi;
				temp2=temp2/10; 
			}
			if(i==arm) {
				System.out.println(i);
			}	
		}
	}
	
	
	public void practice() {
		
		int num=151;
		int temp=num;
		int rem=0;
		int result =0;
		while(temp>0) {
			rem=temp%10;
			result=result*10+rem;
			temp=temp/10;
		}
		if(result==num) {
			System.out.println("pallindrome");
		}
		else {
			System.out.println("non palindrome");
		}
		
	}
	
	public void primeNum() {
		// print first 10 prime number 30 to 100
		
		for(int i=30;i<300;i++) {
			int count=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.println(i);
			}
		}
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Mixed_Program obj =new Mixed_Program();
		//ArmstrongNumber obj1 =new ArmstrongNumber();
		//obj.panindrome();
		obj.primeNum();
		}
}
