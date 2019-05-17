package com.project.Flipkart;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_001 extends BaseTest
{
  
  
  @BeforeMethod(groups= {"regression"})
  @Parameters("browser")
  public void startUp(String btype) throws Exception 
  {
	  init();
	  launch(btype);
	  navigate("amazonurl");
  }
  
  
  @Test(groups= {"regression"})
  public void launch() 
  {
	  selectOption("amazonsearchdropbox_id",10);
	  type("amazonsearchtextbox_name","harry Potter");
	  click("amazonsearchbutton_xpath");
  }
  

  @AfterMethod(groups= {"regression"})
  public void endProcess() 
  {
	  browserClose();
  }


}
