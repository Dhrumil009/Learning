package org.learning.log4j;

import org.apache.log4j.Logger;

import Demo.Box2d;


public class App 
{
	final static Logger logger = Logger.getLogger(App.class);

	public static void main(String[] args) {
//		PropertyConfigurator.configure("src/main/java/resource/log4j.properties");
//		App obj = new App();
//		obj.runMe("Dhrumil Munshi");
//		Box2d d2=new Box2d(10);
//		d2.show();

	}

	private void runMe(String parameter){

		if(logger.isDebugEnabled()){
			logger.debug("This is debug : " + parameter);
		}

		if(logger.isInfoEnabled()){
			logger.info("This is info : " + parameter);
		}

		logger.warn("This is warn : " + parameter);
		logger.error("This is error : " + parameter);
		logger.fatal("This is fatal : " + parameter);

	}

}
