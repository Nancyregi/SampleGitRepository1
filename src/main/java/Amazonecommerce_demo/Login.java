package Amazonecommerce_demo;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login {


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Launch the browser
		System.setProperty("webdriver.chrome.driver","C:\\Nan\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Maximize the browser wndow
		driver.manage().window().maximize();
		
		//Launch URL
		driver.get(" https://www.amazon.in");
		
		 WebElement Login = driver.findElement(By.linkText("Sign in"));
		 //Hit Signin button
		  Login.click();
		  Thread.sleep(4000);
          
		//driver.findelement(By.xpath//*[@id="ap_email"]))
				
	driver.findElement(( By.xpath("//input[@id=\"ap_email\"]"))).sendKeys("reginancy13@gmail.com");

	driver.findElement(( By.xpath("//input[@id=\"continue\"]"))).click();
	
	driver.findElement(( By.xpath("//input[@id=\"ap_password\"]"))).sendKeys("REGin#132");
	
	driver.findElement(( By.xpath("//input[@id=\"signInSubmit\"]"))).click();
	
	 Actions a= new Actions(driver);
     WebElement ele=driver.findElement(By.xpath(".//*[@id='nav-link-accountList']"));
     a.moveToElement(ele).build().perform();
     driver.findElement(By.xpath(".//*[@id='nav-al-your-account']"));
     Thread.sleep(3000);
     driver.findElement(By.xpath(".//*[@id='nav-al-your-account']/a[22]")).click();
	}

}
