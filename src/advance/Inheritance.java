package advance;

public class Inheritance {
int a=20;
int b=25;

	public static void main(String[] args) {
		Inheritance2 obj =new Inheritance2();
		obj.main();
	}
}
 


class Inheritance1 extends Inheritance{
	 
	int c=23;
	public void prat() {
		System.out.println(a+b+c);
	}
	
}

class Inheritance2 extends Inheritance1{
	
	public void main() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		prat();
	}
}
