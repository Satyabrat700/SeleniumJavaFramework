package Log4J;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4J {
	
	 static Logger loggger = LogManager.getLogger("log4J.class");

	public static void main(String[] args) {
		// 

		System.out.println("Hello World");
		
		loggger.info("Checking Info");
		loggger.error("Checking error");
		loggger.warn("Checking warn");
		loggger.fatal("Checking Info");	

	}

}
