package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_upload {
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
				driver.get("https://www.foundit.in/");
				driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
				//uploading through sendkeys
				driver.findElement(By.id("file-upload")).sendKeys("c:\\users\\Siva Resume (2)");
				Thread.sleep(2000);
				driver.quit();
	}

}
