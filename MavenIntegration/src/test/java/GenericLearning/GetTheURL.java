package GenericLearning;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GenricMethods.LaunchingBrowsers;

public class GetTheURL {
	
	LaunchingBrowsers LB = new LaunchingBrowsers();
	
	@BeforeTest
	public void GetTheURLBeforeMethod()
	{
		LB.LaunchChromeBrowser();
		
	}	
	
	@Test
	public void GetTheURLMethod()
	{
	LB.driver.get("https://www.toolsqa.com/automation-practice-form/");
	}

	@AfterTest
	public void GetTheURLAfterMethod()
	{
		System.out.println("Success");
		LB.driver.quit();
	}
	
}
