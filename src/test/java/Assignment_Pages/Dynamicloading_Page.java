package Assignment_Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import Assignment_general.BasePage;

public class Dynamicloading_Page extends BasePage
{

	@FindBy (xpath="//a[text()=\"Dynamic Loading\"]")
	private WebElement Sdynamic;
	
	@FindBy (xpath="//a[contains(text(),'page that is')]")
	private WebElement opt1;
	
	@FindBy(xpath="//a[contains(text(),\"Example 2: Element\")]")
	private WebElement opt2;
	
	@FindBy (xpath="//button[text()=\"Start\"]")
	private WebElement btn;
	
	@FindBy (xpath="//h4[text()='Hello World!']")
	private WebElement txt;
	
//    
//    List<WebElement> eles = driver.findElements(By.xpath("//a[contains(text(),\"Example\")]"));
//    
//    int count = eles.size();
//    
//    for (int i = 0; i <=count; i++) 
//    {
//		eles.get(i).click();
//		driver.findElement(By.xpath("//button[text()=\"Start\"]")).click();
//		String atxt = driver.findElement(By.xpath("//div[@id=\"finish\"]")).getText();
//		System.out.println(atxt);
//		//String Etxt="Hello World!";
//		//Assert.assertEquals(atxt, Etxt);
//		
//	}
//    
	public Dynamicloading_Page(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);

	}
	public void selectdynamic()
	{
		Sdynamic.click();
	}
	
	public void option1(String etxt) throws InterruptedException
	{
		opt1.click();
		btn.click();
		Thread.sleep(9000);

		System.out.println(txt.getText());
		super.verifytext(txt, etxt);
		driver.navigate().back();
		
	}
	public void option2(String etxt) throws InterruptedException
	{
		opt2.click();
		btn.click();
		Thread.sleep(9000);
		super.verifytext(txt, etxt);
	}

}
