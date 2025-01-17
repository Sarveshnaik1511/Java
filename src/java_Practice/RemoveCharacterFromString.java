package java_Practice;

public class RemoveCharacterFromString {

	public void RemoveComaFromString() {
		String s = "1,12120";

		char[] c = s.toCharArray();

		String wantedValue = "";
		for (int i = 0; i < c.length; i++) {
			if (c[i] == ',') {
				continue;
			}
			else {
				wantedValue = wantedValue + c[i];
			}
		}
		System.out.println(wantedValue);

	}
	
	
	public void RemoveComaFromStringWithotConverting() {
		
		String s = "1,25455";
		String rendom ="";
		
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==',') {
			continue;
		}
		else {
			rendom= rendom +s.charAt(i);
		}
	}
	System.out.println(rendom);
	}

	public static void main(String[] args) {
		RemoveCharacterFromString obj = new RemoveCharacterFromString();
		obj.RemoveComaFromStringWithotConverting();
	}
}
