package java_Practice;

public class RemoveWhiteSpacesFromString {
	public static void main(String[] args) {
		
		String n ="Write a Java program to remove all white spaces from a string?";
		String withoutSpace ="";
		for(int i=0;i<n.length();i++) {
			if(n.charAt(i)==' ') {
				continue;
			}
			else {
				withoutSpace =withoutSpace+ n.charAt(i);
			}
		}
		System.out.println(withoutSpace);
	}

}
