package Maven.Maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Navigate_Command_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Nan\\chrome\\chromedriver.exe");
		
		 // Initialize chrome Driver using Desired Capabilities Class    
       //DesiredCapabilities capabilities = DesiredCapabilities.chrome();    
      // capabilities.setCapability("marionette",true);  
		WebDriver driver = new ChromeDriver();
		// Launch Website    
        //driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
        driver.navigate().to("https://www.seleniumeasy.com/test/");
      //Click on the Link Text using click() command    
        //driver.findElement(By.linkText("This is a Link")).click(); 
        
        WebElement input = driver.findElement(By.className("dropdown-toggle"));
	    input.click();
        
	    WebElement checkbox = driver.findElement(By.linkText("Checkbox Demo"));
	    checkbox.click();
	   
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
      //Go back to previous page  
        driver.navigate().back(); 
        
      //Refresh browser  
       driver.navigate().refresh(); 
        
     //Closing browser  
       driver.close();
        

	}

}
