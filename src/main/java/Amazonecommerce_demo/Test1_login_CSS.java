package Amazonecommerce_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1_login_CSS {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
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
		
		WebElement Email = driver.findElement(By.cssSelector("input[id=ap_email]"));
		Email.sendKeys("reginancy13@gmail.com");
		
		driver.findElement(( By.xpath("//input[@id=\"continue\"]"))).click();
		
		WebElement PW = driver.findElement(By.cssSelector("input[id=ap_password]"));
		PW.sendKeys("REGin#132");
		
		WebElement Submit=driver.findElement(By.cssSelector("input[id=signInSubmit"));
		Submit.click();
		
		//Signed in successful using cssSelector
		
		Actions a= new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]"));
        a.moveToElement(ele).build().perform();
        ele.click();
        
      //Go back to Home page 
        driver.navigate().back();  
		
		
		
	}

}
