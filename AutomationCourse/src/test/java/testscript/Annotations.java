package testscript;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@Test(description ="Test Case1",priority = 2)//annotation used to identify it is a test case
	public void testCase()
	{
		System.out.println("Test Case");
	}
	@Test(description = "Test Case2",priority = 1)
	public void testCase2()
	{
		System.out.println("TestCase2");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
	}
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite");
	}
	

}
