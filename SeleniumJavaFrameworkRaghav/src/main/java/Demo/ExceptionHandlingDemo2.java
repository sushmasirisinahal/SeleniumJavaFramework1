package Demo;

public class ExceptionHandlingDemo2 {

	public static void main(String[] args) {
		try {
			demo();
		} catch (Exception e) {
			e.printStackTrace();  //Option to try catch or throws keyword
		}
		
	}
		
		
	public static void demo() throws Exception {	
		System.out.println("Hello world..!");
		throw new ArithmeticException("not valid operation"); //example of throw
		//int i = 1/0;
		//System.out.println("Completed");
	}

	
}
