package Assignment_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Assignment_general.BasePage;
import Assignment_general.generalUtils;

public class File_UploadPage extends BasePage
{
	generalUtils gu=new generalUtils();
	
   @FindBy (xpath="//a[text()='File Upload']")
    private WebElement UploadOpt;
   
   @FindBy (xpath="//input[@type=\"file\"][1]")
   private WebElement choose;
   
   @FindBy (xpath="//input[@value='Upload']")
   private WebElement uploadbtn;
   
   @FindBy (xpath="//h3[text()='File Uploaded!']")
   private WebElement Utext;
      
   public File_UploadPage(WebDriver driver)
   {
	   super(driver);
	   PageFactory.initElements(driver,this);
}

public void selectfileupload()
   {
	   super.verifyelement(UploadOpt);
	   UploadOpt.click();
   }
   public void selectfile(String etitle)
   {
	   super.verifytitle(etitle);
	   super.verifyelement(choose);
	   
	   String file= uploadfile;
         choose.sendKeys(file);
   }
   public void clickupload()
   {
	   super.verifyelement(uploadbtn);
	   uploadbtn.click();
   }
   public void verifyupload()
   {
	   super.verifyelement(Utext);
	   gu.validationResult(Utext);
	   
   }
   
	
}
