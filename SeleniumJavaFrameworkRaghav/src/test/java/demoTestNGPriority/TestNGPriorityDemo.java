package demoTestNGPriority;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {
	@Test(priority = 1)
	public void test1() {
		System.out.println("I am inside Test 1");
	}
	
	@Test(priority = 0)
	public void test2() {
		System.out.println("I am inside Test 2");
	}
	
	@Test(priority = 2)
	public void test3() {
		System.out.println("I am inside Test 3");
	}
	
	
}
