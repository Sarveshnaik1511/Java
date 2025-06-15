package abstract_Class;

public abstract class AbstractClassA {
	
	 int a=20;
	abstract void AbstractTest();
	abstract  void AbstractRun();
	//  abstract static void AbstractionDemo(); //   here we can see abstract static method is not possible
												// as static method directly get bounded to its body and abstract method don't have body.
	
	static void AbstractStatic() {
		System.out.println("Normal  Static method");  // static method with body is possible but not abstract method;
	}
	
	public void AbstractSample() {
		System.out.println("Abstract Sample Method");
	}
}
