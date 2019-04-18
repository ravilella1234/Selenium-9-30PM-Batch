package com.browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Drivers\\chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.get("https://www.amazon.in");
		
		//webdriver.gecko.driver
		//webdriver.ie.driver
		//webdriver.edge.driver

	}

}
