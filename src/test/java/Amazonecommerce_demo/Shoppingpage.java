package Amazonecommerce_demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Shoppingpage {
WebDriver driver;
  
  @BeforeTest public void SigninSetup() throws Exception {
	  System.setProperty("webdriver.chrome.driver","C:\\Nan\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Maximize the browser wndow
		driver.manage().window().maximize();
		
		//Launch URL
		driver.get(" https://www.amazon.in");
	//Signin	
		 WebElement Login = driver.findElement(By.linkText("Sign in"));
		 //Hit Signin button
		  Login.click();
		  Thread.sleep(4000);
        
		//driver.findelement(By.xpath//*[@id="ap_email"]))
				
	driver.findElement(( By.xpath("//input[@id=\"ap_email\"]"))).sendKeys("reginancy13@gmail.com");

	driver.findElement(( By.xpath("//input[@id=\"continue\"]"))).click();
	
	driver.findElement(( By.xpath("//input[@id=\"ap_password\"]"))).sendKeys("REGin#132");
	
	driver.findElement(( By.xpath("//input[@id=\"signInSubmit\"]"))).click();
	
	
	  
  }
  @Test public void TodaysDeal() throws Exception {
	  //WebDriver driver = new ChromeDriver();
	 // driver.get(" https://www.amazon.in");
	  //Launch Todays deal from home page and view the deal
	  Actions a= new Actions(driver);
	    WebElement ele=driver.findElement(By.xpath(".//*[@id=\"nav-xshop\"]/a[4]"));
	    a.moveToElement(ele).build().perform();
	    ele.click();
	    WebElement viewdeal=driver.findElement(By.xpath(".//*[@id=\"101 451c5ada-announce\"]"));
	    viewdeal.click();
	   // Launch BestSeller from home page
	   // driver.findElement(By.xpath(".//*[@id='nav-al-your-account']"));
        Actions b= new Actions(driver);
	    WebElement elem=driver.findElement(By.xpath(".//*[@id=\"nav-xshop\"]/a[3]"));
	    a.moveToElement(elem).build().perform();
	    elem.click();
	    
	    Thread.sleep(3000);
		  //Go back to previous page  
	        driver.navigate().back(); 
	    //driver.findElement(By.xpath(".//*[@id=\"nav-item-signout\"]")).click();
  
  }
 
  @AfterTest
  public void Signout() throws Exception {
	  Actions a= new Actions(driver);
      WebElement ele=driver.findElement(By.xpath(".//*[@id=\"nav-link-accountList\"]"));
      a.moveToElement(ele).build().perform();
      driver.findElement(By.xpath(".//*[@id='nav-al-your-account']"));
      Thread.sleep(3000);
      driver.findElement(By.xpath(".//*[@id=\"nav-item-signout\"]")).click();
  }

}
