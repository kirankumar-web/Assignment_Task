package Assignment_Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import Assignment_general.BasePage;

public class AddorRemove_Page extends BasePage
{
	@FindBy (xpath="//a[contains(text(),\"Add/Remove\")]")
	private WebElement SaddorRemove;
	
	@FindBy (xpath="//h3[text()='Add/Remove Elements']")
	private WebElement text;
	
	@FindBy (xpath="//button[text()='Add Element']")
	private WebElement AddEle;
	
	@FindBys({
	    @FindBy(xpath="//button[@class='added-manually']")
	})
	private List<WebElement> Dele;

	public AddorRemove_Page(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	public void selectAddorRemove()
	{
		super.verifyelement(SaddorRemove);
		SaddorRemove.click();
	}
	public void verifytextele(String etxt)
	{
		super.verifytext(text, etxt);
	}
	public void AddElements(int num,String title) throws InterruptedException 
	{
		super.verifytitle(title);
		super.addElements(AddEle, num);
		Thread.sleep(3000);
	    
	}

	public void deleteElement(int num) throws InterruptedException 
	{
        super.deleteElement(Dele, num);
		Thread.sleep(3000);

	}

	

}
