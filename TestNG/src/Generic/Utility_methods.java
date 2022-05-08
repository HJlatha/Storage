package Generic;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility_methods 
{
	public static WebDriver driver;
	public static Select selct_class(WebElement ele)
	{
		Select sel=new Select(ele);
		return sel;
	}
	public static Actions action_perform (WebDriver driver)
	{
		Actions act= new Actions( driver);
		return act;
	}
	public static Robot keyboard_functions () throws AWTException
	{
		Robot rbt= new Robot();
		return rbt;
	}
	public static JavascriptExecutor Javascriptexe (WebDriver driver)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		return jse;
	}
	
	public static String Title_Of_Page (WebDriver driver)
	{
		String title = driver.getTitle();
		return title;
	}
}

