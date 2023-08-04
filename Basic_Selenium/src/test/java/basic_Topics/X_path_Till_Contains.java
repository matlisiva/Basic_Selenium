package basic_Topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_path_Till_Contains {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sivareddy");
		//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).sendKeys("reddy");
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("matli");
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();
		driver.close();
	}

}
