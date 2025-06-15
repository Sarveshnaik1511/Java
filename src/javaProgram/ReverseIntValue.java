package javaProgram;

public class ReverseIntValue {
	public static void main(String[] args) {
		
		// reverse this interger value
		int n =123545;
		
	String ns=	Integer.toString(n);
	for(int i=ns.length()-1;i>=0;i--) {
		System.out.print(ns.charAt(i));
	}
		
	}

}
