package com.browsers;

import java.io.File;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager extends BaseTest
{
	public static ExtentReports extent;
	
	public static ExtentReports getInstance()
	{
		if(extent==null)
		{
			Date dt=new Date();
			String filePath=dt.toString().replace(":", "_").replace(" ", "_")+".html";
			extent=new ExtentReports(System.getProperty("user.dir")+"//HTMLReports//"+filePath);
			extent.loadConfig(new File(System.getProperty("user.dir")+"//extentreportconfig.xml"));
			extent.addSystemInfo("Selenium Language", "3.11.0").addSystemInfo("Environment", "Production");
		}
		return extent;	
	}

}
