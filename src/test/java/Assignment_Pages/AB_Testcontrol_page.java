package Assignment_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Assignment_general.BasePage;

public class AB_Testcontrol_page extends BasePage
{
	@FindBy (xpath="//a[text()='A/B Testing']")
	private WebElement ele;
	
    @FindBy (xpath="//h3[text()='A/B Test Control']")
    private WebElement Vtext;
    
    public AB_Testcontrol_page(WebDriver driver)
    {
        super(driver);
    	PageFactory.initElements(driver, this);
    }
    
    public void selectABtest()
    {
    	ele.click();
    }

    public void verifyABtest(String title,String text) throws InterruptedException
    {
    	super.verifytitle(title);
    	Thread.sleep(1000);
    	super.verifyelement(Vtext);
    	Thread.sleep(1000);
    	super.verifytext(Vtext, text);
    	
    	
    }
   
	
}
