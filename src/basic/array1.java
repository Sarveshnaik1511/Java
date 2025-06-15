package basic;

public class array1 {

	public void IfNumExistPtrue()
	{
		int a[]= {2,5,4,9,5,10,7,6,11};
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==4) {
				System.out.println(true);
			}
			
		
		}
		
	}
	
	public void IfcharExistPtrue() {
		char a[]= {'h','g','u','y'};
		
		for(int i=0;i<a.length;i++) {
			if(a[i]=='u') {
				System.out.println(true);
			}
			
		}
	}
	
	public void swap() {
		String s="sarvesh";
		String s1="naik";
		String temp;
		temp =s;
		s=s1;
		s1=temp;
		System.out.println(s + " "+s1);
	}
	
	public static void main(String[] args) {
		
		array1 obj =new array1();
		obj.swap(); 
	}

}
