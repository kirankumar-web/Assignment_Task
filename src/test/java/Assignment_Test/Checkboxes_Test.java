package Assignment_Test;

import org.testng.annotations.Test;

import Assignment_Pages.checkboxes_page;
import Assignment_general.BaseTest;
import Assignment_general.Data_retrival;

public class Checkboxes_Test extends BaseTest
{
  @Test
  public void checkboxes() throws InterruptedException
  {
	  String Etitle=Data_retrival.getdata(Filepath, "Sheet1", 4, 5);
	  
	  String Etxt=Data_retrival.getdata(Filepath, "Sheet1", 4, 1);

	  checkboxes_page cbp=new checkboxes_page(driver);
	  
	  cbp.selectcb();
	  
	  cbp.get(Etitle, Etxt);
	  cbp.cbs();
	  
  }
}
