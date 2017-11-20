package org.learning;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggerExample {
	
	public static Logger logger = Logger.getLogger(LoggerExample.class);

	public void testLoggerDebug() {
		logger.debug("Hello.. im in Debug method");
	}

	public void testLoggerInfo() {
		logger.info("Hello.. im in Info method");
	}

	public void testLoggerWarn() {
		logger.warn("Hello.. im in Warn method");
	}

	public void testLoggerError() {
		logger.error("Hello.. im in Error method");
	}

	public void testLoggerFatal() {
		logger.fatal("Hello.. im in Fatal method");
	}

	public static void main(String[] args) {
		PropertyConfigurator.configure("src/main/java/resource/log4j.properties");
		LoggerExample example = new LoggerExample();
		example.testLoggerDebug();
		example.testLoggerInfo();
		example.testLoggerWarn();
		example.testLoggerError();
		example.testLoggerFatal();
	}

}
