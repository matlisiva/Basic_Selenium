package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Double_click {
	public static void main(String[] args) throws Throwable {
		//take care of driver executables
				WebDriverManager.chromedriver().setup();
				//opens empty browser
				WebDriver driver=new ChromeDriver();
				//maximizes the browser
				driver.manage().window().maximize();
				//implicit wait
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				//enters the url
				driver.get("https://demoapp.skillrary.com/");
				//address of course
				 WebElement course = driver.findElement(By.id("course"));
				 //create an object
				 Actions a=new Actions(driver);
				 //performing mouse over
				 a.moveToElement(course).perform();
				 //address of selenium training
				 driver.findElement(By.xpath("//a[text()='Selenium Training'][1]")).click();
				 //web element +
				 WebElement plus = driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
				 a.doubleClick(plus).perform();
				 Thread.sleep(5000);
				 //close the application
				 driver.close();
				 
				 
				
	}

}
