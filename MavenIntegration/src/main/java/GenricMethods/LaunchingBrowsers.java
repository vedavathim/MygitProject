package GenricMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowsers {

	
	public WebDriver driver = null;
	
	public void LaunchChromeBrowser(){
		String chromeBrowserPath = "D:/Selenium_files/chromedriver.exe" ;
		System.setProperty("webdriver.chrome.driver", chromeBrowserPath);
		 driver = new ChromeDriver();
}
	
}
