package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG2 {

	WebDriver driver;
	
	@BeforeClass 
	void GetSite()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	void VerifyTitle()
	{
		String Actual = driver.getTitle();
		String Expect = "Amazon.com. Spend less. Smile more.";
		Assert.assertEquals(Actual, Expect);
		
	}
	@AfterClass
	void throwback()
	    {
			driver.close();
		}
				
	}
	
	
	

