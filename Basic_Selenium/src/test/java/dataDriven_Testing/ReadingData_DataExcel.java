package dataDriven_Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingData_DataExcel {
	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		//creating an object for physical file
			FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Testdata.xlsx");
			//call create method to half fis
			  Workbook wb = WorkbookFactory.create(fis);
			  //reading data from the particular cell
			String URL = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue(); 
			  
			  WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  driver.get(URL);
			  String title = driver.getTitle();
			  Thread.sleep(5000);
			  //writing data into the excel sheet
			   wb.getSheet("Sheet1").createRow(5).createCell(0).setCellValue(title);
			   //creating an object for file output stream
			   Thread.sleep(5000);
			 FileOutputStream fos;
			 try {
				 fos=new FileOutputStream(".\\src\\test\\resources\\Testdata.xlsx");
				 wb.write(fos);
			 }catch(FileNotFoundException e) {
				 e.printStackTrace();
			 }
			 Thread.sleep(5000);
			 driver.quit();
		}

}
