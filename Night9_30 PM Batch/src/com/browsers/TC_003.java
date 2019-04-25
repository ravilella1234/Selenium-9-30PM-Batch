package com.browsers;

import org.apache.log4j.Logger;

import com.relevantcodes.extentreports.LogStatus;

public class TC_003 extends BaseTest
{
	private static final Logger log=Logger.getLogger(TC_003.class.getName());
	
	public static void main(String[] args) throws Exception 
	{
		
		test=e.startTest("TC_003");
		
		init();
		log.info("Initialising data & or & log4j properties.....");
		test.log(LogStatus.INFO, "Initialising data & or & log4j properties.....");
		
		launch("chromebrowser");
		log.info("Opened the browser :- " + p.getProperty("chromebrowser"));
		test.log(LogStatus.INFO, "Opened the browser :- " + p.getProperty("chromebrowser"));
		
		navigate("amazonurl");
		log.info("Navigate to url :- " + p.getProperty("amazonurl"));
		test.log(LogStatus.INFO, "Navigate to url :- " + p.getProperty("amazonurl"));
		
		selectOption("amazonsearchdropbox_id",10);
		log.info("Selected the option 10 By using the locator :- " + or.getProperty("amazonsearchdropbox_id"));
		test.log(LogStatus.INFO, "Selected the option 10 By using the locator :- " + or.getProperty("amazonsearchdropbox_id"));	
		
		type("amazonsearchtextbox_name","harry Potter");
		log.info("Entered the text Harry Potter By using locator :- " + or.getProperty("amazonsearchtextbox_name"));
		test.log(LogStatus.INFO, "Entered the text Harry Potter By using locator :- " + or.getProperty("amazonsearchtextbox_name"));	
		
		click("amazonsearchbutton_xpath");
		log.info("Clicked on Amazon button By using locator :- " + or.getProperty("amazonsearchbutton_xpath"));
		test.log(LogStatus.INFO, "Clicked on Amazon button By using locator :- " + or.getProperty("amazonsearchbutton_xpath"));
		
		e.endTest(test);
		e.flush();
	}
}
