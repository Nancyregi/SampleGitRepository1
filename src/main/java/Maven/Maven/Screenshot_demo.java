package Maven.Maven;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Screenshot_demo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Nan\\chrome\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				//Maximize the browser wndow
				driver.manage().window().maximize();
				
				// Go to URL
				driver.get("http://demo.guru99.com/V4/");
				
				// Find the element to take a screenshot

				//WebElement element = driver.findElement(By.xpath ("//*[@id=\"site-name\"]/a[1]/img"));

				// Along with driver pass element also in takeScreenshot() method.

				//Screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver,element);
				
				// Take a ScreenShot
				File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scrFile, new File("C:pageScreenshot.png"), true);

	}

}
