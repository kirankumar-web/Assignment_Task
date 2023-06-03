package Assignment_Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Assignment_Pages.AB_Testcontrol_page;
import Assignment_Pages.AddorRemove_Page;
import Assignment_Pages.Broken_images_pages;
import Assignment_Pages.DragandDrop_Page;
import Assignment_Pages.DropDown_Page;
import Assignment_Pages.Dynamicloading_Page;
import Assignment_Pages.File_UploadPage;
import Assignment_Pages.Input_Page;
import Assignment_Pages.checkboxes_page;
import Assignment_general.BaseTest;
import Assignment_general.Data_retrival;

public class Assignment_MainTest extends Assignment_BeforeTests
{

	@Test(priority = 0)
	public void test() throws InterruptedException
	{
		String Etitle=Data_retrival.getdata(Filepath, "Sheet1", 4, 5);
		  
		  String Etxt=Data_retrival.getdata(Filepath, "Sheet1", 4, 1);

		  checkboxes_page cbp=new checkboxes_page(driver);
		  
		  cbp.selectcb();
		  
		  cbp.get(Etitle, Etxt);
		  cbp.cbs();
		  
	    driver.navigate().back();

	    DragandDrop_Page ddp=new DragandDrop_Page(driver);
		ddp.selectdrag_drop();
		String t1=Data_retrival.getdata(Filepath, "Sheet1", 6, 2);
		ddp.draganddrop(t1);
		String s1=Data_retrival.getdata(Filepath, "Sheet1", 6, 1);
		
		ddp.verifytext(s1);
		
		driver.navigate().back();
		
		
	}
	@AfterClass
	public void aftermethod() throws InterruptedException
	{
		Dynamicloading_Page dlp=new Dynamicloading_Page(driver);
	       
	       dlp.selectdynamic();
	       
	       String s1=Data_retrival.getdata(Filepath, "Sheet1", 10, 2);
	       dlp.option1(s1);
	       
	       dlp.option2(s1);
	       
		driver.navigate().back();
		
		driver.navigate().back();
		
        DropDown_Page ddp=new DropDown_Page(driver);
		
		ddp.Sdropdown();
		String txt=Data_retrival.getdata(Filepath, "Sheet1", 7, 1);
		String title=Data_retrival.getdata(Filepath, "Sheet1", 7, 5);

		ddp.verifytext(txt,title);
		String opt=Data_retrival.getdata(Filepath, "Sheet1", 7, 2);
		String etxt=Data_retrival.getdata(Filepath, "Sheet1", 7, 3);
		ddp.selectdropdownopt(opt,etxt);
		
		driver.navigate().back();

        File_UploadPage fup= new File_UploadPage(driver);
        
        fup.selectfileupload();
        String etitle = driver.getTitle();
        System.out.println(etitle);
        fup.selectfile(etitle);
        fup.clickupload();
        fup.verifyupload();
        
		driver.navigate().back();
		driver.navigate().back();


        Input_Page ip=new Input_Page(driver);
		ip.selectinput();
		  String s2=Data_retrival.getdata(Filepath, "Sheet1", 23, 5);
		String text=Data_retrival.getdata(Filepath, "Sheet1", 23, 1);
		ip.verifttext_title(s2, text);
		ip.Entertext();
		driver.navigate().back();
		
		AB_Testcontrol_page atp=new AB_Testcontrol_page(driver);
		atp.selectABtest();
		String b1=Data_retrival.getdata(Filepath, "Sheet1", 1, 5);
    	String etxt2 = Data_retrival.getdata(Filepath, "Sheet1", 1, 1);
    	//atp.verifyABtest(b1, etxt2);
    	
    	driver.navigate().back();
    	
	}
	

}
