package Maven.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG {
	
		WebDriver driver = new ChromeDriver();
		
	  @Test (priority = 0)
	  public void CloseBrowser() {
		
		  driver.close();
		  Reporter.log("Driver Closed After Testing");
	  }
	  
	  @Test (priority = -1)
	  public void OpenBrowser() {
	  Reporter.log("This test verifies the current selenium compatibility with TestNG by launching the chrome driver");
	          Reporter.log("Launching Google Chrome Driver for this test"); 
	          System.setProperty("webdriver.chrome.driver","C:\\Nan\\chrome\\chromedriver.exe");
	          driver.get("https://www.demoqa.com");
	          
	          Reporter.log("The website used was DemoQA for this test");
  }
}
