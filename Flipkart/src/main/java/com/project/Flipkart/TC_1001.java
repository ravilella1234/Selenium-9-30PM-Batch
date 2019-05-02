package com.project.Flipkart;

import com.relevantcodes.extentreports.LogStatus;

public class TC_1001 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		test=e.startTest("TC_1001");
		
		init();
		test.log(LogStatus.INFO, "Initiliazing data & OR.....");
		
		launch("chromebrowser");
		test.log(LogStatus.INFO, "Launched Browser :-" + p.getProperty("chromebrowser"));
		
		navigate("amazonurl");
		test.log(LogStatus.INFO, "Navigated to URl :- "+ p.getProperty("amazonurl"));
		
		
		//Title Verification
		if(!verifyTitle("amazontitle"))
			reportFailure("Titles are not Equal");
		else
			reportPass("Titles are equal...");
		
		
		//Text Verification
		if(!verifyText("customerlink_linktext","customerservicelink"))
			reportFailure("Text are not equal...");
		else
			reportPass("Text are equal....");
		
		
		e.endTest(test);
		e.flush();
		
	}
}
