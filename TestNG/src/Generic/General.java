package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class General implements FrameCons{
	
	public WebDriver driver;
	
	@BeforeMethod
	public void OpenApp()
	{
		System.setProperty(Gecko,GeckoValue);
		driver= new FirefoxDriver();
		driver.get(URL);
	}
	
	@AfterMethod
	public void CloseApp(ITestResult result){
		//if(ITestResult.FAILURE= 
		driver.close();
	}

}
