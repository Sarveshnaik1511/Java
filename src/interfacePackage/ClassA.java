package interfacePackage;

public class ClassA implements InterfaceC {
	
	public void method1() {
		
		System.out.println(a);
		System.out.println("This is from InterfaceA");
	}
	
	public void method2() {
	
		System.out.println(b);
		System.out.println("this is from InterfaceB");
		
	}
	
	public void method4() {
		
		System.out.println(c);
		System.out.println("this is from interfaceC");
	}
	public static void main(String[] args) {
		
//		ClassA obj =new ClassA();
//		obj.method1();
//		obj.method2();
//		obj.method4();
		
		InterfaceB obj1 =new ClassA();
		obj1.method2();
		InterfaceB.method3();
		
	}

}
