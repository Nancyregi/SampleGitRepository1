package Amazonecommerce_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Logout {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//Launch the browser
				System.setProperty("webdriver.chrome.driver","C:\\Nan\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				//Maximize the browser wndow
				driver.manage().window().maximize();
				
				//Launch URL
				driver.get(" https://www.amazon.in");
		 Actions a= new Actions(driver);
         WebElement ele=driver.findElement(By.xpath(".//*[@id='nav-link-accountList']"));
         a.moveToElement(ele).build().perform();
         driver.findElement(By.xpath(".//*[@id='nav-al-your-account']"));
         Thread.sleep(3000);
         driver.findElement(By.xpath(".//*[@id='nav-al-your-account']/a[22]")).click();

	}

}
