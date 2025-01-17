package advance;

import java.util.Scanner;

public class NumberToWord {
	
	
	
		
		String [] once= {"zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen"
						,"Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"	};
		
		String [] tens= {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
	
		public String numToWord(int n) {
			if(n<20) {
				return once[n];
			}
			if(n<100) {
				return tens[n/10]+((n%10!=0)? " ":"")+once[n%10];
			}
			if(n<1000) {
				return once[n/100]+" Hundred"+((n%100!=0)?" ":"")+numToWord(n%100);
			}
			if(n<10000) {
				return once[n/1000]+" Thousand"+((n%1000!=0)?" ":"")+numToWord(n%1000);
			}
			if(n<100000) {
				return once[n/10000]+" Lakh"+((n%10000!=0)?" ":"")+numToWord(n%10000);
			}
			
			return " ";
			
		}
	
	
	
	
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the number to convert");
	int n=sc.nextInt();
	sc.close();
	
	NumberToWord obj =new NumberToWord();
	String result=obj.numToWord(n);
	System.out.println(result);
	
}
}
