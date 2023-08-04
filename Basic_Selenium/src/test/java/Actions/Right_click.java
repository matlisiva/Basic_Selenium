package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Right_click {
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
				driver.get("https://www.amazon.in/");
				//address of search text field
				//WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
				WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
				//create an object
				Actions a=new Actions(driver);
				//call context click method for right clicking
				a.contextClick(search).perform();
				Thread.sleep(5000);
				driver.close();
				
	}

}
