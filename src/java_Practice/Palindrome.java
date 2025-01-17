package java_Practice;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter number to check list of Palindrome");
		int num =sc.nextInt();
		sc.close();
		
		for(int i =0;i<=num;i++) {
			
			int temp =i;
			int rem =0;
			int result=0;
			while(temp>0) {
				rem = temp%10;
				result =result * 10 +rem;
				temp =temp/10;
			}
			if(i==result) {
				System.out.println(i);
			}
		}
	}

}
