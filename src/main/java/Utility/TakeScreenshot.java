package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot {
	
	public static void captureScreenshotFailedTC(WebDriver driver, String methodName) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Bhavesh\\eclipse-workspace\\Framework\\Screenshots\\"+ methodName + ".png");
		FileHandler.copy(source, dest);
		
	}
}
