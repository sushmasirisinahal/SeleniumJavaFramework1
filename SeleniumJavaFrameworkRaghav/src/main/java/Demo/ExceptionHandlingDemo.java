package Demo;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		System.out.println("Hello world..!");
		try {
			int i = 1/0;
		}
		catch (ArithmeticException e) {
			System.out.println("Entered catch block");
			System.out.println("Message is:   "+e.getMessage());
			System.out.println("Cause is:   "+e.getCause());
			e.printStackTrace();
		}
		finally {
			System.out.println("Completed");
		}
		

	}

}
