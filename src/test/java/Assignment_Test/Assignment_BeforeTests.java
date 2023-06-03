package Assignment_Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Assignment_Pages.AddorRemove_Page;
import Assignment_Pages.Broken_images_pages;
import Assignment_general.BaseTest;
import Assignment_general.Data_retrival;

public class Assignment_BeforeTests extends BaseTest
{
	@BeforeClass
	public void beforetest() throws InterruptedException
	{
    	
    	AddorRemove_Page arp=new AddorRemove_Page(driver);

		int n1=Data_retrival.getCellData(Filepath, "Sheet1", 2, 3);
		int n2=Data_retrival.getCellData(Filepath, "Sheet1", 2, 4);
		String a1=Data_retrival.getdata(Filepath, "Sheet1", 2, 5);
		String a2=Data_retrival.getdata(Filepath, "Sheet1", 2, 1);

		arp.selectAddorRemove();
		arp.verifytextele(a2);
		arp.AddElements(n1, a1);
		arp.deleteElement(n2);
		
    	driver.navigate().back();
        
    	Broken_images_pages bip=new Broken_images_pages(driver);
        
        bip.selectBrokenimage();
    	String etxt1= Data_retrival.getdata(Filepath, "Sheet1", 3, 1);
    	String etitle=Data_retrival.getdata(Filepath, "Sheet1", 3, 5);
  	    bip.verifytitle_text(etitle, etxt1);

        bip.selectbrokenimg();
        
    	driver.navigate().back();

        
	}
}
