package Base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Utility.ReadExcel;
import Utility.ReadProperty;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	
	public void initialization() throws Exception
	{
		String browserValue = ReadProperty.readPropertyFile("browser");
		
		if(browserValue.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browserValue.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		//driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		//driver.get(readPropertyFile("url"));;
		driver.get(ReadExcel.readExcelFile(0, 0));
	}
	
	
}

//This is update for GITHUB code push
//This is update for GITHUB code pull
