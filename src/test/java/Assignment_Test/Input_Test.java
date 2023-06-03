package Assignment_Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Assignment_Pages.DragandDrop_Page;
import Assignment_Pages.Input_Page;
import Assignment_general.BaseTest;
import Assignment_general.Data_retrival;

public class Input_Test extends BaseTest
{
	@Test
    public void input_test() throws InterruptedException
    {
		//input
		Input_Page ip=new Input_Page(driver);
		ip.selectinput();
		  String s2=Data_retrival.getdata(Filepath, "Sheet1", 23, 5);
		String text=Data_retrival.getdata(Filepath, "Sheet1", 23, 1);
		ip.verifttext_title(s2, text);
		ip.Entertext();
		driver.navigate().back();
		
//	        
//	        //dynamically loading page
//	        driver.findElement(By.xpath("//a[text()=\"Dynamic Loading\"]")).click();
//	        
//	        List<WebElement> eles = driver.findElements(By.xpath("//a[contains(text(),\"Example\")]"));
//	        
//	        int count = eles.size();
//	        
//	        for (int i = 0; i <=count; i++) 
//	        {
//				eles.get(i).click();
//				driver.findElement(By.xpath("//button[text()=\"Start\"]")).click();
//				String atxt = driver.findElement(By.xpath("//div[@id=\"finish\"]")).getText();
//				System.out.println(atxt);
//				//String Etxt="Hello World!";
//				//Assert.assertEquals(atxt, Etxt);
//				
//			}
//	        

    }
  

}
