package web_Elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getter_Methods {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		Point loc = password.getLocation();
		System.out.println("the X and Y co ordinates of password text field are as below");
		System.out.println(loc.getX());
		System.out.println(loc.getY());
		Thread.sleep(5000);
		
		System.out.println("the size height and width of password textfield are as below");
		Dimension size = password.getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		driver.close();
	}

}
