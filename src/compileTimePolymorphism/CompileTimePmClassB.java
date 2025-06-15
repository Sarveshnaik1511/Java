package compileTimePolymorphism;
import interfacePackage.ClassA;

public class CompileTimePmClassB {

	public static void main(String[] args) {
		CompileTimePmClassA obj = new CompileTimePmClassA();
		obj.toDo();
		obj.toDo(25);
		obj.toDo("Sarvesh Naik");
		
		ClassA obj1=new ClassA();
		obj1.method1();
		
		
	}
	
	
}
