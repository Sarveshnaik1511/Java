package returnType;

public class Prime {
	
	
	public int CheckPrime() {
		
		int number=4;
		int store=0;
		for(int i=2;i<=number;i++) {
			int count=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==0) {
				store=number;
			}
			else {
				System.out.println("not a prime");
			}
		}
		return store;
	}
	public static void main(String[] args) {
		Prime obj =new Prime();
		int value=obj.CheckPrime();
		System.out.println(value);
	}

}
