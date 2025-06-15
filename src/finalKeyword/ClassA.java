package finalKeyword;

public class ClassA extends ClassB{
	
//	public void FinalTest() {               // so here we can't override the method because the method is final in ClassB;
//		System.out.println("FinalTest");
//		
//	}
 
	
	public static void main(String[] args) {
		
		ClassA obj =new ClassA();
		obj.FinalTest();
		int a=20;
		final int b=22;
		System.out.println(a);
		
		// here we changed the value of a
		a=22;
		System.out.println(a);
		
		System.out.println(b);
		
		// b=25;  here we tried to change a value of b, but b is final so we cannot change its value
		
		
		
		
	}
	
}
