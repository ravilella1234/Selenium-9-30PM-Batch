package com.browsers;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseTest 
{
	public static WebDriver driver;
	public static Properties p;
	public static FileInputStream fis;
	
	public static void init() throws Exception
	{
		p=new Properties();
		fis=new FileInputStream(System.getProperty("user.dir")+"//data.properties");
		p.load(fis);
	}
	
	public static void launch(String browserKey)
	{
		if(p.getProperty(browserKey).equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
			driver=new ChromeDriver();
		}else if(p.getProperty(browserKey).equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
			driver=new FirefoxDriver();
		}else if(p.getProperty(browserKey).equals("ie")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//drivers//IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}else if(p.getProperty(browserKey).equals("edge")) {
			System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"//drivers//MicrosoftWebDriver.exe" );
			driver=new EdgeDriver();
		}
		
	}
	
	public static void navigate(String urlKey) 
	{
		driver.get(p.getProperty(urlKey));
	}

}
