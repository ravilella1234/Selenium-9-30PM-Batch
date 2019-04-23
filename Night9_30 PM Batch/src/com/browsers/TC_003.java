package com.browsers;

public class TC_003 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		launch("chromebrowser");
		
		navigate("amazonurl");
		
		selectOption("amazonsearchdropbox_id",10);
			
		type("amazonsearchtextbox_name","harry Potter");
			
		click("amazonsearchbutton_xpath");
	
	}
}
