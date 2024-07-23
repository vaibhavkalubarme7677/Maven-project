package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistractionTest_Orange {
	
	WebDriver driver;
	
	@BeforeClass 
	 public void Launch()
	{
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	  @AfterClass
		public void teardown()
		{
			driver.close();
		}

}
