package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_popup {
	public static void main(String[] args) throws Throwable {
		//take care of driver executables
				WebDriverManager.chromedriver().setup();
				//opens empty browser
				WebDriver driver=new ChromeDriver();
				//maximizes the browser
				driver.manage().window().maximize();
				//enters the url
				
				driver.get("https://demoapp.skillrary.com/");
				//implicit wait
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				WebElement course = driver.findElement(By.xpath("//a[text()='COURSE']"));
				Actions a=new Actions(driver);
				a.moveToElement(course).perform();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//a[text()='Selenium Training']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[@ondblclick='addtocart()']")).click();
				Thread.sleep(3000);
				Alert pop = driver.switchTo().alert();
				System.out.println(pop.getText());
				
				pop.accept();
				//pop.dissmiss();
				driver.close();
	}

}
