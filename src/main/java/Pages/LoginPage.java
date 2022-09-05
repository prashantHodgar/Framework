package Pages;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadExcel;
import Utility.ReadProperty;

public class LoginPage extends TestBase {
	//Object Repository
	@FindBy(xpath = "//input[@id='userid']") private WebElement userIdTextbox;
	@FindBy(xpath = "//input[@id='password']") private WebElement passwordTextbox;
	@FindBy(xpath = "//button[@class='button-orange wide']") private WebElement loginBtn;
	@FindBy(xpath = "//img[@alt='Kite']") private WebElement kiteLogo;
	@FindBy(xpath = "//img[@alt='Zerodha']") private WebElement zerodhaLogo;
	
	@FindBy(xpath = "//input[@id='pin']") private WebElement pinTextbox;
	@FindBy(xpath = "//button[@type='submit']") private WebElement continueBtn;
	
	
	public LoginPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginKiteApp() throws Exception
	{
//		userIdTextbox.sendKeys("GTE740");
//		passwordTextbox.sendKeys("prashant30");
//		loginBtn.click();
//		Thread.sleep(2000);
//		pinTextbox.sendKeys("301297");
//		continueBtn.click();
		
		userIdTextbox.sendKeys(ReadProperty.readPropertyFile("userId"));
		passwordTextbox.sendKeys(ReadProperty.readPropertyFile("password"));
		loginBtn.click();
		Thread.sleep(2000);
		pinTextbox.sendKeys(ReadProperty.readPropertyFile("pin"));
		continueBtn.click();
		
		Thread.sleep(1000);
		userIdTextbox.sendKeys(ReadExcel.readExcelFile(0, 1));
		passwordTextbox.sendKeys(ReadExcel.readExcelFile(0, 2));
		loginBtn.click();
		Thread.sleep(2000);
		pinTextbox.sendKeys(ReadExcel.readExcelFile(0, 3));
		continueBtn.click();
	}
	
	public String verifyTitle() 
	{
		return driver.getTitle();	//Title
	}
	
	public boolean verifyKiteLogo()
	{
		return kiteLogo.isDisplayed();
	}
	
	public boolean verifyZerodhaLogo()
	{
		return zerodhaLogo.isDisplayed();
	}
} 
