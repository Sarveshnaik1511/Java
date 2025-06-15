package java_Practice;

import java.util.Scanner;

public class FebonassiSeries {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nth number");
		
		int num=sc.nextInt();
		
		int a =0,b=1,result =0;
		
		System.out.print(a +" "+b+" ");
		
		for(int i =0;i<=num;i++) {
			result =a+b;
			System.out.print(result+" ");
			a=b;
			b=result;
		}
		
		
	}

}
