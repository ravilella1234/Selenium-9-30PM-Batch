package com.browsers;

import org.apache.log4j.Logger;

public class TC_003 extends BaseTest
{
	private static final Logger log=Logger.getLogger(TC_003.class.getName());
	
	public static void main(String[] args) throws Exception 
	{
		init();
		log.info("Initialising data & or & log4j properties.....");
		
		launch("chromebrowser");
		log.info("Opened the browser :- " + p.getProperty("chromebrowser"));
		
		navigate("amazonurl");
		log.info("Navigate to url :- " + p.getProperty("amazonurl"));
		
		selectOption("amazonsearchdropbox_id",10);
		log.info("Selected the option 10 By using the locator :- " + or.getProperty("amazonsearchdropbox_id"));
			
		type("amazonsearchtextbox_name","harry Potter");
		log.info("Entered the text Harry Potter By using locator :- " + or.getProperty("amazonsearchtextbox_name"));
			
		click("amazonsearchbutton_xpath");
		log.info("Clicked on Amazon button By using locator :- " + or.getProperty("amazonsearchbutton_xpath"));
	}
}
