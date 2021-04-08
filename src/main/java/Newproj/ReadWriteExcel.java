package Newproj;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadWriteExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Nan\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Maximize the browser wndow
		driver.manage().window().maximize();
		
		//Launch URL
		driver.get(" https://www.amazon.in");
		
		//Signin	
		 WebElement Login = driver.findElement(By.linkText("Sign in"));
		 //Hit Signin button
		  Login.click();
		 // Thread.sleep(4000);
		// Import excel sheet. 
		  File src=new File("C:\\Nan\\Logindetail\\Testdata.xlsx");
		
			FileInputStream inputStream = new FileInputStream(src);
			
			XSSFWorkbook wb=new XSSFWorkbook(inputStream);
			
			XSSFSheet Sheet1=wb.getSheetAt(0);
		  // Load the sheet in which data is stored. 

		  Sheet1= wb.getSheetAt(0); 
		  
		  String data0=Sheet1.getRow(1).getCell(0).getStringCellValue();
		  
		  String data1=Sheet1.getRow(1).getCell(1).getStringCellValue();
		  
		// Import data for Email. 

		  //cell = Sheet1.getRow(i).getCell(1); 
		driver.findElement(( By.xpath("//input[@id=\"ap_email\"]"))).sendKeys(data0);
		
		driver.findElement(( By.xpath("//input[@id=\"continue\"]"))).click();
		
		driver.findElement(( By.xpath("//input[@id=\"ap_password\"]"))).sendKeys(data1);
		
		driver.findElement(( By.xpath("//input[@id=\"signInSubmit\"]"))).click();

	}

}
