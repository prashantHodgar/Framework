package TestCases;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Pages.OrdersPage;
import Utility.TakeScreenshot;

public class OrdersPageTest extends TestBase {

	LoginPage login;
	OrdersPage order;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		Thread.sleep(2000);
		login = new LoginPage();
		login.loginKiteApp();
	}
	
	@Test
	public void verifyOrdersLinkOperationsTest() throws Exception
	{
		order = new OrdersPage();
		Thread.sleep(2000);
		order.verifyOrdersLinkOperations();
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void exit(ITestResult i) throws Exception
	{
		if(ITestResult.FAILURE == i.getStatus())
		{
			TakeScreenshot.captureScreenshotFailedTC(driver, i.getName());
		}
		driver.close();
	}
}
