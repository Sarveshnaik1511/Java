package advance;

public class Polymorphism {
	
	public void main(String s) {
		System.out.println(s);
	}
	public void main(String s1, int a) {
		System.out.println(s1 + a);
	}

	public static void main(String[] args) {
		Polymorphism obj =new Polymorphism();
		obj.main("i am sarvesh ");
		obj.main("my age is :"+23);
		
	}
}
