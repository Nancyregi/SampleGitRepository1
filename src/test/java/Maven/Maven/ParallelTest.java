package Maven.Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ParallelTest {
	public WebDriver driver;
  @Test
  public void ChromeTest() {
	  
	  //Initialize the chrome driver
	  System.setProperty("webdriver.chrome.driver","C:\\Nan\\chrome\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.demoqa.com"); 
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
	  // driver.quit();
	 
	 }
  @Test
  public void EdgeTest() {
	  
	  //Initialize the chrome driver
	  System.setProperty("webdriver.chrome.driver","C:\\Nan\\edgedriver_win64\\edgedriver.exe");
	  driver = new EdgeDriver();
	  driver.get("https://www.demoqa.com"); 
	  //driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
	  // driver.quit();
 
  }
  
}
