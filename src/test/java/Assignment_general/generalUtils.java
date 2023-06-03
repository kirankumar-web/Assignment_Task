package Assignment_general;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import Assignment_Pages.DragandDrop_Page;

public class generalUtils 
{

	public void verifybrokenimages(List<WebElement> imgElements)
    {
    	for (WebElement imgElement : imgElements)
    	{
            String imgSrc = imgElement.getAttribute("src");

            try {
                URL url = new URL(imgSrc);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.connect();

                int statusCode = connection.getResponseCode();
                if (statusCode != 200) {
                    System.out.println("Broken image detected: " + imgSrc);
                    Reporter.log("Broken image detected: " + imgSrc);
                }

                connection.disconnect();
            } 
            catch (Exception e)
            {
                System.out.println("Error occurred while checking image: " + imgSrc);
                e.printStackTrace();
            }
            
    	}     
    }
    
    public void validationResult(WebElement text)
    {
    	String atext = text.getText();
        String Etext = "File Uploaded!";
        
        Assert.assertEquals(atext,Etext);
    }
    

	public void Actionclass(WebDriver driver, WebElement src, WebElement dest) 
	{
       Actions actions = new Actions(driver);
		
        actions.dragAndDrop(src, dest).build().perform();
	}
	
	public void selectDDAction(WebElement ele, String option, String etxt)
	{
		Select sel=new Select(ele);
		
		//sel.selectByVisibleText("Option 1");
    	sel.selectByVisibleText(option);
		
		String txt = sel.getFirstSelectedOption().getText();
		
		//String etxt="Option 2";
    	Assert.assertEquals(txt, etxt);
		
	}
	
	
}
