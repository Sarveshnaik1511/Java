package basic;

public class Main {
	
	
	public static void open() {
		
		for(int a =9;a>=1;a=a-2) {
			System.out.println(a);
		}
		
}
	public void close() {
		int a= 7;
		while(a<=27) {
			System.out.println(a);
			a=a+4;
		}
	}
	
	void open1() {
		int a=27;
		do {
			System.out.println(a);
			a=a-2;
		}
		while(a>=1);
		
	}
	
	
	public static void main(String[] args) {
		
		Main.open();
		Main obj = new Main();
		obj.close();
		obj.open1();
		}

}
