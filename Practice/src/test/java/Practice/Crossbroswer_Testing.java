package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbroswer_Testing {

	WebDriver driver;
	
	@Parameters("browser")
	@Test
	void launchingWebsite(String browser) {
	if(browser.equalsIgnoreCase("chrome")) {
		
		driver=new ChromeDriver();
		
	}
	else if(browser.equalsIgnoreCase("Edge")) {
		
		driver=new EdgeDriver();
	}
	driver.get("https://www.google.com/");
}
}
