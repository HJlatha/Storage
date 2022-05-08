package PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart  {

	//1. Declartion
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	private WebElement User;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement loginButton;
	
	//2. Intialization
	public Flipkart(WebDriver d) {
		PageFactory.initElements(d, this);
	}
	
	//3. Uitilatization
	public void Username(String name) {
		User.sendKeys(name);
	}
	
}
