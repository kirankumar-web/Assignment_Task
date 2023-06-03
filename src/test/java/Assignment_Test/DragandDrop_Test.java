package Assignment_Test;

import org.testng.annotations.Test;

import Assignment_Pages.DragandDrop_Page;
import Assignment_general.BaseTest;
import Assignment_general.Data_retrival;

public class DragandDrop_Test extends BaseTest
{
	@Test
	public void DragandDrop()
	{
	DragandDrop_Page ddp=new DragandDrop_Page(driver);
	ddp.selectdrag_drop();
	String t1=Data_retrival.getdata(Filepath, "Sheet1", 6, 2);
	ddp.draganddrop(t1);
	String s1=Data_retrival.getdata(Filepath, "Sheet1", 6, 1);
	
	ddp.verifytext(s1);
	
	driver.navigate().back();
	}
}
