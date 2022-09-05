package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class DashboardPage extends TestBase {

	@FindBy(xpath = "//span[@class='nickname']") private WebElement nicknameLabel;
	@FindBy(xpath = "//span[@class='user-id']") private WebElement userIdLabel;
	@FindBy(xpath = "//h4[@class='username']") private WebElement completeNameLabel;
	@FindBy(xpath = "//div[@class='email']") private WebElement emailIdLabel;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logoutLink;
	
	public DashboardPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyNickname() throws Throwable
	{
		Thread.sleep(2000);
		return nicknameLabel.getText();
	}
	
	public String verifyUserId() throws Throwable 
	{
		Thread.sleep(2000);
		return userIdLabel.getText();
	}
	
	public String verifyCompleteName() throws Throwable
	{
		Thread.sleep(2000);
		userIdLabel.click();
		Thread.sleep(2000);
		return completeNameLabel.getText();
	}
	
	public String verifyEmailId() throws Throwable
	{
		Thread.sleep(2000);
		userIdLabel.click();
		Thread.sleep(2000);
		return emailIdLabel.getText();
	}
	
	public void verifyLogout() throws Throwable
	{
		Thread.sleep(2000);
		userIdLabel.click();
		Thread.sleep(2000);
		logoutLink.click();
	}
}
