package Maven.Maven;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Test_Annotation {
	public String baseUrl = "https://www.browserstack.com/";
	String driverPath = "C:\\Nan\\chromedriver.exe";
	public WebDriver driver ;
  @Test
  public void verifyHomepageTitle(){
	  String expectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(actualTitle, expectedTitle);
  }
  @BeforeTest
  public void launchbrowser() {
	  System.out.println("launching Chrome browser");
	  System.setProperty("webdriver.chrome.driver", driverPath);
	  driver = new ChromeDriver();
	  driver.get(baseUrl);
  }

  @AfterTest
  public void closeBrowser() {
	  driver.close();
  }

}
