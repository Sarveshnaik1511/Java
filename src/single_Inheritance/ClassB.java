package single_Inheritance;

public class ClassB extends ClassA {
	
	public static void dothat() {
		System.out.println("this is subclass");
	}

	public static void main(String[] args) {
		
		
//		we can call the inherited static methods in any way below 
		
		ClassA.dothis();
		ClassB.dothat();
		dothat();
		dothis();
		ClassB.dothat();
		ClassB.dothis();
		
		
		// ClassA.dothat();     we cannot call methods from subclass with reference to superclass
	}

}
