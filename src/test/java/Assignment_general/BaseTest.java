package Assignment_general;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import Assignment_general.Autoconstants.autoconstants;

public class BaseTest implements autoconstants
{
	public WebDriver driver;
   @BeforeSuite
   public void precondition()
   {   	  
	   System.setProperty(chromekey, Chropath);
       ChromeOptions co=new ChromeOptions();
       co.addArguments("---remote-allow-origins=*");
	   driver=new ChromeDriver(co);
	   
		 driver.get("http://the-internet.herokuapp.com/");
	   
   }
   @AfterSuite
   public void postcondition()
   {
	   driver.close();
   }
}
