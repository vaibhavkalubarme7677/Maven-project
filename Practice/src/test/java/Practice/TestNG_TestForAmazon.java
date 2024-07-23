package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_TestForAmazon {

    WebDriver driver;
	String Main="https://www.amazon.com/";
	@BeforeClass 
	void GetSite() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}
	
	@Test
	void Product1() throws InterruptedException
	{   
		
		driver.findElement(By.xpath("//span[@class='a-truncate-cut'][normalize-space()='Smartphones']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Google Pixel 8 - Unlocked Android Smartphone with Advanced Pixel Camera, 24-Hour Battery, and Powerful Security - Obsidian - 128 GB']")).click();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
	}
	
	@Test
	void Product2() throws InterruptedException
	{
		
		driver.navigate().to(Main);
		
		driver.findElement(By.xpath("//span[@class='a-truncate-cut'][normalize-space()='Smartphones']")).click();
		driver.findElement(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_3']//div[@class='a-section a-spacing-none puis-padding-right-small s-title-instructions-style']//span[1]")).click();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	    driver.findElement(By.xpath("//span[normalize-space()='Cart']")).click();
	    Thread.sleep(3000);
	}
	
	@AfterClass
	void throwback()
	    {
			driver.close();
		}
				
	}
	
	
	


