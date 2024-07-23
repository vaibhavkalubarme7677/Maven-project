package Practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*Attributes:
1.priority
2.dependsOnMethods
3.dependsOnGroups
4.@ignore
5.isEnabled=false
6.description
7.alwaysRun=true*/


public class Attributes {

	@BeforeMethod
	void BeforeMethod()
	{
		System.out.println("Before Method");
		}
	
//
	
	@Test (priority=1, dependsOnMethods= "Test2", description= "Before Method description",alwaysRun=true)
	void Test1()
	{
		System.out.println("Test");
	}
	
//
	@Test(priority=0, enabled= true)
	void Test2()
	{
		System.out.println("Test1");
	}
	
//	
	@AfterMethod
	void AfterMethod()
	{
		System.out.println("After Method");
	}
	
	
}

