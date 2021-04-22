package demo;

import java.io.File;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Employeeinfo {

	public static void main(String[] args, POIFSFileSystem file) throws IOException {
		// TODO Auto-generated method stub
		WebDriverWait wait;
	    HSSFWorkbook workbook;
	    HSSFSheet sheet;
	    HSSFCell cell;
	    
	    System.setProperty("WebDriver.chrome Driver","E:\\autom\\chromedriver_win32 (1)\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
	    
		
		// Import excel sheet.
	     File src=new File("C:\\Users\\swetha\\Desktop\\employeinfo1.xls");
	     
	     HSSFWorkbook wb = new HSSFWorkbook(file);
	     HSSFSheet s = wb.getSheet("sheet1");
	     int row = s.getLastRowNum();
	     System.out.println(row);
	     
	     
	     
	}

}
