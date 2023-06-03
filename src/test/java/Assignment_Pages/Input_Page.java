package Assignment_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Assignment_general.BasePage;

public class Input_Page extends BasePage
{
	@FindBy (xpath="//a[text()=\"Inputs\"]")
	private WebElement InputOpt;
	
	@FindBy (xpath="//h3[text()='Inputs']")
    private WebElement Vtext;
	
	@FindBy (xpath="//input[@type=\"number\"]")
	private WebElement Etext;

	public Input_Page(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void selectinput()
	{
		InputOpt.click();
	}
	
	public void verifttext_title(String etitle, String etext)
	{
		super.verifyelement(Vtext);
		super.verifytitle(etitle);
		super.verifytext(Vtext, etext);
		Vtext.getText();
	}
   
	public void Entertext() {
		super.verifyelement(Etext);
		Etext.sendKeys("256");
	}
		
	
}
