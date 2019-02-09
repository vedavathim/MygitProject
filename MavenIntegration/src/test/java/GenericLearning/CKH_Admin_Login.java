package GenericLearning;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GenricMethods.LaunchingBrowsers;

public class CKH_Admin_Login {
	
		LaunchingBrowsers LB = new LaunchingBrowsers();
		
		@BeforeTest
		public void CKH_Admin_Login_BeforeMethod()
		{
			LB.LaunchChromeBrowser();
			
		}	
		
		@Test
		public void CKH_Admin_Login_Method()
		{
		LB.driver.get("https://demo.sigmainfo.in:5015/admin_login");
		
		}

		@AfterTest
		public void CKH_Admin_Login_AfterMethod()
		{
			System.out.println("Success CKH_Admin_Login script");
			LB.driver.close();
		}
		
	}
