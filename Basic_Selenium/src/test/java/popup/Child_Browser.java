package popup;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child_Browser {
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
		driver.get("https://www.skillrary.com/");
		
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=' Skillrary Blogs']")).click();
		
		//shifting control to child browser
		Set<String> child = driver.getWindowHandles();
		
		for(String d:child)
		{
			driver.switchTo().window(d);
		}
		//handling child browser elements
		driver.findElement(By.xpath("//input[@id='mytext']")).sendKeys("sivakumar");
		
		//shifting control to parent window
		driver.switchTo().window(parent);
		//handling parent window 
		driver.findElement(By.xpath("//a[text()='CATEGORIES']")).click();
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
