package arrayPrograms;

public class DupicateElement {

	
	// program to print duplicate number in a given array
	public void duplicateNumbers() {
		int a[] = { 20, 55, 52, 55, 23, 20,55,55 };

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					
					a[i]=0;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			if(a[i]>0) {
			System.out.println(a[i]);
			}
		}

	}

	// Program to print dublicate worgs in string
	
	public void duplicateWord() {
		
		String s[]= {"sarvesh","naik","ulhas","naik","sarvesh","sarvesh"};
		
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i].equalsIgnoreCase(s[j]) ) {
					s[j]="";
					
				}
			}
		}
		for(int i=0;i<s.length;i++) {
			if(s[i].length()>0) {
				System.out.println(s[i]);
			}
		}
		
	}
	
	public static void main(String[] args) {
		DupicateElement obj =new DupicateElement();
		obj.duplicateNumbers();

	}

}
