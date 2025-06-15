package advance;

public class IntToString {
	

		public static void main(String[] args)
		{
			int a=54525;
			
			String a1=Integer.toString(a);
			if(a1.charAt(0)==a1.charAt(2)&&a1.charAt(2)==a1.charAt(4)) {
				System.out.println("correct");
			}
			else {
				System.out.println("incorrect");
			}
		
			// converted string to number form (double )
	String v="123546";
	double d=	Double.parseDouble(v);
	System.out.println(d+2);
	
	String v1="123546";
	int i= Integer.parseInt(v1);
	System.out.println(i);
	}

}
