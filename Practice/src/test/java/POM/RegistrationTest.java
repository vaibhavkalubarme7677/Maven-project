package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		RegistractionPage  rp=new RegistractionPage(driver);
		rp.clickReg();
		rp.clickGender();
        rp.setFirstName();
        rp.setLastName();
		rp.setEmail("vaibhavkalubarme@gmail.com");
		
	}

}
