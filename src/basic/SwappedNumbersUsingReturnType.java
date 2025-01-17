package basic;

import java.util.Scanner;

public class SwappedNumbersUsingReturnType {
    public  int[] method1(int a,int b) {
    	
        a = a + b;
        b = a - b;
        a = a - b;
        int result[]={a,b};
        return result;

    }

    public static void main(String[] args) {
        SwappedNumbersUsingReturnType obj = new SwappedNumbersUsingReturnType();
        Scanner sc =new Scanner(System.in);
        System.out.println("enter First number");
        int a=sc.nextInt();
        System.out.println("enter Second number");
        int b=sc.nextInt();
        sc.close();
       int swappedValue[]= obj.method1( a, b);
        System.out.println("After swapping value of First number is:" +swappedValue[0]);
        System.out.println("After swapping value of Second number is:" +swappedValue[1]);
}
    }
