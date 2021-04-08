package Maven.Maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set the location of chrome browser from the local machine path
				System.setProperty("webdriver.chrome.driver","C:\\Nan\\chromedriver.exe");
				
				//Initialize browser
				WebDriver driver = new ChromeDriver();
				
				//Navigate to the demo site
				driver.get("https://demoqa.com/nestedframes");
				
				 //Number of Frames on a Page
		        int countIframesInPage = driver.findElements(By.tagName("iframe")).size();
		        System.out.println("Number of Frames on a Page:" + countIframesInPage);
		        
		      //Locate the frame1 on the webPage
		        WebElement frame1=driver.findElement(By.id("frame1"));
		        
		        //Switch to Frame1
		        driver.switchTo().frame(frame1);
		        
		        //Locate the Element inside the Frame1
		        WebElement frame1Element= driver.findElement(By.tagName("body"));
		        
		        //Get the text for frame1 element
		        String frame1Text=frame1Element.getText();
		        System.out.println("Frame1 is :"+frame1Text);
		        
		        //Number of Frames on a Frame1
		        int countIframesInFrame1 =driver.findElements(By.tagName("iframe")).size();
		        System.out.println("Number of iFrames inside the Frame1:" + countIframesInFrame1);
		        
		        //switch to child frame
		        driver.switchTo().frame(0);
		        
		        int countIframesInFrame2 =driver.findElements(By.tagName("iframe")).size();
		        System.out.println("Number of iFrames inside the Frame2:" + countIframesInFrame2);
		        
		     
		      //By finding all the web elements using iframe tag
		      List<WebElement> iframeElements = driver.findElements(By.tagName("iframeResult"));
		      System.out.println("Total number of iframes are " + iframeElements.size());
		        
		        driver.close();

	}

}
