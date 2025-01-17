package advance;

public class ArmstrongNumber {
	
	
	
	// write a code to list armstrong numbers
	
	public void armstronglist() {
		
		int upto=10000;
	
		for(int i=1;i<=upto;i++) {
			
			int temp=i;
			int count=0;
			
			while(temp>0) {
				
				count=count+1;
				temp=temp/10;
			}
			
			int temp2=i;
			int arm=0;
			int rem;
			
			while(temp2>0) {
				
				int multi=1;
				 rem=temp2%10;
				for(int j=1;j<=count;j++) {
					multi=multi*rem;
				}
				arm=arm+multi;
				temp2=temp2/10;
				
			}
			if(arm==i) {
				System.out.println(i);
			}
			
		}
		
	}
	
	
	// code for Armstrong number only upto 3 digit
	
		public void armstrong() {

		int number=153;
		int temp=number;
		int remainder;
		int result=0; 
		
		
		
		while(number>0) {
			
			remainder =number%10;
			
			
			result=result+(remainder*remainder*remainder);
			number=number/10;
		}
		if(result==temp) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("non armstrong");
		}
		
	}

		
		
		// write a code to check given number is armstrong or not
		
		public void armstrongcheck() {
			
			int num=153;
			
			int temp=num;
			int count=0;
			
			while(temp>0) {
				count=count+1;
				temp=temp/10;
			}
			
			int temp2=num;
			int reminder;
			int arm=0;
			
			while(temp2>0) {
				reminder=temp2%10;
				int multi=1;
				
				for(int i=1;i<=count;i++) {
					multi=multi*reminder;
				}
				arm=arm+multi;
				
				
				temp2=temp2/10;
			}
			if(arm==num) {
				System.out.println("Armstromg");
			}
			else {
				System.out.println("not Armstrong");
			}
			
			
			
			
			
			
			
		}
		
		
		//practice armstrong number
		
		public void practiceArmNum() {
			int num=153;
			
			// count hum many digit are there
			
			int temp=num;
			int count = 0;
			while(temp>0) {
				count=count+1;
				temp=temp/10;
			}
			
			// seperate each digit and perform digit^count
			
			int temp2=num;
			int rem;
			int checkArm=0;
			
			while(temp2>0) {
			rem=temp2%10;
			int multi=1;
			for(int i=1;i<=count;i++) {
				multi =multi*rem;
			}
			checkArm=checkArm+multi;
			temp2=temp2/10;
			}
			if(checkArm==num) {
				System.out.println("Number is armstrong");
			}
			else {
				System.out.println("Number is not a armstrong number");
			}
			
		}
		
		// practice armstrong for list
		
		public void ArmstrongList() {
			int num= 10000;
			
			for(int i=1;i<=num;i++) {
				
				int temp=i;
				int count=0;
				
				while(temp>0) {
				count=count+1;	
				temp=temp/10;
				}
				
				int temp2=i;
				int rem;
				int arm=0;
				
				while(temp2>0) {
				int multi=1;
				rem = temp2%10;
				
				for(int j=1;j<=count;j++) {
					multi=multi*rem;
				}
				arm=arm+multi;
				temp2=temp2/10;
				}
				if(arm==i) {
					System.out.println(i+" ");
				}
				
			}
			
		}
	
	public static void main(String[] args) {
		ArmstrongNumber obj =new ArmstrongNumber();
		obj.ArmstrongList();
		}
}
