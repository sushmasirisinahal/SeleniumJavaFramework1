import org.testng.annotations.Test;

public class TestNGDependancyDemo {
	
	
	//@Test(dependsOnMethods = {"test2","test3"}) //scenario3
	//@Test(dependsOnMethods = {"test2"}, priority=1)  //Scenario 2 even if priority is set to 1, due to dependancy test is executed 1st
	//@Test(dependsOnGroups = {"sanity1"}) //Scenario 4, test assigned to groups and give dependsOnGroups here
	@Test(dependsOnGroups = {"sanity.*"}) //Scenario 5, test assigned to groups and give dependsOnGroups here with regular expression
	public void test1() {
		System.out.println("I am inside Test 1");
	
	}
	
	//@Test(priority=1) //Scenaio 1
	//@Test(priority=2) //Scenario 2
	//@Test(groups= {"sanity1"}) //Scenario 4, test assigned to groups
	@Test(groups= {"sanity2"}) //Scenario 5, test assigned to groups
	public void test2() {
		System.out.println("I am inside Test 2");
	
	}
	
	@Test(groups= {"sanity1"}) //Scenario 5, test assigned to groups
	public void test3() {
		System.out.println("I am inside Test 3");
	
	}
	
}
