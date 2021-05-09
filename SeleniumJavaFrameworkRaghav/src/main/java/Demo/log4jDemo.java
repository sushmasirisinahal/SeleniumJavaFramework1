package Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4jDemo {
	private static Logger logger= LogManager.getLogger(log4jDemo.class.getName());
	public static void main(String[] args) {
		System.out.println("\n Hello World...! \n");
		
		logger.trace("This is trace message");
		logger.info("This is information message");
		logger.debug("Debug Message");
		logger.error("This is error message");
		logger.warn("This is warning message");
		logger.fatal("This is fatal message");
		
		System.out.println("\n Completed");
		
	}
 
}
