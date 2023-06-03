package Assignment_general;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.collections.Lists;

import Assignment_general.Autoconstants.autoconstants;

public class BasePage implements autoconstants{

	public WebDriver driver;
	   public BasePage(WebDriver driver) 
	   {
		   this.driver=driver;
	   }
	   public void verifytitle(String etitle)
	   {
		   WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		   try
		   {
			   wait.until(ExpectedConditions.titleIs(etitle));
			   Reporter.log("title is matching:",true);
		   }
		   catch (Exception e) 
		   {
			   Reporter.log("title is not matching:expected title is"+etitle,true);
			   Reporter.log("actualtitle is :"+driver.getTitle(),true);
			   Assert.fail();
		   }
	   }
	   public void verifyelement(WebElement ele)
	   {
		   //WebDriverWait wait=new WebDriverWait(driver, 10);
		   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		   try
		   {
			   wait.until(ExpectedConditions.visibilityOf(ele));
			   Reporter.log("element  is present:",true);
		   }
		   catch (Exception e) 
		   {
			   Reporter.log("element is not present",true);
			   Assert.fail();
		   }
	    }
	   public void verifytext(WebElement ele,String etxt)
	   {
		   String atxt=ele.getText();
	    	Assert.assertEquals(atxt, etxt);
	   }
	   
	   public void addElements(WebElement ele, int n)
	    {
		    for (int i = 0; i < n; i++) {
		        ele.click();
		    }
	    }
	   public void deleteElement(List<WebElement> eles, int n) 
		{

		    int count = eles.size();
		    for (int i = 0; i < count-2; i++) {
		        eles.get(i).click();
		    }
		}
	   
	  
}