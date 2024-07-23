package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Crossbroswer_LoginPage {

	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.manage().window().maximize();

		
	}
	@Test(dataProvider="Login")
	public void LoginBank(String user,String pswrd)
	{
		
		WebElement userid=driver.findElement(By.name("uid"));
		userid.clear();
		userid.sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(pswrd);
		driver.findElement(By.name("btnLogin")).click();
				
	}

	@DataProvider(name="Login")
	public String[][] getData()
	{
		String loginData[][]= {
				{"mngr478568","UpYsugY"},
				{"mngr","UpYsugY"},
				{"mngr478568","up"},
				{"mngr","up"}
		};
	return loginData;	
	}

	@AfterClass
	public void teardown()
	{
		driver.close();
	}
}
	
	

