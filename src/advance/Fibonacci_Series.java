package advance;

public class Fibonacci_Series {

	
	public static void main(String[] args) {

		int a=0,b=1,n=25,series=0; 
		
		System.out.print(a+" "+b+" ");
		for(int i=2;i<=n;i++) {
			series=a+b;
			System.out.print(series+ " ");
			
			a=b;
			b=series; 
		}
				
	}
}
