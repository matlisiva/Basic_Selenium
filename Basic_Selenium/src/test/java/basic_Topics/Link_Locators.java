package basic_Topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link_Locators {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		//driver.findElement (By.linkText("Forgotten password?")).click();
		driver.findElement (By.partialLinkText("Forgotten password")).click();
		Thread.sleep(5000);
		driver.close();
		}

}
