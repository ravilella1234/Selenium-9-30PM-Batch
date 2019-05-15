package com.project.Flipkart;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_001 extends BaseTest
{
  
  
  @BeforeMethod
  public void startUp() throws Exception 
  {
	  init();
	  launch("chromebrowser");
	  navigate("amazonurl");
  }
  
  
  @Test
  public void launch() 
  {
	  selectOption("amazonsearchdropbox_id",10);
	  type("amazonsearchtextbox_name","harry Potter");
	  click("amazonsearchbutton_xpath");
  }
  

  @AfterMethod
  public void endProcess() 
  {
	  browserClose();
  }


}
