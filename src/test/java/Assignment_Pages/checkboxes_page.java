package Assignment_Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Assignment_general.BasePage;

public class checkboxes_page extends BasePage
{
	@FindBy(xpath="//a[text()=\"Checkboxes\"]")
	 private WebElement Scb;
	
	@FindBy(xpath="//h3[text()='Checkboxes']")
	private WebElement txt;
		
	@FindBys({
		@FindBy (xpath="//input[@type='checkbox']")
	})
	private List<WebElement> eles;

	public checkboxes_page(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void selectcb()
	{
		Scb.click();
	}
	public void get(String Etxt, String etxt) throws InterruptedException
	{
       txt.getText();
       super.verifytitle(Etxt);
       super.verifyelement(txt);
       super.verifytext(txt, etxt);
       Thread.sleep(2000);
	}  
	public void cbs() throws InterruptedException
	{
		for (int i = 0; i < eles.size(); i++) {
			  eles.get(i).click();
		       Thread.sleep(2000);


     }


}
	
}
