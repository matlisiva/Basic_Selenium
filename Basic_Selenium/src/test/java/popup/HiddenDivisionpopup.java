package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenDivisionpopup {
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
		driver.get("https://www.redbus.com/");
		driver.findElement(By.xpath("//label[text()=' date']")).click();
		//selecting date from calendar
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='July']/../..//span[text()='26']")).click();
		
		Thread.sleep(3000);
		
	}

}
