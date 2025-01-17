package basic;

public class Methods_Basic {

	public void Base()
	{
for(int a=1; a<=4;a++) {
			
			for(int b=1;b<=5;b++) {
				
				if(a==1 ||b==1 || a== 4||b==5) {
					
					System.out.print("*");
					
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
	}
	}
	
	public void calculation (int a,int b) {
		int sum=a+b;
		int sum2=a*b;
		System.out.println(sum);
		System.out.println(sum2);
	}
	
	public static void main(String [] args) {
		
		Methods_Basic obj =new Methods_Basic();
		
		obj.Base();
		obj.Base();
		obj.calculation(10, 30);
		If_else_nested obj2 = new If_else_nested();
		obj2.sample();
		
	}
}
