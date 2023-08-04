package web_Elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Is_Selected {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();		
		Thread.sleep(5000);
		
		WebElement rd = driver.findElement(By.xpath("//label[text()='Female']"));
		rd.click();
		Thread.sleep(5000);
		
		if(rd.isSelected()) {
			System.out.println("fail");
		}
		else
			System.out.println("pass");
		driver.close();
	}

}
