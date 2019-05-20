package com.project.Flipkart;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Dependency 
{
  @Test(priority=1)
  public void orange() 
  {
	  System.out.println("orange");
  }
  
  @Test(priority=2,dependsOnMethods= {"orange"})
  public void white() 
  {
	  System.out.println("white");
  }
  
  @Test(priority=3,dependsOnMethods= {"white"})
  public void blue() 
  {
	  System.out.println("blue");
	  Assert.fail();
  }
  
  @Test(priority=4,dependsOnMethods={"blue"})
  public void green() 
  {
	  System.out.println("green");
  }
}
