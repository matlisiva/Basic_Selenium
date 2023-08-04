package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Annotation {
	WebDriver driver;
	
	@BeforeMethod
	public void openApp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(priority=-1)
	public void login() {
		driver.findElement(By.id("email")).sendKeys("siva");
		driver.findElement(By.id("pass")).sendKeys("kumar");
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();
	}
	@AfterMethod
	public void closeApp() {
		driver.close();
	}
	@Test(priority=-1)
	public void forgetpasswordClick() {
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
	}
	

}
