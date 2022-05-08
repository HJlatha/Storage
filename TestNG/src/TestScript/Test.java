package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import Generic.ExcHybrid;
import Generic.General;
import PomScript.Flipkart;

public class Test extends General
{
	@org.testng.annotations.Test
	public void test() throws EncryptedDocumentException, IOException 
	{
		Flipkart Flipk= new Flipkart(driver);
		String name= ExcHybrid.getdata("Sheet1", 0, 0);	
	}
	
}
