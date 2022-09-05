package Pages;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadExcel;

public class OrdersPage extends TestBase{

	//Object Repository
	@FindBy(xpath = "//span[text()='Orders']") private WebElement ordersLink;
	@FindBy(xpath = "//button[@class='button-blue']") private WebElement getStartedBtn;
	@FindBy(xpath = "(//input[@type='text'])[2]") private WebElement searchTextbox;
	@FindBy(xpath = "//button[text()='Create GTT ']") private WebElement createGTTBtn;
	@FindBy(xpath = "//input[@label='Trigger price']") private WebElement triggerPriceTextbox;
	@FindBy(xpath = "//input[@label='Qty.']") private WebElement qtyTextbox;
	@FindBy(xpath = "//input[@label='Price']") private WebElement priceTextbox;
	@FindBy(xpath = "//div[text()='Place']") private WebElement placeBtn;
	@FindBy(xpath = "//button[@class='button-outline cancel']") private WebElement cancelBtn;
	
	@FindBy(xpath = "//span[text()='GTT']") private WebElement gTTLink;
	
	public OrdersPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyOrdersLinkOperations() throws Exception
	{
		Thread.sleep(3000);
		ordersLink.click();
		
		Thread.sleep(2000);
		getStartedBtn.click();
		
		Thread.sleep(2000);
		searchTextbox.sendKeys(ReadExcel.readExcelFile(1, 0));
		
		Actions a = new Actions(driver);
		a.moveToElement(searchTextbox).build().perform();
		Thread.sleep(2000);
		a.sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(3000);
		createGTTBtn.click();
		
		Thread.sleep(2000);
		triggerPriceTextbox.sendKeys(ReadExcel.readExcelFile(1, 1));
		
		Thread.sleep(2000);
		qtyTextbox.sendKeys(ReadExcel.readExcelFile(1, 2));
		
		Thread.sleep(2000);
		priceTextbox.sendKeys(ReadExcel.readExcelFile(1, 3));
		
		Thread.sleep(5000);
		placeBtn.click();
		
//		Thread.sleep(3000);
//		cancelBtn.click();
		
		Thread.sleep(3000);
		gTTLink.click();
	}
	
	
	
}
