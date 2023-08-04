package scroll_Bar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll_Skillrary_Carrers {
	public static void main(String[] args) throws Throwable {
		//take care of driver executables
		WebDriverManager.chromedriver().setup();
		//opens empty browser
		WebDriver driver=new ChromeDriver();
		//maximizes the browser
		driver.manage().window().maximize();
		//enters the url
		driver.get("https://demoapp.skillrary.com/index.php");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement career = driver.findElement(By.xpath("//a[text()='Career']"));
		Point ele = career.getLocation();
		int x = ele.getX();
		int y = ele.getY();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+", "+y+")");
		career.click();
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
