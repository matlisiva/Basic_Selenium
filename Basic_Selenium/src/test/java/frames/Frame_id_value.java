package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame_id_value {
	public static void main(String[] args) {
		//take care of driver executables
				WebDriverManager.chromedriver().setup();
				//opens empty browser
				WebDriver driver=new ChromeDriver();
				//maximizes the browser
				driver.manage().window().maximize();
				//implicit wait
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				//enters the url
				driver.get("https://www.snapdeal.com/");
				//mouse over or sign in
				WebElement sign = driver.findElement(By.xpath("//span[text()='Sign In']"));
				Actions a=new Actions(driver);
				a.moveToElement(sign).perform();
				
				driver.findElement(By.xpath("//a[text()='login']")).click();
				
				//shifting the control frame
				driver.switchTo().frame(0);
				//performing action on frame
				driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']")).sendKeys("1234567890");
				driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-delete-sign fnt-22']")).click();
				
				//driver.switchTo().defaultContent();
				driver.switchTo().frame("loginIframe");
				
				//driver.findElement(By.xpath("//input[@placeholder='Search products & brands']")).sendKeys("123456");
				driver.close();
				
	}

}
