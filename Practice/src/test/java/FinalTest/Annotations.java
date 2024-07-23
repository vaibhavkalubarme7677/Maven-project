package FinalTest;
//4.what is testNG and it's features.. what are the different types of annotations with an examples(10marks)
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	void beforeSuite()
	{
		System.out.println("Before Suit");
	}
	@BeforeClass
	void beforeClass()
	{
		System.out.println("Before Class");
	}
	@BeforeTest
		void beforetest()
		{
			System.out.println("Before Test");
		}
	@BeforeMethod
	void beforemethod()
	{
		System.out.println("Before Method");
	}
	@Test
	void test()
	{
		System.out.println("Test");
	}
	@Test
	void test1()
	{
		System.out.println("Test 1");
	}
	
	@AfterMethod
	void aftermethod()
	{
		System.out.println("After Method");
	}
	@AfterTest
	void aftertest()
	{
		System.out.println("After Test");
	}
	@AfterClass
	void afterclass()
	{
		System.out.println("After Class");
	}	
	@AfterSuite
	void aftersuit()
	{
		System.out.println("After Suit");
	}
	
}
