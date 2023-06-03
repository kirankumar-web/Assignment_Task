package Assignment_Test;

import org.testng.annotations.Test;

import Assignment_Pages.File_UploadPage;
import Assignment_general.BaseTest;
public class File_upload extends BaseTest
{
        @Test
        public void testclasee() throws InterruptedException
        {
		File_UploadPage fup= new File_UploadPage(driver);
        
        fup.selectfileupload();
        String etitle = driver.getTitle();
        System.out.println(etitle);
        fup.selectfile(etitle);
        fup.clickupload();
        fup.verifyupload();
		 
        
        Thread.sleep(5000);
    }
}
