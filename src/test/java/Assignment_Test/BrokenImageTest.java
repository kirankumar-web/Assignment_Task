package Assignment_Test;

import org.testng.annotations.Test;

import Assignment_Pages.Broken_images_pages;
import Assignment_general.BaseTest;
import Assignment_general.Data_retrival;

public class BrokenImageTest extends BaseTest
{
	@Test
    public void broken()
    {
  		 		 
      Broken_images_pages bip=new Broken_images_pages(driver);
      
      bip.selectBrokenimage();
  	String etxt= Data_retrival.getdata(Filepath, "Sheet1", 3, 1);
  	String etitle=Data_retrival.getdata(Filepath, "Sheet1", 3, 5);
	bip.verifytitle_text(etitle, etxt);

      bip.selectbrokenimg();

        
    }
}
