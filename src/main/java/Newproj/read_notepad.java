package Newproj;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class read_notepad {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		FileReader fr=new FileReader("C:\\Nan\\New folder\\credential.txt");
		BufferedReader br=new BufferedReader(fr);
		String x="";
		
		//driver.findElement(By.id("email")).sendKeys(x+"\n"); 
		while((x=br.readLine())!=null)
		{
			//driver.findElement(By.id("email")).sendKeys(x+"\1"); 
			System.out.println(x+"\1");
		}
		
		
		br.close();
	}

}
