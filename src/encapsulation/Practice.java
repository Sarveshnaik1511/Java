package encapsulation;

public class Practice {
	
	
	private int a;
	private int b;
	private int result;

	public int getCalculation() {
		return result;
		
	} 
	
	public void setCalculation(int c, int d) {
		this.a = c;
		this.b= d;
		result =a+2*b;
		
	}
		
	
	
	public static void main(String[] args) {
		
		Practice obj =new Practice();
		obj.setCalculation(10,20);
		int result = obj.getCalculation();
		System.out.println(result);
		
	}
}
