package runTimePolymorphism;

public class RuntimePmClassB extends RuntimePmClassA{

	
	public void runtimeTodo() {
		System.out.println("i am sarvesh over-rided");
	}
	
	public static void example() {
		System.out.println("this is from subclass");
	}
	
	// as super keyword cannot use in static method, for that we need to create non static method to use super keyword
	
	public void test() {
		super.example();
//	    this.example();
		example();
		
	}  
	
	public void runtimeTOdo(int a) {
		System.out.println(a);
	}            
	
	
	public static void main(String[] args) {
		RuntimePmClassB obj = new RuntimePmClassB();
        RuntimePmClassA obj1 =new RuntimePmClassA();
		
		obj.runtimeTOdo(30);
		
		obj.example(); 
		obj1.example();
		
		
		
	}
}
