package Assignment_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Assignment_general.BasePage;
import Assignment_general.generalUtils;

public class DragandDrop_Page extends BasePage
{ 		

    generalUtils gu=new generalUtils();
	@FindBy (xpath="//a[text()=\"Drag and Drop\"]")
    private WebElement DDopt;
	
	@FindBy (xpath="//h3[text()='Drag and Drop']")
	private WebElement text;
	
	@FindBy (xpath="//div[@class=\"column\"][1]")
     private WebElement src;
	
	@FindBy(xpath="//div[@class=\"column\"][2]")
     private WebElement dest;
	
    @FindBy(xpath="//header[text()='A']")
	 private WebElement txt;

	public DragandDrop_Page(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	} 
	
	public void selectdrag_drop()
	{
		DDopt.click();
	}
	public void verifytext(String etxt)
	{
		super.verifyelement(text);
		super.verifytext(text, etxt);
		
	}
	public void draganddrop(String etxt)
	{
		gu.Actionclass(driver, src, dest);
        super.verifytext(txt, etxt);
		
	}
	
}
