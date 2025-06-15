package returnType;

public class ReturnString {
	
	// print string

	public String RetString(String s) {
		
		String saveString ="";
		
		for(int i=0;i<s.length();i++) {
			saveString= saveString+ s.charAt(i);
		}
		
		return saveString;
	}
	
	//Reverse String
	
	public String RevString(String s) {
			String save="";
		for(int i=s.length()-1;i>=0;i--) {
			save= save+s.charAt(i);
		}
		return save;
		
	}
	
	// reverse without changing word position
	
	public String RevWOChagingWordPos(String s) {
		
		String arrayOfS[]=s.split(" ");
		
		String store="";
		for(int i=0;i<arrayOfS.length;i++) {
			String newly =arrayOfS[i];
			for(int j=newly.length()-1;j>=0;j--) {
				store= store+newly.charAt(j);
			}
			if(i<arrayOfS.length-1) {
				store=store+" ";
			}
		}
		return store;
	}
	
	
	
	
	public static void main(String[] args) {
		ReturnString obj=new ReturnString();
//		
//		String saved= obj.RetString("Sarvesh Naik");
//		System.out.println(saved);
//		
//		String saved2 =obj.RevString("SArvesh Naik");
//		System.out.println(saved2);
//		System.out.println(saved +" "+ saved2);
//		
		String saved3=obj.RevWOChagingWordPos("Sarvesh Naik");
		System.out.println(saved3);
		
	}
	
}
