package Assignment_Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Assignment_general.BasePage;
import Assignment_general.generalUtils;

public class Broken_images_pages extends BasePage
{
	   @FindBy (xpath="//a[text()=\"Broken Images\"]")
	   private WebElement brokenimg;
	   
	   @FindBy (xpath="//h3[text()='Broken Images']")
	   private WebElement txt;

	   @FindBy(tagName = "img")
	    private List<WebElement> imgElements;
	   
	   public Broken_images_pages(WebDriver driver)
	   {
		   super(driver);
		   PageFactory.initElements(driver,this);
	}

	public void selectBrokenimage()
	   {
		  brokenimg.click();
		
	   }
	public void verifytitle_text(String etitle, String etxt)
	{
		super.verifytitle(etitle);
		super.verifytext(txt, etxt);
	}
	public void selectbrokenimg()
	{
		generalUtils gu=new generalUtils();
		gu.verifybrokenimages(imgElements);
		
	}
	
}
