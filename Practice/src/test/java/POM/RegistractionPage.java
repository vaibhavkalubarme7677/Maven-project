package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistractionPage {

	WebDriver driver;
	
	 By reglink= By.className("ico-register");
	 By gender=By.id("gender-male");
     By fname=By.name("FirstName");
     By Lname=By.name("LastName");
     By email=By.cssSelector("#Email");
     
     RegistractionPage (WebDriver driver)
     {
    	 this.driver=driver;
     }
     public void clickReg()
     {
   	  driver.findElement(reglink).click();
     }
     public void clickGender()
     {
   	  driver.findElement(gender).click();
     }
     public void setFirstName()
     {
   	  driver.findElement(fname).sendKeys("Vaibhav");
     }
     public void setLastName()
     {
   	  driver.findElement(Lname).sendKeys("Kalubarme");
     }
     public void setEmail(String eemail)
     {
   	  driver.findElement(email).sendKeys(eemail);
     }
}
	

