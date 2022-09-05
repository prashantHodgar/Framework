package TestCases;


import org.testng.ITestResult;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.DashboardPage;
import Pages.LoginPage;
import Utility.TakeScreenshot;

public class DashboardPageTest extends TestBase {

	DashboardPage dash;
	LoginPage login;
	@BeforeMethod (groups = {"Smoke","Regression"})
	public void setup() throws Throwable
	{
		initialization();
		login = new LoginPage();
		dash = new DashboardPage();
		login.loginKiteApp();
	}
	
	@Test (groups = "Smoke")
	public void verifyNicknameTest() throws Throwable
	{
		String value = dash.verifyNickname();
		System.out.println(value);
	}
	
	@Test (groups = "Regression")
	public void verifyUserIdTest() throws Throwable
	{
		String value1 = dash.verifyUserId();
		System.out.println(value1);
	}
	
	@Test (groups = "Smoke")
	public void verifyCompleteNameTest() throws Throwable
	{
		String value2 = dash.verifyCompleteName();
		System.out.println(value2);
	}
	
	@Test (groups = "Smoke")
	public void verifyEmailIdTest() throws Throwable
	{
		String value3 = dash.verifyEmailId();
		System.out.println(value3);
	}
	
	@Test (groups = "Regression")
	public void verifyLogoutTest() throws Throwable
	{
		dash.verifyLogout();
	}
	
	@AfterMethod (groups = {"Smoke","Regression"})
	public void exit(ITestResult i) throws Exception
	{
		if(ITestResult.FAILURE == i.getStatus())
		{
			TakeScreenshot.captureScreenshotFailedTC(driver, i.getName());
		}
		driver.close();
	}
	
}
