package basic;

public class ClassA {
	
	public static int k= 45;
	public int i=55;
	
	

	public static void test() {
		System.out.println(k);
		ClassA obj = new ClassA();
		System.out.println(obj.i);
		
	}
	
	public void test1() {
		System.out.println(k);
		System.out.println(i);
		
	}
	public void largestnum() {
		
		int a=10000,b=20,c=200;
		if(a>b&&a>c) {
			System.out.println("largest is: "+a);
			
		}
		else if(b>a&&b>c) {
			System.out.println("largest is: "+b);
		}
		else {
			System.out.println("largest is : "+c);
		}
	}
	
	public static void main(String [] args) {
		
		ClassA obj = new ClassA();
		obj.largestnum();		
		
	}

}
