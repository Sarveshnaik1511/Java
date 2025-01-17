package multiLevel_Inheritance;

public class ClassD extends ClassC {

	public static void main(String[] args) {
		sample();
		practice("sarvesh");
		ClassD obj =new ClassD();
		obj.test();
		obj.inheri();
		obj.numbers(20, 10);
		
		
		//ClassB obj1 =new ClassB();
		
	//	obj1.inheri();  .. we cannot call later class method by creating middle class object;
	}
	
}
