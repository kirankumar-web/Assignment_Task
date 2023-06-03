package Assignment_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Assignment_general.BasePage;
import Assignment_general.generalUtils;

public class DropDown_Page extends BasePage
{
	generalUtils gu=new generalUtils();
	@FindBy (xpath="//a[text()=\"Dropdown\"]")
	private WebElement Sdd;
	
	@FindBy (xpath="//h3[text()='Dropdown List']")
	private WebElement text;
	
	@FindBy (xpath="//select[@id=\"dropdown\"]")
	private WebElement sclass;

	
	public DropDown_Page(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void Sdropdown()
	{
		Sdd.click();
	}
	
	public void verifytext(String Etxt, String etitle)
	{
		super.verifyelement(text);
		super.verifytitle(etitle);
		super.verifytext(text, Etxt);
	}
	
	public void selectdropdownopt(String opt,String txt )
	{
		gu.selectDDAction(sclass, opt, txt);
	}
	
	 //Dropdown
//	driver.findElement(By.xpath("//a[text()=\"Dropdown\"]")).click();
//	
//	WebElement ele = driver.findElement(By.xpath("//select[@id=\"dropdown\"]"));
//	
//	Select sel=new Select(ele);
//	
//	//sel.selectByVisibleText("Option 1");
//	sel.selectByVisibleText("Option 2");
//	
//	String txt = sel.getFirstSelectedOption().getText();
//	
//	String etxt="Option 2";
//	Assert.assertEquals(txt, etxt);
//	
//    //System.out.println(sel.getAllSelectedOptions().get(1).getText());
//				
//    Thread.sleep(2000);
//    
//    driver.navigate().back();
}
