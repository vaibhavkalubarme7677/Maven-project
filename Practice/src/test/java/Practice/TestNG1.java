package Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {

	
@BeforeSuite
void Beforesuite()
{
	System.out.println("Before Suite");
}

@BeforeClass
void BeforeClass()
{
	System.out.println("Before class");
	}

@BeforeTest
void BeforeTest()
{
	System.out.println("Before Test");
	}
@BeforeMethod
void BeforeMethod1()
{
	System.out.println("Before Method");
	}
void BeforeMethod2()
{
	System.out.println("Before Method");
	}

@Test 
void Test()
{
	System.out.println("Test");
}
@Test
void Test1()
{
	System.out.println("Test1");
}
@AfterMethod
void AfterMethod()
{
	System.out.println("After Method");
}
@AfterTest
void AfterTest()
{
	System.out.println("After Test");
}
@AfterClass
void AfterClass()
{
	System.out.println("After Class");
}
@AfterSuite
void AfterSuite()
{
	System.out.println("After Suite");
}
}


