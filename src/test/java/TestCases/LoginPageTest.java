package TestCases;

import org.testng.Assert;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.TestBase;
import Pages.LoginPage;
import Utility.ReadExcel;
import Utility.TakeScreenshot;

public class LoginPageTest extends TestBase {

	LoginPage login;
	
	@BeforeMethod (groups = "Smoke")
	public void setup() throws Exception
	{
		initialization();
		login = new LoginPage();
		
	}
	
	@Test (enabled = true, priority = 5)
	public void test1()
	{
		
	}
	
	@Test (enabled = true, priority = 4)
	public void verifyTitleTest() throws Exception
	{
		String actTitle = login.verifyTitle();
//		String expTitle = "Kite - Zerodha's fast and elegant flagship trading platform";
		String expTitle = ReadExcel.readExcelFile(2, 0);
//		System.out.println(actTitle);
//		Assert.assertEquals(actTitle, expTitle);
		SoftAssert s = new SoftAssert();
		s.assertEquals(actTitle, expTitle);
		System.out.println("This Test Case has been passed");
		s.assertAll();

	}
	
	@Test (priority = 3 /*invocationCount = 2*/)
	public void verifyKiteLogoTest()
	{
		boolean result = login.verifyKiteLogo();
//		System.out.println(result);
//		Assert.assertEquals(result, true);
		Assert.assertTrue(false);
		System.out.println("Result has been passed");
		
	}
	
	@Test /*(dependsOnMethods = "verifyKiteLogoTest", priority = 2)*/(groups = "Smoke")
	public void verifyZerodhaLogoTest()
	{
		boolean result1 = login.verifyZerodhaLogo();
//		System.out.println(result1);
		Assert.assertTrue(result1);
		System.out.println("Result1 has been passed");
	}
	
	@Test (/*enabled = false, priority = 1*/)
	public void loginKiteAppTest() throws Exception
	{
		login.loginKiteApp();
		Assert.assertTrue(false);
		System.out.println("Login successfully");
	}
	
	@AfterMethod (groups = "Smoke")
	public void exit(ITestResult i) throws Exception
	{
		if(ITestResult.FAILURE == i.getStatus())
		{
			TakeScreenshot.captureScreenshotFailedTC(driver, i.getName());
		}
		driver.close();
	}
	

}
