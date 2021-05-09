package TestNGParameters;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParametersDemo {
	
	@Test
	@Parameters({"MyName"})
	//public void test(@Optional String name) { //to make the parameter optional, that way in xml if parameter is not given it does not throw error but display as null
	public void test(@Optional("Tony") String name) { //To make parameter optional, if parameter not given in xml it take the optional value given here
		System.out.println("Name is: "+name);
	}

}
