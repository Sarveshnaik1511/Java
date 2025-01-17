package errors_Exception;

public class ExceptionHandling {
	static void exception () {
		try {
		System.out.println(20/0);
		}
		catch(Exception e){
			System.out.println("sarvesh");
		}
	}
	
	public void exception1() {
		try {
			String s= null;
			System.out.println(s.length());
			
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("s is null");
		}
		finally {
			System.out.println("hey i am finaly, Hope you all are fine");
		}
	}
	public static void main(String[] args) {
	//	ExceptionHandling.exception();
		ExceptionHandling obj =new ExceptionHandling();
		obj.exception1();
	}

}
