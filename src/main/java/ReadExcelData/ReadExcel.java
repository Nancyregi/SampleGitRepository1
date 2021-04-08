package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.seleniumhq.jetty9.server.Authentication.User;

public class ReadExcel {

	
	

		public static void main(String[] args, Object confirmationMessage) throws IOException {
			// TODO Auto-generated method stub
		File src=new File("C:\\Nan\\Logindetail\\Testdata.xlsx");
			
			FileInputStream inputStream = new FileInputStream(src);
			
			XSSFWorkbook wb=new XSSFWorkbook(inputStream);
			
			XSSFSheet Sheet1=wb.getSheetAt(0);
			
			//get all rows in a sheet
			 int rowCount=Sheet1.getLastRowNum()-Sheet1.getFirstRowNum();
			 
			//iterate over all the row to print the data present in each cell.
		        for(int i=0;i<=rowCount;i++){
		            
		            //get cell count in a row
		            int cellcount=Sheet1.getRow(i).getLastCellNum();
		            
		            //iterate over each cell to print its value
		            System.out.println("Row"+ i+" data is :");
		            
		            for(int j=0;j<cellcount;j++){
		                System.out.print(Sheet1.getRow(i).getCell(j).getStringCellValue() +",");
		            }
		            
		            System.out.println();
		        }
			
			String data0=Sheet1.getRow(1).getCell(0).getStringCellValue();
			
			System.out.println("Data from Excel is "+data0);
			
			String data1=Sheet1.getRow(1).getCell(1).getStringCellValue();
			
			System.out.println("Data from Excel is "+data1);
			
			
			wb.close();

		}
		
		public ReadExcel(String password1, String username1, String username) {
			// TODO Auto-generated constructor stub
				username1=username;
				password1=username;
				
		}

		public ReadExcel(String password1, Object username1, Object username) {
			// TODO Auto-generated constructor stub
			username1=username;
			password1=(String) username;
		}

		

		

		
	}

	


