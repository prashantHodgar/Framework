package TestCases;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {
	
	@Test
	public void openFB()
	{
//		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.close();
	}
	@Test
	public void openInsta()
	{
//		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.instagram.com");
		driver.close();
	}
	@Test
	public void openFlipkart()
	{
//		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com");
		driver.close();
	}
	@Test
	public void openAmazon()
	{
//		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.com");
		driver.close();
	}
	
	
}
