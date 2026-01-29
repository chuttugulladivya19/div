package logdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jdemo {

	    private static final Logger logger = LogManager.getLogger(Log4jdemo.class);

	    public static void main(String[] args) {
	    	System.out.println("completed");
	        logger.info("this is information message");
	        logger.debug("this is debug message");
	        logger.debug("debug mode");
	        System.out.println("hello world");
	    }
	}
	



