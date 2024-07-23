package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistractionPage_Orange {

	
	WebDriver driver;
	
	By UserName= By.cssSelector("input[placeholder='Username']");
	By Password=By.cssSelector("input[placeholder='Password']");
	By Login = By.xpath("//button[normalize-space()='Login']");
   
    
	public RegistractionPage_Orange (WebDriver driver)
    {
   	 this.driver=driver;
    }
    public void setusername() throws InterruptedException
    {
  	  driver.findElement(UserName).sendKeys("Admin");
  	  Thread.sleep(2000);
    }
    public void setpassword() throws InterruptedException
    {
    	
  	  driver.findElement(Password).sendKeys("admin123");
  	  Thread.sleep(2000);
    }
    
    public void Login() throws InterruptedException
    {
    	
  	  driver.findElement(Login).click();
  	  Thread.sleep(2000);
    }
}
