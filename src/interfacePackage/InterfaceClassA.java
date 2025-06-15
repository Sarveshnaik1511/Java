package interfacePackage;

public class InterfaceClassA implements First {
	
	public  void method1() {
		System.out.println("this is method 1");
	}
	public void method2() {
		System.out.println("is complete now");
	}
public static void main(String[] args) {
	InterfaceClassA obj =new InterfaceClassA();
	InterfaceClassB obj1 =new InterfaceClassB();
	obj.method1();
	obj.method2();
	obj1.Method1();
	obj1.method2();
	System.out.println(a);
	System.out.println(First.a);
	System.out.println(c);
}
}
