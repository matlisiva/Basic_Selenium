package dataDriven_Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reading_property_Browser {
	public static void main(String[] args) throws Throwable {
		//creating an object for properties
				Properties p= new Properties();
				//creating an object for physical file
				FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Data.properties");
				//loading his.file
				p.load(fis);
				//reading data from property file
				String URL = p.getProperty("url1");
				String ser = p.getProperty("search");
				String browse = p.getProperty("browser");
				WebDriver driver;
				if(browse.equals("chrome")) {
					WebDriverManager.chromedriver().setup();
					driver=new ChromeDriver();
				}
				else
				{
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
					
				}
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get(URL);
	}

}
