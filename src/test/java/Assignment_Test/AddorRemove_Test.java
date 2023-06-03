package Assignment_Test;

import org.testng.annotations.Test;

import Assignment_Pages.AddorRemove_Page;
import Assignment_general.BaseTest;
import Assignment_general.Data_retrival;

public class AddorRemove_Test extends BaseTest 
{ 
	@Test
     public void AddorRemoveElement_Test() throws InterruptedException
     {
		AddorRemove_Page arp=new AddorRemove_Page(driver);

		int n1=Data_retrival.getCellData(Filepath, "Sheet1", 2, 3);
		int n2=Data_retrival.getCellData(Filepath, "Sheet1", 2, 4);
		String s1=Data_retrival.getdata(Filepath, "Sheet1", 2, 5);
		String s2=Data_retrival.getdata(Filepath, "Sheet1", 2, 1);

		arp.selectAddorRemove();
		arp.verifytextele(s2);
		arp.AddElements(n1, s1);
		arp.deleteElement(n2);
     }
}
