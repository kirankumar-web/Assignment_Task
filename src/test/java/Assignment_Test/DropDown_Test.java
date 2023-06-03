package Assignment_Test;

import org.testng.annotations.Test;

import Assignment_Pages.DropDown_Page;
import Assignment_general.BaseTest;
import Assignment_general.Data_retrival;

public class DropDown_Test extends BaseTest
{
    @Test
	public void dropdown()
	{
		DropDown_Page ddp=new DropDown_Page(driver);
		
		ddp.Sdropdown();
		String txt=Data_retrival.getdata(Filepath, "Sheet1", 7, 1);
		String title=Data_retrival.getdata(Filepath, "Sheet1", 7, 5);

		ddp.verifytext(txt,title);
		String opt=Data_retrival.getdata(Filepath, "Sheet1", 7, 2);
		String etxt=Data_retrival.getdata(Filepath, "Sheet1", 7, 3);
		ddp.selectdropdownopt(opt,etxt);

	}
}
