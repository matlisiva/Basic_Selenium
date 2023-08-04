package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames_through_Index {
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
				WebElement signin = driver.findElement(By.xpath("//span[text()='Sign In']"));
				Actions a=new Actions(driver);
				a.moveToElement(signin).perform();
				driver.findElement(By.xpath("//a[text()='login']")).click();
				//swithing to frame
				driver.switchTo().frame(0);
				driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']")).sendKeys("12345");
				driver.findElement(By.xpath("//button[@id='checkUser']")).click();
				driver.switchTo().defaultContent();
				driver.findElement(By.xpath("//input[@id='inputValEnter']")).sendKeys("123");
				driver.close();
				
	}

}
