package Test22032024;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

	
	  private WebDriver driver;

	    @BeforeMethod
	    public void setUp() {
	        driver = new ChromeDriver();
	    }
        @Test
	    public void testLogin() {
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	        LoginPage loginPage = new LoginPage(driver);
	        loginPage.enterUsername("myUsername");
	        loginPage.enterPassword("myPassword");
	        loginPage.clickLoginButton();

	        // Add assertions to verify login success or failure
	    }
        @AfterMethod
	    public void tearDown() {
	        driver.quit();
	    }
}
	

