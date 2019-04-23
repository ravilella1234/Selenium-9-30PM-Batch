package com.browsers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_002 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		launch("chromebrowser");
		
		navigate("amazonurl");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sony");

		Thread.sleep(3000);
		
		driver.findElement(By.name("field-keywords")).clear();
		
		Thread.sleep(3000);
		
		//driver.findElement(By.className("nav-input")).sendKeys("philips");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("philips");
		
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).clear();
		
		//driver.findElement(By.linkText("Customer Service")).click();
		
		driver.findElement(By.partialLinkText("Customer Ser")).click();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(int i=0;i<links.size();i++)
		{
			if(!links.get(i).getText().isEmpty())
			{
				System.out.println(links.get(i).getText());
			}
			
		}
		
		
		

		
	}

}
