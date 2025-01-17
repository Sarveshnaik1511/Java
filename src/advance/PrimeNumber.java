package advance;

public class PrimeNumber {
	
	// to check given number is prime or not
	
	public void Prime() {
		
		int num=2;
		int count=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				count++;
			}
		}
				if(count==0) {
					System.out.println("number is prime");
				}
				else {
				System.out.println("number is not prime");
			}
		}
	
	// list of prime numbers
	
	public void prime_list() {
		
		for(int i=2;i<=100;i++) {
			
			int count=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count++;
				}
				
			}
			if(count==0) {
				System.out.print(i+" ");
			}
			
		}
			  
			
		}
		
	
	//print even and prime number one by one
	
	public void printEvenAndPrimeNumbers() {
		for(int i=2;i<=100;i++) {
			int count=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count++;
				}
				
				
			}
			if(i%2==0) {
				System.out.print(i+" ");
			}
			
			if(count==0) {
				System.out.println(i);
			}
		}
		
	}
	
	public static void main(String[] args) {
		PrimeNumber obj = new PrimeNumber();
		
		obj.printEvenAndPrimeNumbers();
	}
		
}
	

	

