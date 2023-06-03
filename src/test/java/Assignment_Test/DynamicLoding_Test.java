package Assignment_Test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Assignment_Pages.Dynamicloading_Page;
import Assignment_general.BaseTest;
import Assignment_general.Data_retrival;

public class DynamicLoding_Test extends BaseTest 
{
	@Test
	public void dynamic() throws InterruptedException
	{
       Dynamicloading_Page dlp=new Dynamicloading_Page(driver);
       
       dlp.selectdynamic();
       
       Thread.sleep(1000);
       String s1=Data_retrival.getdata(Filepath, "Sheet1", 10, 2);
       dlp.option1(s1);
       
       dlp.option2(s1);
       
	}

}
