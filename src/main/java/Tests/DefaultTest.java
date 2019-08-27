package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public abstract class DefaultTest {
 
	public WebDriver driver;
	String driverPath = "C:\\selenium_web_driver\\geckodriver.exe";
	String url = "http://demo.testarena.pl/zaloguj";
	
	@BeforeTest()
	public void beforeTest()
	{
		driver = new ChromeDriver();
		System.getProperty("webdriver.chrome.driver", driverPath);
		driver.get(url);
		
	}
	
	@AfterTest
	public void AfterTest()
	{
		driver.quit();
	}
}
