package arrayPrograms;

import java.util.Scanner;

public class TakeArrayInput {
	
	// take a array length from user and also take in input of array to fill the array

	public void arrayInput() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array length");
		int n =sc.nextInt();
		
		sc.nextLine();
		
		String array []=new String[n];
		for(int i=0;i<array.length;i++) {
			System.out.println("enter the element");
			String s=sc.nextLine();
			array[i]=s;	
			
		}
		System.out.println("Array Elements Are: ");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
	
	
	public void arrayInputPractice() {
		
		System.out.println("Enter the array size");
		Scanner sc =new Scanner(System.in);
		int arrayLen =sc.nextInt();
		sc.nextLine();
		
		String newArray[] = new String[arrayLen];
		
		for(int i=0;i<newArray.length;i++) {
			System.out.println("Enter the value for index "+(i+1) );
			String values = sc.nextLine();
			newArray[i]=values;
			
			
		}
		for(int i=0;i<newArray.length;i++) {
			System.out.println(newArray[i]);
		}
		
		
		
	}
	
	public static void main(String[] args) {
		TakeArrayInput obj =new TakeArrayInput();
		obj.arrayInputPractice();
		
	}
	
}
