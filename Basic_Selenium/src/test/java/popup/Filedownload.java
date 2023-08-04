package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Filedownload {
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
				driver.get("http://the-internet.herokuapp.com/download");
				//address of sample.png
				driver.findElement(By.xpath("//a[text()='sample.png']")).click();
	}

}
