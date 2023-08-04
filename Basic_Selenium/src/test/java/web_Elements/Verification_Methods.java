package web_Elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verification_Methods {
	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		WebElement textfield= driver.findElement(By.xpath("//input[@type='text']"));
		if(textfield.isDisplayed()) {
			textfield.sendKeys("sivakumar");
		}
		else {
			System.out.println("testscript is failed");
		}
		WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
		if(btn.isEnabled()) {
			btn.submit();
			
		}
		else
		{
			System.out.println("tesScript is failed");
		}
		driver.close();
		
	}

}
