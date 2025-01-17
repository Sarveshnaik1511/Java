package advance;

public class Mock {
	public void firstNPrimeNumber() {
		int primeCount=0;
		for(int i=20;i<=200;i++) {
			int count=0;  
			
			for(int j=2 ;j<i; j++) {
				
				if(i%j==0) {
					count++;
				}
				
			}
			if(count==0) {
				System.out.println(i); 
				
				if(count==0) {
					primeCount++;
				}
				if(primeCount>20) {
					break;
				}
			}
			
		}	
		
	}
	
	
	public void multiWithoutMultiplication() {
		
		int a =20;
		int b=10;
		int c =0;
		
		for(int i =1;i<=a;i++) {
			c= c+b;                  
		}
		System.out.println(c);
		
	}
	
	public static void main(String[] args) {
		
		Mock obj =new Mock();
		obj.firstNPrimeNumber();
	}
}
