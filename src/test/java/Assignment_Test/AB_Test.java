package Assignment_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Assignment_Pages.AB_Testcontrol_page;
import Assignment_general.BaseTest;
import Assignment_general.Data_retrival;

public class AB_Test extends BaseTest
{ 
	@Test
	public void launch() throws InterruptedException
	{
		
		AB_Testcontrol_page atp=new AB_Testcontrol_page(driver);
		atp.selectABtest();
		String s1=Data_retrival.getdata(Filepath, "Sheet1", 1, 5);
    	String etxt = Data_retrival.getdata(Filepath, "Sheet1", 1, 1);
    	atp.verifyABtest(s1, etxt);
		 
	}

}
