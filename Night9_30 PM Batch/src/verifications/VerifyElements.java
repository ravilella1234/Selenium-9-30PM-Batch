package verifications;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import com.browsers.BaseTest;

public class VerifyElements extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		launch("chromebrowser");
		
		navigate("amazonurl");
		
		
		/*WebElement loc = driver.findElement(By.id("twotabsearchtextbox"));
		
		loc.sendKeys("philips");
		
		String value = loc.getAttribute("value");
		
		System.out.println("Text is :" + value);*/
		
		
		
		/*//String actualLink = driver.findElement(By.linkText("Customer Service")).getText();
		String actualLink = driver.findElement(By.linkText("Customer Service")).getAttribute("innerHTML");
		String expectedLink="Customer Service";
		
		System.out.println("Acutal Link : " + actualLink);
		System.out.println("Expected Link : " + expectedLink);
		
		//if(actualLink.equals(expectedLink))
		//if(actualLink.equalsIgnoreCase(expectedLink))
		//if(actualLink.contains(expectedLink))
		if(actualLink.contentEquals(expectedLink))
		{
			System.out.println("actual & expected links are equal....");
		}
		else
		{
			System.out.println("actual & expected links are not equal....");
		}*/
		
		
		String actualLink = driver.findElement(By.linkText("Customer Service")).getAttribute("innerHTML");
		String expectedLink="Customer service";
		
		System.out.println("Acutal Link : " + actualLink);
		System.out.println("Expected Link : " + expectedLink);
		
		
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualLink, expectedLink);
		
		
		//Assert.assertEquals(actualLink, expectedLink);
		
		
		s.assertTrue(actualLink.equals(expectedLink), "Both Links are not equal..");
		
		s.assertTrue(false, "fail1");
		
		s.assertTrue(true, "faile2");
		
		s.assertTrue(false, "fail3");
		
		driver.findElement(By.linkText("Customer Service")).click();
		
		System.out.println("bye...");
		
		s.assertAll();

	}

}
