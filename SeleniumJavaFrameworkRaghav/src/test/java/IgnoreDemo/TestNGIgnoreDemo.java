package IgnoreDemo;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


//@Ignore  //To ignore all the tests, at class level provide annotation at class level
public class TestNGIgnoreDemo {
	
	//@Ignore  //To ignore any test
	@Test
	public void test1() {
		System.out.println("I am inside Test 1");
	
	}
	
	@Test
	public void test2() {
		System.out.println("I am inside Test 2");
	
	}
	

}
