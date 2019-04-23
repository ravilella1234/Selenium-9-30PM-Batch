package com.browsers;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.support.ui.Select;

public class BaseTest 
{
	public static WebDriver driver;
	public static Properties p;
	public static Properties or;
	public static FileInputStream fis;
	
	public static void init() throws Exception
	{
		p=new Properties();
		fis=new FileInputStream(System.getProperty("user.dir")+"//data.properties");
		p.load(fis);
		
		or=new Properties();
		fis=new FileInputStream(System.getProperty("user.dir")+"//OR.properties");
		or.load(fis);
		
	}
	
	public static void launch(String browserKey)
	{
		if(p.getProperty(browserKey).equals("chrome")) {
			//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
			System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"//drivers//chromedriver.exe");
			driver=new ChromeDriver();
		}else if(p.getProperty(browserKey).equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
			driver=new FirefoxDriver();
		}else if(p.getProperty(browserKey).equals("ie")) {
			//System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//drivers//IEDriverServer.exe");
			System.setProperty(InternetExplorerDriverService.IE_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"//drivers//IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}else if(p.getProperty(browserKey).equals("edge")) {
			//System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"//drivers//MicrosoftWebDriver.exe" );
			System.setProperty(EdgeDriverService.EDGE_DRIVER_EXE_PROPERTY,System.getProperty("user.dir")+"//drivers//MicrosoftWebDriver.exe" );
			driver=new EdgeDriver();
			
			
		}
		
	}
	
	public static void navigate(String urlKey) 
	{
		driver.get(p.getProperty(urlKey));
		driver.manage().window().maximize();
		//driver.navigate().to(p.getProperty(urlKey));
	}
	
	
	public static void selectOption(String locatorKey, int item) 
	{
		WebElement loc = driver.findElement(By.id(or.getProperty(locatorKey)));
		Select s=new Select(loc);
		s.selectByIndex(item);	
	}
	
	
	public static void type(String locatorKey, String value) 
	{
		driver.findElement(By.name(or.getProperty(locatorKey))).sendKeys(value);
	}
	
	
	public static void click(String locatorKey) 
	{
		driver.findElement(By.xpath(or.getProperty(locatorKey))).click();
	}


}
