package FinalTest;
//6.what are the different types of elements and how we can find with different types of locators.(10marks)
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("Wesite Link");
		driver.manage().window().maximize();
		
		//Classname
		driver.findElement(By.className("information"));
		//CssSelector
		driver.findElement(By.cssSelector("#fname"));
		//ByID
		driver.findElement(By.id("lname"));
		//ByName
		driver.findElement(By.name("testforproject"));
		//By link text
		driver.findElement(By.linkText("Test for Project"));
		//Partial Link
		driver.findElement(By.partialLinkText("Developtrees Officail Page"));
		//Xpath
		driver.findElement(By.xpath("//input[@value='f']"));
		//Tag Name
		driver.findElement(By.tagName("a"));
		
	}

}
