package returnType;

public class ReturnInt {

	public int calcu()
	{
		int a=20;
		int b=22;
		return a+b;
	}
	
	public static void main(String[] args) {
		ReturnInt obj =new ReturnInt();
		int result= obj.calcu();
		System.out.println(result);
	}
}
